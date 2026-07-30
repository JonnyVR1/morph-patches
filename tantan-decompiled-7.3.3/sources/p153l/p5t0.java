package p153l;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class p5t0 {

    /* JADX INFO: renamed from: i */
    public static final String f150675i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j */
    public static final String f150676j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k */
    public static final String f150677k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l */
    public static final String f150678l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m */
    public static final String f150679m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n */
    public static final String f150680n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o */
    public static final String f150681o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: p */
    public static final String f150682p = Integer.toString(7, 36);

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public static final String f150683q = Integer.toString(8, 36);

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final mhy0 f150684r = new mhy0() { // from class: l.x8s0
    };

    /* JADX INFO: renamed from: a */
    public final long f150685a;

    /* JADX INFO: renamed from: b */
    public final int f150686b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final Uri[] f150687c;

    /* JADX INFO: renamed from: d */
    public final trs0[] f150688d;

    /* JADX INFO: renamed from: e */
    public final int[] f150689e;

    /* JADX INFO: renamed from: f */
    public final long[] f150690f;

    /* JADX INFO: renamed from: g */
    public final long f150691g;

    /* JADX INFO: renamed from: h */
    public final boolean f150692h;

    public p5t0(long j, int i, int i2, int[] iArr, trs0[] trs0VarArr, long[] jArr, long j2, boolean z) {
        Uri uri;
        int length = iArr.length;
        int length2 = trs0VarArr.length;
        int i3 = 0;
        lev0.m153956d(length == length2);
        this.f150685a = 0L;
        this.f150686b = i;
        this.f150689e = iArr;
        this.f150688d = trs0VarArr;
        this.f150690f = jArr;
        this.f150691g = 0L;
        this.f150692h = false;
        this.f150687c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f150687c;
            if (i3 >= uriArr.length) {
                return;
            }
            trs0 trs0Var = trs0VarArr[i3];
            if (trs0Var == null) {
                uri = null;
            } else {
                zis0 zis0Var = trs0Var.f175939b;
                zis0Var.getClass();
                uri = zis0Var.f204611a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m170680a(@IntRange(from = -1) int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f150689e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public final p5t0 m170681b(int i) {
        int[] iArr = this.f150689e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f150690f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new p5t0(0L, 0, -1, iArrCopyOf, (trs0[]) Arrays.copyOf(this.f150688d, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p5t0.class == obj.getClass()) {
            p5t0 p5t0Var = (p5t0) obj;
            if (this.f150686b == p5t0Var.f150686b && Arrays.equals(this.f150688d, p5t0Var.f150688d) && Arrays.equals(this.f150689e, p5t0Var.f150689e) && Arrays.equals(this.f150690f, p5t0Var.f150690f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f150686b * 31) - 1) * 961) + Arrays.hashCode(this.f150688d)) * 31) + Arrays.hashCode(this.f150689e)) * 31) + Arrays.hashCode(this.f150690f)) * 961;
    }

    public p5t0(long j) {
        this(0L, -1, -1, new int[0], new trs0[0], new long[0], 0L, false);
    }
}
