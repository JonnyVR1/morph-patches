package p153l;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class xlj {

    /* JADX INFO: renamed from: t */
    public static final h1e0 f194973t = h1e0.f107451h;

    /* JADX INFO: renamed from: u */
    public static final h1e0 f194974u = h1e0.f107452i;

    /* JADX INFO: renamed from: a */
    public Resources f194975a;

    /* JADX INFO: renamed from: b */
    public int f194976b;

    /* JADX INFO: renamed from: c */
    public float f194977c;

    /* JADX INFO: renamed from: d */
    public Drawable f194978d;

    /* JADX INFO: renamed from: e */
    public h1e0 f194979e;

    /* JADX INFO: renamed from: f */
    public Drawable f194980f;

    /* JADX INFO: renamed from: g */
    public h1e0 f194981g;

    /* JADX INFO: renamed from: h */
    public Drawable f194982h;

    /* JADX INFO: renamed from: i */
    public h1e0 f194983i;

    /* JADX INFO: renamed from: j */
    public Drawable f194984j;

    /* JADX INFO: renamed from: k */
    public h1e0 f194985k;

    /* JADX INFO: renamed from: l */
    public h1e0 f194986l;

    /* JADX INFO: renamed from: m */
    public Matrix f194987m;

    /* JADX INFO: renamed from: n */
    public PointF f194988n;

    /* JADX INFO: renamed from: o */
    public ColorFilter f194989o;

    /* JADX INFO: renamed from: p */
    public Drawable f194990p;

    /* JADX INFO: renamed from: q */
    public List<Drawable> f194991q;

    /* JADX INFO: renamed from: r */
    public Drawable f194992r;

    /* JADX INFO: renamed from: s */
    public RoundingParams f194993s;

    public xlj(Resources resources) {
        this.f194975a = resources;
        m211657t();
    }

    /* JADX INFO: renamed from: u */
    public static xlj m211625u(Resources resources) {
        return new xlj(resources);
    }

    /* JADX INFO: renamed from: A */
    public xlj m211626A(Drawable drawable) {
        this.f194982h = drawable;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public xlj m211627B(h1e0 h1e0Var) {
        this.f194983i = h1e0Var;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public xlj m211628C(Drawable drawable) {
        if (drawable == null) {
            this.f194991q = null;
            return this;
        }
        this.f194991q = Arrays.asList(drawable);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public xlj m211629D(Drawable drawable) {
        this.f194978d = drawable;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public xlj m211630E(h1e0 h1e0Var) {
        this.f194979e = h1e0Var;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public xlj m211631F(Drawable drawable) {
        if (drawable == null) {
            this.f194992r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f194992r = stateListDrawable;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public xlj m211632G(Drawable drawable) {
        this.f194984j = drawable;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public xlj m211633H(h1e0 h1e0Var) {
        this.f194985k = h1e0Var;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public xlj m211634I(Drawable drawable) {
        this.f194980f = drawable;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public xlj m211635J(h1e0 h1e0Var) {
        this.f194981g = h1e0Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public xlj m211636K(RoundingParams roundingParams) {
        this.f194993s = roundingParams;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final void m211637L() {
        List<Drawable> list = this.f194991q;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                wn80.m207182g(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public wlj m211638a() {
        m211637L();
        return new wlj(this);
    }

    /* JADX INFO: renamed from: b */
    public ColorFilter m211639b() {
        return this.f194989o;
    }

    /* JADX INFO: renamed from: c */
    public PointF m211640c() {
        return this.f194988n;
    }

    /* JADX INFO: renamed from: d */
    public h1e0 m211641d() {
        return this.f194986l;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m211642e() {
        return this.f194990p;
    }

    /* JADX INFO: renamed from: f */
    public float m211643f() {
        return this.f194977c;
    }

    /* JADX INFO: renamed from: g */
    public int m211644g() {
        return this.f194976b;
    }

    /* JADX INFO: renamed from: h */
    public Drawable m211645h() {
        return this.f194982h;
    }

    /* JADX INFO: renamed from: i */
    public h1e0 m211646i() {
        return this.f194983i;
    }

    /* JADX INFO: renamed from: j */
    public List<Drawable> m211647j() {
        return this.f194991q;
    }

    /* JADX INFO: renamed from: k */
    public Drawable m211648k() {
        return this.f194978d;
    }

    /* JADX INFO: renamed from: l */
    public h1e0 m211649l() {
        return this.f194979e;
    }

    /* JADX INFO: renamed from: m */
    public Drawable m211650m() {
        return this.f194992r;
    }

    /* JADX INFO: renamed from: n */
    public Drawable m211651n() {
        return this.f194984j;
    }

    /* JADX INFO: renamed from: o */
    public h1e0 m211652o() {
        return this.f194985k;
    }

    /* JADX INFO: renamed from: p */
    public Resources m211653p() {
        return this.f194975a;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m211654q() {
        return this.f194980f;
    }

    /* JADX INFO: renamed from: r */
    public h1e0 m211655r() {
        return this.f194981g;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m211656s() {
        return this.f194993s;
    }

    /* JADX INFO: renamed from: t */
    public final void m211657t() {
        this.f194976b = 300;
        this.f194977c = 0.0f;
        this.f194978d = null;
        h1e0 h1e0Var = f194973t;
        this.f194979e = h1e0Var;
        this.f194980f = null;
        this.f194981g = h1e0Var;
        this.f194982h = null;
        this.f194983i = h1e0Var;
        this.f194984j = null;
        this.f194985k = h1e0Var;
        this.f194986l = f194974u;
        this.f194987m = null;
        this.f194988n = null;
        this.f194989o = null;
        this.f194990p = null;
        this.f194991q = null;
        this.f194992r = null;
        this.f194993s = null;
    }

    /* JADX INFO: renamed from: v */
    public xlj m211658v(h1e0 h1e0Var) {
        this.f194986l = h1e0Var;
        this.f194987m = null;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public xlj m211659w(Drawable drawable) {
        this.f194990p = drawable;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public xlj m211660x(float f) {
        this.f194977c = f;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public xlj m211661y(int i) {
        this.f194976b = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public xlj m211662z(int i) {
        this.f194982h = this.f194975a.getDrawable(i);
        return this;
    }
}
