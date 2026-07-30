package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* JADX INFO: loaded from: classes6.dex */
public enum zzeii {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED(BuildConfig.VERSION_NAME);

    private final String zzf;

    zzeii(String str) {
        this.zzf = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzf;
    }
}
