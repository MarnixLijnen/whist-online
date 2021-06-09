package Entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "USERS", schema = "whist-online", catalog = "")
public class UsersEntity {
    private int userId;
    private String userName;
    private String password;
    private byte[] profilePicture;

    @Id
    @Column(name = "userID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "profilePicture", nullable = true)
    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return userId == that.userId && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Arrays.equals(profilePicture, that.profilePicture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(userId, userName, password);
        result = 31 * result + Arrays.hashCode(profilePicture);
        return result;
    }
}
