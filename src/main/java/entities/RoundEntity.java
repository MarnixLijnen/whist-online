package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ROUNDS", schema = "whist-online")
public class RoundEntity {
    private long roundId;
    private byte scoreP1;
    private byte scoreP2;
    private byte scoreP3;
    private byte scoreP4;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "roundID_FK")
    private List<GameTypeEntity> gameTypes;


    @Id
    @Column(name = "roundID", nullable = false)
    public long getRoundId() {
        return roundId;
    }

    public void setRoundId(long roundId) {
        this.roundId = roundId;
    }

    @Basic
    @Column(name = "scoreP1", nullable = false)
    public byte getScoreP1() {
        return scoreP1;
    }

    public void setScoreP1(byte score) {
        this.scoreP1 = score;
    }

    @Basic
    @Column(name = "scoreP2", nullable = false)
    public byte getScoreP2() {
        return scoreP2;
    }

    public void setScoreP2(byte score) {
        this.scoreP2 = score;
    }

    @Basic
    @Column(name = "scoreP3", nullable = false)
    public byte getScoreP3() {
        return scoreP3;
    }

    public void setScoreP3(byte score) {
        this.scoreP3 = score;
    }

    @Basic
    @Column(name = "scoreP4", nullable = false)
    public byte getScoreP4() {
        return scoreP4;
    }

    public void setScoreP4(byte score) {
        this.scoreP4 = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundEntity that = (RoundEntity) o;
        return roundId == that.roundId && scoreP1 == that.scoreP1 && scoreP2 == that.scoreP2 && scoreP3 == that.scoreP3 && scoreP4 == that.scoreP4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roundId, scoreP1, scoreP2, scoreP3, scoreP4);
    }
}
