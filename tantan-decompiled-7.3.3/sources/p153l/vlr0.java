package p153l;

import androidx.annotation.Nullable;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes6.dex */
public final class vlr0 {

    /* JADX INFO: renamed from: a */
    public final vfr0 f184628a;

    /* JADX INFO: renamed from: b */
    public final long f184629b;

    /* JADX INFO: renamed from: c */
    public final long f184630c;

    /* JADX INFO: renamed from: d */
    public final int f184631d;

    /* JADX INFO: renamed from: e */
    public final int f184632e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f184633f;

    public vlr0(vfr0 vfr0Var, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.f184628a = vfr0Var;
        this.f184629b = j;
        this.f184630c = j2;
        this.f184633f = jArr;
        this.f184631d = i;
        this.f184632e = i2;
    }

    /* JADX INFO: renamed from: a */
    public static vlr0 m201658a(vfr0 vfr0Var, bgw0 bgw0Var) {
        long[] jArr;
        int i;
        int i2;
        int iM104280v = bgw0Var.m104280v();
        int iM104248E = (iM104280v & 1) != 0 ? bgw0Var.m104248E() : -1;
        long jM104253J = (iM104280v & 2) != 0 ? bgw0Var.m104253J() : -1L;
        if ((iM104280v & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = bgw0Var.m104245B();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iM104280v & 8) != 0) {
            bgw0Var.m104270l(4);
        }
        if (bgw0Var.m104275q() >= 24) {
            bgw0Var.m104270l(21);
            int iM104247D = bgw0Var.m104247D();
            i2 = iM104247D & UnixStat.PERM_MASK;
            i = iM104247D >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new vlr0(vfr0Var, iM104248E, jM104253J, jArr2, i, i2);
    }
}
