package com.google.android.libraries.places.internal;

import p149l.jf4;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzky extends zzld {
    private final jf4 zza;
    private final String zzb;

    public zzky(jf4 jf4Var, String str) {
        this.zza = jf4Var;
        if (str != null) {
            this.zzb = str;
        } else {
            jfd0.m141176a("Null query");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzld) {
            zzld zzldVar = (zzld) obj;
            if (this.zza.equals(zzldVar.zza()) && this.zzb.equals(zzldVar.zzb())) {
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
        return "AutocompleteRequest{source=" + this.zza.toString() + ", query=" + this.zzb + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzlg
    public final jf4 zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    public final String zzb() {
        return this.zzb;
    }
}
