package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class e0x0 extends l0x0 {

    /* JADX INFO: renamed from: a */
    public final int f88690a;

    /* JADX INFO: renamed from: b */
    public final int f88691b;

    /* JADX INFO: renamed from: c */
    public final c0x0 f88692c;

    /* JADX INFO: renamed from: d */
    public final b0x0 f88693d;

    public /* synthetic */ e0x0(int i, int i2, c0x0 c0x0Var, b0x0 b0x0Var, d0x0 d0x0Var) {
        this.f88690a = i;
        this.f88691b = i2;
        this.f88692c = c0x0Var;
        this.f88693d = b0x0Var;
    }

    /* JADX INFO: renamed from: e */
    public static a0x0 m114351e() {
        return new a0x0(null);
    }

    @Override // p149l.fow0
    /* JADX INFO: renamed from: a */
    public final boolean mo104696a() {
        return this.f88692c != c0x0.f78187e;
    }

    /* JADX INFO: renamed from: b */
    public final int m114352b() {
        return this.f88691b;
    }

    /* JADX INFO: renamed from: c */
    public final int m114353c() {
        return this.f88690a;
    }

    /* JADX INFO: renamed from: d */
    public final int m114354d() {
        c0x0 c0x0Var = this.f88692c;
        if (c0x0Var == c0x0.f78187e) {
            return this.f88691b;
        }
        if (c0x0Var == c0x0.f78184b || c0x0Var == c0x0.f78185c || c0x0Var == c0x0.f78186d) {
            return this.f88691b + 5;
        }
        qkq0.m175383a("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0x0)) {
            return false;
        }
        e0x0 e0x0Var = (e0x0) obj;
        return e0x0Var.f88690a == this.f88690a && e0x0Var.m114354d() == m114354d() && e0x0Var.f88692c == this.f88692c && e0x0Var.f88693d == this.f88693d;
    }

    /* JADX INFO: renamed from: f */
    public final b0x0 m114355f() {
        return this.f88693d;
    }

    /* JADX INFO: renamed from: g */
    public final c0x0 m114356g() {
        return this.f88692c;
    }

    public final int hashCode() {
        return Objects.hash(e0x0.class, Integer.valueOf(this.f88690a), Integer.valueOf(this.f88691b), this.f88692c, this.f88693d);
    }

    public final String toString() {
        b0x0 b0x0Var = this.f88693d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f88692c) + ", hashType: " + String.valueOf(b0x0Var) + ", " + this.f88691b + "-byte tags, and " + this.f88690a + "-byte key)";
    }
}
