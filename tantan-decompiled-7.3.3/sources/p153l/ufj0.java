package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ufj0 {

    /* JADX INFO: renamed from: a */
    public final yej0 f178773a;

    /* JADX INFO: renamed from: b */
    public final int f178774b;

    /* JADX INFO: renamed from: c */
    public final long[] f178775c;

    /* JADX INFO: renamed from: d */
    public final int[] f178776d;

    /* JADX INFO: renamed from: e */
    public final int f178777e;

    /* JADX INFO: renamed from: f */
    public final long[] f178778f;

    /* JADX INFO: renamed from: g */
    public final int[] f178779g;

    /* JADX INFO: renamed from: h */
    public final long f178780h;

    public ufj0(yej0 yej0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        w11.m204365a(iArr.length == jArr2.length);
        w11.m204365a(jArr.length == jArr2.length);
        w11.m204365a(iArr2.length == jArr2.length);
        this.f178773a = yej0Var;
        this.f178775c = jArr;
        this.f178776d = iArr;
        this.f178777e = i;
        this.f178778f = jArr2;
        this.f178779g = iArr2;
        this.f178780h = j;
        this.f178774b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m195842a(long j) {
        for (int iM105141i = bmk0.m105141i(this.f178778f, j, true, false); iM105141i >= 0; iM105141i--) {
            if ((this.f178779g[iM105141i] & 1) != 0) {
                return iM105141i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public int m195843b(long j) {
        for (int iM105129e = bmk0.m105129e(this.f178778f, j, true, false); iM105129e < this.f178778f.length; iM105129e++) {
            if ((this.f178779g[iM105129e] & 1) != 0) {
                return iM105129e;
            }
        }
        return -1;
    }
}
