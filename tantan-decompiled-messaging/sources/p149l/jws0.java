package p149l;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class jws0 {

    /* JADX INFO: renamed from: i */
    public static final String f120109i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j */
    public static final String f120110j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k */
    public static final String f120111k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l */
    public static final String f120112l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m */
    public static final String f120113m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n */
    public static final String f120114n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o */
    public static final String f120115o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: p */
    public static final String f120116p = Integer.toString(7, 36);

    /* JADX INFO: renamed from: q */
    @VisibleForTesting
    public static final String f120117q = Integer.toString(8, 36);

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final g8y0 f120118r = new g8y0() { // from class: l.rzr0
    };

    /* JADX INFO: renamed from: a */
    public final long f120119a;

    /* JADX INFO: renamed from: b */
    public final int f120120b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final Uri[] f120121c;

    /* JADX INFO: renamed from: d */
    public final nis0[] f120122d;

    /* JADX INFO: renamed from: e */
    public final int[] f120123e;

    /* JADX INFO: renamed from: f */
    public final long[] f120124f;

    /* JADX INFO: renamed from: g */
    public final long f120125g;

    /* JADX INFO: renamed from: h */
    public final boolean f120126h;

    public jws0(long j, int i, int i2, int[] iArr, nis0[] nis0VarArr, long[] jArr, long j2, boolean z) {
        Uri uri;
        int length = iArr.length;
        int length2 = nis0VarArr.length;
        int i3 = 0;
        f5v0.m119533d(length == length2);
        this.f120119a = 0L;
        this.f120120b = i;
        this.f120123e = iArr;
        this.f120122d = nis0VarArr;
        this.f120124f = jArr;
        this.f120125g = 0L;
        this.f120126h = false;
        this.f120121c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f120121c;
            if (i3 >= uriArr.length) {
                return;
            }
            nis0 nis0Var = nis0VarArr[i3];
            if (nis0Var == null) {
                uri = null;
            } else {
                t9s0 t9s0Var = nis0Var.f139152b;
                t9s0Var.getClass();
                uri = t9s0Var.f169062a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m143666a(@IntRange(from = -1) int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f120123e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public final jws0 m143667b(int i) {
        int[] iArr = this.f120123e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f120124f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new jws0(0L, 0, -1, iArrCopyOf, (nis0[]) Arrays.copyOf(this.f120122d, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jws0.class == obj.getClass()) {
            jws0 jws0Var = (jws0) obj;
            if (this.f120120b == jws0Var.f120120b && Arrays.equals(this.f120122d, jws0Var.f120122d) && Arrays.equals(this.f120123e, jws0Var.f120123e) && Arrays.equals(this.f120124f, jws0Var.f120124f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f120120b * 31) - 1) * 961) + Arrays.hashCode(this.f120122d)) * 31) + Arrays.hashCode(this.f120123e)) * 31) + Arrays.hashCode(this.f120124f)) * 961;
    }

    public jws0(long j) {
        this(0L, -1, -1, new int[0], new nis0[0], new long[0], 0L, false);
    }
}
