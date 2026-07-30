package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class rzw0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final int f165635a;

    /* JADX INFO: renamed from: b */
    public final int f165636b;

    /* JADX INFO: renamed from: c */
    public final int f165637c = 16;

    /* JADX INFO: renamed from: d */
    public final pzw0 f165638d;

    public /* synthetic */ rzw0(int i, int i2, int i3, pzw0 pzw0Var, qzw0 qzw0Var) {
        this.f165635a = i;
        this.f165636b = i2;
        this.f165638d = pzw0Var;
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f165638d != pzw0.f154986d;
    }

    /* JADX INFO: renamed from: b */
    public final int m183862b() {
        return this.f165636b;
    }

    /* JADX INFO: renamed from: c */
    public final int m183863c() {
        return this.f165635a;
    }

    /* JADX INFO: renamed from: d */
    public final pzw0 m183864d() {
        return this.f165638d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rzw0)) {
            return false;
        }
        rzw0 rzw0Var = (rzw0) obj;
        return rzw0Var.f165635a == this.f165635a && rzw0Var.f165636b == this.f165636b && rzw0Var.f165638d == this.f165638d;
    }

    public final int hashCode() {
        return Objects.hash(rzw0.class, Integer.valueOf(this.f165635a), Integer.valueOf(this.f165636b), 16, this.f165638d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f165638d) + ", " + this.f165636b + "-byte IV, 16-byte tag, and " + this.f165635a + "-byte key)";
    }
}
