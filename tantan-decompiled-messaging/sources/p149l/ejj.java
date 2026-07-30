package p149l;

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
public class ejj {

    /* JADX INFO: renamed from: t */
    public static final ftd0 f91742t = ftd0.f99184h;

    /* JADX INFO: renamed from: u */
    public static final ftd0 f91743u = ftd0.f99185i;

    /* JADX INFO: renamed from: a */
    public Resources f91744a;

    /* JADX INFO: renamed from: b */
    public int f91745b;

    /* JADX INFO: renamed from: c */
    public float f91746c;

    /* JADX INFO: renamed from: d */
    public Drawable f91747d;

    /* JADX INFO: renamed from: e */
    public ftd0 f91748e;

    /* JADX INFO: renamed from: f */
    public Drawable f91749f;

    /* JADX INFO: renamed from: g */
    public ftd0 f91750g;

    /* JADX INFO: renamed from: h */
    public Drawable f91751h;

    /* JADX INFO: renamed from: i */
    public ftd0 f91752i;

    /* JADX INFO: renamed from: j */
    public Drawable f91753j;

    /* JADX INFO: renamed from: k */
    public ftd0 f91754k;

    /* JADX INFO: renamed from: l */
    public ftd0 f91755l;

    /* JADX INFO: renamed from: m */
    public Matrix f91756m;

    /* JADX INFO: renamed from: n */
    public PointF f91757n;

    /* JADX INFO: renamed from: o */
    public ColorFilter f91758o;

    /* JADX INFO: renamed from: p */
    public Drawable f91759p;

    /* JADX INFO: renamed from: q */
    public List<Drawable> f91760q;

    /* JADX INFO: renamed from: r */
    public Drawable f91761r;

    /* JADX INFO: renamed from: s */
    public RoundingParams f91762s;

    public ejj(Resources resources) {
        this.f91744a = resources;
        m116891t();
    }

    /* JADX INFO: renamed from: u */
    public static ejj m116859u(Resources resources) {
        return new ejj(resources);
    }

    /* JADX INFO: renamed from: A */
    public ejj m116860A(Drawable drawable) {
        this.f91751h = drawable;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public ejj m116861B(ftd0 ftd0Var) {
        this.f91752i = ftd0Var;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public ejj m116862C(Drawable drawable) {
        if (drawable == null) {
            this.f91760q = null;
            return this;
        }
        this.f91760q = Arrays.asList(drawable);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public ejj m116863D(Drawable drawable) {
        this.f91747d = drawable;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public ejj m116864E(ftd0 ftd0Var) {
        this.f91748e = ftd0Var;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public ejj m116865F(Drawable drawable) {
        if (drawable == null) {
            this.f91761r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f91761r = stateListDrawable;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ejj m116866G(Drawable drawable) {
        this.f91753j = drawable;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public ejj m116867H(ftd0 ftd0Var) {
        this.f91754k = ftd0Var;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public ejj m116868I(Drawable drawable) {
        this.f91749f = drawable;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public ejj m116869J(ftd0 ftd0Var) {
        this.f91750g = ftd0Var;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public ejj m116870K(RoundingParams roundingParams) {
        this.f91762s = roundingParams;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final void m116871L() {
        List<Drawable> list = this.f91760q;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                rf80.m179116g(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public djj m116872a() {
        m116871L();
        return new djj(this);
    }

    /* JADX INFO: renamed from: b */
    public ColorFilter m116873b() {
        return this.f91758o;
    }

    /* JADX INFO: renamed from: c */
    public PointF m116874c() {
        return this.f91757n;
    }

    /* JADX INFO: renamed from: d */
    public ftd0 m116875d() {
        return this.f91755l;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m116876e() {
        return this.f91759p;
    }

    /* JADX INFO: renamed from: f */
    public float m116877f() {
        return this.f91746c;
    }

    /* JADX INFO: renamed from: g */
    public int m116878g() {
        return this.f91745b;
    }

    /* JADX INFO: renamed from: h */
    public Drawable m116879h() {
        return this.f91751h;
    }

    /* JADX INFO: renamed from: i */
    public ftd0 m116880i() {
        return this.f91752i;
    }

    /* JADX INFO: renamed from: j */
    public List<Drawable> m116881j() {
        return this.f91760q;
    }

    /* JADX INFO: renamed from: k */
    public Drawable m116882k() {
        return this.f91747d;
    }

    /* JADX INFO: renamed from: l */
    public ftd0 m116883l() {
        return this.f91748e;
    }

    /* JADX INFO: renamed from: m */
    public Drawable m116884m() {
        return this.f91761r;
    }

    /* JADX INFO: renamed from: n */
    public Drawable m116885n() {
        return this.f91753j;
    }

    /* JADX INFO: renamed from: o */
    public ftd0 m116886o() {
        return this.f91754k;
    }

    /* JADX INFO: renamed from: p */
    public Resources m116887p() {
        return this.f91744a;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m116888q() {
        return this.f91749f;
    }

    /* JADX INFO: renamed from: r */
    public ftd0 m116889r() {
        return this.f91750g;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m116890s() {
        return this.f91762s;
    }

    /* JADX INFO: renamed from: t */
    public final void m116891t() {
        this.f91745b = 300;
        this.f91746c = 0.0f;
        this.f91747d = null;
        ftd0 ftd0Var = f91742t;
        this.f91748e = ftd0Var;
        this.f91749f = null;
        this.f91750g = ftd0Var;
        this.f91751h = null;
        this.f91752i = ftd0Var;
        this.f91753j = null;
        this.f91754k = ftd0Var;
        this.f91755l = f91743u;
        this.f91756m = null;
        this.f91757n = null;
        this.f91758o = null;
        this.f91759p = null;
        this.f91760q = null;
        this.f91761r = null;
        this.f91762s = null;
    }

    /* JADX INFO: renamed from: v */
    public ejj m116892v(ftd0 ftd0Var) {
        this.f91755l = ftd0Var;
        this.f91756m = null;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public ejj m116893w(Drawable drawable) {
        this.f91759p = drawable;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public ejj m116894x(float f) {
        this.f91746c = f;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public ejj m116895y(int i) {
        this.f91745b = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public ejj m116896z(int i) {
        this.f91751h = this.f91744a.getDrawable(i);
        return this;
    }
}
