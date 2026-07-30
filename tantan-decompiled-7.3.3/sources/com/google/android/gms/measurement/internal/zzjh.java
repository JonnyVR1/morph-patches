package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes6.dex */
public enum zzjh {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String zzf;

    zzjh(String str) {
        this.zzf = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzf;
    }
}
