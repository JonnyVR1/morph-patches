package com.google.android.libraries.places.internal;

import p153l.ig4;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzkz extends zzle {
    private final ig4 zza;
    private final String zzb;

    public zzkz(ig4 ig4Var, String str) {
        this.zza = ig4Var;
        if (str != null) {
            this.zzb = str;
        } else {
            mnd0.m159157a("Null placeId");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzle) {
            zzle zzleVar = (zzle) obj;
            if (this.zza.equals(zzleVar.zza()) && this.zzb.equals(zzleVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "PlaceRequest{source=" + this.zza.toString() + ", placeId=" + this.zzb + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzlg
    public final ig4 zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzle
    public final String zzb() {
        return this.zzb;
    }
}
