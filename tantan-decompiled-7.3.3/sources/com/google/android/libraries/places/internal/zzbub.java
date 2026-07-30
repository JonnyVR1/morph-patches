package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbub implements zzbuf {
    private static final Logger zza = Logger.getLogger(zzbty.class.getName());
    private static final zzbwf zzb;

    static {
        zzbwe zzbweVar = zzbwf.zza;
        zzb = zzbwe.zza("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static /* bridge */ /* synthetic */ int zza(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw zzi("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static /* bridge */ /* synthetic */ int zzb(zzbwd zzbwdVar) {
        return (zzbwdVar.zzc() & 255) | ((zzbwdVar.zzc() & 255) << 16) | ((zzbwdVar.zzc() & 255) << 8);
    }

    public static /* bridge */ /* synthetic */ IllegalArgumentException zzf(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException zzi(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // com.google.android.libraries.places.internal.zzbuf
    public final zzbtr zzc(zzbwd zzbwdVar, boolean z) {
        return new zzbtz(zzbwdVar, 4096, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbuf
    public final zzbts zzd(zzbwc zzbwcVar, boolean z) {
        return new zzbua(zzbwcVar, true);
    }
}
