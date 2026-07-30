package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
final class zzawu extends zzaww {
    public zzawu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final void zzc(Object obj, long j, boolean z) {
        if (zzawx.zzb) {
            zzawx.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzawx.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final void zzd(Object obj, long j, byte b) {
        if (zzawx.zzb) {
            zzawx.zzD(obj, j, b);
        } else {
            zzawx.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzaww
    public final boolean zzg(Object obj, long j) {
        return zzawx.zzb ? zzawx.zzt(obj, j) : zzawx.zzu(obj, j);
    }
}
