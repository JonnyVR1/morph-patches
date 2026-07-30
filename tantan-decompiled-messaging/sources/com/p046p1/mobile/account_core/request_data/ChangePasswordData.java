package com.p046p1.mobile.account_core.request_data;

import com.google.gson.annotations.SerializedName;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import p149l.C17657j;

/* JADX INFO: loaded from: classes8.dex */
public class ChangePasswordData extends RequestData {
    public int code;

    @SerializedName(ShareConstants.NEW_VERSION)
    private String newpassword;
    private String old;

    public void setNewpassword(String str) {
        this.newpassword = C17657j.m139081b(str);
    }

    public void setOld(String str) {
        this.old = C17657j.m139081b(str);
    }
}
