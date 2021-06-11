package REST;

import EJB.SessionBean;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class userREST {

    @Inject
    private SessionBean session;

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public void register(JsonObject userDetails) {
        session.register(userDetails);
    }

    @GET
    @Path("/getPassword")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPassword(@QueryParam("userName") String userName) {
        return "password";
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.TEXT_PLAIN)
    public void login(String userID) {
        session.setUserID(Integer.parseInt(userID));
    }

    @POST
    @Path("/logout")
    @Consumes(MediaType.TEXT_PLAIN)
    public void logout() {
        session.setUserID(-1);
    }
}
