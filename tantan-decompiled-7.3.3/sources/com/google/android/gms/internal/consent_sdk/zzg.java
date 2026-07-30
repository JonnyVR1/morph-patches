package com.google.android.gms.internal.consent_sdk;

import p153l.m1j;

/* JADX INFO: loaded from: classes6.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i, String str) {
        super(str);
        this.zza = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final m1j zza() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new m1j(this.zza, super.getMessage());
    }

    public zzg(int i, String str, Throwable th) {
        super(str, th);
        this.zza = i;
    }
}
