package REST;

import EJB.GameBean;
import Entities.GamesEntity;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/game")
public class gameREST {

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
    public List<GamesEntity> getAllGames() {
        return gameBean.findAllGames();
    }
}
