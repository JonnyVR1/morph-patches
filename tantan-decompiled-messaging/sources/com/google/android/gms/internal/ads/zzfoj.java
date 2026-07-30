package com.google.android.gms.internal.ads;

import com.p046p1.mobile.putong.data.Mobile;

/* JADX INFO: loaded from: classes6.dex */
public enum zzfoj {
    CTV("ctv"),
    MOBILE(Mobile.TYPE),
    OTHER("other");

    private final String zze;

    zzfoj(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
