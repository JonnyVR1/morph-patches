package p149l;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ehr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f91386a;

    /* JADX INFO: renamed from: b */
    public int f91387b;

    /* JADX INFO: renamed from: c */
    public boolean f91388c;

    /* JADX INFO: renamed from: d */
    public int f91389d;

    /* JADX INFO: renamed from: e */
    public boolean f91390e;

    /* JADX INFO: renamed from: k */
    public float f91396k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f91397l;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Layout.Alignment f91400o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Layout.Alignment f91401p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public xgr0 f91403r;

    /* JADX INFO: renamed from: f */
    public int f91391f = -1;

    /* JADX INFO: renamed from: g */
    public int f91392g = -1;

    /* JADX INFO: renamed from: h */
    public int f91393h = -1;

    /* JADX INFO: renamed from: i */
    public int f91394i = -1;

    /* JADX INFO: renamed from: j */
    public int f91395j = -1;

    /* JADX INFO: renamed from: m */
    public int f91398m = -1;

    /* JADX INFO: renamed from: n */
    public int f91399n = -1;

    /* JADX INFO: renamed from: q */
    public int f91402q = -1;

    /* JADX INFO: renamed from: s */
    public float f91404s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    public final ehr0 m116559A(float f) {
        this.f91396k = f;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final ehr0 m116560B(int i) {
        this.f91395j = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final ehr0 m116561C(@Nullable String str) {
        this.f91397l = str;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final ehr0 m116562D(boolean z) {
        this.f91394i = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final ehr0 m116563E(boolean z) {
        this.f91391f = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public final ehr0 m116564F(@Nullable Layout.Alignment alignment) {
        this.f91401p = alignment;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public final ehr0 m116565G(int i) {
        this.f91399n = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final ehr0 m116566H(int i) {
        this.f91398m = i;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final ehr0 m116567I(float f) {
        this.f91404s = f;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final ehr0 m116568J(@Nullable Layout.Alignment alignment) {
        this.f91400o = alignment;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final ehr0 m116569a(boolean z) {
        this.f91402q = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ehr0 m116570b(@Nullable xgr0 xgr0Var) {
        this.f91403r = xgr0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ehr0 m116571c(boolean z) {
        this.f91392g = z ? 1 : 0;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m116572d() {
        return this.f91386a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m116573e() {
        return this.f91397l;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m116574f() {
        return this.f91402q == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m116575g() {
        return this.f91390e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m116576h() {
        return this.f91388c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m116577i() {
        return this.f91391f == 1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m116578j() {
        return this.f91392g == 1;
    }

    /* JADX INFO: renamed from: k */
    public final float m116579k() {
        return this.f91396k;
    }

    /* JADX INFO: renamed from: l */
    public final float m116580l() {
        return this.f91404s;
    }

    /* JADX INFO: renamed from: m */
    public final int m116581m() {
        if (this.f91390e) {
            return this.f91389d;
        }
        qkq0.m175383a("Background color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m116582n() {
        if (this.f91388c) {
            return this.f91387b;
        }
        qkq0.m175383a("Font color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final int m116583o() {
        return this.f91395j;
    }

    /* JADX INFO: renamed from: p */
    public final int m116584p() {
        return this.f91399n;
    }

    /* JADX INFO: renamed from: q */
    public final int m116585q() {
        return this.f91398m;
    }

    /* JADX INFO: renamed from: r */
    public final int m116586r() {
        int i = this.f91393h;
        if (i == -1 && this.f91394i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f91394i == 1 ? 2 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Layout.Alignment m116587s() {
        return this.f91401p;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Layout.Alignment m116588t() {
        return this.f91400o;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final xgr0 m116589u() {
        return this.f91403r;
    }

    /* JADX INFO: renamed from: v */
    public final ehr0 m116590v(@Nullable ehr0 ehr0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ehr0Var != null) {
            if (!this.f91388c && ehr0Var.f91388c) {
                m116593y(ehr0Var.f91387b);
            }
            if (this.f91393h == -1) {
                this.f91393h = ehr0Var.f91393h;
            }
            if (this.f91394i == -1) {
                this.f91394i = ehr0Var.f91394i;
            }
            if (this.f91386a == null && (str = ehr0Var.f91386a) != null) {
                this.f91386a = str;
            }
            if (this.f91391f == -1) {
                this.f91391f = ehr0Var.f91391f;
            }
            if (this.f91392g == -1) {
                this.f91392g = ehr0Var.f91392g;
            }
            if (this.f91399n == -1) {
                this.f91399n = ehr0Var.f91399n;
            }
            if (this.f91400o == null && (alignment2 = ehr0Var.f91400o) != null) {
                this.f91400o = alignment2;
            }
            if (this.f91401p == null && (alignment = ehr0Var.f91401p) != null) {
                this.f91401p = alignment;
            }
            if (this.f91402q == -1) {
                this.f91402q = ehr0Var.f91402q;
            }
            if (this.f91395j == -1) {
                this.f91395j = ehr0Var.f91395j;
                this.f91396k = ehr0Var.f91396k;
            }
            if (this.f91403r == null) {
                this.f91403r = ehr0Var.f91403r;
            }
            if (this.f91404s == Float.MAX_VALUE) {
                this.f91404s = ehr0Var.f91404s;
            }
            if (!this.f91390e && ehr0Var.f91390e) {
                m116591w(ehr0Var.f91389d);
            }
            if (this.f91398m == -1 && (i = ehr0Var.f91398m) != -1) {
                this.f91398m = i;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final ehr0 m116591w(int i) {
        this.f91389d = i;
        this.f91390e = true;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final ehr0 m116592x(boolean z) {
        this.f91393h = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final ehr0 m116593y(int i) {
        this.f91387b = i;
        this.f91388c = true;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final ehr0 m116594z(@Nullable String str) {
        this.f91386a = str;
        return this;
    }
}
