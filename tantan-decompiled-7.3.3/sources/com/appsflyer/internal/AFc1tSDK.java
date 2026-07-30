package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK {
    public static boolean getCurrencyIso4217Code(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public static boolean getRevenue(@Nullable String str) {
        return str == null || str.trim().length() == 0;
    }
}
