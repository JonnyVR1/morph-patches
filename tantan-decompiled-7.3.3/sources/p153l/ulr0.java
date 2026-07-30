package p153l;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class ulr0 implements tlr0 {

    /* JADX INFO: renamed from: a */
    public final long[] f179550a;

    /* JADX INFO: renamed from: b */
    public final long[] f179551b;

    /* JADX INFO: renamed from: c */
    public final long f179552c;

    /* JADX INFO: renamed from: d */
    public final long f179553d;

    public ulr0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f179550a = jArr;
        this.f179551b = jArr2;
        this.f179552c = j;
        this.f179553d = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ulr0 m196563c(long j, long j2, vfr0 vfr0Var, bgw0 bgw0Var) {
        int iM104245B;
        bgw0Var.m104270l(10);
        int iM104280v = bgw0Var.m104280v();
        if (iM104280v <= 0) {
            return null;
        }
        int i = vfr0Var.f183969d;
        long jM159395H = mpw0.m159395H(iM104280v, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i, RoundingMode.FLOOR);
        int iM104249F = bgw0Var.m104249F();
        int iM104249F2 = bgw0Var.m104249F();
        int iM104249F3 = bgw0Var.m104249F();
        bgw0Var.m104270l(2);
        long j3 = j2 + ((long) vfr0Var.f183968c);
        long[] jArr = new long[iM104249F];
        long[] jArr2 = new long[iM104249F];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iM104249F) {
            long j5 = j3;
            long[] jArr3 = jArr2;
            jArr[i2] = (((long) i2) * jM159395H) / ((long) iM104249F);
            jArr3[i2] = Math.max(j4, j5);
            if (iM104249F3 == 1) {
                iM104245B = bgw0Var.m104245B();
            } else if (iM104249F3 == 2) {
                iM104245B = bgw0Var.m104249F();
            } else if (iM104249F3 == 3) {
                iM104245B = bgw0Var.m104247D();
            } else {
                if (iM104249F3 != 4) {
                    return null;
                }
                iM104245B = bgw0Var.m104248E();
            }
            j4 += ((long) iM104245B) * ((long) iM104249F2);
            i2++;
            jArr2 = jArr3;
            j3 = j5;
        }
        long[] jArr4 = jArr2;
        if (j != -1 && j != j4) {
            y4w0.m214278f("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new ulr0(jArr, jArr4, jM159395H, j4);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        long[] jArr = this.f179550a;
        int iM159420r = mpw0.m159420r(jArr, j, true, true);
        cgr0 cgr0Var = new cgr0(jArr[iM159420r], this.f179551b[iM159420r]);
        if (cgr0Var.f81726a < j) {
            long[] jArr2 = this.f179550a;
            if (iM159420r != jArr2.length - 1) {
                int i = iM159420r + 1;
                return new zfr0(cgr0Var, new cgr0(jArr2[i], this.f179551b[i]));
            }
        }
        return new zfr0(cgr0Var, cgr0Var);
    }

    @Override // p153l.tlr0
    /* JADX INFO: renamed from: b */
    public final long mo158947b(long j) {
        return this.f179550a[mpw0.m159420r(this.f179551b, j, true, true)];
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f179552c;
    }

    @Override // p153l.tlr0
    public final long zzc() {
        return this.f179553d;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
