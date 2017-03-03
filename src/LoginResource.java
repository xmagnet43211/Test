/**
 * Created by root on 15/2/2017.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("login")
public class LoginResource {

    @Context

    private SecurityContext security;

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String login() {

        String email = security.getUserPrincipal().getName();
        return "ok";
    }
}
