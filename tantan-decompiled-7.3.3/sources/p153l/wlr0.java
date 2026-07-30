package p153l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class wlr0 implements tlr0 {

    /* JADX INFO: renamed from: a */
    public final long f189725a;

    /* JADX INFO: renamed from: b */
    public final int f189726b;

    /* JADX INFO: renamed from: c */
    public final long f189727c;

    /* JADX INFO: renamed from: d */
    public final long f189728d;

    /* JADX INFO: renamed from: e */
    public final long f189729e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f189730f;

    public wlr0(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f189725a = j;
        this.f189726b = i;
        this.f189727c = j2;
        this.f189730f = jArr;
        this.f189728d = j3;
        this.f189729e = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static wlr0 m207071c(long j, vlr0 vlr0Var, long j2) {
        long j3 = vlr0Var.f184629b;
        if (j3 == -1) {
            j3 = -1;
        }
        vfr0 vfr0Var = vlr0Var.f184628a;
        long jM159394G = mpw0.m159394G((j3 * ((long) vfr0Var.f183972g)) - 1, vfr0Var.f183969d);
        long j4 = vlr0Var.f184630c;
        if (j4 == -1 || vlr0Var.f184633f == null) {
            return new wlr0(j2, vlr0Var.f184628a.f183968c, jM159394G, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                y4w0.m214278f("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        return new wlr0(j2, vlr0Var.f184628a.f183968c, jM159394G, vlr0Var.f184630c, vlr0Var.f184633f);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        if (!zzh()) {
            cgr0 cgr0Var = new cgr0(0L, this.f189725a + ((long) this.f189726b));
            return new zfr0(cgr0Var, cgr0Var);
        }
        long jMax = Math.max(0L, Math.min(j, this.f189727c));
        double d = (jMax * 100.0d) / this.f189727c;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f189730f;
                lev0.m153954b(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.f189728d;
        cgr0 cgr0Var2 = new cgr0(jMax, this.f189725a + Math.max(this.f189726b, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zfr0(cgr0Var2, cgr0Var2);
    }

    @Override // p153l.tlr0
    /* JADX INFO: renamed from: b */
    public final long mo158947b(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.f189725a;
        if (j2 <= this.f189726b) {
            return 0L;
        }
        long[] jArr = this.f189730f;
        lev0.m153954b(jArr);
        double d = (j2 * 256.0d) / this.f189728d;
        int iM159420r = mpw0.m159420r(jArr, (long) d, true, true);
        long jM207072d = m207072d(iM159420r);
        long j3 = jArr[iM159420r];
        int i = iM159420r + 1;
        long jM207072d2 = m207072d(i);
        long j4 = iM159420r == 99 ? 256L : jArr[i];
        return jM207072d + Math.round((j3 == j4 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (j4 - j3)) * (jM207072d2 - jM207072d));
    }

    /* JADX INFO: renamed from: d */
    public final long m207072d(int i) {
        return (this.f189727c * ((long) i)) / 100;
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f189727c;
    }

    @Override // p153l.tlr0
    public final long zzc() {
        return this.f189729e;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return this.f189730f != null;
    }
}
