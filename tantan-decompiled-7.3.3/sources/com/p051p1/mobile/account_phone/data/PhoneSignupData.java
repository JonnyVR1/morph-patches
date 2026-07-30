package com.p051p1.mobile.account_phone.data;

import com.p051p1.mobile.account_core.request_data.SignupData;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import p153l.C17835j;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneSignupData extends SignupData {
    public int code;
    public int countryCode;
    public String mobileNumber;
    private String password;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p051p1.mobile.account_core.request_data.SignupData, com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C17835j.m142881b(str);
    }
}
