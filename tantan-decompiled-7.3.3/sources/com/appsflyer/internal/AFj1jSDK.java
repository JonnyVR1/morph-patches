package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1jSDK {
    public String getMonetizationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFj1jSDK(@NonNull Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
