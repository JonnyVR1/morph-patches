package com.p046p1.mobile.account_cosmos.data;

import com.p046p1.mobile.account_core.request_data.OperatorType;
import com.p046p1.mobile.account_core.request_data.ProviderType;
import com.p046p1.mobile.account_core.request_data.SignupData;
import com.p046p1.mobile.account_core.request_data.ThirdPartyAccount;
import p149l.C17657j;

/* JADX INFO: loaded from: classes8.dex */
public class CosmosSignupData extends SignupData {
    public String accessCode;
    public OperatorType operatorType;
    private String password;
    public String providerToken;
    final ProviderType providerType = ProviderType.cosmos;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;

    public void setPassword(String str) {
        this.password = C17657j.m139081b(str);
    }
}
