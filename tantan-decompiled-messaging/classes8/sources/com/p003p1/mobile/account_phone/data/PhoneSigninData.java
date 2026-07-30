package com.p003p1.mobile.account_phone.data;

import com.p003p1.mobile.account_core.request_data.ThirdPartyAccount;
import p007l.C0570j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PhoneSigninData extends PhoneData {
    public int code;
    private String password;
    public PhoneSigninType signinType;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p003p1.mobile.account_phone.data.PhoneData, com.p003p1.mobile.account_core.request_data.RequestData, com.p003p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C0570j.m9450b(str);
    }
}
