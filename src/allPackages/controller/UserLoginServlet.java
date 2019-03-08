package allPackages.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import allPackages.bean.User;
import allPackages.service.UserService;
import allPackages.service.UserServiceImpl;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserLoginServlet() {
        super();
    }
	private UserService us;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//接受表单数据
		String studentId=request.getParameter("StudentId");
		String passw=request.getParameter("Password");
		//封装成user对象
		User u=new User();
		u.setStudenID(studentId);
		u.setPassword(passw);
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		us=(UserService) ac.getBean("userService");
		User loginUser=us.getUserByInfo(u);
		//根据用户验证结果进行操作，验证成功与否，重定向不同
		if(loginUser==null)
		{
			response.sendRedirect(request.getContextPath()+"/loginFail.jsp");
		}
		else {
			response.sendRedirect(request.getContextPath()+"/loginSuccess.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
