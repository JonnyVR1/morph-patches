package p149l;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class ocr0 implements ncr0 {

    /* JADX INFO: renamed from: a */
    public final long[] f143092a;

    /* JADX INFO: renamed from: b */
    public final long[] f143093b;

    /* JADX INFO: renamed from: c */
    public final long f143094c;

    /* JADX INFO: renamed from: d */
    public final long f143095d;

    public ocr0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f143092a = jArr;
        this.f143093b = jArr2;
        this.f143094c = j;
        this.f143095d = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ocr0 m163556c(long j, long j2, p6r0 p6r0Var, v6w0 v6w0Var) {
        int iM197238B;
        v6w0Var.m197263l(10);
        int iM197273v = v6w0Var.m197273v();
        if (iM197273v <= 0) {
            return null;
        }
        int i = p6r0Var.f147432d;
        long jM126051H = ggw0.m126051H(iM197273v, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i, RoundingMode.FLOOR);
        int iM197242F = v6w0Var.m197242F();
        int iM197242F2 = v6w0Var.m197242F();
        int iM197242F3 = v6w0Var.m197242F();
        v6w0Var.m197263l(2);
        long j3 = j2 + ((long) p6r0Var.f147431c);
        long[] jArr = new long[iM197242F];
        long[] jArr2 = new long[iM197242F];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iM197242F) {
            long j5 = j3;
            long[] jArr3 = jArr2;
            jArr[i2] = (((long) i2) * jM126051H) / ((long) iM197242F);
            jArr3[i2] = Math.max(j4, j5);
            if (iM197242F3 == 1) {
                iM197238B = v6w0Var.m197238B();
            } else if (iM197242F3 == 2) {
                iM197238B = v6w0Var.m197242F();
            } else if (iM197242F3 == 3) {
                iM197238B = v6w0Var.m197240D();
            } else {
                if (iM197242F3 != 4) {
                    return null;
                }
                iM197238B = v6w0Var.m197241E();
            }
            j4 += ((long) iM197238B) * ((long) iM197242F2);
            i2++;
            jArr2 = jArr3;
            j3 = j5;
        }
        long[] jArr4 = jArr2;
        if (j != -1 && j != j4) {
            svv0.m186111f("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new ocr0(jArr, jArr4, jM126051H, j4);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        long[] jArr = this.f143092a;
        int iM126076r = ggw0.m126076r(jArr, j, true, true);
        w6r0 w6r0Var = new w6r0(jArr[iM126076r], this.f143093b[iM126076r]);
        if (w6r0Var.f184990a < j) {
            long[] jArr2 = this.f143092a;
            if (iM126076r != jArr2.length - 1) {
                int i = iM126076r + 1;
                return new t6r0(w6r0Var, new w6r0(jArr2[i], this.f143093b[i]));
            }
        }
        return new t6r0(w6r0Var, w6r0Var);
    }

    @Override // p149l.ncr0
    /* JADX INFO: renamed from: b */
    public final long mo125519b(long j) {
        return this.f143092a[ggw0.m126076r(this.f143093b, j, true, true)];
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f143094c;
    }

    @Override // p149l.ncr0
    public final long zzc() {
        return this.f143095d;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
