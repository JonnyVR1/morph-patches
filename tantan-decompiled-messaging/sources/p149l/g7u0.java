package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class g7u0 {

    /* JADX INFO: renamed from: e */
    public static final String f101437e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    public static final String f101438f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g */
    public static final String f101439g = Integer.toString(3, 36);

    /* JADX INFO: renamed from: h */
    public static final String f101440h = Integer.toString(4, 36);

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final g8y0 f101441i = new g8y0() { // from class: l.z5u0
    };

    /* JADX INFO: renamed from: a */
    public final int f101442a;

    /* JADX INFO: renamed from: b */
    public final ntt0 f101443b;

    /* JADX INFO: renamed from: c */
    public final int[] f101444c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f101445d;

    public g7u0(ntt0 ntt0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = ntt0Var.f140535a;
        this.f101442a = 1;
        this.f101443b = ntt0Var;
        this.f101444c = (int[]) iArr.clone();
        this.f101445d = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m124734a() {
        return this.f101443b.f140537c;
    }

    /* JADX INFO: renamed from: b */
    public final mhr0 m124735b(int i) {
        return this.f101443b.m161414b(0);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m124736c() {
        for (boolean z : this.f101445d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m124737d(int i) {
        return this.f101445d[0];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g7u0.class == obj.getClass()) {
            g7u0 g7u0Var = (g7u0) obj;
            if (this.f101443b.equals(g7u0Var.f101443b) && Arrays.equals(this.f101444c, g7u0Var.f101444c) && Arrays.equals(this.f101445d, g7u0Var.f101445d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f101443b.hashCode() * 961) + Arrays.hashCode(this.f101444c)) * 31) + Arrays.hashCode(this.f101445d);
    }
}
