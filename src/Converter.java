import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by christos on 6/2/2017.
 */

@WebServlet(name="mychat", urlPatterns={"/mychat/*"} )
public class Converter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
/*
        JSONObject obj = new JSONObject();

        try {
            obj.put("name", "mkyong.com");
            obj.put("age", new Integer(100));
        } catch (JSONException e) {
            e.printStackTrace();
        }*/

        out.println("<h1>hello</h1>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        doGet(req, resp);

    }
}
