package com.p046p1.mobile.account_cosmos.data;

import com.p046p1.mobile.account_core.request_data.OperatorType;
import com.p046p1.mobile.account_core.request_data.ProviderType;
import com.p046p1.mobile.account_core.request_data.RequestData;

/* JADX INFO: loaded from: classes8.dex */
public class CosmosVerifyData extends RequestData {
    public String accessCode;
    public OperatorType operatorType;
    public String providerToken;
    final ProviderType providerType = ProviderType.cosmos;
}
