package p149l;

import com.google.android.exoplayer2.source.InterfaceC1974r;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class zr5 implements InterfaceC1974r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1974r[] f204456a;

    public zr5(InterfaceC1974r[] interfaceC1974rArr) {
        this.f204456a = interfaceC1974rArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        boolean zMo10923c;
        boolean z = false;
        do {
            long jMo10926f = mo10926f();
            if (jMo10926f == Long.MIN_VALUE) {
                return z;
            }
            zMo10923c = false;
            for (InterfaceC1974r interfaceC1974r : this.f204456a) {
                long jMo10926f2 = interfaceC1974r.mo10926f();
                boolean z2 = jMo10926f2 != Long.MIN_VALUE && jMo10926f2 <= j;
                if (jMo10926f2 == jMo10926f || z2) {
                    zMo10923c |= interfaceC1974r.mo10923c(j);
                }
            }
            z |= zMo10923c;
        } while (zMo10923c);
        return z;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public final long mo10924d() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1974r interfaceC1974r : this.f204456a) {
            long jMo10924d = interfaceC1974r.mo10924d();
            if (jMo10924d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10924d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public final void mo10925e(long j) {
        for (InterfaceC1974r interfaceC1974r : this.f204456a) {
            interfaceC1974r.mo10925e(j);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public final long mo10926f() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC1974r interfaceC1974r : this.f204456a) {
            long jMo10926f = interfaceC1974r.mo10926f();
            if (jMo10926f != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10926f);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        for (InterfaceC1974r interfaceC1974r : this.f204456a) {
            if (interfaceC1974r.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
