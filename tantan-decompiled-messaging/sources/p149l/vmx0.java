package p149l;

import com.google.android.gms.internal.measurement.zzik;

/* JADX INFO: loaded from: classes6.dex */
public final class vmx0 extends dnx0 {

    /* JADX INFO: renamed from: a */
    public int f182194a = 0;

    /* JADX INFO: renamed from: b */
    public final int f182195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzik f182196c;

    public vmx0(zzik zzikVar) {
        this.f182196c = zzikVar;
        this.f182195b = zzikVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f182194a < this.f182195b;
    }

    @Override // p149l.hnx0
    public final byte zza() {
        int i = this.f182194a;
        if (i < this.f182195b) {
            this.f182194a = i + 1;
            return this.f182196c.zzb(i);
        }
        lmr.m150601a();
        return (byte) 0;
    }
}
