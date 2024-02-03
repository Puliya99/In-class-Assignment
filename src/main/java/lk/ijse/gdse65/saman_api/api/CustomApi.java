package lk.ijse.gdse65.saman_api.api;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "custom", urlPatterns = "/customApi")
public class CustomApi extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("custom API");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("code");
        String head = req.getHeader("head");
        System.out.println(code);
        System.out.println(head);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());
    }
}
