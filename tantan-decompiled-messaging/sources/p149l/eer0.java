package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class eer0 {

    /* JADX INFO: renamed from: a */
    public final ber0 f90773a;

    /* JADX INFO: renamed from: b */
    public final int f90774b;

    /* JADX INFO: renamed from: c */
    public final long[] f90775c;

    /* JADX INFO: renamed from: d */
    public final int[] f90776d;

    /* JADX INFO: renamed from: e */
    public final int f90777e;

    /* JADX INFO: renamed from: f */
    public final long[] f90778f;

    /* JADX INFO: renamed from: g */
    public final int[] f90779g;

    /* JADX INFO: renamed from: h */
    public final long f90780h;

    public eer0(ber0 ber0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        f5v0.m119533d(length == length2);
        int length3 = jArr.length;
        f5v0.m119533d(length3 == length2);
        int length4 = iArr2.length;
        f5v0.m119533d(length4 == length2);
        this.f90773a = ber0Var;
        this.f90775c = jArr;
        this.f90776d = iArr;
        this.f90777e = i;
        this.f90778f = jArr2;
        this.f90779g = iArr2;
        this.f90780h = j;
        this.f90774b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m115988a(long j) {
        for (int iM126076r = ggw0.m126076r(this.f90778f, j, true, false); iM126076r >= 0; iM126076r--) {
            if ((this.f90779g[iM126076r] & 1) != 0) {
                return iM126076r;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m115989b(long j) {
        for (int iM126074p = ggw0.m126074p(this.f90778f, j, true, false); iM126074p < this.f90778f.length; iM126074p++) {
            if ((this.f90779g[iM126074p] & 1) != 0) {
                return iM126074p;
            }
        }
        return -1;
    }
}
