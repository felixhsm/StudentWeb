package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
/*
 * 학생 정보 등록
 * url : ?? /student/register
 */
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet{
	
	// 학생 정보 등록의 경우 post방식으로 요청해야함.
	// post방식 요청은 form태그를 통해서 밖에 되지 않으므로
	// form 작성 필요
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		String name = request.getParameter("name");
		int firstScore, secondScore;
		firstScore = Integer.parseInt(request.getParameter("firstScore")); // 원인 및 해결방안
		// 원인 : 문자열을 int로 변환할 수 없음
		// 해결방안 : 문자열을 int로 변화해주면 됨 어떻게?
		// Integger.parseInt("")
		secondScore = Integer.parseInt(request.getParameter("secondScore"));
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		RequestDispatcher view;
		String message = "";
		for(Student std:sList) 
			if(std.getName().equals(name)) { // 이름으로 중복을 체크했다.
//				out.println("이미 존재합니다.");
				request.setAttribute("message", message);
				message = "이미 존재합니다.";
				view = request.getRequestDispatcher("/WEB-INF/views/common.result.jsp");
				view.forward(request, response);
				return; 	// 메소드를 종료하여 밑에 코드가 안돌아가도록 함.
		}
			sList.add(new Student(name, firstScore, secondScore));
//			out.println("회원가입이 완료되었습니다.");
			request.setAttribute("message", message);
			message = "회원갑입이 완료되었습니다.";
			view = request.getRequestDispatcher("/WEB-INF/views/common.result.jsp");
			view.forward(request, response);
			
		
	
	}
}
