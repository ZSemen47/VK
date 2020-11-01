package domain;

public class PostInfo {
    private int date;
    private String text;
    private String copyright;
    private String postType;
    private boolean markedAsAds;
    private boolean isPinned;
    private boolean friendsOnly;
    private int countOFLikes;
    private Object arrowToDown;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }
    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }
    public int getCountOFLikes() {
        return countOFLikes;
    }

    public void setCountOFLikes(int countOFLikes) {
        this.countOFLikes = countOFLikes;
    }
    public Object getArrowToDown() {
        return arrowToDown;
    }

    public void setArrowToDown(Object arrowToDown) {
        this.arrowToDown = arrowToDown;
    }
}
