package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * 학생 리스트 조회
 * url : ?? /student/list
 */
@WebServlet("/student/list") // URL주소
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",88,77));
		sList.add(new Student("삼용자",77,66));
		sList.add(new Student("사용자",66,55));
		
//		for(Student std:sList) {
//			System.out.println(std.toString());
//		}
		RequestDispatcher view;
		Student student = sList.get(0);
		request.setAttribute("student", student);
//		request.setAttribute("name", sList.get(0).getName());
//		request.setAttribute("firstScore", sList.get(0).getFirstScore());
//		request.setAttribute("secondScore", sList.get(0).getSecondScore());	
//		request.setAttribute("name2", sList.get(1).getName());
//		request.setAttribute("firstScore2", sList.get(1).getFirstScore());
//		request.setAttribute("secondScore2", sList.get(1).getSecondScore());	
		view = request.getRequestDispatcher("/WEB-INF/views/student/list.jsp");
		view.forward(request, response);
		}
				
	}

