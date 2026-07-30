package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class zzgx extends IOException {
    public final int zza;

    public zzgx(int i) {
        this.zza = i;
    }

    public zzgx(@Nullable String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgx(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzgx(@Nullable Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
