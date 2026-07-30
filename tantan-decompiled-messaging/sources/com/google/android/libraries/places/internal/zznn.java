package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zznn extends zznp {
    private static final zznn zzb = new zznn();

    private zznn() {
        super("");
    }

    @Override // com.google.android.libraries.places.internal.zznp, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zza((zznp) obj);
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final int zza(zznp zznpVar) {
        return zznpVar == this ? 0 : -1;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final void zzc(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final void zzd(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final boolean zze(Comparable comparable) {
        return true;
    }
}
