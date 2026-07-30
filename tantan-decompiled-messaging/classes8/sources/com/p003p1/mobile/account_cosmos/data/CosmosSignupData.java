package com.p003p1.mobile.account_cosmos.data;

import com.p003p1.mobile.account_core.request_data.OperatorType;
import com.p003p1.mobile.account_core.request_data.ProviderType;
import com.p003p1.mobile.account_core.request_data.SignupData;
import com.p003p1.mobile.account_core.request_data.ThirdPartyAccount;
import p007l.C0570j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CosmosSignupData extends SignupData {
    public String accessCode;
    public OperatorType operatorType;
    private String password;
    public String providerToken;
    final ProviderType providerType = ProviderType.cosmos;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;

    public void setPassword(String str) {
        this.password = C0570j.m9450b(str);
    }
}
