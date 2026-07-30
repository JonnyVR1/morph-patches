package p149l;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jcj0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f117318a;

    /* JADX INFO: renamed from: b */
    public int f117319b;

    /* JADX INFO: renamed from: c */
    public boolean f117320c;

    /* JADX INFO: renamed from: d */
    public int f117321d;

    /* JADX INFO: renamed from: e */
    public boolean f117322e;

    /* JADX INFO: renamed from: k */
    public float f117328k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f117329l;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Layout.Alignment f117332o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Layout.Alignment f117333p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public qii0 f117335r;

    /* JADX INFO: renamed from: f */
    public int f117323f = -1;

    /* JADX INFO: renamed from: g */
    public int f117324g = -1;

    /* JADX INFO: renamed from: h */
    public int f117325h = -1;

    /* JADX INFO: renamed from: i */
    public int f117326i = -1;

    /* JADX INFO: renamed from: j */
    public int f117327j = -1;

    /* JADX INFO: renamed from: m */
    public int f117330m = -1;

    /* JADX INFO: renamed from: n */
    public int f117331n = -1;

    /* JADX INFO: renamed from: q */
    public int f117334q = -1;

    /* JADX INFO: renamed from: s */
    public float f117336s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: A */
    public jcj0 m140943A(@Nullable String str) {
        this.f117329l = str;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public jcj0 m140944B(boolean z) {
        this.f117326i = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public jcj0 m140945C(boolean z) {
        this.f117323f = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public jcj0 m140946D(@Nullable Layout.Alignment alignment) {
        this.f117333p = alignment;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public jcj0 m140947E(int i) {
        this.f117331n = i;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public jcj0 m140948F(int i) {
        this.f117330m = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public jcj0 m140949G(float f) {
        this.f117336s = f;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public jcj0 m140950H(@Nullable Layout.Alignment alignment) {
        this.f117332o = alignment;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public jcj0 m140951I(boolean z) {
        this.f117334q = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public jcj0 m140952J(@Nullable qii0 qii0Var) {
        this.f117335r = qii0Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public jcj0 m140953K(boolean z) {
        this.f117324g = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public jcj0 m140954a(@Nullable jcj0 jcj0Var) {
        return m140971r(jcj0Var, true);
    }

    /* JADX INFO: renamed from: b */
    public int m140955b() {
        if (this.f117322e) {
            return this.f117321d;
        }
        qkq0.m175383a("Background color has not been defined.");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m140956c() {
        if (this.f117320c) {
            return this.f117319b;
        }
        qkq0.m175383a("Font color has not been defined.");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m140957d() {
        return this.f117318a;
    }

    /* JADX INFO: renamed from: e */
    public float m140958e() {
        return this.f117328k;
    }

    /* JADX INFO: renamed from: f */
    public int m140959f() {
        return this.f117327j;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public String m140960g() {
        return this.f117329l;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Layout.Alignment m140961h() {
        return this.f117333p;
    }

    /* JADX INFO: renamed from: i */
    public int m140962i() {
        return this.f117331n;
    }

    /* JADX INFO: renamed from: j */
    public int m140963j() {
        return this.f117330m;
    }

    /* JADX INFO: renamed from: k */
    public float m140964k() {
        return this.f117336s;
    }

    /* JADX INFO: renamed from: l */
    public int m140965l() {
        int i = this.f117325h;
        if (i == -1 && this.f117326i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f117326i == 1 ? 2 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public Layout.Alignment m140966m() {
        return this.f117332o;
    }

    /* JADX INFO: renamed from: n */
    public boolean m140967n() {
        return this.f117334q == 1;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public qii0 m140968o() {
        return this.f117335r;
    }

    /* JADX INFO: renamed from: p */
    public boolean m140969p() {
        return this.f117322e;
    }

    /* JADX INFO: renamed from: q */
    public boolean m140970q() {
        return this.f117320c;
    }

    /* JADX INFO: renamed from: r */
    public final jcj0 m140971r(@Nullable jcj0 jcj0Var, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (jcj0Var != null) {
            if (!this.f117320c && jcj0Var.f117320c) {
                m140976w(jcj0Var.f117319b);
            }
            if (this.f117325h == -1) {
                this.f117325h = jcj0Var.f117325h;
            }
            if (this.f117326i == -1) {
                this.f117326i = jcj0Var.f117326i;
            }
            if (this.f117318a == null && (str = jcj0Var.f117318a) != null) {
                this.f117318a = str;
            }
            if (this.f117323f == -1) {
                this.f117323f = jcj0Var.f117323f;
            }
            if (this.f117324g == -1) {
                this.f117324g = jcj0Var.f117324g;
            }
            if (this.f117331n == -1) {
                this.f117331n = jcj0Var.f117331n;
            }
            if (this.f117332o == null && (alignment2 = jcj0Var.f117332o) != null) {
                this.f117332o = alignment2;
            }
            if (this.f117333p == null && (alignment = jcj0Var.f117333p) != null) {
                this.f117333p = alignment;
            }
            if (this.f117334q == -1) {
                this.f117334q = jcj0Var.f117334q;
            }
            if (this.f117327j == -1) {
                this.f117327j = jcj0Var.f117327j;
                this.f117328k = jcj0Var.f117328k;
            }
            if (this.f117335r == null) {
                this.f117335r = jcj0Var.f117335r;
            }
            if (this.f117336s == Float.MAX_VALUE) {
                this.f117336s = jcj0Var.f117336s;
            }
            if (z && !this.f117322e && jcj0Var.f117322e) {
                m140974u(jcj0Var.f117321d);
            }
            if (z && this.f117330m == -1 && (i = jcj0Var.f117330m) != -1) {
                this.f117330m = i;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m140972s() {
        return this.f117323f == 1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m140973t() {
        return this.f117324g == 1;
    }

    /* JADX INFO: renamed from: u */
    public jcj0 m140974u(int i) {
        this.f117321d = i;
        this.f117322e = true;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public jcj0 m140975v(boolean z) {
        this.f117325h = z ? 1 : 0;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public jcj0 m140976w(int i) {
        this.f117319b = i;
        this.f117320c = true;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public jcj0 m140977x(@Nullable String str) {
        this.f117318a = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public jcj0 m140978y(float f) {
        this.f117328k = f;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public jcj0 m140979z(int i) {
        this.f117327j = i;
        return this;
    }
}
