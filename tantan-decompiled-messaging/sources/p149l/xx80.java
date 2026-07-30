package p149l;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.Picture;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class xx80 {

    /* JADX INFO: renamed from: z */
    public static xx80 f194818z;

    /* JADX INFO: renamed from: a */
    public Privilege f194819a;

    /* JADX INFO: renamed from: b */
    public int f194820b;

    /* JADX INFO: renamed from: c */
    public int f194821c;

    /* JADX INFO: renamed from: d */
    public int f194822d;

    /* JADX INFO: renamed from: e */
    public int f194823e;

    /* JADX INFO: renamed from: f */
    public int f194824f;

    /* JADX INFO: renamed from: g */
    public int f194825g;

    /* JADX INFO: renamed from: h */
    public String f194826h;

    /* JADX INFO: renamed from: i */
    public String f194827i;

    /* JADX INFO: renamed from: j */
    public CharSequence f194828j;

    /* JADX INFO: renamed from: k */
    public CharSequence f194829k;

    /* JADX INFO: renamed from: l */
    public int f194830l;

    /* JADX INFO: renamed from: m */
    public CharSequence f194831m;

    /* JADX INFO: renamed from: n */
    public int f194832n;

    /* JADX INFO: renamed from: o */
    public CharSequence f194833o;

    /* JADX INFO: renamed from: p */
    public int f194834p;

    /* JADX INFO: renamed from: q */
    public boolean f194835q;

    /* JADX INFO: renamed from: r */
    public int f194836r;

    /* JADX INFO: renamed from: s */
    public int f194837s;

    /* JADX INFO: renamed from: t */
    public List<String> f194838t;

    /* JADX INFO: renamed from: u */
    public int f194839u;

    /* JADX INFO: renamed from: v */
    public int f194840v;

    /* JADX INFO: renamed from: w */
    public boolean f194841w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f194842x;

    /* JADX INFO: renamed from: y */
    public Picture.ImageUri f194843y;

    /* JADX INFO: renamed from: b */
    public static xx80 m211444b() {
        if (f194818z == null) {
            synchronized (xx80.class) {
                try {
                    if (f194818z == null) {
                        f194818z = new xx80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f194818z.m211446c();
        return f194818z;
    }

    /* JADX INFO: renamed from: a */
    public wx80 m211445a() {
        wx80 wx80Var = new wx80();
        wx80Var.m205936U(this.f194819a);
        wx80Var.m205921F(this.f194820b);
        wx80Var.m205925J(this.f194821c);
        wx80Var.m205924I(this.f194822d);
        wx80Var.m205930O(this.f194823e);
        wx80Var.m205919D(this.f194824f);
        wx80Var.m205939X(this.f194825g);
        wx80Var.m205931P(this.f194826h);
        wx80Var.m205920E(this.f194827i);
        wx80Var.m205953f0(this.f194828j);
        wx80Var.m205940Y(this.f194829k);
        wx80Var.m205955g0(this.f194830l);
        wx80Var.m205943a0(this.f194831m);
        wx80Var.m205945b0(this.f194832n);
        wx80Var.m205922G(this.f194833o);
        wx80Var.m205923H(this.f194834p);
        wx80Var.m205929N(this.f194836r);
        wx80Var.m205938W(this.f194837s);
        wx80Var.m205918C(this.f194838t);
        wx80Var.m205928M(this.f194839u);
        wx80Var.m205937V(this.f194840v);
        wx80Var.m205927L(this.f194842x);
        wx80Var.m205926K(this.f194841w);
        wx80Var.m205947c0(this.f194835q);
        wx80Var.m205933R(this.f194843y);
        return wx80Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m211446c() {
        this.f194819a = null;
        this.f194820b = 0;
        this.f194821c = 0;
        this.f194822d = 0;
        this.f194826h = "";
        this.f194827i = "";
        this.f194823e = 0;
        this.f194824f = 0;
        this.f194825g = 0;
        this.f194828j = "";
        this.f194829k = "";
        this.f194830l = 0;
        this.f194831m = "";
        this.f194832n = 0;
        this.f194833o = "";
        this.f194834p = 0;
        this.f194836r = 0;
        this.f194838t = null;
        this.f194839u = 0;
        this.f194840v = 0;
        this.f194841w = false;
        this.f194842x = 0;
        this.f194835q = true;
        this.f194843y = null;
    }

    /* JADX INFO: renamed from: d */
    public xx80 m211447d(@DrawableRes int i) {
        this.f194824f = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public xx80 m211448e(@DrawableRes int i) {
        this.f194820b = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public xx80 m211449f(@StringRes int i) {
        this.f194833o = CoreModule.f17544b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public xx80 m211450g(CharSequence charSequence) {
        this.f194833o = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public xx80 m211451h(@ColorRes int i, @ColorRes int i2) {
        this.f194821c = i;
        this.f194822d = i2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public xx80 m211452i(@DrawableRes int i) {
        this.f194823e = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public xx80 m211453j(String str) {
        this.f194826h = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public xx80 m211454k(Privilege privilege) {
        this.f194819a = privilege;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public xx80 m211455l(@StringRes int i) {
        this.f194831m = CoreModule.f17544b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public xx80 m211456m(CharSequence charSequence) {
        this.f194831m = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public xx80 m211457n(@StringRes int i) {
        this.f194828j = CoreModule.f17544b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public xx80 m211458o(CharSequence charSequence) {
        this.f194828j = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public xx80 m211459p(@ColorRes int i) {
        this.f194830l = i;
        return this;
    }
}
