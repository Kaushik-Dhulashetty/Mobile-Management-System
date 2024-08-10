package com.jsp.hibernate_servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate_servlet.entity.Mobile;

@WebServlet("/DisplayAllMobile")
public class DisplayAllMobileServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		Query<Mobile> query = session.createQuery("from Mobile");
		List<Mobile> mobiles = query.list();
		req.setAttribute("mobile", mobiles);
		RequestDispatcher rd = req.getRequestDispatcher("DisplayAllMobiles.jsp");
		rd.forward(req, resp);
		tran.commit();
		session.close();
		sf.close();
	}
}
