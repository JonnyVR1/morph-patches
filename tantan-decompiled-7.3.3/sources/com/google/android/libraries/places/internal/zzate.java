package com.google.android.libraries.places.internal;

import p153l.p7f;

/* JADX INFO: loaded from: classes7.dex */
final class zzate {
    private final Object zza;
    private final int zzb;

    public zzate(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzate)) {
            return false;
        }
        zzate zzateVar = (zzate) obj;
        return this.zza == zzateVar.zza && this.zzb == zzateVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * p7f.COLOR_SPACE_UNCALIBRATED) + this.zzb;
    }
}
