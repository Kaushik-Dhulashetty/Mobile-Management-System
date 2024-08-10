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

@WebServlet("/SaveUpdatedDetails")
public class SaveUpdatedMobileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int mobileId = Integer.parseInt(req.getParameter("mobileId"));
		String mobileModel = req.getParameter("mobileModel");
		String mobileBrand = req.getParameter("mobileBrand");
		String mobileRom = req.getParameter("mobileRom");
		String mobileRam = req.getParameter("mobileRam");
		int mobilePrice = Integer.parseInt(req.getParameter("mobilePrice"));

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		Mobile mobile = session.get(Mobile.class, mobileId);
		mobile.setMobileBrand(mobileBrand);
		mobile.setMobileModel(mobileModel);
		mobile.setMobilePrice(mobilePrice);
		mobile.setRam(mobileRam);
		mobile.setRom(mobileRom);
		session.update(mobile);
		resp.sendRedirect("DisplayAllMobile");

		tran.commit();
		session.close();
		sf.close();

	}

}
