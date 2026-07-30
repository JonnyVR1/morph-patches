package p149l;

import androidx.annotation.Nullable;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes6.dex */
public final class pcr0 {

    /* JADX INFO: renamed from: a */
    public final p6r0 f148223a;

    /* JADX INFO: renamed from: b */
    public final long f148224b;

    /* JADX INFO: renamed from: c */
    public final long f148225c;

    /* JADX INFO: renamed from: d */
    public final int f148226d;

    /* JADX INFO: renamed from: e */
    public final int f148227e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final long[] f148228f;

    public pcr0(p6r0 p6r0Var, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.f148223a = p6r0Var;
        this.f148224b = j;
        this.f148225c = j2;
        this.f148228f = jArr;
        this.f148226d = i;
        this.f148227e = i2;
    }

    /* JADX INFO: renamed from: a */
    public static pcr0 m168370a(p6r0 p6r0Var, v6w0 v6w0Var) {
        long[] jArr;
        int i;
        int i2;
        int iM197273v = v6w0Var.m197273v();
        int iM197241E = (iM197273v & 1) != 0 ? v6w0Var.m197241E() : -1;
        long jM197246J = (iM197273v & 2) != 0 ? v6w0Var.m197246J() : -1L;
        if ((iM197273v & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = v6w0Var.m197238B();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iM197273v & 8) != 0) {
            v6w0Var.m197263l(4);
        }
        if (v6w0Var.m197268q() >= 24) {
            v6w0Var.m197263l(21);
            int iM197240D = v6w0Var.m197240D();
            i2 = iM197240D & UnixStat.PERM_MASK;
            i = iM197240D >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new pcr0(p6r0Var, iM197241E, jM197246J, jArr2, i, i2);
    }
}
