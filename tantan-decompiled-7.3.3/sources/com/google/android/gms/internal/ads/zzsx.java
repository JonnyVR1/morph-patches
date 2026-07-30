package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import p153l.hwy0;
import p153l.mpw0;
import p153l.sqr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzsx extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final hwy0 zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final zzsx zze;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzsx(sqr0 sqr0Var, @Nullable Throwable th, boolean z, hwy0 hwy0Var) {
        String str = "Decoder init failed: " + hwy0Var.f111951a + ", " + sqr0Var.toString();
        String str2 = sqr0Var.f170251l;
        int i = mpw0.f137957a;
        this(str, th, str2, false, hwy0Var, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    public static /* bridge */ /* synthetic */ zzsx zza(zzsx zzsxVar, zzsx zzsxVar2) {
        return new zzsx(zzsxVar.getMessage(), zzsxVar.getCause(), zzsxVar.zza, false, zzsxVar.zzc, zzsxVar.zzd, zzsxVar2);
    }

    public zzsx(sqr0 sqr0Var, @Nullable Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + sqr0Var.toString(), th, sqr0Var.f170251l, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    private zzsx(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable hwy0 hwy0Var, @Nullable String str3, @Nullable zzsx zzsxVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = hwy0Var;
        this.zzd = str3;
        this.zze = zzsxVar;
    }
}
