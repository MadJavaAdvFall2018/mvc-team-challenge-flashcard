package java112.project3;

import java.io.*;
import java.util.*;
import java112.utilities.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


/**
 * The type Servlet flash card.
 *
 * @author emullendore
 * @author sfhlug
 * @author jmsee
 */
@WebServlet(
    name = "servletflashcard", 
    urlPatterns = { "/flashcard" }
)

public class ServletFlashCard extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        // set the response type before sending data

        BeanFlashCard bean = new BeanFlashCard();
        //Map map = new HashMap();


        request.setAttribute("questionAnswer", bean);

        String url = "/flashcards.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}