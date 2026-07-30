package com.p046p1.mobile.account_phone.data;

import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import p149l.C17657j;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneSignupData extends SignupData {
    public int code;
    public int countryCode;
    public String mobileNumber;
    private String password;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p046p1.mobile.account_core.request_data.SignupData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }

    public void setPassword(String str) {
        this.password = C17657j.m139081b(str);
    }
}
