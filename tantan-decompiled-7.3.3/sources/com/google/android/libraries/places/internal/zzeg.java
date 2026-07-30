package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzeg extends zzei {
    private final long zza;
    private final long zzb;

    public zzeg(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzei) {
            zzei zzeiVar = (zzei) obj;
            if (this.zza == zzeiVar.zza() && this.zzb == zzeiVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zzb;
        long j2 = this.zza;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.zza + ", uptimeMillis=" + this.zzb + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzei
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzei
    public final long zzb() {
        return this.zzb;
    }
}
