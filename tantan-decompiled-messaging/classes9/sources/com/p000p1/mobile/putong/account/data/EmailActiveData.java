package com.p000p1.mobile.putong.account.data;

import com.p1.mobile.account_core.request_data.RequestData;
import com.p1.mobile.account_phone.data.PhoneSigninType;
import l.j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailActiveData extends RequestData {
    public PhoneSigninType activateType;
    public int code;
    public String email;
    private String password;

    public void setPassword(String str) {
        this.password = j.b(str);
    }
}
