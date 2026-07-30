package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class s1l0 implements pke0 {

    /* JADX INFO: renamed from: a */
    public final long[] f165794a;

    /* JADX INFO: renamed from: b */
    public final long[] f165795b;

    /* JADX INFO: renamed from: c */
    public final long f165796c;

    /* JADX INFO: renamed from: d */
    public final long f165797d;

    public s1l0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f165794a = jArr;
        this.f165795b = jArr2;
        this.f165796c = j;
        this.f165797d = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static s1l0 m184055a(long j, long j2, i710.C17660a c17660a, ig60 ig60Var) {
        int iM139795H;
        ig60Var.m139809V(10);
        int iM139827q = ig60Var.m139827q();
        s1l0 s1l0Var = null;
        if (iM139827q <= 0) {
            return null;
        }
        int i = c17660a.f113229d;
        long jM105110W0 = bmk0.m105110W0(iM139827q, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iM139801N = ig60Var.m139801N();
        int iM139801N2 = ig60Var.m139801N();
        int iM139801N3 = ig60Var.m139801N();
        int i2 = 2;
        ig60Var.m139809V(2);
        long j3 = j2 + ((long) c17660a.f113228c);
        long[] jArr = new long[iM139801N];
        long[] jArr2 = new long[iM139801N];
        int i3 = 0;
        long j4 = j2;
        while (i3 < iM139801N) {
            s1l0 s1l0Var2 = s1l0Var;
            int i4 = iM139801N2;
            long[] jArr3 = jArr;
            jArr3[i3] = (((long) i3) * jM105110W0) / ((long) iM139801N);
            jArr2[i3] = Math.max(j4, j3);
            if (iM139801N3 == 1) {
                iM139795H = ig60Var.m139795H();
            } else if (iM139801N3 == i2) {
                iM139795H = ig60Var.m139801N();
            } else if (iM139801N3 == 3) {
                iM139795H = ig60Var.m139798K();
            } else {
                if (iM139801N3 != 4) {
                    return s1l0Var2;
                }
                iM139795H = ig60Var.m139799L();
            }
            j4 += ((long) iM139795H) * ((long) i4);
            i3++;
            s1l0Var = s1l0Var2;
            iM139801N2 = i4;
            jArr = jArr3;
            j3 = j3;
            i2 = 2;
        }
        long[] jArr4 = jArr;
        if (j != -1 && j != j4) {
            kyv.m152151i("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new s1l0(jArr4, jArr2, jM105110W0, j4);
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: c */
    public long mo128052c(long j) {
        return this.f165794a[bmk0.m105141i(this.f165795b, j, true, true)];
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        int iM105141i = bmk0.m105141i(this.f165794a, j, true, true);
        oke0 oke0Var = new oke0(this.f165794a[iM105141i], this.f165795b[iM105141i]);
        if (oke0Var.f147751a >= j || iM105141i == this.f165794a.length - 1) {
            return new mke0.C18640a(oke0Var);
        }
        int i = iM105141i + 1;
        return new mke0.C18640a(oke0Var, new oke0(this.f165794a[i], this.f165795b[i]));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: g */
    public long mo128053g() {
        return this.f165797d;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f165796c;
    }
}
