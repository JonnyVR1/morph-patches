package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class rpw0 extends apw0 {

    /* JADX INFO: renamed from: a */
    public final int f160571a;

    /* JADX INFO: renamed from: b */
    public final int f160572b;

    /* JADX INFO: renamed from: c */
    public final int f160573c;

    /* JADX INFO: renamed from: d */
    public final int f160574d;

    /* JADX INFO: renamed from: e */
    public final ppw0 f160575e;

    /* JADX INFO: renamed from: f */
    public final opw0 f160576f;

    public /* synthetic */ rpw0(int i, int i2, int i3, int i4, ppw0 ppw0Var, opw0 opw0Var, qpw0 qpw0Var) {
        this.f160571a = i;
        this.f160572b = i2;
        this.f160573c = i3;
        this.f160574d = i4;
        this.f160575e = ppw0Var;
        this.f160576f = opw0Var;
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f160575e != ppw0.f150728d;
    }

    /* JADX INFO: renamed from: b */
    public final int m180402b() {
        return this.f160571a;
    }

    /* JADX INFO: renamed from: c */
    public final int m180403c() {
        return this.f160572b;
    }

    /* JADX INFO: renamed from: d */
    public final int m180404d() {
        return this.f160573c;
    }

    /* JADX INFO: renamed from: e */
    public final int m180405e() {
        return this.f160574d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rpw0)) {
            return false;
        }
        rpw0 rpw0Var = (rpw0) obj;
        return rpw0Var.f160571a == this.f160571a && rpw0Var.f160572b == this.f160572b && rpw0Var.f160573c == this.f160573c && rpw0Var.f160574d == this.f160574d && rpw0Var.f160575e == this.f160575e && rpw0Var.f160576f == this.f160576f;
    }

    /* JADX INFO: renamed from: f */
    public final opw0 m180406f() {
        return this.f160576f;
    }

    /* JADX INFO: renamed from: g */
    public final ppw0 m180407g() {
        return this.f160575e;
    }

    public final int hashCode() {
        return Objects.hash(rpw0.class, Integer.valueOf(this.f160571a), Integer.valueOf(this.f160572b), Integer.valueOf(this.f160573c), Integer.valueOf(this.f160574d), this.f160575e, this.f160576f);
    }

    public final String toString() {
        opw0 opw0Var = this.f160576f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.f160575e) + ", hashType: " + String.valueOf(opw0Var) + ", " + this.f160573c + "-byte IV, and " + this.f160574d + "-byte tags, and " + this.f160571a + "-byte AES key, and " + this.f160572b + "-byte HMAC key)";
    }
}
