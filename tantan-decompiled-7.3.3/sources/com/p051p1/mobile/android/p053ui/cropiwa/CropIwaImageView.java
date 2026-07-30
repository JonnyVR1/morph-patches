package com.p051p1.mobile.android.p053ui.cropiwa;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import com.p051p1.mobile.android.p053ui.cropiwa.config.InitialPosition;
import p153l.dw5;
import p153l.gwb;
import p153l.jqi0;
import p153l.km50;
import p153l.mhx;
import p153l.phx;
import p153l.wvb;
import p153l.zm50;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor", "AppCompatCustomView"})
class CropIwaImageView extends ImageView implements zm50, dw5 {

    /* JADX INFO: renamed from: a */
    public Matrix f16486a;

    /* JADX INFO: renamed from: b */
    public phx f16487b;

    /* JADX INFO: renamed from: c */
    public C4506b f16488c;

    /* JADX INFO: renamed from: d */
    public RectF f16489d;

    /* JADX INFO: renamed from: e */
    public RectF f16490e;

    /* JADX INFO: renamed from: f */
    public RectF f16491f;

    /* JADX INFO: renamed from: g */
    public km50 f16492g;

    /* JADX INFO: renamed from: h */
    public wvb f16493h;

    /* JADX INFO: renamed from: i */
    public boolean f16494i;

    /* JADX INFO: renamed from: j */
    public mhx f16495j;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$a */
    public static /* synthetic */ class C4505a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16496a;

        static {
            int[] iArr = new int[InitialPosition.values().length];
            f16496a = iArr;
            try {
                iArr[InitialPosition.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16496a[InitialPosition.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$b */
    public class C4506b {

        /* JADX INFO: renamed from: a */
        public ScaleGestureDetector f16497a;

        /* JADX INFO: renamed from: b */
        public C4508d f16498b;

        public C4506b() {
            this.f16497a = new ScaleGestureDetector(CropIwaImageView.this.getContext(), new C4507c());
            this.f16498b = new C4508d();
        }

        /* JADX INFO: renamed from: a */
        public void m21986a(MotionEvent motionEvent) {
            this.f16498b.m21990b(motionEvent);
        }

        /* JADX INFO: renamed from: b */
        public void m21987b(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    CropIwaImageView.this.m21976q();
                    return;
                }
                if (CropIwaImageView.this.f16493h.m208045m()) {
                    this.f16497a.onTouchEvent(motionEvent);
                }
                if (CropIwaImageView.this.f16493h.m208046n()) {
                    this.f16498b.m21992d(motionEvent, !this.f16497a.isInProgress());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$c */
    public class C4507c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C4507c() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m21988a(float f) {
            return f >= CropIwaImageView.this.f16493h.m208042j() && f <= CropIwaImageView.this.f16493h.m208042j() + CropIwaImageView.this.f16493h.m208041i();
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean z = CropIwaImageView.this.f16494i;
            CropIwaImageView cropIwaImageView = CropIwaImageView.this;
            if (!m21988a((z ? Math.max(Math.abs(cropIwaImageView.f16487b.m172345c(CropIwaImageView.this.f16486a)), Math.abs(CropIwaImageView.this.f16487b.m172344b(CropIwaImageView.this.f16486a))) : cropIwaImageView.f16487b.m172345c(CropIwaImageView.this.f16486a)) * scaleFactor)) {
                return true;
            }
            CropIwaImageView.this.m21967M(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            CropIwaImageView.this.f16493h.m208054v(CropIwaImageView.this.m21978s()).m208036b();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.cropiwa.CropIwaImageView$d */
    public class C4508d {

        /* JADX INFO: renamed from: a */
        public float f16501a;

        /* JADX INFO: renamed from: b */
        public float f16502b;

        /* JADX INFO: renamed from: c */
        public int f16503c;

        /* JADX INFO: renamed from: d */
        public jqi0 f16504d;

        public C4508d() {
            this.f16504d = new jqi0();
        }

        /* JADX INFO: renamed from: a */
        public final void m21989a(float f, float f2, int i) {
            CropIwaImageView.this.m21973S();
            this.f16504d.m146588d(f, f2, CropIwaImageView.this.f16490e, CropIwaImageView.this.f16489d);
            m21994f(f, f2, i);
        }

        /* JADX INFO: renamed from: b */
        public void m21990b(MotionEvent motionEvent) {
            m21989a(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerId(0));
        }

        /* JADX INFO: renamed from: c */
        public final void m21991c(MotionEvent motionEvent) {
            if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f16503c) {
                int i = 0;
                while (i < motionEvent.getPointerCount() && i == motionEvent.getActionIndex()) {
                    i++;
                }
                m21989a(motionEvent.getX(i), motionEvent.getY(i), motionEvent.getPointerId(i));
            }
        }

        /* JADX INFO: renamed from: d */
        public void m21992d(MotionEvent motionEvent, boolean z) {
            float x;
            float y;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 2) {
                if (actionMasked != 6) {
                    return;
                }
                m21991c(motionEvent);
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16503c);
            CropIwaImageView.this.m21973S();
            try {
                x = this.f16504d.m146586b(motionEvent.getX(iFindPointerIndex));
                y = this.f16504d.m146587c(motionEvent.getY(iFindPointerIndex));
            } catch (Exception unused) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            }
            if (z) {
                CropIwaImageView.this.m21972R(x - this.f16501a, y - this.f16502b);
            }
            m21993e(x, y);
        }

        /* JADX INFO: renamed from: e */
        public final void m21993e(float f, float f2) {
            m21994f(f, f2, this.f16503c);
        }

        /* JADX INFO: renamed from: f */
        public final void m21994f(float f, float f2, int i) {
            this.f16501a = f;
            this.f16502b = f2;
            this.f16503c = i;
        }
    }

    public CropIwaImageView(Context context, wvb wvbVar) {
        super(context);
        this.f16495j = new mhx();
        m21955A(wvbVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m21955A(wvb wvbVar) {
        this.f16493h = wvbVar;
        wvbVar.m208035a(this);
        this.f16490e = new RectF();
        this.f16489d = new RectF();
        this.f16491f = new RectF();
        this.f16487b = new phx();
        this.f16486a = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f16488c = new C4506b();
    }

    /* JADX INFO: renamed from: B */
    public boolean m21956B() {
        new RectF().set(this.f16491f);
        Matrix matrix = new Matrix();
        matrix.set(this.f16486a);
        RectF rectF = new RectF(this.f16491f);
        matrix.mapRect(rectF);
        float f = rectF.left;
        RectF rectF2 = this.f16489d;
        return f - rectF2.left > 0.1f || rectF.top - rectF2.top > 0.1f || rectF.right - rectF2.right < -0.1f || rectF.bottom - rectF2.bottom < -0.1f;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m21957C(ValueAnimator valueAnimator) {
        this.f16486a.set((Matrix) valueAnimator.getAnimatedValue());
        setImageMatrix(this.f16486a);
        m21973S();
        invalidate();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m21958D() {
        m21977r(this.f16493h.m208044l() && !this.f16494i);
    }

    /* JADX INFO: renamed from: E */
    public void m21959E() {
        m21973S();
        m21972R((getWidth() / 2.0f) - this.f16490e.centerX(), (getHeight() / 2.0f) - this.f16490e.centerY());
    }

    /* JADX INFO: renamed from: F */
    public void m21960F(RectF rectF) {
        m21973S();
        m21972R((getWidth() / 2.0f) - rectF.centerX(), (getHeight() / 2.0f) - rectF.centerY());
    }

    /* JADX INFO: renamed from: G */
    public void m21961G() {
        if (this.f16492g != null) {
            RectF rectF = new RectF(this.f16490e);
            gwb.m132650c(0, 0, getWidth(), getHeight(), rectF);
            this.f16492g.mo21918b(rectF);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m21962H() {
        m21973S();
        m21959E();
        if (this.f16493h.m208043k() == -1.0f) {
            int i = C4505a.f16496a[this.f16493h.m208040h().ordinal()];
            if (i == 1) {
                m21964J();
            } else if (i == 2) {
                m21963I();
            }
            this.f16493h.m208054v(m21978s()).m208036b();
        } else {
            m21971Q(this.f16493h.m208043k());
        }
        m21961G();
    }

    /* JADX INFO: renamed from: I */
    public final void m21963I() {
        float width;
        int iM21982w;
        if (m21982w() < m21979t()) {
            width = getHeight();
            iM21982w = m21979t();
        } else {
            width = getWidth();
            iM21982w = m21982w();
        }
        m21966L(width / iM21982w);
    }

    /* JADX INFO: renamed from: J */
    public final void m21964J() {
        float width;
        int iM21982w;
        if (getWidth() < getHeight()) {
            width = getHeight();
            iM21982w = m21979t();
        } else {
            width = getWidth();
            iM21982w = m21982w();
        }
        m21966L(width / iM21982w);
    }

    /* JADX INFO: renamed from: K */
    public void m21965K(float f) {
        this.f16486a.postRotate(f, this.f16490e.centerX(), this.f16490e.centerY());
        setImageMatrix(this.f16486a);
        m21973S();
        m21977r(false);
    }

    /* JADX INFO: renamed from: L */
    public final void m21966L(float f) {
        m21973S();
        m21967M(f, this.f16490e.centerX(), this.f16490e.centerY());
    }

    /* JADX INFO: renamed from: M */
    public final void m21967M(float f, float f2, float f3) {
        this.f16486a.postScale(f, f, f2, f3);
        setImageMatrix(this.f16486a);
        m21973S();
        phx.f152493b.onNext(Float.valueOf(Math.max(Math.abs(this.f16487b.m172345c(this.f16486a)), Math.abs(this.f16487b.m172344b(this.f16486a)))));
    }

    /* JADX INFO: renamed from: N */
    public void m21968N(km50 km50Var) {
        this.f16492g = km50Var;
        if (m21985z()) {
            m21973S();
            m21961G();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m21969O(Matrix matrix) {
        this.f16495j.m158434c();
        this.f16486a = matrix;
        getImageMatrix().set(matrix);
        setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: P */
    public void m21970P(boolean z) {
        this.f16494i = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m21971Q(@FloatRange(from = 0.009999999776482582d, to = 1.0d) float f) {
        m21966L((this.f16493h.m208042j() + (this.f16493h.m208041i() * Math.min(Math.max(0.01f, f), 1.0f))) / this.f16487b.m172345c(this.f16486a));
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public final void m21972R(float f, float f2) {
        this.f16486a.postTranslate(f, f2);
        setImageMatrix(this.f16486a);
        if (f > 0.01f || f2 > 0.01f) {
            m21973S();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m21973S() {
        this.f16491f.set(0.0f, 0.0f, m21984y(), m21983x());
        this.f16490e.set(this.f16491f);
        this.f16486a.mapRect(this.f16490e);
    }

    @Override // p153l.dw5
    /* JADX INFO: renamed from: a */
    public void mo21917a() {
        if (Math.abs(m21978s() - this.f16493h.m208043k()) > 0.001f) {
            m21971Q(this.f16493h.m208043k());
            m21977r(false);
        }
        setBackgroundColor(this.f16493h.m208037e());
    }

    @Override // p153l.zm50
    /* JADX INFO: renamed from: b */
    public void mo21974b(RectF rectF, boolean z) {
        m21973S();
        this.f16489d.set(rectF);
        if (m21985z()) {
            if (z) {
                m21977r(false);
            } else {
                post(new Runnable() { // from class: com.p1.mobile.android.ui.cropiwa.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16549a.m21958D();
                    }
                });
            }
            m21973S();
            invalidate();
        }
    }

    @Override // p153l.zm50
    /* JADX INFO: renamed from: c */
    public void mo21975c(float f, float f2, float f3) {
        m21967M(f, f2, f3);
        this.f16493h.m208054v(m21978s()).m208036b();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f16486a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f16493h.m208055w() && m21985z()) {
            m21962H();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m21976q() {
        m21977r(!this.f16494i);
    }

    /* JADX INFO: renamed from: r */
    public final void m21977r(boolean z) {
        m21973S();
        Matrix matrixM172340a = phx.m172340a(this.f16491f, this.f16486a, this.f16489d);
        mhx mhxVar = this.f16495j;
        if (z) {
            mhxVar.m158433b(this.f16486a, matrixM172340a, new ValueAnimator.AnimatorUpdateListener() { // from class: com.p1.mobile.android.ui.cropiwa.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f16550a.m21957C(valueAnimator);
                }
            });
        } else {
            mhxVar.m158434c();
            this.f16486a.set(matrixM172340a);
            setImageMatrix(this.f16486a);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final float m21978s() {
        return gwb.m132648a(((this.f16487b.m172345c(this.f16486a) - this.f16493h.m208042j()) / this.f16493h.m208041i()) + 0.01f, 0.01f, 1.0f);
    }

    /* JADX INFO: renamed from: t */
    public int m21979t() {
        return (int) this.f16490e.height();
    }

    /* JADX INFO: renamed from: u */
    public RectF m21980u() {
        m21973S();
        return new RectF(this.f16490e);
    }

    /* JADX INFO: renamed from: v */
    public C4506b m21981v() {
        return this.f16488c;
    }

    /* JADX INFO: renamed from: w */
    public int m21982w() {
        return (int) this.f16490e.width();
    }

    /* JADX INFO: renamed from: x */
    public int m21983x() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public int m21984y() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public boolean m21985z() {
        return (m21984y() == -1 || m21983x() == -1) ? false : true;
    }
}
