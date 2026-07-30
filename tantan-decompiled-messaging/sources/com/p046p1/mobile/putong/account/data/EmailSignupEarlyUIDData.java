package com.p046p1.mobile.putong.account.data;

import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;

/* JADX INFO: loaded from: classes9.dex */
public class EmailSignupEarlyUIDData extends SignupData {
    public int code;
    public String email;
    public ThirdPartyAccount thirdPartyAccount;

    @Override // com.p046p1.mobile.account_core.request_data.SignupData, com.p046p1.mobile.account_core.request_data.RequestData, com.p046p1.mobile.account_core.request_data.JsonData
    public void checkNull() {
        super.checkNull();
    }
}
