package com.clevertap.android.sdk.product_config;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: renamed from: com.clevertap.android.sdk.product_config.b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class C1305b {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static String m6921a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.getAccountId() : "");
        sb.append("[Product Config]");
        return sb.toString();
    }
}
