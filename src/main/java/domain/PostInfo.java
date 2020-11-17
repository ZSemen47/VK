package domain;

public class PostInfo {
    private int date;
    private String text;
    private String copyright;
    private String postType;
    private boolean markedAsAds;
    private boolean isPinned;
    private boolean friendsOnly;
    private Like likesInfo;
    private Geo geoinfo;
    private Comment commentsinfo;
    private Repost repostinfo;
    private View viewsinfo;
    private PostCurrentUserCan caninfo;
    private PostId idinfo;
    private PostSource sourceinfo;
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

    public Object getArrowToDown() {
        return arrowToDown;
    }

    public void setArrowToDown(Object arrowToDown) {
        this.arrowToDown = arrowToDown;
    }

    public Like getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(Like likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Geo getGeoinfo() { return geoinfo; }

    public void setGeoinfo(Geo geoinfo) { this.geoinfo = geoinfo; }

    public Comment getCommentsinfo() { return commentsinfo; }

    public void setCommentsinfo(Comment commentsinfo) { this.commentsinfo = commentsinfo; }

    public Repost getRepostinfo() { return repostinfo; }

    public void setRepostinfo(Repost repostinfo) { this.repostinfo = repostinfo; }

    public View getViewsinfo() { return viewsinfo; }

    public void setViewsinfo(View viewsinfo) { this.viewsinfo = viewsinfo; }

    public PostCurrentUserCan getCaninfo() { return caninfo; }

    public void setCaninfo(PostCurrentUserCan caninfo) { this.caninfo = caninfo; }

    public PostId getIdinfo() { return idinfo; }

    public void setIdinfo(PostId idinfo) { this.idinfo = idinfo; }

    public PostSource getSourceinfo() { return sourceinfo; }

    public void setSourceinfo(PostSource sourceinfo) { this.sourceinfo = sourceinfo; }

}
