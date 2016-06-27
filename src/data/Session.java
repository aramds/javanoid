package data;

public class Session extends DataMain {
    private Long sessionId;
    private Long lifeTime = 60 * 60 * 60L;
    private User user;

    Session() {
    }

    public Session(Long sessionId, User user) {
        this.sessionId = sessionId;
        this.user = user;
    }

    public Session(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Session(Long id, Long sessionId, Long lifeTime) {
        super(id);
        this.sessionId = sessionId;
        this.lifeTime = lifeTime;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(Long lifeTime) {
        this.lifeTime = lifeTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionId=" + sessionId +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
