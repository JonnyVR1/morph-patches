package p009l;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Picture;
import java.util.List;
import l.wx80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xx80 {

    /* JADX INFO: renamed from: z */
    public static xx80 f22755z;

    /* JADX INFO: renamed from: a */
    public Privilege f22756a;

    /* JADX INFO: renamed from: b */
    public int f22757b;

    /* JADX INFO: renamed from: c */
    public int f22758c;

    /* JADX INFO: renamed from: d */
    public int f22759d;

    /* JADX INFO: renamed from: e */
    public int f22760e;

    /* JADX INFO: renamed from: f */
    public int f22761f;

    /* JADX INFO: renamed from: g */
    public int f22762g;

    /* JADX INFO: renamed from: h */
    public String f22763h;

    /* JADX INFO: renamed from: i */
    public String f22764i;

    /* JADX INFO: renamed from: j */
    public CharSequence f22765j;

    /* JADX INFO: renamed from: k */
    public CharSequence f22766k;

    /* JADX INFO: renamed from: l */
    public int f22767l;

    /* JADX INFO: renamed from: m */
    public CharSequence f22768m;

    /* JADX INFO: renamed from: n */
    public int f22769n;

    /* JADX INFO: renamed from: o */
    public CharSequence f22770o;

    /* JADX INFO: renamed from: p */
    public int f22771p;

    /* JADX INFO: renamed from: q */
    public boolean f22772q;

    /* JADX INFO: renamed from: r */
    public int f22773r;

    /* JADX INFO: renamed from: s */
    public int f22774s;

    /* JADX INFO: renamed from: t */
    public List<String> f22775t;

    /* JADX INFO: renamed from: u */
    public int f22776u;

    /* JADX INFO: renamed from: v */
    public int f22777v;

    /* JADX INFO: renamed from: w */
    public boolean f22778w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f22779x;

    /* JADX INFO: renamed from: y */
    public Picture.ImageUri f22780y;

    /* JADX INFO: renamed from: b */
    public static xx80 m25035b() {
        if (f22755z == null) {
            synchronized (xx80.class) {
                try {
                    if (f22755z == null) {
                        f22755z = new xx80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f22755z.m25037c();
        return f22755z;
    }

    /* JADX INFO: renamed from: a */
    public wx80 m25036a() {
        wx80 wx80Var = new wx80();
        wx80Var.U(this.f22756a);
        wx80Var.F(this.f22757b);
        wx80Var.J(this.f22758c);
        wx80Var.I(this.f22759d);
        wx80Var.O(this.f22760e);
        wx80Var.D(this.f22761f);
        wx80Var.X(this.f22762g);
        wx80Var.P(this.f22763h);
        wx80Var.E(this.f22764i);
        wx80Var.f0(this.f22765j);
        wx80Var.Y(this.f22766k);
        wx80Var.g0(this.f22767l);
        wx80Var.a0(this.f22768m);
        wx80Var.b0(this.f22769n);
        wx80Var.G(this.f22770o);
        wx80Var.H(this.f22771p);
        wx80Var.N(this.f22773r);
        wx80Var.W(this.f22774s);
        wx80Var.C(this.f22775t);
        wx80Var.M(this.f22776u);
        wx80Var.V(this.f22777v);
        wx80Var.L(this.f22779x);
        wx80Var.K(this.f22778w);
        wx80Var.c0(this.f22772q);
        wx80Var.R(this.f22780y);
        return wx80Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m25037c() {
        this.f22756a = null;
        this.f22757b = 0;
        this.f22758c = 0;
        this.f22759d = 0;
        this.f22763h = "";
        this.f22764i = "";
        this.f22760e = 0;
        this.f22761f = 0;
        this.f22762g = 0;
        this.f22765j = "";
        this.f22766k = "";
        this.f22767l = 0;
        this.f22768m = "";
        this.f22769n = 0;
        this.f22770o = "";
        this.f22771p = 0;
        this.f22773r = 0;
        this.f22775t = null;
        this.f22776u = 0;
        this.f22777v = 0;
        this.f22778w = false;
        this.f22779x = 0;
        this.f22772q = true;
        this.f22780y = null;
    }

    /* JADX INFO: renamed from: d */
    public xx80 m25038d(@DrawableRes int i) {
        this.f22761f = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public xx80 m25039e(@DrawableRes int i) {
        this.f22757b = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public xx80 m25040f(@StringRes int i) {
        this.f22770o = CoreModule.b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public xx80 m25041g(CharSequence charSequence) {
        this.f22770o = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public xx80 m25042h(@ColorRes int i, @ColorRes int i2) {
        this.f22758c = i;
        this.f22759d = i2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public xx80 m25043i(@DrawableRes int i) {
        this.f22760e = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public xx80 m25044j(String str) {
        this.f22763h = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public xx80 m25045k(Privilege privilege) {
        this.f22756a = privilege;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public xx80 m25046l(@StringRes int i) {
        this.f22768m = CoreModule.b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public xx80 m25047m(CharSequence charSequence) {
        this.f22768m = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public xx80 m25048n(@StringRes int i) {
        this.f22765j = CoreModule.b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public xx80 m25049o(CharSequence charSequence) {
        this.f22765j = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public xx80 m25050p(@ColorRes int i) {
        this.f22767l = i;
        return this;
    }
}
