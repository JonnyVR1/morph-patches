package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class b1x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final int f74403a;

    /* JADX INFO: renamed from: b */
    public final z0x0 f74404b;

    public /* synthetic */ b1x0(int i, z0x0 z0x0Var, a1x0 a1x0Var) {
        this.f74403a = i;
        this.f74404b = z0x0Var;
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f74404b != z0x0.f202437d;
    }

    /* JADX INFO: renamed from: b */
    public final int m101511b() {
        return this.f74403a;
    }

    /* JADX INFO: renamed from: c */
    public final z0x0 m101512c() {
        return this.f74404b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1x0)) {
            return false;
        }
        b1x0 b1x0Var = (b1x0) obj;
        return b1x0Var.f74403a == this.f74403a && b1x0Var.f74404b == this.f74404b;
    }

    public final int hashCode() {
        return Objects.hash(b1x0.class, Integer.valueOf(this.f74403a), this.f74404b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f74404b) + ", " + this.f74403a + "-byte key)";
    }
}
