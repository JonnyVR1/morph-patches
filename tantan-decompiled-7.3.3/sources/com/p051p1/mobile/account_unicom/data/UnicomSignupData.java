package com.p051p1.mobile.account_unicom.data;

import com.p051p1.mobile.account_core.request_data.OperatorType;
import com.p051p1.mobile.account_core.request_data.ProviderType;
import com.p051p1.mobile.account_core.request_data.SignupData;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import p153l.C17835j;

/* JADX INFO: loaded from: classes8.dex */
public class UnicomSignupData extends SignupData {
    private String password;
    public String providerToken;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;
    final OperatorType operatorType = OperatorType.china_unicom;
    public ProviderType providerType = ProviderType.china_unicom;

    public void setPassword(String str) {
        this.password = C17835j.m142881b(str);
    }
}
