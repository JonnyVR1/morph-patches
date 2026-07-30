package p153l;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class kqr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f128268a;

    /* JADX INFO: renamed from: b */
    public int f128269b;

    /* JADX INFO: renamed from: c */
    public boolean f128270c;

    /* JADX INFO: renamed from: d */
    public int f128271d;

    /* JADX INFO: renamed from: e */
    public boolean f128272e;

    /* JADX INFO: renamed from: k */
    public float f128278k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f128279l;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Layout.Alignment f128282o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Layout.Alignment f128283p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public dqr0 f128285r;

    /* JADX INFO: renamed from: f */
    public int f128273f = -1;

    /* JADX INFO: renamed from: g */
    public int f128274g = -1;

    /* JADX INFO: renamed from: h */
    public int f128275h = -1;

    /* JADX INFO: renamed from: i */
    public int f128276i = -1;

    /* JADX INFO: renamed from: j */
    public int f128277j = -1;

    /* JADX INFO: renamed from: m */
    public int f128280m = -1;

    /* JADX INFO: renamed from: n */
    public int f128281n = -1;

    /* JADX INFO: renamed from: q */
    public int f128284q = -1;

    /* JADX INFO: renamed from: s */
    public float f128286s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    public final kqr0 m150926A(float f) {
        this.f128278k = f;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final kqr0 m150927B(int i) {
        this.f128277j = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final kqr0 m150928C(@Nullable String str) {
        this.f128279l = str;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final kqr0 m150929D(boolean z) {
        this.f128276i = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final kqr0 m150930E(boolean z) {
        this.f128273f = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public final kqr0 m150931F(@Nullable Layout.Alignment alignment) {
        this.f128283p = alignment;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public final kqr0 m150932G(int i) {
        this.f128281n = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final kqr0 m150933H(int i) {
        this.f128280m = i;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final kqr0 m150934I(float f) {
        this.f128286s = f;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final kqr0 m150935J(@Nullable Layout.Alignment alignment) {
        this.f128282o = alignment;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final kqr0 m150936a(boolean z) {
        this.f128284q = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final kqr0 m150937b(@Nullable dqr0 dqr0Var) {
        this.f128285r = dqr0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final kqr0 m150938c(boolean z) {
        this.f128274g = z ? 1 : 0;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m150939d() {
        return this.f128268a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m150940e() {
        return this.f128279l;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m150941f() {
        return this.f128284q == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m150942g() {
        return this.f128272e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m150943h() {
        return this.f128270c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m150944i() {
        return this.f128273f == 1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m150945j() {
        return this.f128274g == 1;
    }

    /* JADX INFO: renamed from: k */
    public final float m150946k() {
        return this.f128278k;
    }

    /* JADX INFO: renamed from: l */
    public final float m150947l() {
        return this.f128286s;
    }

    /* JADX INFO: renamed from: m */
    public final int m150948m() {
        if (this.f128272e) {
            return this.f128271d;
        }
        wtq0.m207906a("Background color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m150949n() {
        if (this.f128270c) {
            return this.f128269b;
        }
        wtq0.m207906a("Font color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final int m150950o() {
        return this.f128277j;
    }

    /* JADX INFO: renamed from: p */
    public final int m150951p() {
        return this.f128281n;
    }

    /* JADX INFO: renamed from: q */
    public final int m150952q() {
        return this.f128280m;
    }

    /* JADX INFO: renamed from: r */
    public final int m150953r() {
        int i = this.f128275h;
        if (i == -1 && this.f128276i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f128276i == 1 ? 2 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Layout.Alignment m150954s() {
        return this.f128283p;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Layout.Alignment m150955t() {
        return this.f128282o;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final dqr0 m150956u() {
        return this.f128285r;
    }

    /* JADX INFO: renamed from: v */
    public final kqr0 m150957v(@Nullable kqr0 kqr0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kqr0Var != null) {
            if (!this.f128270c && kqr0Var.f128270c) {
                m150960y(kqr0Var.f128269b);
            }
            if (this.f128275h == -1) {
                this.f128275h = kqr0Var.f128275h;
            }
            if (this.f128276i == -1) {
                this.f128276i = kqr0Var.f128276i;
            }
            if (this.f128268a == null && (str = kqr0Var.f128268a) != null) {
                this.f128268a = str;
            }
            if (this.f128273f == -1) {
                this.f128273f = kqr0Var.f128273f;
            }
            if (this.f128274g == -1) {
                this.f128274g = kqr0Var.f128274g;
            }
            if (this.f128281n == -1) {
                this.f128281n = kqr0Var.f128281n;
            }
            if (this.f128282o == null && (alignment2 = kqr0Var.f128282o) != null) {
                this.f128282o = alignment2;
            }
            if (this.f128283p == null && (alignment = kqr0Var.f128283p) != null) {
                this.f128283p = alignment;
            }
            if (this.f128284q == -1) {
                this.f128284q = kqr0Var.f128284q;
            }
            if (this.f128277j == -1) {
                this.f128277j = kqr0Var.f128277j;
                this.f128278k = kqr0Var.f128278k;
            }
            if (this.f128285r == null) {
                this.f128285r = kqr0Var.f128285r;
            }
            if (this.f128286s == Float.MAX_VALUE) {
                this.f128286s = kqr0Var.f128286s;
            }
            if (!this.f128272e && kqr0Var.f128272e) {
                m150958w(kqr0Var.f128271d);
            }
            if (this.f128280m == -1 && (i = kqr0Var.f128280m) != -1) {
                this.f128280m = i;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final kqr0 m150958w(int i) {
        this.f128271d = i;
        this.f128272e = true;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final kqr0 m150959x(boolean z) {
        this.f128275h = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final kqr0 m150960y(int i) {
        this.f128269b = i;
        this.f128270c = true;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final kqr0 m150961z(@Nullable String str) {
        this.f128268a = str;
        return this;
    }
}
