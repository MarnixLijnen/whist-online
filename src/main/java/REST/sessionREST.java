package REST;

import javax.ws.rs.*;

@Path("/session")
public class sessionREST {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, session World!";
    }
}
