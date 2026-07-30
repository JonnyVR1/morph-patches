package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class lsw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final ksw0 f129902a;

    public lsw0(ksw0 ksw0Var) {
        this.f129902a = ksw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static lsw0 m151649c(ksw0 ksw0Var) {
        return new lsw0(ksw0Var);
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f129902a != ksw0.f124513d;
    }

    /* JADX INFO: renamed from: b */
    public final ksw0 m151650b() {
        return this.f129902a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lsw0) && ((lsw0) obj).f129902a == this.f129902a;
    }

    public final int hashCode() {
        return Objects.hash(lsw0.class, this.f129902a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f129902a.toString() + ")";
    }
}
