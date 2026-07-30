package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class iuw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final huw0 f115060a;

    public iuw0(huw0 huw0Var) {
        this.f115060a = huw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static iuw0 m138498c(huw0 huw0Var) {
        return new iuw0(huw0Var);
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f115060a != huw0.f109595d;
    }

    /* JADX INFO: renamed from: b */
    public final huw0 m138499b() {
        return this.f115060a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iuw0) && ((iuw0) obj).f115060a == this.f115060a;
    }

    public final int hashCode() {
        return Objects.hash(iuw0.class, this.f115060a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f115060a.toString() + ")";
    }
}
