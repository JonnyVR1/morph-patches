package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import p149l.bny0;
import p149l.ggw0;

/* JADX INFO: loaded from: classes6.dex */
public class zzst extends zzif {

    @Nullable
    public final bny0 zza;

    @Nullable
    public final String zzb;

    public zzst(Throwable th, @Nullable bny0 bny0Var) {
        super("Decoder failed: ".concat(String.valueOf(bny0Var == null ? null : bny0Var.f76460a)), th);
        this.zza = bny0Var;
        int i = ggw0.f102568a;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
