package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import p153l.tg3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzasq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    final int zzb = zzf;
    int zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    zzasr zzd;

    public /* synthetic */ zzasq(zzasp zzaspVar) {
    }

    public static int zzF(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzH(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzasq zzI(InputStream inputStream, int i) {
        return new zzaso(inputStream, 4096, null);
    }

    public static zzasq zzJ(byte[] bArr, int i, int i2) {
        return zzK(bArr, 0, i2, false);
    }

    public static zzasq zzK(byte[] bArr, int i, int i2, boolean z) {
        zzasm zzasmVar = new zzasm(bArr, 0, i2, false, null);
        try {
            zzasmVar.zze(i2);
            return zzasmVar;
        } catch (zzauf e) {
            tg3.m191013a(e);
            return null;
        }
    }

    public abstract void zzA(int i);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i) throws IOException;

    public final int zzG(int i) {
        int i2 = this.zzc;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        return i2;
    }

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i) throws zzauf;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzask zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i) throws zzauf;
}
