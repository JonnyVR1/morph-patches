package com.p046p1.mobile.account_phone.data;

import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;

/* JADX INFO: loaded from: classes8.dex */
public class PhoneSignupEarlyUIDData extends SignupData {
    public int code;
    public int countryCode;
    public String mobileNumber;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p046p1.mobile.account_core.request_data.SignupData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }
}
