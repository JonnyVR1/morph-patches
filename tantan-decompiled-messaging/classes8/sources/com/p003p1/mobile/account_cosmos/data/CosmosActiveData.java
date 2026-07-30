package com.p003p1.mobile.account_cosmos.data;

import com.p003p1.mobile.account_core.request_data.OperatorType;
import com.p003p1.mobile.account_core.request_data.ProviderType;
import com.p003p1.mobile.account_core.request_data.RequestData;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CosmosActiveData extends RequestData {
    public String accessCode;
    public OperatorType operatorType;
    public String providerToken;
    final ProviderType providerType = ProviderType.cosmos;
}
