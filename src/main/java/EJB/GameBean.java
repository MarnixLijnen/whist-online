package EJB;

import entities.GameEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "gameEJB")
public class GameBean {

  @PersistenceContext(unitName = "whist-online")
  private EntityManager em;

    public GameBean() {
    }

    @SuppressWarnings("unchecked")
    public List<GameEntity> findAllGames() {
      Query query = em.createNamedQuery("findAllGames");
      return query.getResultList();
    }
}
