package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ROUNDS", schema = "whist-online", catalog = "")
public class RoundsEntity {
    private long roundId;
    private byte gameType;

    @Id
    @Column(name = "roundID", nullable = false)
    public long getRoundId() {
        return roundId;
    }

    public void setRoundId(long roundId) {
        this.roundId = roundId;
    }

    @Basic
    @Column(name = "gameType", nullable = false)
    public byte getGameType() {
        return gameType;
    }

    public void setGameType(byte gameType) {
        this.gameType = gameType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundsEntity that = (RoundsEntity) o;
        return roundId == that.roundId && gameType == that.gameType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roundId, gameType);
    }
}
