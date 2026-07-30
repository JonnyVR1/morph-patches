package p153l;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nlj0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f142546a;

    /* JADX INFO: renamed from: b */
    public int f142547b;

    /* JADX INFO: renamed from: c */
    public boolean f142548c;

    /* JADX INFO: renamed from: d */
    public int f142549d;

    /* JADX INFO: renamed from: e */
    public boolean f142550e;

    /* JADX INFO: renamed from: k */
    public float f142556k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f142557l;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Layout.Alignment f142560o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Layout.Alignment f142561p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public qri0 f142563r;

    /* JADX INFO: renamed from: f */
    public int f142551f = -1;

    /* JADX INFO: renamed from: g */
    public int f142552g = -1;

    /* JADX INFO: renamed from: h */
    public int f142553h = -1;

    /* JADX INFO: renamed from: i */
    public int f142554i = -1;

    /* JADX INFO: renamed from: j */
    public int f142555j = -1;

    /* JADX INFO: renamed from: m */
    public int f142558m = -1;

    /* JADX INFO: renamed from: n */
    public int f142559n = -1;

    /* JADX INFO: renamed from: q */
    public int f142562q = -1;

    /* JADX INFO: renamed from: s */
    public float f142564s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    public nlj0 m163689A(@Nullable String str) {
        this.f142557l = str;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public nlj0 m163690B(boolean z) {
        this.f142554i = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public nlj0 m163691C(boolean z) {
        this.f142551f = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public nlj0 m163692D(@Nullable Layout.Alignment alignment) {
        this.f142561p = alignment;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public nlj0 m163693E(int i) {
        this.f142559n = i;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public nlj0 m163694F(int i) {
        this.f142558m = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public nlj0 m163695G(float f) {
        this.f142564s = f;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public nlj0 m163696H(@Nullable Layout.Alignment alignment) {
        this.f142560o = alignment;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public nlj0 m163697I(boolean z) {
        this.f142562q = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public nlj0 m163698J(@Nullable qri0 qri0Var) {
        this.f142563r = qri0Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public nlj0 m163699K(boolean z) {
        this.f142552g = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public nlj0 m163700a(@Nullable nlj0 nlj0Var) {
        return m163717r(nlj0Var, true);
    }

    /* JADX INFO: renamed from: b */
    public int m163701b() {
        if (this.f142550e) {
            return this.f142549d;
        }
        wtq0.m207906a("Background color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m163702c() {
        if (this.f142548c) {
            return this.f142547b;
        }
        wtq0.m207906a("Font color has not been defined.");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m163703d() {
        return this.f142546a;
    }

    /* JADX INFO: renamed from: e */
    public float m163704e() {
        return this.f142556k;
    }

    /* JADX INFO: renamed from: f */
    public int m163705f() {
        return this.f142555j;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public String m163706g() {
        return this.f142557l;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Layout.Alignment m163707h() {
        return this.f142561p;
    }

    /* JADX INFO: renamed from: i */
    public int m163708i() {
        return this.f142559n;
    }

    /* JADX INFO: renamed from: j */
    public int m163709j() {
        return this.f142558m;
    }

    /* JADX INFO: renamed from: k */
    public float m163710k() {
        return this.f142564s;
    }

    /* JADX INFO: renamed from: l */
    public int m163711l() {
        int i = this.f142553h;
        if (i == -1 && this.f142554i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f142554i == 1 ? 2 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public Layout.Alignment m163712m() {
        return this.f142560o;
    }

    /* JADX INFO: renamed from: n */
    public boolean m163713n() {
        return this.f142562q == 1;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public qri0 m163714o() {
        return this.f142563r;
    }

    /* JADX INFO: renamed from: p */
    public boolean m163715p() {
        return this.f142550e;
    }

    /* JADX INFO: renamed from: q */
    public boolean m163716q() {
        return this.f142548c;
    }

    /* JADX INFO: renamed from: r */
    public final nlj0 m163717r(@Nullable nlj0 nlj0Var, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (nlj0Var != null) {
            if (!this.f142548c && nlj0Var.f142548c) {
                m163722w(nlj0Var.f142547b);
            }
            if (this.f142553h == -1) {
                this.f142553h = nlj0Var.f142553h;
            }
            if (this.f142554i == -1) {
                this.f142554i = nlj0Var.f142554i;
            }
            if (this.f142546a == null && (str = nlj0Var.f142546a) != null) {
                this.f142546a = str;
            }
            if (this.f142551f == -1) {
                this.f142551f = nlj0Var.f142551f;
            }
            if (this.f142552g == -1) {
                this.f142552g = nlj0Var.f142552g;
            }
            if (this.f142559n == -1) {
                this.f142559n = nlj0Var.f142559n;
            }
            if (this.f142560o == null && (alignment2 = nlj0Var.f142560o) != null) {
                this.f142560o = alignment2;
            }
            if (this.f142561p == null && (alignment = nlj0Var.f142561p) != null) {
                this.f142561p = alignment;
            }
            if (this.f142562q == -1) {
                this.f142562q = nlj0Var.f142562q;
            }
            if (this.f142555j == -1) {
                this.f142555j = nlj0Var.f142555j;
                this.f142556k = nlj0Var.f142556k;
            }
            if (this.f142563r == null) {
                this.f142563r = nlj0Var.f142563r;
            }
            if (this.f142564s == Float.MAX_VALUE) {
                this.f142564s = nlj0Var.f142564s;
            }
            if (z && !this.f142550e && nlj0Var.f142550e) {
                m163720u(nlj0Var.f142549d);
            }
            if (z && this.f142558m == -1 && (i = nlj0Var.f142558m) != -1) {
                this.f142558m = i;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m163718s() {
        return this.f142551f == 1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m163719t() {
        return this.f142552g == 1;
    }

    /* JADX INFO: renamed from: u */
    public nlj0 m163720u(int i) {
        this.f142549d = i;
        this.f142550e = true;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public nlj0 m163721v(boolean z) {
        this.f142553h = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public nlj0 m163722w(int i) {
        this.f142547b = i;
        this.f142548c = true;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public nlj0 m163723x(@Nullable String str) {
        this.f142546a = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public nlj0 m163724y(float f) {
        this.f142556k = f;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public nlj0 m163725z(int i) {
        this.f142555j = i;
        return this;
    }
}
