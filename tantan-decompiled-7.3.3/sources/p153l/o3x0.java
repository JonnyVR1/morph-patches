package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class o3x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final n3x0 f144865a;

    public o3x0(n3x0 n3x0Var) {
        this.f144865a = n3x0Var;
    }

    /* JADX INFO: renamed from: c */
    public static o3x0 m165892c(n3x0 n3x0Var) {
        return new o3x0(n3x0Var);
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f144865a != n3x0.f140044d;
    }

    /* JADX INFO: renamed from: b */
    public final n3x0 m165893b() {
        return this.f144865a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o3x0) && ((o3x0) obj).f144865a == this.f144865a;
    }

    public final int hashCode() {
        return Objects.hash(o3x0.class, this.f144865a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f144865a.toString() + ")";
    }
}
