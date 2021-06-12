package REST;

import javax.ws.rs.*;

@Path("/hello-world")
public class registrationAPI {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}
