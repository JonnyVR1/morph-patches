package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class k9x0 extends r9x0 {

    /* JADX INFO: renamed from: a */
    public final int f124595a;

    /* JADX INFO: renamed from: b */
    public final int f124596b;

    /* JADX INFO: renamed from: c */
    public final i9x0 f124597c;

    /* JADX INFO: renamed from: d */
    public final h9x0 f124598d;

    public /* synthetic */ k9x0(int i, int i2, i9x0 i9x0Var, h9x0 h9x0Var, j9x0 j9x0Var) {
        this.f124595a = i;
        this.f124596b = i2;
        this.f124597c = i9x0Var;
        this.f124598d = h9x0Var;
    }

    /* JADX INFO: renamed from: e */
    public static g9x0 m148900e() {
        return new g9x0(null);
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f124597c != i9x0.f113527e;
    }

    /* JADX INFO: renamed from: b */
    public final int m148901b() {
        return this.f124596b;
    }

    /* JADX INFO: renamed from: c */
    public final int m148902c() {
        return this.f124595a;
    }

    /* JADX INFO: renamed from: d */
    public final int m148903d() {
        i9x0 i9x0Var = this.f124597c;
        if (i9x0Var == i9x0.f113527e) {
            return this.f124596b;
        }
        if (i9x0Var == i9x0.f113524b || i9x0Var == i9x0.f113525c || i9x0Var == i9x0.f113526d) {
            return this.f124596b + 5;
        }
        wtq0.m207906a("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k9x0)) {
            return false;
        }
        k9x0 k9x0Var = (k9x0) obj;
        return k9x0Var.f124595a == this.f124595a && k9x0Var.m148903d() == m148903d() && k9x0Var.f124597c == this.f124597c && k9x0Var.f124598d == this.f124598d;
    }

    /* JADX INFO: renamed from: f */
    public final h9x0 m148904f() {
        return this.f124598d;
    }

    /* JADX INFO: renamed from: g */
    public final i9x0 m148905g() {
        return this.f124597c;
    }

    public final int hashCode() {
        return Objects.hash(k9x0.class, Integer.valueOf(this.f124595a), Integer.valueOf(this.f124596b), this.f124597c, this.f124598d);
    }

    public final String toString() {
        h9x0 h9x0Var = this.f124598d;
        return "HMAC Parameters (variant: " + String.valueOf(this.f124597c) + ", hashType: " + String.valueOf(h9x0Var) + ", " + this.f124596b + "-byte tags, and " + this.f124595a + "-byte key)";
    }
}
