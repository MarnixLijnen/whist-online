package EJB;

import entities.UserEntity;

import javax.ejb.Stateful;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful(name = "SessionEJB")
public class SessionBean {

    private int userID;

    @PersistenceContext(name = "whist-online")
    private EntityManager em;

    public SessionBean() {
    }

    /**
     * Find the user entity associated with the saved userID in the session.
     * @return the userdata (entity). Null if the userID does not exist.
     */
    public UserEntity getUser() {
        return em.find(UserEntity.class, userID);
    }

    public void register(JsonObject userDetails) {
        UserEntity user = new UserEntity(userDetails.getString("userName"), userDetails.getString("password"));
        em.persist(user);
        this.userID = user.getUserId();
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
