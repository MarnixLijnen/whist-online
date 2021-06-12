package REST;

import EJB.GameBean;
import entities.GameEntity;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/game")
@RolesAllowed({"user", "admin"})
public class gameAPI {

    @EJB
    GameBean gameBean;

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, game World!";
    }

    @GET
    @Path("/getAllGames")
    @Produces(MediaType.TEXT_PLAIN)
    public List<GameEntity> getAllGames() {
        return gameBean.findAllGames();
    }
}
