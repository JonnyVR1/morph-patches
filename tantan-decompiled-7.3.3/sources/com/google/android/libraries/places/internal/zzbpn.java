package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbpn {
    final int zza;
    final int zzb;
    final int zzc;
    final AtomicInteger zzd;

    public zzbpn(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.zza = i;
        this.zzb = i / 2;
        atomicInteger.set(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbpn)) {
            return false;
        }
        zzbpn zzbpnVar = (zzbpn) obj;
        return this.zza == zzbpnVar.zza && this.zzc == zzbpnVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzc)});
    }

    public final boolean zza() {
        return this.zzd.get() > this.zzb;
    }

    public final boolean zzb() {
        int i;
        int i2;
        do {
            i = this.zzd.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!this.zzd.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.zzb;
    }
}
