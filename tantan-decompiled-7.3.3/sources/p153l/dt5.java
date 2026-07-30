package p153l;

import com.google.android.exoplayer2.source.InterfaceC1997r;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class dt5 implements InterfaceC1997r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1997r[] f90538a;

    public dt5(InterfaceC1997r[] interfaceC1997rArr) {
        this.f90538a = interfaceC1997rArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        boolean zMo10977c;
        boolean z = false;
        do {
            long jMo10980f = mo10980f();
            if (jMo10980f == Long.MIN_VALUE) {
                return z;
            }
            zMo10977c = false;
            for (InterfaceC1997r interfaceC1997r : this.f90538a) {
                long jMo10980f2 = interfaceC1997r.mo10980f();
                boolean z2 = jMo10980f2 != Long.MIN_VALUE && jMo10980f2 <= j;
                if (jMo10980f2 == jMo10980f || z2) {
                    zMo10977c |= interfaceC1997r.mo10977c(j);
                }
            }
            z |= zMo10977c;
        } while (zMo10977c);
        return z;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public final long mo10978d() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1997r interfaceC1997r : this.f90538a) {
            long jMo10978d = interfaceC1997r.mo10978d();
            if (jMo10978d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10978d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public final void mo10979e(long j) {
        for (InterfaceC1997r interfaceC1997r : this.f90538a) {
            interfaceC1997r.mo10979e(j);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public final long mo10980f() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1997r interfaceC1997r : this.f90538a) {
            long jMo10980f = interfaceC1997r.mo10980f();
            if (jMo10980f != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10980f);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        for (InterfaceC1997r interfaceC1997r : this.f90538a) {
            if (interfaceC1997r.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
