package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes6.dex */
final class zzcd extends zzce {
    private static final zzcd zzb = new zzcd();

    private zzcd() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.zzce, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zza((zzce) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int zza(zzce zzceVar) {
        return zzceVar == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void zzc(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void zzd(StringBuilder sb) {
        throw new AssertionError();
    }
}
