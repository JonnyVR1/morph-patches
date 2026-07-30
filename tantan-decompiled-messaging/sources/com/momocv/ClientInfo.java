package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class ClientInfo implements Serializable {
    public String cpu_type_;
    public String gpu_type_;
    public String mobile_phone_type_;
    public String user_id_;

    public String getCpu_type_() {
        return this.cpu_type_;
    }

    public String getGpu_type_() {
        return this.gpu_type_;
    }

    public String getMobile_phone_type_() {
        return this.mobile_phone_type_;
    }

    public String getUser_id_() {
        return this.user_id_;
    }

    public void setCpu_type_(String str) {
        this.cpu_type_ = str;
    }

    public void setGpu_type_(String str) {
        this.gpu_type_ = str;
    }

    public void setMobile_phone_type_(String str) {
        this.mobile_phone_type_ = str;
    }

    public void setUser_id_(String str) {
        this.user_id_ = str;
    }
}
