package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import p149l.mhr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzpx extends Exception {
    public final int zza;
    public final boolean zzb;
    public final mhr0 zzc;

    public zzpx(int i, int i2, int i3, int i4, mhr0 mhr0Var, boolean z, @Nullable Exception exc) {
        String strValueOf = String.valueOf(mhr0Var);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = mhr0Var;
    }
}
