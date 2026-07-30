package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mgu0 {

    /* JADX INFO: renamed from: e */
    public static final String f136787e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f */
    public static final String f136788f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g */
    public static final String f136789g = Integer.toString(3, 36);

    /* JADX INFO: renamed from: h */
    public static final String f136790h = Integer.toString(4, 36);

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final mhy0 f136791i = new mhy0() { // from class: l.ffu0
    };

    /* JADX INFO: renamed from: a */
    public final int f136792a;

    /* JADX INFO: renamed from: b */
    public final t2u0 f136793b;

    /* JADX INFO: renamed from: c */
    public final int[] f136794c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f136795d;

    public mgu0(t2u0 t2u0Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = t2u0Var.f171820a;
        this.f136792a = 1;
        this.f136793b = t2u0Var;
        this.f136794c = (int[]) iArr.clone();
        this.f136795d = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m158387a() {
        return this.f136793b.f171822c;
    }

    /* JADX INFO: renamed from: b */
    public final sqr0 m158388b(int i) {
        return this.f136793b.m189003b(0);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m158389c() {
        for (boolean z : this.f136795d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m158390d(int i) {
        return this.f136795d[0];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mgu0.class == obj.getClass()) {
            mgu0 mgu0Var = (mgu0) obj;
            if (this.f136793b.equals(mgu0Var.f136793b) && Arrays.equals(this.f136794c, mgu0Var.f136794c) && Arrays.equals(this.f136795d, mgu0Var.f136795d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f136793b.hashCode() * 961) + Arrays.hashCode(this.f136794c)) * 31) + Arrays.hashCode(this.f136795d);
    }
}
