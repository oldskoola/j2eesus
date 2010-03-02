package de.oldskooler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 839230472788902447L;
	
	private String helloMessage;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		helloMessage = "HELLO GET";
		PrintWriter writer = null;
		try {
			writer = res.getWriter();
		} catch (IOException e) {
			log("exception while getting writer!",e);
		}
		writer.println(helloMessage);
	}

}
