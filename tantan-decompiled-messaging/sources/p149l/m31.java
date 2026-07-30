package p149l;

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
public class m31 implements View.OnTouchListener, hf50, sd50 {

    /* JADX INFO: renamed from: i */
    public rsd0 f130976i;

    /* JADX INFO: renamed from: j */
    public u3e f130977j;

    /* JADX INFO: renamed from: k */
    public sjj f130978k;

    /* JADX INFO: renamed from: r */
    public RunnableC18375d f130985r;

    /* JADX INFO: renamed from: s */
    public WeakReference<DraweeView<djj>> f130986s;

    /* JADX INFO: renamed from: t */
    public zg50 f130987t;

    /* JADX INFO: renamed from: u */
    public View.OnLongClickListener f130988u;

    /* JADX INFO: renamed from: v */
    public td50 f130989v;

    /* JADX INFO: renamed from: w */
    public boolean f130990w;

    /* JADX INFO: renamed from: a */
    public final float[] f130968a = new float[9];

    /* JADX INFO: renamed from: b */
    public final RectF f130969b = new RectF();

    /* JADX INFO: renamed from: c */
    public final Interpolator f130970c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public float f130971d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f130972e = 1.75f;

    /* JADX INFO: renamed from: f */
    public float f130973f = 3.0f;

    /* JADX INFO: renamed from: g */
    public float f130974g = 3.0f;

    /* JADX INFO: renamed from: h */
    public long f130975h = 200;

    /* JADX INFO: renamed from: l */
    public boolean f130979l = false;

    /* JADX INFO: renamed from: m */
    public boolean f130980m = true;

    /* JADX INFO: renamed from: n */
    public int f130981n = 2;

    /* JADX INFO: renamed from: o */
    public final Matrix f130982o = new Matrix();

    /* JADX INFO: renamed from: p */
    public int f130983p = -1;

    /* JADX INFO: renamed from: q */
    public int f130984q = -1;

    /* JADX INFO: renamed from: x */
    public boolean f130991x = false;

    /* JADX INFO: renamed from: y */
    public boolean f130992y = false;

    /* JADX INFO: renamed from: z */
    public boolean f130993z = false;

    /* JADX INFO: renamed from: l.m31$a */
    public class C18372a extends GestureDetector.SimpleOnGestureListener {
        public C18372a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (m31.this.f130988u != null) {
                m31.this.f130988u.onLongClick(m31.this.m152800x());
                m31 m31Var = m31.this;
                m31Var.f130993z = true;
                m31Var.f130977j.mo123847c(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.m31$c */
    public class RunnableC18374c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final float f130997a;

        /* JADX INFO: renamed from: b */
        public final float f130998b;

        /* JADX INFO: renamed from: c */
        public final long f130999c = SystemClock.uptimeMillis();

        /* JADX INFO: renamed from: d */
        public final float f131000d;

        /* JADX INFO: renamed from: e */
        public final float f131001e;

        public RunnableC18374c(float f, float f2, float f3, float f4) {
            this.f130997a = f3;
            this.f130998b = f4;
            this.f131000d = f;
            this.f131001e = f2;
        }

        /* JADX INFO: renamed from: a */
        public final float m152803a() {
            return m31.this.f130970c.getInterpolation(Math.min(1.0f, ((SystemClock.uptimeMillis() - this.f130999c) * 1.0f) / m31.this.f130975h));
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<djj> draweeViewM152800x = m31.this.m152800x();
            if (draweeViewM152800x == null) {
                return;
            }
            float fM152803a = m152803a();
            float f = this.f131000d;
            m31.this.mo130752f((f + ((this.f131001e - f) * fM152803a)) / m31.this.m152764G(), this.f130997a, this.f130998b);
            if (fM152803a < 1.0f) {
                m31.this.m152769L(draweeViewM152800x, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.m31$d */
    public class RunnableC18375d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final u5e0 f131003a;

        /* JADX INFO: renamed from: b */
        public int f131004b;

        /* JADX INFO: renamed from: c */
        public int f131005c;

        public RunnableC18375d(Context context) {
            this.f131003a = u5e0.m191858c(context);
        }

        /* JADX INFO: renamed from: a */
        public void m152804a() {
            this.f131003a.m191860a();
        }

        /* JADX INFO: renamed from: b */
        public void m152805b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFM152796t = m31.this.m152796t();
            if (rectFM152796t == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM152796t.left);
            float f = i;
            if (f < rectFM152796t.width()) {
                iRound = Math.round(rectFM152796t.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFM152796t.top);
            float f2 = i2;
            if (f2 < rectFM152796t.height()) {
                iRound2 = Math.round(rectFM152796t.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f131004b = iRound3;
            this.f131005c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f131003a.m191862e(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<djj> draweeViewM152800x;
            if (this.f131003a.m191865h() || (draweeViewM152800x = m31.this.m152800x()) == null || !this.f131003a.m191861b()) {
                return;
            }
            int iM191863f = this.f131003a.m191863f();
            int iM191864g = this.f131003a.m191864g();
            m31.this.f130982o.postTranslate(this.f131004b - iM191863f, this.f131005c - iM191864g);
            draweeViewM152800x.invalidate();
            this.f131004b = iM191863f;
            this.f131005c = iM191864g;
            m31.this.m152769L(draweeViewM152800x, this);
        }
    }

    public m31(DraweeView<djj> draweeView) {
        this.f130986s = new WeakReference<>(draweeView);
        ((djj) draweeView.getHierarchy()).m112076w(ftd0.f99181e);
        draweeView.setOnTouchListener(this);
        this.f130976i = new rsd0(draweeView.getContext(), this);
        this.f130977j = new u3e(m152761D(), draweeView.getContext());
        sjj sjjVar = new sjj(draweeView.getContext(), new C18372a());
        this.f130978k = sjjVar;
        sjjVar.m184494b(new mpd(this));
    }

    /* JADX INFO: renamed from: s */
    public static void m152758s(float f, float f2, float f3) {
        if (f >= f2) {
            ig3.m135964a("MinZoom has to be less than MidZoom");
        } else {
            if (f2 < f3) {
                return;
            }
            ig3.m135964a("MidZoom has to be less than MaxZoom");
        }
    }

    /* JADX INFO: renamed from: A */
    public float m152759A() {
        return this.f130972e;
    }

    /* JADX INFO: renamed from: C */
    public float m152760C() {
        return this.f130971d;
    }

    /* JADX INFO: renamed from: E */
    public ve50 m152762E() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public zg50 m152763F() {
        return this.f130987t;
    }

    /* JADX INFO: renamed from: G */
    public float m152764G() {
        return (float) Math.sqrt(((float) Math.pow(m152801y(this.f130982o, 0), 2.0d)) + ((float) Math.pow(m152801y(this.f130982o, 3), 2.0d)));
    }

    /* JADX INFO: renamed from: H */
    public final int m152765H() {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x != null) {
            return (draweeViewM152800x.getHeight() - draweeViewM152800x.getPaddingTop()) - draweeViewM152800x.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final int m152766I() {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x != null) {
            return (draweeViewM152800x.getWidth() - draweeViewM152800x.getPaddingLeft()) - draweeViewM152800x.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m152767J(float f, float f2, DraweeView draweeView, float f3, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        draweeView.setTranslationX(animatedFraction);
        draweeView.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        draweeView.setScaleX(animatedFraction3);
        draweeView.setScaleY(animatedFraction3);
        td50 td50Var = this.f130989v;
        if (td50Var != null) {
            td50Var.mo44483c(animatedFraction, animatedFraction2);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m152768K() {
        m152792o();
    }

    /* JADX INFO: renamed from: L */
    public final void m152769L(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: M */
    public final void m152770M() {
        this.f130982o.reset();
        m152794q();
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x != null) {
            draweeViewM152800x.invalidate();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m152771N(boolean z) {
        this.f130980m = z;
    }

    /* JADX INFO: renamed from: O */
    public void m152772O(u3e u3eVar) {
        this.f130977j = u3eVar;
    }

    /* JADX INFO: renamed from: P */
    public void m152773P(float f) {
        this.f130974g = f;
    }

    /* JADX INFO: renamed from: Q */
    public void m152774Q(boolean z) {
        this.f130990w = z;
    }

    /* JADX INFO: renamed from: R */
    public void m152775R(float f) {
        m152758s(this.f130971d, this.f130972e, f);
        this.f130973f = f;
    }

    /* JADX INFO: renamed from: S */
    public void m152776S(float f) {
        m152758s(this.f130971d, f, this.f130973f);
        this.f130972e = f;
    }

    /* JADX INFO: renamed from: T */
    public void m152777T(float f) {
        m152758s(f, this.f130972e, this.f130973f);
        this.f130971d = f;
    }

    /* JADX INFO: renamed from: U */
    public void m152778U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        sjj sjjVar = this.f130978k;
        if (onDoubleTapListener != null) {
            sjjVar.m184494b(onDoubleTapListener);
        } else {
            sjjVar.m184494b(new mpd(this));
        }
    }

    /* JADX INFO: renamed from: V */
    public void m152779V(td50 td50Var) {
        this.f130989v = td50Var;
    }

    /* JADX INFO: renamed from: W */
    public void m152780W(View.OnLongClickListener onLongClickListener) {
        this.f130988u = onLongClickListener;
    }

    /* JADX INFO: renamed from: Z */
    public void m152783Z(zg50 zg50Var) {
        this.f130987t = zg50Var;
    }

    @Override // p149l.sd50
    /* JADX INFO: renamed from: a */
    public void mo152784a(float f, float f2) {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null || m152764G() > this.f130973f) {
            return;
        }
        this.f130991x = true;
        draweeViewM152800x.setTranslationX(f);
        draweeViewM152800x.setTranslationY(f2);
        if (f2 > 0.0f) {
            float fM208408w0 = xdl0.m208408w0() / (xdl0.m208408w0() + f2);
            draweeViewM152800x.setScaleX(fM208408w0);
            draweeViewM152800x.setScaleY(fM208408w0);
        }
        td50 td50Var = this.f130989v;
        if (td50Var != null) {
            td50Var.mo44483c(f, f2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m152785a0(float f) {
        m152787c0(f, false);
    }

    @Override // p149l.hf50
    /* JADX INFO: renamed from: b */
    public void mo130749b(float f, float f2, float f3, float f4) {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null) {
            return;
        }
        RunnableC18375d runnableC18375d = new RunnableC18375d(draweeViewM152800x.getContext());
        this.f130985r = runnableC18375d;
        runnableC18375d.m152805b(m152766I(), m152765H(), (int) f3, (int) f4);
        draweeViewM152800x.post(this.f130985r);
    }

    /* JADX INFO: renamed from: b0 */
    public void m152786b0(float f, float f2, float f3, boolean z) {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null || f < this.f130971d || f > this.f130973f) {
            return;
        }
        if (z) {
            draweeViewM152800x.post(new RunnableC18374c(m152764G(), f, f2, f3));
        } else {
            this.f130982o.setScale(f, f, f2, f3);
            m152793p();
        }
    }

    @Override // p149l.hf50
    /* JADX INFO: renamed from: c */
    public void mo130750c(float f, float f2) {
        if (!this.f130990w) {
            ViewParent parent = m152800x().getParent();
            if (parent == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(false);
            return;
        }
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null || this.f130976i.m180654d()) {
            return;
        }
        this.f130982o.postTranslate(f, f2);
        m152793p();
        ViewParent parent2 = draweeViewM152800x.getParent();
        if (parent2 == null) {
            return;
        }
        if (!this.f130980m || this.f130976i.m180654d() || this.f130979l) {
            parent2.requestDisallowInterceptTouchEvent(true);
            return;
        }
        int i = this.f130981n;
        if (i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m152787c0(float f, boolean z) {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x != null) {
            m152786b0(f, draweeViewM152800x.getRight() / 2, draweeViewM152800x.getBottom() / 2, false);
        }
    }

    @Override // p149l.hf50
    /* JADX INFO: renamed from: d */
    public void mo130751d() {
        m152795r();
    }

    /* JADX INFO: renamed from: d0 */
    public void m152788d0(long j) {
        if (j < 0) {
            j = 200;
        }
        this.f130975h = j;
    }

    @Override // p149l.sd50
    /* JADX INFO: renamed from: e */
    public void mo152789e(boolean z) {
        this.f130992y = false;
        final DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null || !this.f130991x) {
            return;
        }
        if (z) {
            td50 td50Var = this.f130989v;
            if (td50Var != null) {
                td50Var.mo44484d();
                return;
            }
            return;
        }
        final float translationX = draweeViewM152800x.getTranslationX();
        final float translationY = draweeViewM152800x.getTranslationY();
        final float scaleX = draweeViewM152800x.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f125834a.m152767J(translationX, translationY, draweeViewM152800x, scaleX, duration, valueAnimator);
            }
        });
        duration.addListener(new C18373b(draweeViewM152800x));
        duration.start();
    }

    /* JADX INFO: renamed from: e0 */
    public void m152790e0(int i, int i2) {
        this.f130984q = i;
        this.f130983p = i2;
        m152791f0();
    }

    @Override // p149l.hf50
    /* JADX INFO: renamed from: f */
    public void mo130752f(float f, float f2, float f3) {
        if (this.f130990w) {
            if (m152764G() < this.f130973f || f < 1.0f) {
                this.f130982o.postScale(f, f, f2, f3);
                m152793p();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m152791f0() {
        if (this.f130984q == -1 && this.f130983p == -1) {
            return;
        }
        m152770M();
    }

    /* JADX INFO: renamed from: o */
    public final void m152792o() {
        RunnableC18375d runnableC18375d = this.f130985r;
        if (runnableC18375d != null) {
            runnableC18375d.m152804a();
            this.f130985r = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        boolean z = false;
        boolean zMo123846b = (this.f130993z || this.f130989v == null || !this.f130992y) ? false : this.f130977j.mo123846b(motionEvent);
        int iM147817c = ky00.m147817c(motionEvent);
        if (iM147817c == 0) {
            this.f130993z = false;
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            m152792o();
        } else if ((iM147817c == 1 || iM147817c == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean zM180654d = this.f130976i.m180654d();
        boolean zM180653c = this.f130976i.m180653c();
        if (!this.f130991x) {
            zMo123846b = this.f130976i.m180657g(motionEvent);
        }
        boolean z2 = (zM180654d || this.f130976i.m180654d()) ? false : true;
        boolean z3 = (zM180653c || this.f130976i.m180653c()) ? false : true;
        if (z2 && z3) {
            z = true;
        }
        this.f130979l = z;
        if (this.f130978k.m184493a(motionEvent)) {
            return true;
        }
        return zMo123846b;
    }

    /* JADX INFO: renamed from: p */
    public void m152793p() {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x != null && m152794q()) {
            draweeViewM152800x.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m152794q() {
        float f;
        RectF rectFM152797u = m152797u(m152799w());
        if (rectFM152797u == null) {
            return false;
        }
        float fHeight = rectFM152797u.height();
        float fWidth = rectFM152797u.width();
        float fM152765H = m152765H();
        float f2 = rectFM152797u.top;
        float f3 = 0.0f;
        if (fHeight <= fM152765H) {
            f = ((fM152765H - fHeight) / 2.0f) - f2;
        } else if (f2 > 0.0f) {
            f = -f2;
        } else {
            float f4 = rectFM152797u.bottom;
            f = f4 < fM152765H ? fM152765H - f4 : 0.0f;
        }
        int iM152766I = m152766I();
        this.f130992y = false;
        int i = (int) fWidth;
        float f5 = rectFM152797u.left;
        if (i <= iM152766I) {
            float f6 = ((iM152766I - fWidth) / 2.0f) - f5;
            this.f130981n = 2;
            if (rectFM152797u.top >= 0.0f) {
                this.f130992y = true;
            }
            f3 = f6;
        } else if (f5 > 0.0f) {
            f3 = -f5;
            this.f130981n = 0;
        } else {
            float f7 = rectFM152797u.right;
            float f8 = iM152766I;
            if (f7 < f8) {
                f3 = f8 - f7;
                this.f130981n = 1;
            } else {
                this.f130981n = -1;
            }
        }
        this.f130982o.postTranslate(f3, f);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m152795r() {
        RectF rectFM152796t;
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null || m152764G() >= this.f130971d || (rectFM152796t = m152796t()) == null) {
            return;
        }
        draweeViewM152800x.post(new RunnableC18374c(m152764G(), this.f130971d, rectFM152796t.centerX(), rectFM152796t.centerY()));
    }

    /* JADX INFO: renamed from: t */
    public RectF m152796t() {
        m152794q();
        return m152797u(m152799w());
    }

    /* JADX INFO: renamed from: u */
    public final RectF m152797u(Matrix matrix) {
        DraweeView<djj> draweeViewM152800x = m152800x();
        if (draweeViewM152800x == null) {
            return null;
        }
        int i = this.f130984q;
        if (i == -1 && this.f130983p == -1) {
            return null;
        }
        this.f130969b.set(0.0f, 0.0f, i, this.f130983p);
        ((djj) draweeViewM152800x.getHierarchy()).m112065l(this.f130969b);
        matrix.mapRect(this.f130969b);
        return this.f130969b;
    }

    /* JADX INFO: renamed from: v */
    public float m152798v() {
        return this.f130974g;
    }

    /* JADX INFO: renamed from: w */
    public Matrix m152799w() {
        return this.f130982o;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public DraweeView<djj> m152800x() {
        return this.f130986s.get();
    }

    /* JADX INFO: renamed from: y */
    public final float m152801y(Matrix matrix, int i) {
        matrix.getValues(this.f130968a);
        return this.f130968a[i];
    }

    /* JADX INFO: renamed from: z */
    public float m152802z() {
        return this.f130973f;
    }

    /* JADX INFO: renamed from: D */
    public sd50 m152761D() {
        return this;
    }

    /* JADX INFO: renamed from: l.m31$b */
    public class C18373b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DraweeView f130995a;

        public C18373b(DraweeView draweeView) {
            this.f130995a = draweeView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m31 m31Var = m31.this;
            m31Var.f130991x = false;
            if (m31Var.f130989v != null) {
                m31.this.f130989v.mo44483c(0.0f, 0.0f);
            }
            this.f130995a.setTranslationX(0.0f);
            this.f130995a.setTranslationY(0.0f);
            this.f130995a.setScaleX(1.0f);
            this.f130995a.setScaleY(1.0f);
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
    public void m152781X(ve50 ve50Var) {
    }

    /* JADX INFO: renamed from: Y */
    public void m152782Y(gf50 gf50Var) {
    }
}
