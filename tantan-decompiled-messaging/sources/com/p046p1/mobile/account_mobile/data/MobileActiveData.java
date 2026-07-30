package com.p046p1.mobile.account_mobile.data;

import com.p046p1.mobile.account_core.request_data.OperatorType;
import com.p046p1.mobile.account_core.request_data.ProviderType;
import com.p046p1.mobile.account_core.request_data.RequestData;

/* JADX INFO: loaded from: classes8.dex */
public class MobileActiveData extends RequestData {
    public OperatorType operatorType;
    public String providerToken;
    final ProviderType providerType = ProviderType.china_mobile;
}
