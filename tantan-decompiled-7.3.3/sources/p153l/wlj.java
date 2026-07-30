package p153l;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.generic.WrappingUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class wlj implements dve0 {

    /* JADX INFO: renamed from: a */
    public final Drawable f189696a;

    /* JADX INFO: renamed from: b */
    public final Resources f189697b;

    /* JADX INFO: renamed from: c */
    public RoundingParams f189698c;

    /* JADX INFO: renamed from: d */
    public final kmd0 f189699d;

    /* JADX INFO: renamed from: e */
    public final oxf f189700e;

    /* JADX INFO: renamed from: f */
    public final p2j f189701f;

    public wlj(xlj xljVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f189696a = colorDrawable;
        if (i9j.m139099d()) {
            i9j.m139097a("GenericDraweeHierarchy()");
        }
        this.f189697b = xljVar.m211653p();
        this.f189698c = xljVar.m211656s();
        p2j p2jVar = new p2j(colorDrawable);
        this.f189701f = p2jVar;
        int i = 1;
        int size = xljVar.m211647j() != null ? xljVar.m211647j().size() : 1;
        int i2 = (size == 0 ? 1 : size) + (xljVar.m211650m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = m207047h(xljVar.m211642e(), null);
        drawableArr[1] = m207047h(xljVar.m211648k(), xljVar.m211649l());
        drawableArr[2] = m207046g(p2jVar, xljVar.m211641d(), xljVar.m211640c(), xljVar.m211639b());
        drawableArr[3] = m207047h(xljVar.m211651n(), xljVar.m211652o());
        drawableArr[4] = m207047h(xljVar.m211654q(), xljVar.m211655r());
        drawableArr[5] = m207047h(xljVar.m211645h(), xljVar.m211646i());
        if (i2 > 0) {
            if (xljVar.m211647j() != null) {
                Iterator<Drawable> it = xljVar.m211647j().iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = m207047h(it.next(), null);
                    i++;
                }
            }
            if (xljVar.m211650m() != null) {
                drawableArr[i + 6] = m207047h(xljVar.m211650m(), null);
            }
        }
        oxf oxfVar = new oxf(drawableArr, false, 2);
        this.f189700e = oxfVar;
        oxfVar.m169704u(xljVar.m211644g());
        kmd0 kmd0Var = new kmd0(WrappingUtils.m8327d(oxfVar, this.f189698c));
        this.f189699d = kmd0Var;
        kmd0Var.mutate();
        m207060u();
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m207038A(Drawable drawable) {
        m207063x(5, drawable);
    }

    /* JADX INFO: renamed from: B */
    public void m207039B(int i, Drawable drawable) {
        wn80.m207178c(i >= 0 && i + 6 < this.f189700e.m128367d(), "The given index does not correspond to an overlay image.");
        m207063x(i + 6, drawable);
    }

    /* JADX INFO: renamed from: C */
    public void m207040C(Drawable drawable) {
        m207039B(0, drawable);
    }

    /* JADX INFO: renamed from: D */
    public void m207041D(int i) {
        m207042E(this.f189697b.getDrawable(i));
    }

    /* JADX INFO: renamed from: E */
    public void m207042E(Drawable drawable) {
        m207063x(1, drawable);
    }

    /* JADX INFO: renamed from: F */
    public void m207043F(Drawable drawable, h1e0 h1e0Var) {
        m207063x(1, drawable);
        m207056q(1).m208823x(h1e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m207044G(float f) {
        Drawable drawableM128365b = this.f189700e.m128365b(3);
        if (drawableM128365b == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableM128365b instanceof Animatable) {
                ((Animatable) drawableM128365b).stop();
            }
            m207050k(3);
        } else {
            if (drawableM128365b instanceof Animatable) {
                ((Animatable) drawableM128365b).start();
            }
            m207048i(3);
        }
        drawableM128365b.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX INFO: renamed from: H */
    public void m207045H(RoundingParams roundingParams) {
        this.f189698c = roundingParams;
        WrappingUtils.m8332i(this.f189699d, roundingParams);
        for (int i = 0; i < this.f189700e.m128367d(); i++) {
            WrappingUtils.m8331h(m207054o(i), this.f189698c, this.f189697b);
        }
    }

    @Override // p153l.dve0
    /* JADX INFO: renamed from: a */
    public void mo118276a(Throwable th) {
        this.f189700e.m169692f();
        m207049j();
        if (this.f189700e.m128365b(4) != null) {
            m207048i(4);
        } else {
            m207048i(1);
        }
        this.f189700e.m169694i();
    }

    @Override // p153l.mde
    /* JADX INFO: renamed from: b */
    public Drawable mo157973b() {
        return this.f189699d;
    }

    @Override // p153l.dve0
    /* JADX INFO: renamed from: c */
    public void mo118277c(Drawable drawable) {
        this.f189699d.m150430s(drawable);
    }

    @Override // p153l.dve0
    /* JADX INFO: renamed from: d */
    public void mo118278d(Throwable th) {
        this.f189700e.m169692f();
        m207049j();
        if (this.f189700e.m128365b(5) != null) {
            m207048i(5);
        } else {
            m207048i(1);
        }
        this.f189700e.m169694i();
    }

    @Override // p153l.dve0
    /* JADX INFO: renamed from: e */
    public void mo118279e(float f, boolean z) {
        if (this.f189700e.m128365b(3) == null) {
            return;
        }
        this.f189700e.m169692f();
        m207044G(f);
        if (z) {
            this.f189700e.m169698o();
        }
        this.f189700e.m169694i();
    }

    @Override // p153l.dve0
    /* JADX INFO: renamed from: f */
    public void mo118280f(Drawable drawable, float f, boolean z) {
        Drawable drawableM8326c = WrappingUtils.m8326c(drawable, this.f189698c, this.f189697b);
        drawableM8326c.mutate();
        this.f189701f.mo128372k(drawableM8326c);
        this.f189700e.m169692f();
        m207049j();
        m207048i(2);
        m207044G(f);
        if (z) {
            this.f189700e.m169698o();
        }
        this.f189700e.m169694i();
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m207046g(Drawable drawable, h1e0 h1e0Var, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return WrappingUtils.m8329f(drawable, h1e0Var, pointF);
    }

    @Override // p153l.mde
    public Rect getBounds() {
        return this.f189699d.getBounds();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m207047h(Drawable drawable, h1e0 h1e0Var) {
        return WrappingUtils.m8328e(WrappingUtils.m8326c(drawable, this.f189698c, this.f189697b), h1e0Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m207048i(int i) {
        if (i >= 0) {
            this.f189700e.m169696m(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m207049j() {
        m207050k(1);
        m207050k(2);
        m207050k(3);
        m207050k(4);
        m207050k(5);
    }

    /* JADX INFO: renamed from: k */
    public final void m207050k(int i) {
        if (i >= 0) {
            this.f189700e.m169697n(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m207051l(RectF rectF) {
        this.f189701f.m170353p(rectF);
    }

    /* JADX INFO: renamed from: m */
    public PointF m207052m() {
        if (m207058s(2)) {
            return m207056q(2).m208820u();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public h1e0 m207053n() {
        if (m207058s(2)) {
            return m207056q(2).m208821v();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final uce m207054o(int i) {
        uce uceVarM128366c = this.f189700e.m128366c(i);
        if (uceVarM128366c.mo128371i() instanceof nhx) {
            uceVarM128366c = (nhx) uceVarM128366c.mo128371i();
        }
        return uceVarM128366c.mo128371i() instanceof x0e0 ? (x0e0) uceVarM128366c.mo128371i() : uceVarM128366c;
    }

    /* JADX INFO: renamed from: p */
    public RoundingParams m207055p() {
        return this.f189698c;
    }

    /* JADX INFO: renamed from: q */
    public final x0e0 m207056q(int i) {
        uce uceVarM207054o = m207054o(i);
        return uceVarM207054o instanceof x0e0 ? (x0e0) uceVarM207054o : WrappingUtils.m8333j(uceVarM207054o, h1e0.f107444a);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: r */
    public boolean m207057r() {
        return this.f189701f.mo128371i() != this.f189696a;
    }

    @Override // p153l.dve0
    public void reset() {
        m207059t();
        m207060u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m207058s(int i) {
        return m207054o(i) instanceof x0e0;
    }

    /* JADX INFO: renamed from: t */
    public final void m207059t() {
        this.f189701f.mo128372k(this.f189696a);
    }

    /* JADX INFO: renamed from: u */
    public final void m207060u() {
        oxf oxfVar = this.f189700e;
        if (oxfVar != null) {
            oxfVar.m169692f();
            this.f189700e.m169695k();
            m207049j();
            m207048i(1);
            this.f189700e.m169698o();
            this.f189700e.m169694i();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m207061v(PointF pointF) {
        wn80.m207182g(pointF);
        m207056q(2).m208822w(pointF);
    }

    /* JADX INFO: renamed from: w */
    public void m207062w(h1e0 h1e0Var) {
        wn80.m207182g(h1e0Var);
        m207056q(2).m208823x(h1e0Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m207063x(int i, Drawable drawable) {
        if (drawable == null) {
            this.f189700e.m128368e(i, null);
        } else {
            m207054o(i).mo128372k(WrappingUtils.m8326c(drawable, this.f189698c, this.f189697b));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m207064y(int i) {
        this.f189700e.m169704u(i);
    }

    /* JADX INFO: renamed from: z */
    public void m207065z(int i) {
        m207038A(this.f189697b.getDrawable(i));
    }
}
