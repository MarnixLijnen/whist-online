package Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "GAMES", schema = "whist-online")
@NamedQuery(name = "findAllGames", query = "select g from GameEntity g")
public class GameEntity {
    private int gameId;
    private String gameName;
    private String password;
    private Timestamp timestamp;
    @OneToMany
    @JoinColumn(name = "gameID_FK")
    private List<RoundEntity> rounds;
    @ManyToMany
    @JoinTable(name = "PLAYERS", joinColumns = @JoinColumn(name = "gameID_FK"), inverseJoinColumns = @JoinColumn(name = "userID_FK"))
    private List<UserEntity> players;


    @Id
    @Column(name = "gameID", nullable = false)
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Basic
    @Column(name = "gameName", nullable = false, length = 50)
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameEntity that = (GameEntity) o;
        return gameId == that.gameId && Objects.equals(gameName, that.gameName) && Objects.equals(password, that.password) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, gameName, password, timestamp);
    }
}
