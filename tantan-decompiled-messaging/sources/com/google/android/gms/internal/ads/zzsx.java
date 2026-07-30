package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import p149l.bny0;
import p149l.ggw0;
import p149l.mhr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzsx extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final bny0 zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final zzsx zze;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzsx(mhr0 mhr0Var, @Nullable Throwable th, boolean z, bny0 bny0Var) {
        String str = "Decoder init failed: " + bny0Var.f76460a + ", " + mhr0Var.toString();
        String str2 = mhr0Var.f133892l;
        int i = ggw0.f102568a;
        this(str, th, str2, false, bny0Var, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    public static /* bridge */ /* synthetic */ zzsx zza(zzsx zzsxVar, zzsx zzsxVar2) {
        return new zzsx(zzsxVar.getMessage(), zzsxVar.getCause(), zzsxVar.zza, false, zzsxVar.zzc, zzsxVar.zzd, zzsxVar2);
    }

    public zzsx(mhr0 mhr0Var, @Nullable Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + mhr0Var.toString(), th, mhr0Var.f133892l, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    private zzsx(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable bny0 bny0Var, @Nullable String str3, @Nullable zzsx zzsxVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = bny0Var;
        this.zzd = str3;
        this.zze = zzsxVar;
    }
}
