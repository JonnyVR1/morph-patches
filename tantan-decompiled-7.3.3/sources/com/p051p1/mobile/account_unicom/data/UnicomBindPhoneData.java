package com.p051p1.mobile.account_unicom.data;

import com.p051p1.mobile.account_core.request_data.OperatorType;
import com.p051p1.mobile.account_core.request_data.ProviderType;
import com.p051p1.mobile.account_core.request_data.RequestData;

/* JADX INFO: loaded from: classes8.dex */
public class UnicomBindPhoneData extends RequestData {
    public String providerToken;
    public String providerUserId;
    final OperatorType operatorType = OperatorType.china_unicom;
    public ProviderType providerType = ProviderType.china_unicom;
}
