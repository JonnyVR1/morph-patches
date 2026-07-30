package com.appsflyer.internal;

import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1pSDK implements AFe1gSDK<AFh1aSDK> {
    @Override // com.appsflyer.internal.AFe1gSDK
    public final /* synthetic */ AFh1aSDK getMonetizationNetwork(String str) throws JSONException {
        return new AFh1aSDK(str);
    }
}
