package com.p051p1.mobile.putong.account.data;

import com.p051p1.mobile.account_core.request_data.RequestData;
import com.p051p1.mobile.account_phone.data.PhoneSigninType;
import p153l.C17835j;

/* JADX INFO: loaded from: classes9.dex */
public class EmailRequestData extends RequestData {
    public int code;
    public String email;
    private String password;
    public PhoneSigninType signinType;

    public void setPassword(String str) {
        this.password = C17835j.m142881b(str);
    }
}
