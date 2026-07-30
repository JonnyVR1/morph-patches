package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import p149l.ofw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfxh implements Serializable, ofw0 {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxh) {
            return this.zza.equals(((zzfxh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // p149l.ofw0
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((ofw0) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
