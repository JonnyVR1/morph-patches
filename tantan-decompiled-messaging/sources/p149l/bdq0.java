package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bdq0 implements kce0 {

    /* JADX INFO: renamed from: a */
    public final long f75049a;

    /* JADX INFO: renamed from: b */
    public final int f75050b;

    /* JADX INFO: renamed from: c */
    public final long f75051c;

    /* JADX INFO: renamed from: d */
    public final long f75052d;

    /* JADX INFO: renamed from: e */
    public final long f75053e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f75054f;

    public bdq0(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f75049a = j;
        this.f75050b = i;
        this.f75051c = j2;
        this.f75054f = jArr;
        this.f75052d = j3;
        this.f75053e = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static bdq0 m101201a(long j, long j2, yy00.C21578a c21578a, d860 d860Var) {
        int iM110283L;
        int i = c21578a.f200705g;
        int i2 = c21578a.f200702d;
        int iM110311q = d860Var.m110311q();
        if ((iM110311q & 1) != 1 || (iM110283L = d860Var.m110283L()) == 0) {
            return null;
        }
        long jM197832W0 = vck0.m197832W0(iM110283L, ((long) i) * 1000000, i2);
        if ((iM110311q & 6) != 6) {
            return new bdq0(j2, c21578a.f200701c, jM197832W0);
        }
        long jM110281J = d860Var.m110281J();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = d860Var.m110279H();
        }
        if (j != -1) {
            long j3 = j2 + jM110281J;
            if (j != j3) {
                jwv.m143689i("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new bdq0(j2, c21578a.f200701c, jM197832W0, jM110281J, jArr);
    }

    /* JADX INFO: renamed from: b */
    public final long m101202b(int i) {
        return (this.f75051c * ((long) i)) / 100;
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: c */
    public long mo99379c(long j) {
        long j2 = j - this.f75049a;
        if (!mo98122e() || j2 <= this.f75050b) {
            return 0L;
        }
        long[] jArr = (long[]) p11.m167015i(this.f75054f);
        double d = (j2 * 256.0d) / this.f75052d;
        int iM197863i = vck0.m197863i(jArr, (long) d, true, true);
        long jM101202b = m101202b(iM197863i);
        long j3 = jArr[iM197863i];
        int i = iM197863i + 1;
        long jM101202b2 = m101202b(i);
        long j4 = iM197863i == 99 ? 256L : jArr[i];
        return jM101202b + Math.round((j3 == j4 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (j4 - j3)) * (jM101202b2 - jM101202b));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        if (!mo98122e()) {
            return new hce0.C17274a(new jce0(0L, this.f75049a + ((long) this.f75050b)));
        }
        long jM197886r = vck0.m197886r(j, 0L, this.f75051c);
        double d = (jM197886r * 100.0d) / this.f75051c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) p11.m167015i(this.f75054f);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new hce0.C17274a(new jce0(jM197886r, this.f75049a + vck0.m197886r(Math.round((d2 / 256.0d) * this.f75052d), this.f75050b, this.f75052d - 1)));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return this.f75054f != null;
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: g */
    public long mo99380g() {
        return this.f75053e;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f75051c;
    }

    public bdq0(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }
}
