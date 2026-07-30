package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public enum zzfog {
    HTML(Constants.INAPP_HTML_TAG),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String zze;

    zzfog(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
