package p153l;

import com.google.android.gms.internal.measurement.zzik;

/* JADX INFO: loaded from: classes6.dex */
public final class bwx0 extends jwx0 {

    /* JADX INFO: renamed from: a */
    public int f78797a = 0;

    /* JADX INFO: renamed from: b */
    public final int f78798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzik f78799c;

    public bwx0(zzik zzikVar) {
        this.f78799c = zzikVar;
        this.f78798b = zzikVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f78797a < this.f78798b;
    }

    @Override // p153l.nwx0
    public final byte zza() {
        int i = this.f78797a;
        if (i < this.f78798b) {
            this.f78797a = i + 1;
            return this.f78799c.zzb(i);
        }
        mor.m159308a();
        return (byte) 0;
    }
}
