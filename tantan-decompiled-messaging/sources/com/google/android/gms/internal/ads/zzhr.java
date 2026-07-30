package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import p149l.uax0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzhr extends zzhp {
    public final int zzd;

    @Nullable
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhr(int i, @Nullable String str, @Nullable IOException iOException, Map map, uax0 uax0Var, byte[] bArr) {
        super("Response code: " + i, iOException, uax0Var, 2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
