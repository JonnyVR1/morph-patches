package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class o0x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final int f144594a;

    /* JADX INFO: renamed from: b */
    public final int f144595b = 12;

    /* JADX INFO: renamed from: c */
    public final int f144596c = 16;

    /* JADX INFO: renamed from: d */
    public final m0x0 f144597d;

    public /* synthetic */ o0x0(int i, int i2, int i3, m0x0 m0x0Var, n0x0 n0x0Var) {
        this.f144594a = i;
        this.f144597d = m0x0Var;
    }

    /* JADX INFO: renamed from: c */
    public static l0x0 m165552c() {
        return new l0x0(null);
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return this.f144597d != m0x0.f134369d;
    }

    /* JADX INFO: renamed from: b */
    public final int m165553b() {
        return this.f144594a;
    }

    /* JADX INFO: renamed from: d */
    public final m0x0 m165554d() {
        return this.f144597d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0x0)) {
            return false;
        }
        o0x0 o0x0Var = (o0x0) obj;
        return o0x0Var.f144594a == this.f144594a && o0x0Var.f144597d == this.f144597d;
    }

    public final int hashCode() {
        return Objects.hash(o0x0.class, Integer.valueOf(this.f144594a), 12, 16, this.f144597d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f144597d) + ", 12-byte IV, 16-byte tag, and " + this.f144594a + "-byte key)";
    }
}
