package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zwx0 {

    /* JADX INFO: renamed from: a */
    public final String f206394a;

    /* JADX INFO: renamed from: b */
    public final sqr0 f206395b;

    /* JADX INFO: renamed from: c */
    public final sqr0 f206396c;

    /* JADX INFO: renamed from: d */
    public final int f206397d;

    /* JADX INFO: renamed from: e */
    public final int f206398e;

    public zwx0(String str, sqr0 sqr0Var, sqr0 sqr0Var2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        lev0.m153956d(z);
        lev0.m153955c(str);
        this.f206394a = str;
        this.f206395b = sqr0Var;
        sqr0Var2.getClass();
        this.f206396c = sqr0Var2;
        this.f206397d = i;
        this.f206398e = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zwx0.class == obj.getClass()) {
            zwx0 zwx0Var = (zwx0) obj;
            if (this.f206397d == zwx0Var.f206397d && this.f206398e == zwx0Var.f206398e && this.f206394a.equals(zwx0Var.f206394a) && this.f206395b.equals(zwx0Var.f206395b) && this.f206396c.equals(zwx0Var.f206396c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f206397d + 527) * 31) + this.f206398e) * 31) + this.f206394a.hashCode()) * 31) + this.f206395b.hashCode()) * 31) + this.f206396c.hashCode();
    }
}
