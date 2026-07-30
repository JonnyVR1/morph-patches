package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class h8x0 extends r9x0 {

    /* JADX INFO: renamed from: a */
    public final int f108282a;

    /* JADX INFO: renamed from: b */
    public final int f108283b;

    /* JADX INFO: renamed from: c */
    public final f8x0 f108284c;

    public /* synthetic */ h8x0(int i, int i2, f8x0 f8x0Var, g8x0 g8x0Var) {
        this.f108282a = i;
        this.f108283b = i2;
        this.f108284c = f8x0Var;
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f108284c != f8x0.f97787e;
    }

    /* JADX INFO: renamed from: b */
    public final int m133992b() {
        return this.f108283b;
    }

    /* JADX INFO: renamed from: c */
    public final int m133993c() {
        return this.f108282a;
    }

    /* JADX INFO: renamed from: d */
    public final int m133994d() {
        f8x0 f8x0Var = this.f108284c;
        if (f8x0Var == f8x0.f97787e) {
            return this.f108283b;
        }
        if (f8x0Var == f8x0.f97784b || f8x0Var == f8x0.f97785c || f8x0Var == f8x0.f97786d) {
            return this.f108283b + 5;
        }
        wtq0.m207906a("Unknown variant");
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final f8x0 m133995e() {
        return this.f108284c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8x0)) {
            return false;
        }
        h8x0 h8x0Var = (h8x0) obj;
        return h8x0Var.f108282a == this.f108282a && h8x0Var.m133994d() == m133994d() && h8x0Var.f108284c == this.f108284c;
    }

    public final int hashCode() {
        return Objects.hash(h8x0.class, Integer.valueOf(this.f108282a), Integer.valueOf(this.f108283b), this.f108284c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f108284c) + ", " + this.f108283b + "-byte tags, and " + this.f108282a + "-byte key)";
    }
}
