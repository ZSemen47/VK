package domain;

public class Like {
    private int count;
    private int usersLike;
    private boolean canLike;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getUsersLike() {
        return usersLike;
    }
    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setUsersLike(int usersLike) {
        this.usersLike = usersLike;
    }
    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
