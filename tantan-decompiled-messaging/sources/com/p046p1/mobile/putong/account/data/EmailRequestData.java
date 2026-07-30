package com.p046p1.mobile.putong.account.data;

import com.p046p1.mobile.account_core.request_data.RequestData;
import com.p046p1.mobile.account_phone.data.PhoneSigninType;
import p149l.C17657j;

/* JADX INFO: loaded from: classes9.dex */
public class EmailRequestData extends RequestData {
    public int code;
    public String email;
    private String password;
    public PhoneSigninType signinType;

    public void setPassword(String str) {
        this.password = C17657j.m139081b(str);
    }
}
