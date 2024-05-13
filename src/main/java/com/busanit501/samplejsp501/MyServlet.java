package com.busanit501.samplejsp501;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 웹브라우저에 접근시 , http://localhost:8080/my
@WebServlet(name="myServlet" , urlPatterns = "/my")
public class MyServlet extends HttpServlet {
// 웹브라우저 주소 요청 (request) -> 서버 (톰캣서버, was = 웹서버 + 톰캣컨태이너 )
// 서버 웹브라우저에게 답장 (response)
    // doGet : 매소드 이름
    // 변수 , 메서드 정의
    // throws : 예외가 발생하면 IOException , 예외를 던짐.
    // throw , 강제로 예외를 발생시키는 예약어.

public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

    // HttpServletRequest , 브라우저가 요청시 필요한 정보를 답는 수납도구
    // HttpServletResponse , 서버가 응답시 보내는 정보를 담는 수납도구

    // 보내는 정보의 타입을 지정 , MIME 타입
    response.setContentType("text/html");

    // 자바,콘솔 출력시 , syso
    // Hello
    // PrintWriter , 출력도구
    PrintWriter out = response.getWriter();
    // 수납도구에 , html 태그를 입력
    out.println("<html><body>");
    out.println("<h1>" + "내가만든 MyServlet 파일에서 답보내기 연습중" + "</h1>");
    out.println("</body></html>");
}
}
