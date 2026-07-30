package p003l;

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
import l.djj;
import l.ftd0;
import l.ig3;
import l.ky00;
import l.sjj;
import l.u5e0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class m31 implements View.OnTouchListener, hf50, sd50 {

    /* JADX INFO: renamed from: i */
    public rsd0 f5506i;

    /* JADX INFO: renamed from: j */
    public u3e f5507j;

    /* JADX INFO: renamed from: k */
    public sjj f5508k;

    /* JADX INFO: renamed from: r */
    public RunnableC0422d f5515r;

    /* JADX INFO: renamed from: s */
    public WeakReference<DraweeView<djj>> f5516s;

    /* JADX INFO: renamed from: t */
    public zg50 f5517t;

    /* JADX INFO: renamed from: u */
    public View.OnLongClickListener f5518u;

    /* JADX INFO: renamed from: v */
    public td50 f5519v;

    /* JADX INFO: renamed from: w */
    public boolean f5520w;

    /* JADX INFO: renamed from: a */
    public final float[] f5498a = new float[9];

    /* JADX INFO: renamed from: b */
    public final RectF f5499b = new RectF();

    /* JADX INFO: renamed from: c */
    public final Interpolator f5500c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: d */
    public float f5501d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f5502e = 1.75f;

    /* JADX INFO: renamed from: f */
    public float f5503f = 3.0f;

    /* JADX INFO: renamed from: g */
    public float f5504g = 3.0f;

    /* JADX INFO: renamed from: h */
    public long f5505h = 200;

    /* JADX INFO: renamed from: l */
    public boolean f5509l = false;

    /* JADX INFO: renamed from: m */
    public boolean f5510m = true;

    /* JADX INFO: renamed from: n */
    public int f5511n = 2;

    /* JADX INFO: renamed from: o */
    public final Matrix f5512o = new Matrix();

    /* JADX INFO: renamed from: p */
    public int f5513p = -1;

    /* JADX INFO: renamed from: q */
    public int f5514q = -1;

    /* JADX INFO: renamed from: x */
    public boolean f5521x = false;

    /* JADX INFO: renamed from: y */
    public boolean f5522y = false;

    /* JADX INFO: renamed from: z */
    public boolean f5523z = false;

    /* JADX INFO: renamed from: l.m31$a */
    public class C0419a extends GestureDetector.SimpleOnGestureListener {
        public C0419a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (m31.this.f5518u != null) {
                m31.this.f5518u.onLongClick(m31.this.m6266x());
                m31 m31Var = m31.this;
                m31Var.f5523z = true;
                m31Var.f5507j.mo7345c(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.m31$c */
    public class RunnableC0421c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final float f5527a;

        /* JADX INFO: renamed from: b */
        public final float f5528b;

        /* JADX INFO: renamed from: c */
        public final long f5529c = SystemClock.uptimeMillis();

        /* JADX INFO: renamed from: d */
        public final float f5530d;

        /* JADX INFO: renamed from: e */
        public final float f5531e;

        public RunnableC0421c(float f, float f2, float f3, float f4) {
            this.f5527a = f3;
            this.f5528b = f4;
            this.f5530d = f;
            this.f5531e = f2;
        }

        /* JADX INFO: renamed from: a */
        public final float m6269a() {
            return m31.this.f5500c.getInterpolation(Math.min(1.0f, ((SystemClock.uptimeMillis() - this.f5529c) * 1.0f) / m31.this.f5505h));
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<djj> draweeViewM6266x = m31.this.m6266x();
            if (draweeViewM6266x == null) {
                return;
            }
            float fM6269a = m6269a();
            float f = this.f5530d;
            m31.this.mo4959f((f + ((this.f5531e - f) * fM6269a)) / m31.this.m6230G(), this.f5527a, this.f5528b);
            if (fM6269a < 1.0f) {
                m31.this.m6235L(draweeViewM6266x, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.m31$d */
    public class RunnableC0422d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final u5e0 f5533a;

        /* JADX INFO: renamed from: b */
        public int f5534b;

        /* JADX INFO: renamed from: c */
        public int f5535c;

        public RunnableC0422d(Context context) {
            this.f5533a = u5e0.c(context);
        }

        /* JADX INFO: renamed from: a */
        public void m6270a() {
            this.f5533a.a();
        }

        /* JADX INFO: renamed from: b */
        public void m6271b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFM6262t = m31.this.m6262t();
            if (rectFM6262t == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM6262t.left);
            float f = i;
            if (f < rectFM6262t.width()) {
                iRound = Math.round(rectFM6262t.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFM6262t.top);
            float f2 = i2;
            if (f2 < rectFM6262t.height()) {
                iRound2 = Math.round(rectFM6262t.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f5534b = iRound3;
            this.f5535c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f5533a.e(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<djj> draweeViewM6266x;
            if (this.f5533a.h() || (draweeViewM6266x = m31.this.m6266x()) == null || !this.f5533a.b()) {
                return;
            }
            int iF = this.f5533a.f();
            int iG = this.f5533a.g();
            m31.this.f5512o.postTranslate(this.f5534b - iF, this.f5535c - iG);
            draweeViewM6266x.invalidate();
            this.f5534b = iF;
            this.f5535c = iG;
            m31.this.m6235L(draweeViewM6266x, this);
        }
    }

    public m31(DraweeView<djj> draweeView) {
        this.f5516s = new WeakReference<>(draweeView);
        draweeView.getHierarchy().w(ftd0.e);
        draweeView.setOnTouchListener(this);
        this.f5506i = new rsd0(draweeView.getContext(), this);
        this.f5507j = new u3e(m6227D(), draweeView.getContext());
        sjj sjjVar = new sjj(draweeView.getContext(), new C0419a());
        this.f5508k = sjjVar;
        sjjVar.b(new mpd(this));
    }

    /* JADX INFO: renamed from: s */
    public static void m6224s(float f, float f2, float f3) {
        if (f >= f2) {
            ig3.a("MinZoom has to be less than MidZoom");
        } else {
            if (f2 < f3) {
                return;
            }
            ig3.a("MidZoom has to be less than MaxZoom");
        }
    }

    /* JADX INFO: renamed from: A */
    public float m6225A() {
        return this.f5502e;
    }

    /* JADX INFO: renamed from: C */
    public float m6226C() {
        return this.f5501d;
    }

    /* JADX INFO: renamed from: E */
    public ve50 m6228E() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public zg50 m6229F() {
        return this.f5517t;
    }

    /* JADX INFO: renamed from: G */
    public float m6230G() {
        return (float) Math.sqrt(((float) Math.pow(m6267y(this.f5512o, 0), 2.0d)) + ((float) Math.pow(m6267y(this.f5512o, 3), 2.0d)));
    }

    /* JADX INFO: renamed from: H */
    public final int m6231H() {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x != null) {
            return (draweeViewM6266x.getHeight() - draweeViewM6266x.getPaddingTop()) - draweeViewM6266x.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final int m6232I() {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x != null) {
            return (draweeViewM6266x.getWidth() - draweeViewM6266x.getPaddingLeft()) - draweeViewM6266x.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m6233J(float f, float f2, DraweeView draweeView, float f3, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        draweeView.setTranslationX(animatedFraction);
        draweeView.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        draweeView.setScaleX(animatedFraction3);
        draweeView.setScaleY(animatedFraction3);
        td50 td50Var = this.f5519v;
        if (td50Var != null) {
            td50Var.mo929c(animatedFraction, animatedFraction2);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m6234K() {
        m6258o();
    }

    /* JADX INFO: renamed from: L */
    public final void m6235L(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: M */
    public final void m6236M() {
        this.f5512o.reset();
        m6260q();
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x != null) {
            draweeViewM6266x.invalidate();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m6237N(boolean z) {
        this.f5510m = z;
    }

    /* JADX INFO: renamed from: O */
    public void m6238O(u3e u3eVar) {
        this.f5507j = u3eVar;
    }

    /* JADX INFO: renamed from: P */
    public void m6239P(float f) {
        this.f5504g = f;
    }

    /* JADX INFO: renamed from: Q */
    public void m6240Q(boolean z) {
        this.f5520w = z;
    }

    /* JADX INFO: renamed from: R */
    public void m6241R(float f) {
        m6224s(this.f5501d, this.f5502e, f);
        this.f5503f = f;
    }

    /* JADX INFO: renamed from: S */
    public void m6242S(float f) {
        m6224s(this.f5501d, f, this.f5503f);
        this.f5502e = f;
    }

    /* JADX INFO: renamed from: T */
    public void m6243T(float f) {
        m6224s(f, this.f5502e, this.f5503f);
        this.f5501d = f;
    }

    /* JADX INFO: renamed from: U */
    public void m6244U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        sjj sjjVar = this.f5508k;
        if (onDoubleTapListener != null) {
            sjjVar.b(onDoubleTapListener);
        } else {
            sjjVar.b(new mpd(this));
        }
    }

    /* JADX INFO: renamed from: V */
    public void m6245V(td50 td50Var) {
        this.f5519v = td50Var;
    }

    /* JADX INFO: renamed from: W */
    public void m6246W(View.OnLongClickListener onLongClickListener) {
        this.f5518u = onLongClickListener;
    }

    /* JADX INFO: renamed from: Z */
    public void m6249Z(zg50 zg50Var) {
        this.f5517t = zg50Var;
    }

    @Override // p003l.sd50
    /* JADX INFO: renamed from: a */
    public void mo6250a(float f, float f2) {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null || m6230G() > this.f5503f) {
            return;
        }
        this.f5521x = true;
        draweeViewM6266x.setTranslationX(f);
        draweeViewM6266x.setTranslationY(f2);
        if (f2 > 0.0f) {
            float fW0 = xdl0.w0() / (xdl0.w0() + f2);
            draweeViewM6266x.setScaleX(fW0);
            draweeViewM6266x.setScaleY(fW0);
        }
        td50 td50Var = this.f5519v;
        if (td50Var != null) {
            td50Var.mo929c(f, f2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m6251a0(float f) {
        m6253c0(f, false);
    }

    @Override // p003l.hf50
    /* JADX INFO: renamed from: b */
    public void mo4956b(float f, float f2, float f3, float f4) {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null) {
            return;
        }
        RunnableC0422d runnableC0422d = new RunnableC0422d(draweeViewM6266x.getContext());
        this.f5515r = runnableC0422d;
        runnableC0422d.m6271b(m6232I(), m6231H(), (int) f3, (int) f4);
        draweeViewM6266x.post(this.f5515r);
    }

    /* JADX INFO: renamed from: b0 */
    public void m6252b0(float f, float f2, float f3, boolean z) {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null || f < this.f5501d || f > this.f5503f) {
            return;
        }
        if (z) {
            draweeViewM6266x.post(new RunnableC0421c(m6230G(), f, f2, f3));
        } else {
            this.f5512o.setScale(f, f, f2, f3);
            m6259p();
        }
    }

    @Override // p003l.hf50
    /* JADX INFO: renamed from: c */
    public void mo4957c(float f, float f2) {
        if (!this.f5520w) {
            ViewParent parent = m6266x().getParent();
            if (parent == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(false);
            return;
        }
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null || this.f5506i.m7369d()) {
            return;
        }
        this.f5512o.postTranslate(f, f2);
        m6259p();
        ViewParent parent2 = draweeViewM6266x.getParent();
        if (parent2 == null) {
            return;
        }
        if (!this.f5510m || this.f5506i.m7369d() || this.f5509l) {
            parent2.requestDisallowInterceptTouchEvent(true);
            return;
        }
        int i = this.f5511n;
        if (i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m6253c0(float f, boolean z) {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x != null) {
            m6252b0(f, draweeViewM6266x.getRight() / 2, draweeViewM6266x.getBottom() / 2, false);
        }
    }

    @Override // p003l.hf50
    /* JADX INFO: renamed from: d */
    public void mo4958d() {
        m6261r();
    }

    /* JADX INFO: renamed from: d0 */
    public void m6254d0(long j) {
        if (j < 0) {
            j = 200;
        }
        this.f5505h = j;
    }

    @Override // p003l.sd50
    /* JADX INFO: renamed from: e */
    public void mo6255e(boolean z) {
        this.f5522y = false;
        final DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null || !this.f5521x) {
            return;
        }
        if (z) {
            td50 td50Var = this.f5519v;
            if (td50Var != null) {
                td50Var.mo930d();
                return;
            }
            return;
        }
        final float translationX = draweeViewM6266x.getTranslationX();
        final float translationY = draweeViewM6266x.getTranslationY();
        final float scaleX = draweeViewM6266x.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5194a.m6233J(translationX, translationY, draweeViewM6266x, scaleX, duration, valueAnimator);
            }
        });
        duration.addListener(new C0420b(draweeViewM6266x));
        duration.start();
    }

    /* JADX INFO: renamed from: e0 */
    public void m6256e0(int i, int i2) {
        this.f5514q = i;
        this.f5513p = i2;
        m6257f0();
    }

    @Override // p003l.hf50
    /* JADX INFO: renamed from: f */
    public void mo4959f(float f, float f2, float f3) {
        if (this.f5520w) {
            if (m6230G() < this.f5503f || f < 1.0f) {
                this.f5512o.postScale(f, f, f2, f3);
                m6259p();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6257f0() {
        if (this.f5514q == -1 && this.f5513p == -1) {
            return;
        }
        m6236M();
    }

    /* JADX INFO: renamed from: o */
    public final void m6258o() {
        RunnableC0422d runnableC0422d = this.f5515r;
        if (runnableC0422d != null) {
            runnableC0422d.m6270a();
            this.f5515r = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        boolean z = false;
        boolean zMo7344b = (this.f5523z || this.f5519v == null || !this.f5522y) ? false : this.f5507j.mo7344b(motionEvent);
        int iC = ky00.c(motionEvent);
        if (iC == 0) {
            this.f5523z = false;
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            m6258o();
        } else if ((iC == 1 || iC == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean zM7369d = this.f5506i.m7369d();
        boolean zM7368c = this.f5506i.m7368c();
        if (!this.f5521x) {
            zMo7344b = this.f5506i.m7372g(motionEvent);
        }
        boolean z2 = (zM7369d || this.f5506i.m7369d()) ? false : true;
        boolean z3 = (zM7368c || this.f5506i.m7368c()) ? false : true;
        if (z2 && z3) {
            z = true;
        }
        this.f5509l = z;
        if (this.f5508k.a(motionEvent)) {
            return true;
        }
        return zMo7344b;
    }

    /* JADX INFO: renamed from: p */
    public void m6259p() {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x != null && m6260q()) {
            draweeViewM6266x.invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m6260q() {
        float f;
        RectF rectFM6263u = m6263u(m6265w());
        if (rectFM6263u == null) {
            return false;
        }
        float fHeight = rectFM6263u.height();
        float fWidth = rectFM6263u.width();
        float fM6231H = m6231H();
        float f2 = rectFM6263u.top;
        float f3 = 0.0f;
        if (fHeight <= fM6231H) {
            f = ((fM6231H - fHeight) / 2.0f) - f2;
        } else if (f2 > 0.0f) {
            f = -f2;
        } else {
            float f4 = rectFM6263u.bottom;
            f = f4 < fM6231H ? fM6231H - f4 : 0.0f;
        }
        int iM6232I = m6232I();
        this.f5522y = false;
        int i = (int) fWidth;
        float f5 = rectFM6263u.left;
        if (i <= iM6232I) {
            float f6 = ((iM6232I - fWidth) / 2.0f) - f5;
            this.f5511n = 2;
            if (rectFM6263u.top >= 0.0f) {
                this.f5522y = true;
            }
            f3 = f6;
        } else if (f5 > 0.0f) {
            f3 = -f5;
            this.f5511n = 0;
        } else {
            float f7 = rectFM6263u.right;
            float f8 = iM6232I;
            if (f7 < f8) {
                f3 = f8 - f7;
                this.f5511n = 1;
            } else {
                this.f5511n = -1;
            }
        }
        this.f5512o.postTranslate(f3, f);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m6261r() {
        RectF rectFM6262t;
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null || m6230G() >= this.f5501d || (rectFM6262t = m6262t()) == null) {
            return;
        }
        draweeViewM6266x.post(new RunnableC0421c(m6230G(), this.f5501d, rectFM6262t.centerX(), rectFM6262t.centerY()));
    }

    /* JADX INFO: renamed from: t */
    public RectF m6262t() {
        m6260q();
        return m6263u(m6265w());
    }

    /* JADX INFO: renamed from: u */
    public final RectF m6263u(Matrix matrix) {
        DraweeView<djj> draweeViewM6266x = m6266x();
        if (draweeViewM6266x == null) {
            return null;
        }
        int i = this.f5514q;
        if (i == -1 && this.f5513p == -1) {
            return null;
        }
        this.f5499b.set(0.0f, 0.0f, i, this.f5513p);
        draweeViewM6266x.getHierarchy().l(this.f5499b);
        matrix.mapRect(this.f5499b);
        return this.f5499b;
    }

    /* JADX INFO: renamed from: v */
    public float m6264v() {
        return this.f5504g;
    }

    /* JADX INFO: renamed from: w */
    public Matrix m6265w() {
        return this.f5512o;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public DraweeView<djj> m6266x() {
        return this.f5516s.get();
    }

    /* JADX INFO: renamed from: y */
    public final float m6267y(Matrix matrix, int i) {
        matrix.getValues(this.f5498a);
        return this.f5498a[i];
    }

    /* JADX INFO: renamed from: z */
    public float m6268z() {
        return this.f5503f;
    }

    /* JADX INFO: renamed from: D */
    public sd50 m6227D() {
        return this;
    }

    /* JADX INFO: renamed from: l.m31$b */
    public class C0420b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DraweeView f5525a;

        public C0420b(DraweeView draweeView) {
            this.f5525a = draweeView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m31 m31Var = m31.this;
            m31Var.f5521x = false;
            if (m31Var.f5519v != null) {
                m31.this.f5519v.mo929c(0.0f, 0.0f);
            }
            this.f5525a.setTranslationX(0.0f);
            this.f5525a.setTranslationY(0.0f);
            this.f5525a.setScaleX(1.0f);
            this.f5525a.setScaleY(1.0f);
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
    public void m6247X(ve50 ve50Var) {
    }

    /* JADX INFO: renamed from: Y */
    public void m6248Y(gf50 gf50Var) {
    }
}
