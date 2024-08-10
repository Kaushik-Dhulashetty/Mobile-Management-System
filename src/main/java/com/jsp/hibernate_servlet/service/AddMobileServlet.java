package com.jsp.hibernate_servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate_servlet.entity.Mobile;

@WebServlet("/AddMobileServlet")
public class AddMobileServlet extends HttpServlet {
		
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int mobileId=Integer.parseInt(req.getParameter("mobileId"));
		String mobileModel=req.getParameter("mobileModel");
		String mobileBrand=req.getParameter("mobileBrand");
		String Ram=req.getParameter("mobileRam");
		String Rom=req.getParameter("mobileRom");
		int mobilePrice=Integer.parseInt(req.getParameter("mobilePrice"));
		
		
		Mobile m = new Mobile();
		m.setMobileId(mobileId);
		m.setMobileBrand(mobileBrand);
		m.setMobileModel(mobileModel);
		m.setRam(Ram);
		m.setRom(Rom);
		m.setMobilePrice(mobilePrice);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

	    resp.sendRedirect("index.jsp");
		session.save(m);
		tran.commit();
		session.close();
		sf.close();

	}

}
