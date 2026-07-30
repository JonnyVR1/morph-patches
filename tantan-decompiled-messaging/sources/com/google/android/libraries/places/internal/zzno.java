package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzno extends zznp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzno(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "\\" + this.zza.toString() + "/";
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final void zzc(StringBuilder sb) {
        sb.append('[');
        sb.append(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final void zzd(StringBuilder sb) {
        sb.append(this.zza);
        sb.append(')');
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final boolean zze(Comparable comparable) {
        int i = zzok.zzc;
        return this.zza.compareTo(comparable) <= 0;
    }
}
