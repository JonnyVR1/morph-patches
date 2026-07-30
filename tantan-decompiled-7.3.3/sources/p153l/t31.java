package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class t31 implements View.OnTouchListener, nn50, zl50 {

    /* JADX INFO: renamed from: i */
    public t0e0 f171855i;

    /* JADX INFO: renamed from: j */
    public i5e f171856j;

    /* JADX INFO: renamed from: k */
    public lmj f171857k;

    /* JADX INFO: renamed from: r */
    public RunnableC20224d f171864r;

    /* JADX INFO: renamed from: s */
    public WeakReference<DraweeView<wlj>> f171865s;

    /* JADX INFO: renamed from: t */
    public fp50 f171866t;

    /* JADX INFO: renamed from: u */
    public View.OnLongClickListener f171867u;

    /* JADX INFO: renamed from: v */
    public am50 f171868v;

    /* JADX INFO: renamed from: w */
    public boolean f171869w;

    /* JADX INFO: renamed from: a */
    public final float[] f171847a = new float[9];

    /* JADX INFO: renamed from: b */
    public final RectF f171848b = new RectF();

    /* JADX INFO: renamed from: c */
    public final Interpolator f171849c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public float f171850d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f171851e = 1.75f;

    /* JADX INFO: renamed from: f */
    public float f171852f = 3.0f;

    /* JADX INFO: renamed from: g */
    public float f171853g = 3.0f;

    /* JADX INFO: renamed from: h */
    public long f171854h = 200;

    /* JADX INFO: renamed from: l */
    public boolean f171858l = false;

    /* JADX INFO: renamed from: m */
    public boolean f171859m = true;

    /* JADX INFO: renamed from: n */
    public int f171860n = 2;

    /* JADX INFO: renamed from: o */
    public final Matrix f171861o = new Matrix();

    /* JADX INFO: renamed from: p */
    public int f171862p = -1;

    /* JADX INFO: renamed from: q */
    public int f171863q = -1;

    /* JADX INFO: renamed from: x */
    public boolean f171870x = false;

    /* JADX INFO: renamed from: y */
    public boolean f171871y = false;

    /* JADX INFO: renamed from: z */
    public boolean f171872z = false;

    /* JADX INFO: renamed from: l.t31$a */
    public class C20221a extends GestureDetector.SimpleOnGestureListener {
        public C20221a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (t31.this.f171867u != null) {
                t31.this.f171867u.onLongClick(t31.this.m189063x());
                t31 t31Var = t31.this;
                t31Var.f171872z = true;
                t31Var.f171856j.mo138697c(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.t31$c */
    public class RunnableC20223c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final float f171876a;

        /* JADX INFO: renamed from: b */
        public final float f171877b;

        /* JADX INFO: renamed from: c */
        public final long f171878c = SystemClock.uptimeMillis();

        /* JADX INFO: renamed from: d */
        public final float f171879d;

        /* JADX INFO: renamed from: e */
        public final float f171880e;

        public RunnableC20223c(float f, float f2, float f3, float f4) {
            this.f171876a = f3;
            this.f171877b = f4;
            this.f171879d = f;
            this.f171880e = f2;
        }

        /* JADX INFO: renamed from: a */
        public final float m189066a() {
            return t31.this.f171849c.getInterpolation(Math.min(1.0f, ((SystemClock.uptimeMillis() - this.f171878c) * 1.0f) / t31.this.f171854h));
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<wlj> draweeViewM189063x = t31.this.m189063x();
            if (draweeViewM189063x == null) {
                return;
            }
            float fM189066a = m189066a();
            float f = this.f171879d;
            t31.this.mo163859f((f + ((this.f171880e - f) * fM189066a)) / t31.this.m189027G(), this.f171876a, this.f171877b);
            if (fM189066a < 1.0f) {
                t31.this.m189032L(draweeViewM189063x, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.t31$d */
    public class RunnableC20224d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final zde0 f171882a;

        /* JADX INFO: renamed from: b */
        public int f171883b;

        /* JADX INFO: renamed from: c */
        public int f171884c;

        public RunnableC20224d(Context context) {
            this.f171882a = zde0.m219292c(context);
        }

        /* JADX INFO: renamed from: a */
        public void m189067a() {
            this.f171882a.m219294a();
        }

        /* JADX INFO: renamed from: b */
        public void m189068b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFM189059t = t31.this.m189059t();
            if (rectFM189059t == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM189059t.left);
            float f = i;
            if (f < rectFM189059t.width()) {
                iRound = Math.round(rectFM189059t.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFM189059t.top);
            float f2 = i2;
            if (f2 < rectFM189059t.height()) {
                iRound2 = Math.round(rectFM189059t.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f171883b = iRound3;
            this.f171884c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f171882a.m219296e(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<wlj> draweeViewM189063x;
            if (this.f171882a.m219299h() || (draweeViewM189063x = t31.this.m189063x()) == null || !this.f171882a.m219295b()) {
                return;
            }
            int iM219297f = this.f171882a.m219297f();
            int iM219298g = this.f171882a.m219298g();
            t31.this.f171861o.postTranslate(this.f171883b - iM219297f, this.f171884c - iM219298g);
            draweeViewM189063x.invalidate();
            this.f171883b = iM219297f;
            this.f171884c = iM219298g;
            t31.this.m189032L(draweeViewM189063x, this);
        }
    }

    public t31(DraweeView<wlj> draweeView) {
        this.f171865s = new WeakReference<>(draweeView);
        ((wlj) draweeView.getHierarchy()).m207062w(h1e0.f107448e);
        draweeView.setOnTouchListener(this);
        this.f171855i = new t0e0(draweeView.getContext(), this);
        this.f171856j = new i5e(m189024D(), draweeView.getContext());
        lmj lmjVar = new lmj(draweeView.getContext(), new C20221a());
        this.f171857k = lmjVar;
        lmjVar.m154871b(new rqd(this));
    }

    /* JADX INFO: renamed from: s */
    public static void m189021s(float f, float f2, float f3) {
        if (f >= f2) {
            wg3.m206174a("MinZoom has to be less than MidZoom");
        } else {
            if (f2 < f3) {
                return;
            }
            wg3.m206174a("MidZoom has to be less than MaxZoom");
        }
    }

    /* JADX INFO: renamed from: A */
    public float m189022A() {
        return this.f171851e;
    }

    /* JADX INFO: renamed from: C */
    public float m189023C() {
        return this.f171850d;
    }

    /* JADX INFO: renamed from: E */
    public cn50 m189025E() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public fp50 m189026F() {
        return this.f171866t;
    }

    /* JADX INFO: renamed from: G */
    public float m189027G() {
        return (float) Math.sqrt(((float) Math.pow(m189064y(this.f171861o, 0), 2.0d)) + ((float) Math.pow(m189064y(this.f171861o, 3), 2.0d)));
    }

    /* JADX INFO: renamed from: H */
    public final int m189028H() {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x != null) {
            return (draweeViewM189063x.getHeight() - draweeViewM189063x.getPaddingTop()) - draweeViewM189063x.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final int m189029I() {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x != null) {
            return (draweeViewM189063x.getWidth() - draweeViewM189063x.getPaddingLeft()) - draweeViewM189063x.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m189030J(float f, float f2, DraweeView draweeView, float f3, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        draweeView.setTranslationX(animatedFraction);
        draweeView.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        draweeView.setScaleX(animatedFraction3);
        draweeView.setScaleY(animatedFraction3);
        am50 am50Var = this.f171868v;
        if (am50Var != null) {
            am50Var.mo45666c(animatedFraction, animatedFraction2);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m189031K() {
        m189055o();
    }

    /* JADX INFO: renamed from: L */
    public final void m189032L(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: M */
    public final void m189033M() {
        this.f171861o.reset();
        m189057q();
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x != null) {
            draweeViewM189063x.invalidate();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m189034N(boolean z) {
        this.f171859m = z;
    }

    /* JADX INFO: renamed from: O */
    public void m189035O(i5e i5eVar) {
        this.f171856j = i5eVar;
    }

    /* JADX INFO: renamed from: P */
    public void m189036P(float f) {
        this.f171853g = f;
    }

    /* JADX INFO: renamed from: Q */
    public void m189037Q(boolean z) {
        this.f171869w = z;
    }

    /* JADX INFO: renamed from: R */
    public void m189038R(float f) {
        m189021s(this.f171850d, this.f171851e, f);
        this.f171852f = f;
    }

    /* JADX INFO: renamed from: S */
    public void m189039S(float f) {
        m189021s(this.f171850d, f, this.f171852f);
        this.f171851e = f;
    }

    /* JADX INFO: renamed from: T */
    public void m189040T(float f) {
        m189021s(f, this.f171851e, this.f171852f);
        this.f171850d = f;
    }

    /* JADX INFO: renamed from: U */
    public void m189041U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        lmj lmjVar = this.f171857k;
        if (onDoubleTapListener != null) {
            lmjVar.m154871b(onDoubleTapListener);
        } else {
            lmjVar.m154871b(new rqd(this));
        }
    }

    /* JADX INFO: renamed from: V */
    public void m189042V(am50 am50Var) {
        this.f171868v = am50Var;
    }

    /* JADX INFO: renamed from: W */
    public void m189043W(View.OnLongClickListener onLongClickListener) {
        this.f171867u = onLongClickListener;
    }

    /* JADX INFO: renamed from: Z */
    public void m189046Z(fp50 fp50Var) {
        this.f171866t = fp50Var;
    }

    @Override // p153l.zl50
    /* JADX INFO: renamed from: a */
    public void mo189047a(float f, float f2) {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null || m189027G() > this.f171852f) {
            return;
        }
        this.f171870x = true;
        draweeViewM189063x.setTranslationX(f);
        draweeViewM189063x.setTranslationY(f2);
        if (f2 > 0.0f) {
            float fM105588w0 = bnl0.m105588w0() / (bnl0.m105588w0() + f2);
            draweeViewM189063x.setScaleX(fM105588w0);
            draweeViewM189063x.setScaleY(fM105588w0);
        }
        am50 am50Var = this.f171868v;
        if (am50Var != null) {
            am50Var.mo45666c(f, f2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m189048a0(float f) {
        m189050c0(f, false);
    }

    @Override // p153l.nn50
    /* JADX INFO: renamed from: b */
    public void mo163856b(float f, float f2, float f3, float f4) {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null) {
            return;
        }
        RunnableC20224d runnableC20224d = new RunnableC20224d(draweeViewM189063x.getContext());
        this.f171864r = runnableC20224d;
        runnableC20224d.m189068b(m189029I(), m189028H(), (int) f3, (int) f4);
        draweeViewM189063x.post(this.f171864r);
    }

    /* JADX INFO: renamed from: b0 */
    public void m189049b0(float f, float f2, float f3, boolean z) {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null || f < this.f171850d || f > this.f171852f) {
            return;
        }
        if (z) {
            draweeViewM189063x.post(new RunnableC20223c(m189027G(), f, f2, f3));
        } else {
            this.f171861o.setScale(f, f, f2, f3);
            m189056p();
        }
    }

    @Override // p153l.nn50
    /* JADX INFO: renamed from: c */
    public void mo163857c(float f, float f2) {
        if (!this.f171869w) {
            ViewParent parent = m189063x().getParent();
            if (parent == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(false);
            return;
        }
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null || this.f171855i.m188721d()) {
            return;
        }
        this.f171861o.postTranslate(f, f2);
        m189056p();
        ViewParent parent2 = draweeViewM189063x.getParent();
        if (parent2 == null) {
            return;
        }
        if (!this.f171859m || this.f171855i.m188721d() || this.f171858l) {
            parent2.requestDisallowInterceptTouchEvent(true);
            return;
        }
        int i = this.f171860n;
        if (i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m189050c0(float f, boolean z) {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x != null) {
            m189049b0(f, draweeViewM189063x.getRight() / 2, draweeViewM189063x.getBottom() / 2, false);
        }
    }

    @Override // p153l.nn50
    /* JADX INFO: renamed from: d */
    public void mo163858d() {
        m189058r();
    }

    /* JADX INFO: renamed from: d0 */
    public void m189051d0(long j) {
        if (j < 0) {
            j = 200;
        }
        this.f171854h = j;
    }

    @Override // p153l.zl50
    /* JADX INFO: renamed from: e */
    public void mo189052e(boolean z) {
        this.f171871y = false;
        final DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null || !this.f171870x) {
            return;
        }
        if (z) {
            am50 am50Var = this.f171868v;
            if (am50Var != null) {
                am50Var.mo45667d();
                return;
            }
            return;
        }
        final float translationX = draweeViewM189063x.getTranslationX();
        final float translationY = draweeViewM189063x.getTranslationY();
        final float scaleX = draweeViewM189063x.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.s31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f165948a.m189030J(translationX, translationY, draweeViewM189063x, scaleX, duration, valueAnimator);
            }
        });
        duration.addListener(new C20222b(draweeViewM189063x));
        duration.start();
    }

    /* JADX INFO: renamed from: e0 */
    public void m189053e0(int i, int i2) {
        this.f171863q = i;
        this.f171862p = i2;
        m189054f0();
    }

    @Override // p153l.nn50
    /* JADX INFO: renamed from: f */
    public void mo163859f(float f, float f2, float f3) {
        if (this.f171869w) {
            if (m189027G() < this.f171852f || f < 1.0f) {
                this.f171861o.postScale(f, f, f2, f3);
                m189056p();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m189054f0() {
        if (this.f171863q == -1 && this.f171862p == -1) {
            return;
        }
        m189033M();
    }

    /* JADX INFO: renamed from: o */
    public final void m189055o() {
        RunnableC20224d runnableC20224d = this.f171864r;
        if (runnableC20224d != null) {
            runnableC20224d.m189067a();
            this.f171864r = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        boolean z = false;
        boolean zMo138696b = (this.f171872z || this.f171868v == null || !this.f171871y) ? false : this.f171856j.mo138696b(motionEvent);
        int iM194643c = u610.m194643c(motionEvent);
        if (iM194643c == 0) {
            this.f171872z = false;
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            m189055o();
        } else if ((iM194643c == 1 || iM194643c == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean zM188721d = this.f171855i.m188721d();
        boolean zM188720c = this.f171855i.m188720c();
        if (!this.f171870x) {
            zMo138696b = this.f171855i.m188724g(motionEvent);
        }
        boolean z2 = (zM188721d || this.f171855i.m188721d()) ? false : true;
        boolean z3 = (zM188720c || this.f171855i.m188720c()) ? false : true;
        if (z2 && z3) {
            z = true;
        }
        this.f171858l = z;
        if (this.f171857k.m154870a(motionEvent)) {
            return true;
        }
        return zMo138696b;
    }

    /* JADX INFO: renamed from: p */
    public void m189056p() {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x != null && m189057q()) {
            draweeViewM189063x.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m189057q() {
        float f;
        RectF rectFM189060u = m189060u(m189062w());
        if (rectFM189060u == null) {
            return false;
        }
        float fHeight = rectFM189060u.height();
        float fWidth = rectFM189060u.width();
        float fM189028H = m189028H();
        float f2 = rectFM189060u.top;
        float f3 = 0.0f;
        if (fHeight <= fM189028H) {
            f = ((fM189028H - fHeight) / 2.0f) - f2;
        } else if (f2 > 0.0f) {
            f = -f2;
        } else {
            float f4 = rectFM189060u.bottom;
            f = f4 < fM189028H ? fM189028H - f4 : 0.0f;
        }
        int iM189029I = m189029I();
        this.f171871y = false;
        int i = (int) fWidth;
        float f5 = rectFM189060u.left;
        if (i <= iM189029I) {
            float f6 = ((iM189029I - fWidth) / 2.0f) - f5;
            this.f171860n = 2;
            if (rectFM189060u.top >= 0.0f) {
                this.f171871y = true;
            }
            f3 = f6;
        } else if (f5 > 0.0f) {
            f3 = -f5;
            this.f171860n = 0;
        } else {
            float f7 = rectFM189060u.right;
            float f8 = iM189029I;
            if (f7 < f8) {
                f3 = f8 - f7;
                this.f171860n = 1;
            } else {
                this.f171860n = -1;
            }
        }
        this.f171861o.postTranslate(f3, f);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m189058r() {
        RectF rectFM189059t;
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null || m189027G() >= this.f171850d || (rectFM189059t = m189059t()) == null) {
            return;
        }
        draweeViewM189063x.post(new RunnableC20223c(m189027G(), this.f171850d, rectFM189059t.centerX(), rectFM189059t.centerY()));
    }

    /* JADX INFO: renamed from: t */
    public RectF m189059t() {
        m189057q();
        return m189060u(m189062w());
    }

    /* JADX INFO: renamed from: u */
    public final RectF m189060u(Matrix matrix) {
        DraweeView<wlj> draweeViewM189063x = m189063x();
        if (draweeViewM189063x == null) {
            return null;
        }
        int i = this.f171863q;
        if (i == -1 && this.f171862p == -1) {
            return null;
        }
        this.f171848b.set(0.0f, 0.0f, i, this.f171862p);
        ((wlj) draweeViewM189063x.getHierarchy()).m207051l(this.f171848b);
        matrix.mapRect(this.f171848b);
        return this.f171848b;
    }

    /* JADX INFO: renamed from: v */
    public float m189061v() {
        return this.f171853g;
    }

    /* JADX INFO: renamed from: w */
    public Matrix m189062w() {
        return this.f171861o;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public DraweeView<wlj> m189063x() {
        return this.f171865s.get();
    }

    /* JADX INFO: renamed from: y */
    public final float m189064y(Matrix matrix, int i) {
        matrix.getValues(this.f171847a);
        return this.f171847a[i];
    }

    /* JADX INFO: renamed from: z */
    public float m189065z() {
        return this.f171852f;
    }

    /* JADX INFO: renamed from: D */
    public zl50 m189024D() {
        return this;
    }

    /* JADX INFO: renamed from: l.t31$b */
    public class C20222b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DraweeView f171874a;

        public C20222b(DraweeView draweeView) {
            this.f171874a = draweeView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t31 t31Var = t31.this;
            t31Var.f171870x = false;
            if (t31Var.f171868v != null) {
                t31.this.f171868v.mo45666c(0.0f, 0.0f);
            }
            this.f171874a.setTranslationX(0.0f);
            this.f171874a.setTranslationY(0.0f);
            this.f171874a.setScaleX(1.0f);
            this.f171874a.setScaleY(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: X */
    public void m189044X(cn50 cn50Var) {
    }

    /* JADX INFO: renamed from: Y */
    public void m189045Y(mn50 mn50Var) {
    }
}
