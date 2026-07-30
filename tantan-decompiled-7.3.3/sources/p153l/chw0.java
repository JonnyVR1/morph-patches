package p153l;

import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;

/* JADX INFO: loaded from: classes6.dex */
public final class chw0 {

    /* JADX INFO: renamed from: c */
    public static final chw0 f81875c = new chw0(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final chw0 f81876d = new chw0(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f81877a;

    /* JADX INFO: renamed from: b */
    public final int f81878b;

    public chw0(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        lev0.m153956d(z);
        this.f81877a = i;
        this.f81878b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m109847a() {
        return this.f81878b;
    }

    /* JADX INFO: renamed from: b */
    public final int m109848b() {
        return this.f81877a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof chw0) {
            chw0 chw0Var = (chw0) obj;
            if (this.f81877a == chw0Var.f81877a && this.f81878b == chw0Var.f81878b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f81877a;
        return this.f81878b ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        return this.f81877a + BaseSei.f14624X + this.f81878b;
    }
}
