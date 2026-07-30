package p153l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gmq0 implements pke0 {

    /* JADX INFO: renamed from: a */
    public final long f105023a;

    /* JADX INFO: renamed from: b */
    public final int f105024b;

    /* JADX INFO: renamed from: c */
    public final long f105025c;

    /* JADX INFO: renamed from: d */
    public final long f105026d;

    /* JADX INFO: renamed from: e */
    public final long f105027e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f105028f;

    public gmq0(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f105023a = j;
        this.f105024b = i;
        this.f105025c = j2;
        this.f105028f = jArr;
        this.f105026d = j3;
        this.f105027e = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static gmq0 m130824a(long j, long j2, i710.C17660a c17660a, ig60 ig60Var) {
        int iM139799L;
        int i = c17660a.f113232g;
        int i2 = c17660a.f113229d;
        int iM139827q = ig60Var.m139827q();
        if ((iM139827q & 1) != 1 || (iM139799L = ig60Var.m139799L()) == 0) {
            return null;
        }
        long jM105110W0 = bmk0.m105110W0(iM139799L, ((long) i) * 1000000, i2);
        if ((iM139827q & 6) != 6) {
            return new gmq0(j2, c17660a.f113228c, jM105110W0);
        }
        long jM139797J = ig60Var.m139797J();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ig60Var.m139795H();
        }
        if (j != -1) {
            long j3 = j2 + jM139797J;
            if (j != j3) {
                kyv.m152151i("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new gmq0(j2, c17660a.f113228c, jM105110W0, jM139797J, jArr);
    }

    /* JADX INFO: renamed from: b */
    public final long m130825b(int i) {
        return (this.f105025c * ((long) i)) / 100;
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: c */
    public long mo128052c(long j) {
        long j2 = j - this.f105023a;
        if (!mo107792e() || j2 <= this.f105024b) {
            return 0L;
        }
        long[] jArr = (long[]) w11.m204373i(this.f105028f);
        double d = (j2 * 256.0d) / this.f105026d;
        int iM105141i = bmk0.m105141i(jArr, (long) d, true, true);
        long jM130825b = m130825b(iM105141i);
        long j3 = jArr[iM105141i];
        int i = iM105141i + 1;
        long jM130825b2 = m130825b(i);
        long j4 = iM105141i == 99 ? 256L : jArr[i];
        return jM130825b + Math.round((j3 == j4 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (j4 - j3)) * (jM130825b2 - jM130825b));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        if (!mo107792e()) {
            return new mke0.C18640a(new oke0(0L, this.f105023a + ((long) this.f105024b)));
        }
        long jM105164r = bmk0.m105164r(j, 0L, this.f105025c);
        double d = (jM105164r * 100.0d) / this.f105025c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) w11.m204373i(this.f105028f);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new mke0.C18640a(new oke0(jM105164r, this.f105023a + bmk0.m105164r(Math.round((d2 / 256.0d) * this.f105026d), this.f105024b, this.f105026d - 1)));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return this.f105028f != null;
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: g */
    public long mo128053g() {
        return this.f105027e;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f105025c;
    }

    public gmq0(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }
}
