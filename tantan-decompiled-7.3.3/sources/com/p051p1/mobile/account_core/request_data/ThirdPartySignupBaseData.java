package com.p051p1.mobile.account_core.request_data;

/* JADX INFO: loaded from: classes8.dex */
public class ThirdPartySignupBaseData extends SignupData {
    public String thirdPartyId;
    public String thirdPartyToken;
    public String thirdPartyUnionId;

    @Override // com.p051p1.mobile.account_core.request_data.SignupData, com.p051p1.mobile.account_core.request_data.RequestData, com.p051p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }
}
