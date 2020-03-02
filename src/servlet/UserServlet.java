package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enity.User;
import service.UserService;
import service.impl.ServiceImpl;
//设置我访问的URL信息
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		UserService us = new ServiceImpl();
		User user = new User();
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		//调用实体类中的setter方法为私有的属相赋值
		user.setName(name);
		user.setAge(age);
		us.save(user);
	}

}
