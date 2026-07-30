package com.p046p1.mobile.putong.live.base.apibean;

/* JADX INFO: loaded from: classes13.dex */
public class FanbaseGroupAuditsItemBean extends BaseListItemBean {
    public static final String APPROVED = "approved";
    public static final String PENDING = "pending";
    public static final String REJECTED = "rejected";
    private int age;
    private String avatar;
    private String date;
    private String desc;
    private String gender;
    private String groupId;

    /* JADX INFO: renamed from: id */
    private String f44232id;
    private String name;
    private String status;
    private String statusDesc;
    private String userId;

    public int getAge() {
        return this.age;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getDate() {
        return this.date;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getGender() {
        return this.gender;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getId() {
        return this.f44232id;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setId(String str) {
        this.f44232id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "FanbaseGroupAuditsItemBean{id='" + this.f44232id + "', groupId='" + this.groupId + "', userId='" + this.userId + "', avatar='" + this.avatar + "', name='" + this.name + "', age=" + this.age + ", desc='" + this.desc + "', status='" + this.status + "', statusDesc='" + this.statusDesc + "', date='" + this.date + "', gender='" + this.gender + "'}";
    }
}
