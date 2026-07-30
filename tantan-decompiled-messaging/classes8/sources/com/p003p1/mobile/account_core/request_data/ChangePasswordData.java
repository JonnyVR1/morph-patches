package com.p003p1.mobile.account_core.request_data;

import com.google.gson.annotations.SerializedName;
import p007l.C0570j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ChangePasswordData extends RequestData {
    public int code;

    @SerializedName("new")
    private String newpassword;
    private String old;

    public void setNewpassword(String str) {
        this.newpassword = C0570j.m9450b(str);
    }

    public void setOld(String str) {
        this.old = C0570j.m9450b(str);
    }
}
