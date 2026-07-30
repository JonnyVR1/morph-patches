package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzka {
    public abstract zzka zzb(int i);

    public abstract zzkb zzc();

    public abstract zzka zzd(int i);

    public final zzkb zze() {
        zzkb zzkbVarZzc = zzc();
        zzmt.zzp(!zzkbVarZzc.zzb().isEmpty(), "Package name must not be empty.");
        return zzkbVarZzc;
    }
}
