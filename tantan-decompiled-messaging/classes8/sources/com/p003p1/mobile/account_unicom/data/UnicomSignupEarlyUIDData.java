package com.p003p1.mobile.account_unicom.data;

import com.p003p1.mobile.account_core.request_data.OperatorType;
import com.p003p1.mobile.account_core.request_data.ProviderType;
import com.p003p1.mobile.account_core.request_data.SignupData;
import com.p003p1.mobile.account_core.request_data.ThirdPartyAccount;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class UnicomSignupEarlyUIDData extends SignupData {
    public String providerToken;
    public String providerUserId;
    public ThirdPartyAccount thirdPartyAccount;
    final OperatorType operatorType = OperatorType.china_unicom;
    public ProviderType providerType = ProviderType.china_unicom;
}
