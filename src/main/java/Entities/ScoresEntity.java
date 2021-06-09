package Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SCORES", schema = "whist-online", catalog = "")
public class ScoresEntity {
    private long scoreId;
    private byte score;

    @Id
    @Column(name = "scoreID", nullable = false)
    public long getScoreId() {
        return scoreId;
    }

    public void setScoreId(long scoreId) {
        this.scoreId = scoreId;
    }

    @Basic
    @Column(name = "score", nullable = false)
    public byte getScore() {
        return score;
    }

    public void setScore(byte score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoresEntity that = (ScoresEntity) o;
        return scoreId == that.scoreId && score == that.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scoreId, score);
    }
}
