package com.p051p1.mobile.account_mobile.data;

import com.p051p1.mobile.account_core.request_data.OperatorType;
import com.p051p1.mobile.account_core.request_data.ProviderType;
import com.p051p1.mobile.account_core.request_data.SignupData;
import com.p051p1.mobile.account_core.request_data.ThirdPartyAccount;
import p153l.C17835j;

/* JADX INFO: loaded from: classes8.dex */
public class MobileSignupData extends SignupData {
    public OperatorType operatorType;
    private String password;
    public String providerToken;
    final ProviderType providerType = ProviderType.china_mobile;
    public String signupType;
    public ThirdPartyAccount thirdPartyAccount;

    public void setPassword(String str) {
        this.password = C17835j.m142881b(str);
    }
}
