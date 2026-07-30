package com.appsflyer.attribution;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface AppsFlyerRequestListener {
    void onError(int i, @NonNull String str);

    void onSuccess();
}
