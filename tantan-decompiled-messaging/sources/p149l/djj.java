package p149l;

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
public class djj implements wme0 {

    /* JADX INFO: renamed from: a */
    public final Drawable f86548a;

    /* JADX INFO: renamed from: b */
    public final Resources f86549b;

    /* JADX INFO: renamed from: c */
    public RoundingParams f86550c;

    /* JADX INFO: renamed from: d */
    public final ied0 f86551d;

    /* JADX INFO: renamed from: e */
    public final awf f86552e;

    /* JADX INFO: renamed from: f */
    public final uzi f86553f;

    public djj(ejj ejjVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f86548a = colorDrawable;
        if (o6j.m162852d()) {
            o6j.m162850a("GenericDraweeHierarchy()");
        }
        this.f86549b = ejjVar.m116887p();
        this.f86550c = ejjVar.m116890s();
        uzi uziVar = new uzi(colorDrawable);
        this.f86553f = uziVar;
        int i = 1;
        int size = ejjVar.m116881j() != null ? ejjVar.m116881j().size() : 1;
        int i2 = (size == 0 ? 1 : size) + (ejjVar.m116884m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i2 + 6];
        drawableArr[0] = m112061h(ejjVar.m116876e(), null);
        drawableArr[1] = m112061h(ejjVar.m116882k(), ejjVar.m116883l());
        drawableArr[2] = m112060g(uziVar, ejjVar.m116875d(), ejjVar.m116874c(), ejjVar.m116873b());
        drawableArr[3] = m112061h(ejjVar.m116885n(), ejjVar.m116886o());
        drawableArr[4] = m112061h(ejjVar.m116888q(), ejjVar.m116889r());
        drawableArr[5] = m112061h(ejjVar.m116879h(), ejjVar.m116880i());
        if (i2 > 0) {
            if (ejjVar.m116881j() != null) {
                Iterator<Drawable> it = ejjVar.m116881j().iterator();
                i = 0;
                while (it.hasNext()) {
                    drawableArr[i + 6] = m112061h(it.next(), null);
                    i++;
                }
            }
            if (ejjVar.m116884m() != null) {
                drawableArr[i + 6] = m112061h(ejjVar.m116884m(), null);
            }
        }
        awf awfVar = new awf(drawableArr, false, 2);
        this.f86552e = awfVar;
        awfVar.m99279u(ejjVar.m116878g());
        ied0 ied0Var = new ied0(WrappingUtils.m8273d(awfVar, this.f86550c));
        this.f86551d = ied0Var;
        ied0Var.mutate();
        m112074u();
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m112046A(Drawable drawable) {
        m112077x(5, drawable);
    }

    /* JADX INFO: renamed from: B */
    public void m112047B(int i, Drawable drawable) {
        rf80.m179112c(i >= 0 && i + 6 < this.f86552e.m220986d(), "The given index does not correspond to an overlay image.");
        m112077x(i + 6, drawable);
    }

    /* JADX INFO: renamed from: C */
    public void m112048C(Drawable drawable) {
        m112047B(0, drawable);
    }

    /* JADX INFO: renamed from: D */
    public void m112049D(int i) {
        m112050E(this.f86549b.getDrawable(i));
    }

    /* JADX INFO: renamed from: E */
    public void m112050E(Drawable drawable) {
        m112077x(1, drawable);
    }

    /* JADX INFO: renamed from: F */
    public void m112051F(Drawable drawable, ftd0 ftd0Var) {
        m112077x(1, drawable);
        m112070q(1).m199860x(ftd0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m112052G(float f) {
        Drawable drawableM220984b = this.f86552e.m220984b(3);
        if (drawableM220984b == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableM220984b instanceof Animatable) {
                ((Animatable) drawableM220984b).stop();
            }
            m112064k(3);
        } else {
            if (drawableM220984b instanceof Animatable) {
                ((Animatable) drawableM220984b).start();
            }
            m112062i(3);
        }
        drawableM220984b.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX INFO: renamed from: H */
    public void m112053H(RoundingParams roundingParams) {
        this.f86550c = roundingParams;
        WrappingUtils.m8278i(this.f86551d, roundingParams);
        for (int i = 0; i < this.f86552e.m220986d(); i++) {
            WrappingUtils.m8277h(m112068o(i), this.f86550c, this.f86549b);
        }
    }

    @Override // p149l.wme0
    /* JADX INFO: renamed from: a */
    public void mo112054a(Throwable th) {
        this.f86552e.m99267f();
        m112063j();
        if (this.f86552e.m220984b(4) != null) {
            m112062i(4);
        } else {
            m112062i(1);
        }
        this.f86552e.m99269i();
    }

    @Override // p149l.ice
    /* JADX INFO: renamed from: b */
    public Drawable mo112055b() {
        return this.f86551d;
    }

    @Override // p149l.wme0
    /* JADX INFO: renamed from: c */
    public void mo112056c(Drawable drawable) {
        this.f86551d.m135668s(drawable);
    }

    @Override // p149l.wme0
    /* JADX INFO: renamed from: d */
    public void mo112057d(Throwable th) {
        this.f86552e.m99267f();
        m112063j();
        if (this.f86552e.m220984b(5) != null) {
            m112062i(5);
        } else {
            m112062i(1);
        }
        this.f86552e.m99269i();
    }

    @Override // p149l.wme0
    /* JADX INFO: renamed from: e */
    public void mo112058e(float f, boolean z) {
        if (this.f86552e.m220984b(3) == null) {
            return;
        }
        this.f86552e.m99267f();
        m112052G(f);
        if (z) {
            this.f86552e.m99273o();
        }
        this.f86552e.m99269i();
    }

    @Override // p149l.wme0
    /* JADX INFO: renamed from: f */
    public void mo112059f(Drawable drawable, float f, boolean z) {
        Drawable drawableM8272c = WrappingUtils.m8272c(drawable, this.f86550c, this.f86549b);
        drawableM8272c.mutate();
        this.f86553f.mo173825k(drawableM8272c);
        this.f86552e.m99267f();
        m112063j();
        m112062i(2);
        m112052G(f);
        if (z) {
            this.f86552e.m99273o();
        }
        this.f86552e.m99269i();
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m112060g(Drawable drawable, ftd0 ftd0Var, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return WrappingUtils.m8275f(drawable, ftd0Var, pointF);
    }

    @Override // p149l.ice
    public Rect getBounds() {
        return this.f86551d.getBounds();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m112061h(Drawable drawable, ftd0 ftd0Var) {
        return WrappingUtils.m8274e(WrappingUtils.m8272c(drawable, this.f86550c, this.f86549b), ftd0Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m112062i(int i) {
        if (i >= 0) {
            this.f86552e.m99271m(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m112063j() {
        m112064k(1);
        m112064k(2);
        m112064k(3);
        m112064k(4);
        m112064k(5);
    }

    /* JADX INFO: renamed from: k */
    public final void m112064k(int i) {
        if (i >= 0) {
            this.f86552e.m99272n(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m112065l(RectF rectF) {
        this.f86553f.m196419p(rectF);
    }

    /* JADX INFO: renamed from: m */
    public PointF m112066m() {
        if (m112072s(2)) {
            return m112070q(2).m199857u();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public ftd0 m112067n() {
        if (m112072s(2)) {
            return m112070q(2).m199858v();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final qbe m112068o(int i) {
        qbe qbeVarM220985c = this.f86552e.m220985c(i);
        if (qbeVarM220985c.mo173824i() instanceof oex) {
            qbeVarM220985c = (oex) qbeVarM220985c.mo173824i();
        }
        return qbeVarM220985c.mo173824i() instanceof vsd0 ? (vsd0) qbeVarM220985c.mo173824i() : qbeVarM220985c;
    }

    /* JADX INFO: renamed from: p */
    public RoundingParams m112069p() {
        return this.f86550c;
    }

    /* JADX INFO: renamed from: q */
    public final vsd0 m112070q(int i) {
        qbe qbeVarM112068o = m112068o(i);
        return qbeVarM112068o instanceof vsd0 ? (vsd0) qbeVarM112068o : WrappingUtils.m8279j(qbeVarM112068o, ftd0.f99177a);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: r */
    public boolean m112071r() {
        return this.f86553f.mo173824i() != this.f86548a;
    }

    @Override // p149l.wme0
    public void reset() {
        m112073t();
        m112074u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m112072s(int i) {
        return m112068o(i) instanceof vsd0;
    }

    /* JADX INFO: renamed from: t */
    public final void m112073t() {
        this.f86553f.mo173825k(this.f86548a);
    }

    /* JADX INFO: renamed from: u */
    public final void m112074u() {
        awf awfVar = this.f86552e;
        if (awfVar != null) {
            awfVar.m99267f();
            this.f86552e.m99270k();
            m112063j();
            m112062i(1);
            this.f86552e.m99273o();
            this.f86552e.m99269i();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m112075v(PointF pointF) {
        rf80.m179116g(pointF);
        m112070q(2).m199859w(pointF);
    }

    /* JADX INFO: renamed from: w */
    public void m112076w(ftd0 ftd0Var) {
        rf80.m179116g(ftd0Var);
        m112070q(2).m199860x(ftd0Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m112077x(int i, Drawable drawable) {
        if (drawable == null) {
            this.f86552e.m220987e(i, null);
        } else {
            m112068o(i).mo173825k(WrappingUtils.m8272c(drawable, this.f86550c, this.f86549b));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m112078y(int i) {
        this.f86552e.m99279u(i);
    }

    /* JADX INFO: renamed from: z */
    public void m112079z(int i) {
        m112046A(this.f86549b.getDrawable(i));
    }
}
