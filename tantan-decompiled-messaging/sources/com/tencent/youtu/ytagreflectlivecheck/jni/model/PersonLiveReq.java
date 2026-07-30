package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class PersonLiveReq {
    public String app_id;
    public String business_name;
    public int live_type;
    public PersonLive livedata;
    public String person_id;
    public String req_type;

    public PersonLiveReq(String str, String str2, String str3, PersonLive personLive, int i, String str4) {
        this.app_id = str;
        this.business_name = str2;
        this.person_id = str3;
        this.livedata = personLive;
        this.live_type = i;
        this.req_type = str4;
    }

    public String getApp_id() {
        return this.app_id;
    }

    public String getBusiness_name() {
        return this.business_name;
    }

    public int getLive_type() {
        return this.live_type;
    }

    public PersonLive getLivedata() {
        return this.livedata;
    }

    public String getPerson_id() {
        return this.person_id;
    }

    public String getReq_type() {
        return this.req_type;
    }

    public void setApp_id(String str) {
        this.app_id = str;
    }

    public void setBusiness_name(String str) {
        this.business_name = str;
    }

    public void setLive_type(int i) {
        this.live_type = i;
    }

    public void setLivedata(PersonLive personLive) {
        this.livedata = personLive;
    }

    public void setPerson_id(String str) {
        this.person_id = str;
    }

    public void setReq_type(String str) {
        this.req_type = str;
    }

    public PersonLiveReq() {
    }
}
