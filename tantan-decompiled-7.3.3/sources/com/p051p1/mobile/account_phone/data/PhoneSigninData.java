package com.p051p1.mobile.account_phone.data;

import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import p153l.C17835j;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneSigninData extends PhoneData {
    public int code;
    private String password;
    public PhoneSigninType signinType;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p051p1.mobile.account_phone.data.PhoneData, com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C17835j.m142881b(str);
    }
}
