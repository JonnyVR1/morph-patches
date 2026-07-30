package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class qcr0 implements ncr0 {

    /* JADX INFO: renamed from: a */
    public final long f153811a;

    /* JADX INFO: renamed from: b */
    public final int f153812b;

    /* JADX INFO: renamed from: c */
    public final long f153813c;

    /* JADX INFO: renamed from: d */
    public final long f153814d;

    /* JADX INFO: renamed from: e */
    public final long f153815e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f153816f;

    public qcr0(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f153811a = j;
        this.f153812b = i;
        this.f153813c = j2;
        this.f153816f = jArr;
        this.f153814d = j3;
        this.f153815e = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static qcr0 m173924c(long j, pcr0 pcr0Var, long j2) {
        long j3 = pcr0Var.f148224b;
        if (j3 == -1) {
            j3 = -1;
        }
        p6r0 p6r0Var = pcr0Var.f148223a;
        long jM126050G = ggw0.m126050G((j3 * ((long) p6r0Var.f147435g)) - 1, p6r0Var.f147432d);
        long j4 = pcr0Var.f148225c;
        if (j4 == -1 || pcr0Var.f148228f == null) {
            return new qcr0(j2, pcr0Var.f148223a.f147431c, jM126050G, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                svv0.m186111f("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        return new qcr0(j2, pcr0Var.f148223a.f147431c, jM126050G, pcr0Var.f148225c, pcr0Var.f148228f);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        if (!zzh()) {
            w6r0 w6r0Var = new w6r0(0L, this.f153811a + ((long) this.f153812b));
            return new t6r0(w6r0Var, w6r0Var);
        }
        long jMax = Math.max(0L, Math.min(j, this.f153813c));
        double d = (jMax * 100.0d) / this.f153813c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f153816f;
                f5v0.m119531b(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.f153814d;
        w6r0 w6r0Var2 = new w6r0(jMax, this.f153811a + Math.max(this.f153812b, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new t6r0(w6r0Var2, w6r0Var2);
    }

    @Override // p149l.ncr0
    /* JADX INFO: renamed from: b */
    public final long mo125519b(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.f153811a;
        if (j2 <= this.f153812b) {
            return 0L;
        }
        long[] jArr = this.f153816f;
        f5v0.m119531b(jArr);
        double d = (j2 * 256.0d) / this.f153814d;
        int iM126076r = ggw0.m126076r(jArr, (long) d, true, true);
        long jM173925d = m173925d(iM126076r);
        long j3 = jArr[iM126076r];
        int i = iM126076r + 1;
        long jM173925d2 = m173925d(i);
        long j4 = iM126076r == 99 ? 256L : jArr[i];
        return jM173925d + Math.round((j3 == j4 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (j4 - j3)) * (jM173925d2 - jM173925d));
    }

    /* JADX INFO: renamed from: d */
    public final long m173925d(int i) {
        return (this.f153813c * ((long) i)) / 100;
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f153813c;
    }

    @Override // p149l.ncr0
    public final long zzc() {
        return this.f153815e;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return this.f153816f != null;
    }
}
