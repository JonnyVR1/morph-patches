package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class lqw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final int f129442a;

    /* JADX INFO: renamed from: b */
    public final int f129443b;

    /* JADX INFO: renamed from: c */
    public final int f129444c = 16;

    /* JADX INFO: renamed from: d */
    public final jqw0 f129445d;

    public /* synthetic */ lqw0(int i, int i2, int i3, jqw0 jqw0Var, kqw0 kqw0Var) {
        this.f129442a = i;
        this.f129443b = i2;
        this.f129445d = jqw0Var;
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f129445d != jqw0.f119331d;
    }

    /* JADX INFO: renamed from: b */
    public final int m151105b() {
        return this.f129443b;
    }

    /* JADX INFO: renamed from: c */
    public final int m151106c() {
        return this.f129442a;
    }

    /* JADX INFO: renamed from: d */
    public final jqw0 m151107d() {
        return this.f129445d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lqw0)) {
            return false;
        }
        lqw0 lqw0Var = (lqw0) obj;
        return lqw0Var.f129442a == this.f129442a && lqw0Var.f129443b == this.f129443b && lqw0Var.f129445d == this.f129445d;
    }

    public final int hashCode() {
        return Objects.hash(lqw0.class, Integer.valueOf(this.f129442a), Integer.valueOf(this.f129443b), 16, this.f129445d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f129445d) + ", " + this.f129443b + "-byte IV, 16-byte tag, and " + this.f129442a + "-byte key)";
    }
}
