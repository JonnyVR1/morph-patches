package p153l;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.Picture;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b690 {

    /* JADX INFO: renamed from: z */
    public static b690 f75143z;

    /* JADX INFO: renamed from: a */
    public Privilege f75144a;

    /* JADX INFO: renamed from: b */
    public int f75145b;

    /* JADX INFO: renamed from: c */
    public int f75146c;

    /* JADX INFO: renamed from: d */
    public int f75147d;

    /* JADX INFO: renamed from: e */
    public int f75148e;

    /* JADX INFO: renamed from: f */
    public int f75149f;

    /* JADX INFO: renamed from: g */
    public int f75150g;

    /* JADX INFO: renamed from: h */
    public String f75151h;

    /* JADX INFO: renamed from: i */
    public String f75152i;

    /* JADX INFO: renamed from: j */
    public CharSequence f75153j;

    /* JADX INFO: renamed from: k */
    public CharSequence f75154k;

    /* JADX INFO: renamed from: l */
    public int f75155l;

    /* JADX INFO: renamed from: m */
    public CharSequence f75156m;

    /* JADX INFO: renamed from: n */
    public int f75157n;

    /* JADX INFO: renamed from: o */
    public CharSequence f75158o;

    /* JADX INFO: renamed from: p */
    public int f75159p;

    /* JADX INFO: renamed from: q */
    public boolean f75160q;

    /* JADX INFO: renamed from: r */
    public int f75161r;

    /* JADX INFO: renamed from: s */
    public int f75162s;

    /* JADX INFO: renamed from: t */
    public List<String> f75163t;

    /* JADX INFO: renamed from: u */
    public int f75164u;

    /* JADX INFO: renamed from: v */
    public int f75165v;

    /* JADX INFO: renamed from: w */
    public boolean f75166w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f75167x;

    /* JADX INFO: renamed from: y */
    public Picture.ImageUri f75168y;

    /* JADX INFO: renamed from: b */
    public static b690 m102710b() {
        if (f75143z == null) {
            synchronized (b690.class) {
                try {
                    if (f75143z == null) {
                        f75143z = new b690();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f75143z.m102712c();
        return f75143z;
    }

    /* JADX INFO: renamed from: a */
    public a690 m102711a() {
        a690 a690Var = new a690();
        a690Var.m96282U(this.f75144a);
        a690Var.m96267F(this.f75145b);
        a690Var.m96271J(this.f75146c);
        a690Var.m96270I(this.f75147d);
        a690Var.m96276O(this.f75148e);
        a690Var.m96265D(this.f75149f);
        a690Var.m96285X(this.f75150g);
        a690Var.m96277P(this.f75151h);
        a690Var.m96266E(this.f75152i);
        a690Var.m96299f0(this.f75153j);
        a690Var.m96286Y(this.f75154k);
        a690Var.m96301g0(this.f75155l);
        a690Var.m96289a0(this.f75156m);
        a690Var.m96291b0(this.f75157n);
        a690Var.m96268G(this.f75158o);
        a690Var.m96269H(this.f75159p);
        a690Var.m96275N(this.f75161r);
        a690Var.m96284W(this.f75162s);
        a690Var.m96264C(this.f75163t);
        a690Var.m96274M(this.f75164u);
        a690Var.m96283V(this.f75165v);
        a690Var.m96273L(this.f75167x);
        a690Var.m96272K(this.f75166w);
        a690Var.m96293c0(this.f75160q);
        a690Var.m96279R(this.f75168y);
        return a690Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m102712c() {
        this.f75144a = null;
        this.f75145b = 0;
        this.f75146c = 0;
        this.f75147d = 0;
        this.f75151h = "";
        this.f75152i = "";
        this.f75148e = 0;
        this.f75149f = 0;
        this.f75150g = 0;
        this.f75153j = "";
        this.f75154k = "";
        this.f75155l = 0;
        this.f75156m = "";
        this.f75157n = 0;
        this.f75158o = "";
        this.f75159p = 0;
        this.f75161r = 0;
        this.f75163t = null;
        this.f75164u = 0;
        this.f75165v = 0;
        this.f75166w = false;
        this.f75167x = 0;
        this.f75160q = true;
        this.f75168y = null;
    }

    /* JADX INFO: renamed from: d */
    public b690 m102713d(@DrawableRes int i) {
        this.f75149f = i;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public b690 m102714e(@DrawableRes int i) {
        this.f75145b = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public b690 m102715f(@StringRes int i) {
        this.f75158o = CoreModule.f18263b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public b690 m102716g(CharSequence charSequence) {
        this.f75158o = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public b690 m102717h(@ColorRes int i, @ColorRes int i2) {
        this.f75146c = i;
        this.f75147d = i2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public b690 m102718i(@DrawableRes int i) {
        this.f75148e = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public b690 m102719j(String str) {
        this.f75151h = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public b690 m102720k(Privilege privilege) {
        this.f75144a = privilege;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public b690 m102721l(@StringRes int i) {
        this.f75156m = CoreModule.f18263b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public b690 m102722m(CharSequence charSequence) {
        this.f75156m = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public b690 m102723n(@StringRes int i) {
        this.f75153j = CoreModule.f18263b.getString(i);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public b690 m102724o(CharSequence charSequence) {
        this.f75153j = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public b690 m102725p(@ColorRes int i) {
        this.f75155l = i;
        return this;
    }
}
