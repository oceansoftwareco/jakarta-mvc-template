package pro.ivanov;

import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Controller
@Path("/")
public class HomeController {
    @Inject
    private Models models;

    @GET
    @View("index.jsp")
    public void index() {
        models.put("msg", "Hello from Jakarta EE");
    }
}