package com.kh.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/login")
public class StudentLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String message = "";
	RequestDispatcher view;
	if("admin".equals(userId) && "admin".equals(userPw)) {
		message = "관리자님 환영합니다.";
	}else {
		message = " 일반사용자님 환영합니다.";
	}
	request.setAttribute("message", message);
	view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
	view.forward(request, response);
	
	}
}
