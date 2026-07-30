package com.p003p1.mobile.account_mobile.data;

import com.p003p1.mobile.account_core.request_data.OperatorType;
import com.p003p1.mobile.account_core.request_data.ProviderType;
import com.p003p1.mobile.account_core.request_data.RequestData;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class MobileBindPhoneData extends RequestData {
    public OperatorType operatorType;
    public String providerToken;
    final ProviderType providerType = ProviderType.china_mobile;
    public String providerUserId;
}
