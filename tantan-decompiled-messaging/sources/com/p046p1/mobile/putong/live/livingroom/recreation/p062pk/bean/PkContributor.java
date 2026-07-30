package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean;

/* JADX INFO: loaded from: classes5.dex */
public class PkContributor implements Comparable<PkContributor> {
    private String avatarUrl;
    private boolean isHost;
    private boolean isPunishStage;
    private boolean isSuccess;
    private boolean isTied;
    private int rank;
    private long score;
    private String userId;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isHost() {
        return this.isHost;
    }

    public boolean isPunishStage() {
        return this.isPunishStage;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public boolean isTied() {
        return this.isTied;
    }

    public PkContributor setAvatarUrl(String str) {
        this.avatarUrl = str;
        return this;
    }

    public PkContributor setHost(boolean z) {
        this.isHost = z;
        return this;
    }

    public PkContributor setPunishStage(boolean z) {
        this.isPunishStage = z;
        return this;
    }

    public PkContributor setRank(int i) {
        this.rank = i;
        return this;
    }

    public PkContributor setScore(long j) {
        this.score = j;
        return this;
    }

    public PkContributor setSuccess(boolean z) {
        this.isSuccess = z;
        return this;
    }

    public PkContributor setTied(boolean z) {
        this.isTied = z;
        return this;
    }

    public PkContributor setUserId(String str) {
        this.userId = str;
        return this;
    }

    public String toString() {
        return "PkContributor{userId='" + this.userId + "', avatarUrl='" + this.avatarUrl + "', isHost=" + this.isHost + ", score=" + this.score + ", rank=" + this.rank + ", isPunishStage=" + this.isPunishStage + ", isSuccess=" + this.isSuccess + ", isTied=" + this.isTied + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(PkContributor pkContributor) {
        return (int) (pkContributor.score - this.score);
    }
}
