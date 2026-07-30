package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class q6j0 {

    /* JADX INFO: renamed from: a */
    public final u5j0 f152911a;

    /* JADX INFO: renamed from: b */
    public final int f152912b;

    /* JADX INFO: renamed from: c */
    public final long[] f152913c;

    /* JADX INFO: renamed from: d */
    public final int[] f152914d;

    /* JADX INFO: renamed from: e */
    public final int f152915e;

    /* JADX INFO: renamed from: f */
    public final long[] f152916f;

    /* JADX INFO: renamed from: g */
    public final int[] f152917g;

    /* JADX INFO: renamed from: h */
    public final long f152918h;

    public q6j0(u5j0 u5j0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        p11.m167007a(iArr.length == jArr2.length);
        p11.m167007a(jArr.length == jArr2.length);
        p11.m167007a(iArr2.length == jArr2.length);
        this.f152911a = u5j0Var;
        this.f152913c = jArr;
        this.f152914d = iArr;
        this.f152915e = i;
        this.f152916f = jArr2;
        this.f152917g = iArr2;
        this.f152918h = j;
        this.f152912b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m173145a(long j) {
        for (int iM197863i = vck0.m197863i(this.f152916f, j, true, false); iM197863i >= 0; iM197863i--) {
            if ((this.f152917g[iM197863i] & 1) != 0) {
                return iM197863i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public int m173146b(long j) {
        for (int iM197851e = vck0.m197851e(this.f152916f, j, true, false); iM197851e < this.f152916f.length; iM197851e++) {
            if ((this.f152917g[iM197851e] & 1) != 0) {
                return iM197851e;
            }
        }
        return -1;
    }
}
