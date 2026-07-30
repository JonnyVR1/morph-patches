package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class msk0 implements kce0 {

    /* JADX INFO: renamed from: a */
    public final long[] f135506a;

    /* JADX INFO: renamed from: b */
    public final long[] f135507b;

    /* JADX INFO: renamed from: c */
    public final long f135508c;

    /* JADX INFO: renamed from: d */
    public final long f135509d;

    public msk0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f135506a = jArr;
        this.f135507b = jArr2;
        this.f135508c = j;
        this.f135509d = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static msk0 m156150a(long j, long j2, yy00.C21578a c21578a, d860 d860Var) {
        int iM110279H;
        d860Var.m110293V(10);
        int iM110311q = d860Var.m110311q();
        msk0 msk0Var = null;
        if (iM110311q <= 0) {
            return null;
        }
        int i = c21578a.f200702d;
        long jM197832W0 = vck0.m197832W0(iM110311q, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iM110285N = d860Var.m110285N();
        int iM110285N2 = d860Var.m110285N();
        int iM110285N3 = d860Var.m110285N();
        int i2 = 2;
        d860Var.m110293V(2);
        long j3 = j2 + ((long) c21578a.f200701c);
        long[] jArr = new long[iM110285N];
        long[] jArr2 = new long[iM110285N];
        int i3 = 0;
        long j4 = j2;
        while (i3 < iM110285N) {
            msk0 msk0Var2 = msk0Var;
            int i4 = iM110285N2;
            long[] jArr3 = jArr;
            jArr3[i3] = (((long) i3) * jM197832W0) / ((long) iM110285N);
            jArr2[i3] = Math.max(j4, j3);
            if (iM110285N3 == 1) {
                iM110279H = d860Var.m110279H();
            } else if (iM110285N3 == i2) {
                iM110279H = d860Var.m110285N();
            } else if (iM110285N3 == 3) {
                iM110279H = d860Var.m110282K();
            } else {
                if (iM110285N3 != 4) {
                    return msk0Var2;
                }
                iM110279H = d860Var.m110283L();
            }
            j4 += ((long) iM110279H) * ((long) i4);
            i3++;
            msk0Var = msk0Var2;
            iM110285N2 = i4;
            jArr = jArr3;
            j3 = j3;
            i2 = 2;
        }
        long[] jArr4 = jArr;
        if (j != -1 && j != j4) {
            jwv.m143689i("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new msk0(jArr4, jArr2, jM197832W0, j4);
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: c */
    public long mo99379c(long j) {
        return this.f135506a[vck0.m197863i(this.f135507b, j, true, true)];
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        int iM197863i = vck0.m197863i(this.f135506a, j, true, true);
        jce0 jce0Var = new jce0(this.f135506a[iM197863i], this.f135507b[iM197863i]);
        if (jce0Var.f117295a >= j || iM197863i == this.f135506a.length - 1) {
            return new hce0.C17274a(jce0Var);
        }
        int i = iM197863i + 1;
        return new hce0.C17274a(jce0Var, new jce0(this.f135506a[i], this.f135507b[i]));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: g */
    public long mo99380g() {
        return this.f135509d;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f135508c;
    }
}
