package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class knr0 {

    /* JADX INFO: renamed from: a */
    public final hnr0 f127628a;

    /* JADX INFO: renamed from: b */
    public final int f127629b;

    /* JADX INFO: renamed from: c */
    public final long[] f127630c;

    /* JADX INFO: renamed from: d */
    public final int[] f127631d;

    /* JADX INFO: renamed from: e */
    public final int f127632e;

    /* JADX INFO: renamed from: f */
    public final long[] f127633f;

    /* JADX INFO: renamed from: g */
    public final int[] f127634g;

    /* JADX INFO: renamed from: h */
    public final long f127635h;

    public knr0(hnr0 hnr0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        lev0.m153956d(length == length2);
        int length3 = jArr.length;
        lev0.m153956d(length3 == length2);
        int length4 = iArr2.length;
        lev0.m153956d(length4 == length2);
        this.f127628a = hnr0Var;
        this.f127630c = jArr;
        this.f127631d = iArr;
        this.f127632e = i;
        this.f127633f = jArr2;
        this.f127634g = iArr2;
        this.f127635h = j;
        this.f127629b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m150550a(long j) {
        for (int iM159420r = mpw0.m159420r(this.f127633f, j, true, false); iM159420r >= 0; iM159420r--) {
            if ((this.f127634g[iM159420r] & 1) != 0) {
                return iM159420r;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m150551b(long j) {
        for (int iM159418p = mpw0.m159418p(this.f127633f, j, true, false); iM159418p < this.f127633f.length; iM159418p++) {
            if ((this.f127634g[iM159418p] & 1) != 0) {
                return iM159418p;
            }
        }
        return -1;
    }
}
