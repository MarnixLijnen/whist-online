package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GAME_TYPES", schema = "whist-online")
public class GameTypesEntity {
    private long scoreId;
    private byte gameType;

    @Id
    @Column(name = "scoreID", nullable = false)
    public long getScoreId() {
        return scoreId;
    }

    public void setScoreId(long scoreId) {
        this.scoreId = scoreId;
    }

    @Basic
    @Column(name = "gameType", nullable = false)
    public byte getGameType() {
        return gameType;
    }

    public void setGameType(byte score) {
        this.gameType = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameTypesEntity that = (GameTypesEntity) o;
        return scoreId == that.scoreId && gameType == that.gameType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scoreId, gameType);
    }
}
