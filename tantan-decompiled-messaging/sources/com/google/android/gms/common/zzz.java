package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
final class zzz {

    @Nullable
    private String zza = null;
    private long zzb = -1;
    private zzag zzc = zzag.zzl();
    private zzag zzd = zzag.zzl();

    public final zzz zza(long j) {
        this.zzb = j;
        return this;
    }

    public final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzag.zzk(list);
        return this;
    }

    public final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzag.zzk(list);
        return this;
    }

    public final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzab zze() {
        if (this.zza == null) {
            qkq0.m175383a("packageName must be defined");
            return null;
        }
        if (this.zzb < 0) {
            qkq0.m175383a("minimumStampedVersionNumber must be greater than or equal to 0");
            return null;
        }
        if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        qkq0.m175383a("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        return null;
    }
}
