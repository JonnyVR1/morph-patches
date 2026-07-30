package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import p153l.hwy0;
import p153l.mpw0;

/* JADX INFO: loaded from: classes6.dex */
public class zzst extends zzif {

    @Nullable
    public final hwy0 zza;

    @Nullable
    public final String zzb;

    public zzst(Throwable th, @Nullable hwy0 hwy0Var) {
        super("Decoder failed: ".concat(String.valueOf(hwy0Var == null ? null : hwy0Var.f111951a)), th);
        this.zza = hwy0Var;
        int i = mpw0.f137957a;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
