package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1gSDK<ResponseType> {
    @NonNull
    ResponseType getMonetizationNetwork(String str) throws JSONException;
}
