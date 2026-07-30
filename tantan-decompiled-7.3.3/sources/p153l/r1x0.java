package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class r1x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final q1x0 f160862a;

    public r1x0(q1x0 q1x0Var) {
        this.f160862a = q1x0Var;
    }

    /* JADX INFO: renamed from: c */
    public static r1x0 m179456c(q1x0 q1x0Var) {
        return new r1x0(q1x0Var);
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f160862a != q1x0.f155229d;
    }

    /* JADX INFO: renamed from: b */
    public final q1x0 m179457b() {
        return this.f160862a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r1x0) && ((r1x0) obj).f160862a == this.f160862a;
    }

    public final int hashCode() {
        return Objects.hash(r1x0.class, this.f160862a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f160862a.toString() + ")";
    }
}
