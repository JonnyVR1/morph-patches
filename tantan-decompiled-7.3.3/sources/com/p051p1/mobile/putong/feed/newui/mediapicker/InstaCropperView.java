package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.tantanapp.common.utils.NullChecker;
import p153l.l51;
import p153l.rsw;
import p153l.wtq0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class InstaCropperView extends View {

    /* JADX INFO: renamed from: A */
    public ValueAnimator.AnimatorUpdateListener f41126A;

    /* JADX INFO: renamed from: a */
    public float f41127a;

    /* JADX INFO: renamed from: b */
    public float f41128b;

    /* JADX INFO: renamed from: c */
    public float f41129c;

    /* JADX INFO: renamed from: d */
    public Uri f41130d;

    /* JADX INFO: renamed from: e */
    public int f41131e;

    /* JADX INFO: renamed from: f */
    public int f41132f;

    /* JADX INFO: renamed from: g */
    public rsw f41133g;

    /* JADX INFO: renamed from: h */
    public int f41134h;

    /* JADX INFO: renamed from: i */
    public int f41135i;

    /* JADX INFO: renamed from: j */
    public RectF f41136j;

    /* JADX INFO: renamed from: k */
    public Drawable f41137k;

    /* JADX INFO: renamed from: l */
    public float f41138l;

    /* JADX INFO: renamed from: m */
    public float f41139m;

    /* JADX INFO: renamed from: n */
    public float f41140n;

    /* JADX INFO: renamed from: o */
    public float f41141o;

    /* JADX INFO: renamed from: p */
    public float f41142p;

    /* JADX INFO: renamed from: q */
    public RectF f41143q;

    /* JADX INFO: renamed from: r */
    public GestureDetector f41144r;

    /* JADX INFO: renamed from: s */
    public ScaleGestureDetector f41145s;

    /* JADX INFO: renamed from: t */
    public float f41146t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f41147u;

    /* JADX INFO: renamed from: v */
    public boolean f41148v;

    /* JADX INFO: renamed from: w */
    public C11380f f41149w;

    /* JADX INFO: renamed from: x */
    public x20 f41150x;

    /* JADX INFO: renamed from: y */
    public GestureDetector.OnGestureListener f41151y;

    /* JADX INFO: renamed from: z */
    public ScaleGestureDetector.OnScaleGestureListener f41152z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$a */
    public class C11375a implements Animator.AnimatorListener {
        public C11375a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InstaCropperView.this.m63417H();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$b */
    public class AsyncTaskC11376b extends rsw {
        public AsyncTaskC11376b(Context context, Uri uri, int i, int i2) {
            super(context, uri, i, i2);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            InstaCropperView.this.f41137k = drawable;
            InstaCropperView.this.f41131e = m183035c();
            InstaCropperView.this.f41132f = m183034b();
            InstaCropperView.this.m63422M();
            if (NullChecker.m82486a(InstaCropperView.this.f41150x)) {
                InstaCropperView.this.f41150x.call();
                InstaCropperView.this.f41150x = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$c */
    public class GestureDetectorOnGestureListenerC11377c implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC11377c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3 = -f;
            float f4 = -f2;
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m63412C(instaCropperView.f41143q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM63419J = instaCropperView2.m63419J(instaCropperView2.f41143q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM63420K = instaCropperView3.m63420K(instaCropperView3.f41143q);
            float fM63433y = InstaCropperView.this.m63433y(f3, fM63419J);
            float fM63433y2 = InstaCropperView.this.m63433y(f4, fM63420K);
            InstaCropperView.this.f41141o += fM63433y;
            InstaCropperView.this.f41142p += fM63433y2;
            InstaCropperView.this.m63431V();
            InstaCropperView.this.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$d */
    public class ScaleGestureDetectorOnScaleGestureListenerC11378d implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC11378d() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float fM63432x = InstaCropperView.this.m63432x(scaleGestureDetector.getScaleFactor(), InstaCropperView.this.m63418I());
            InstaCropperView.this.f41139m = scaleGestureDetector.getFocusX();
            InstaCropperView.this.f41140n = scaleGestureDetector.getFocusY();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m63429T(instaCropperView.f41138l * fM63432x, InstaCropperView.this.f41139m, InstaCropperView.this.f41140n);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$e */
    public class C11379e implements ValueAnimator.AnimatorUpdateListener {
        public C11379e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m63412C(instaCropperView.f41143q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM63419J = instaCropperView2.m63419J(instaCropperView2.f41143q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM63420K = instaCropperView3.m63420K(instaCropperView3.f41143q);
            float fM63418I = InstaCropperView.this.m63418I();
            InstaCropperView.this.f41141o -= fM63419J * fFloatValue;
            InstaCropperView.this.f41142p -= fM63420K * fFloatValue;
            float f = ((1.0f - fFloatValue) * InstaCropperView.this.f41138l) + (fFloatValue * (InstaCropperView.this.f41138l / fM63418I));
            InstaCropperView instaCropperView4 = InstaCropperView.this;
            instaCropperView4.m63429T(f, instaCropperView4.f41139m, InstaCropperView.this.f41140n);
            InstaCropperView.this.m63431V();
            InstaCropperView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$f */
    public static class C11380f {

        /* JADX INFO: renamed from: a */
        public Uri f41158a;

        /* JADX INFO: renamed from: b */
        public float f41159b;

        /* JADX INFO: renamed from: c */
        public float f41160c;

        /* JADX INFO: renamed from: d */
        public float f41161d;

        /* JADX INFO: renamed from: e */
        public int f41162e;

        /* JADX INFO: renamed from: f */
        public int f41163f;

        /* JADX INFO: renamed from: g */
        public int f41164g;

        /* JADX INFO: renamed from: h */
        public int f41165h;

        /* JADX INFO: renamed from: i */
        public int f41166i;

        /* JADX INFO: renamed from: j */
        public int f41167j;

        public C11380f(Uri uri, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f41158a = uri;
            this.f41159b = f;
            this.f41160c = f2;
            this.f41161d = f3;
            this.f41162e = i;
            this.f41163f = i2;
            this.f41164g = i3;
            this.f41165h = i4;
            this.f41166i = i5;
            this.f41167j = i6;
        }
    }

    public InstaCropperView(Context context) {
        super(context);
        this.f41127a = 0.5625f;
        this.f41128b = 1.91f;
        this.f41129c = 1.0f;
        this.f41130d = null;
        this.f41133g = null;
        this.f41136j = new RectF();
        this.f41137k = null;
        this.f41143q = new RectF();
        this.f41148v = false;
        this.f41151y = new GestureDetectorOnGestureListenerC11377c();
        this.f41152z = new ScaleGestureDetectorOnScaleGestureListenerC11378d();
        this.f41126A = new C11379e();
        m63413D(context, null, 0, 0);
    }

    private float getDisplayDrawableHeight() {
        return this.f41138l * this.f41132f;
    }

    private float getDisplayDrawableWidth() {
        return this.f41138l * this.f41131e;
    }

    private float getDrawableScaleToFitWithValidRatio() {
        float f;
        int i;
        float imageSizeRatio = getImageSizeRatio();
        if (m63414E(imageSizeRatio)) {
            int i2 = this.f41134h;
            int i3 = this.f41135i;
            float f2 = i2 / i3;
            int i4 = this.f41131e;
            i = this.f41132f;
            if (i4 / i > f2) {
                return i2 / i4;
            }
            f = i3;
        } else if (imageSizeRatio < this.f41127a) {
            f = this.f41134h * 0.5625f;
            i = this.f41131e;
        } else {
            f = this.f41135i / 1.91f;
            i = this.f41132f;
        }
        return f / i;
    }

    private float getDrawableScaleToFitWithView() {
        int i = this.f41134h;
        int i2 = this.f41135i;
        float f = i / i2;
        int i3 = this.f41131e;
        int i4 = this.f41132f;
        return ((float) i3) / ((float) i4) > f ? i2 / i4 : i / i3;
    }

    private float getImageSizeRatio() {
        return this.f41131e / this.f41132f;
    }

    private float getMaximumAllowedScale() {
        return Math.min(this.f41131e / this.f41134h, this.f41132f / this.f41135i);
    }

    private float getMinimumAllowedScale() {
        return this.f41148v ? getDrawableScaleToFitWithView() : getDrawableScaleToFitWithValidRatio();
    }

    private void setDrawableScale(float f) {
        this.f41138l = f;
        invalidate();
    }

    private void setGridBounds(RectF rectF) {
        this.f41136j.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m63410A() {
        Drawable drawable = this.f41137k;
        if (drawable == null) {
            return false;
        }
        return m63416G(drawable.getIntrinsicWidth(), this.f41137k.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: B */
    public final boolean m63411B() {
        return m63416G(this.f41133g.m183037e(), this.f41133g.m183036d());
    }

    /* JADX INFO: renamed from: C */
    public final void m63412C(RectF rectF) {
        float f = this.f41141o;
        rectF.left = f;
        rectF.top = this.f41142p;
        rectF.right = f + getDisplayDrawableWidth();
        rectF.bottom = rectF.top + getDisplayDrawableHeight();
    }

    /* JADX INFO: renamed from: D */
    public final void m63413D(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f41144r = new GestureDetector(context, this.f41151y);
        this.f41145s = new ScaleGestureDetector(context, this.f41152z);
        this.f41146t = getResources().getDisplayMetrics().density * 144.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f41147u = valueAnimator;
        valueAnimator.setDuration(400L);
        this.f41147u.setFloatValues(0.0f, 1.0f);
        this.f41147u.setInterpolator(new DecelerateInterpolator(0.25f));
        this.f41147u.addUpdateListener(this.f41126A);
        this.f41147u.addListener(new C11375a());
    }

    /* JADX INFO: renamed from: E */
    public final boolean m63414E(float f) {
        return f >= this.f41127a && f <= this.f41128b;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m63415F() {
        return this.f41133g != null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m63416G(int i, int i2) {
        float f = (this.f41134h * this.f41135i) / (i * i2);
        return f >= 0.5f && f <= 2.0f;
    }

    /* JADX INFO: renamed from: I */
    public final float m63418I() {
        float maximumAllowedScale = getMaximumAllowedScale();
        float minimumAllowedScale = getMinimumAllowedScale();
        if (maximumAllowedScale < minimumAllowedScale) {
            maximumAllowedScale = minimumAllowedScale;
        }
        float f = this.f41138l;
        if (f < minimumAllowedScale) {
            return f / minimumAllowedScale;
        }
        if (f > maximumAllowedScale) {
            return f / maximumAllowedScale;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: J */
    public final float m63419J(RectF rectF) {
        float fCenterX;
        float f;
        float fWidth = rectF.width();
        int i = this.f41134h;
        if (fWidth <= i) {
            fCenterX = rectF.centerX();
            f = this.f41134h / 2;
        } else {
            float f2 = rectF.left;
            if (f2 <= 0.0f && rectF.right >= i) {
                return 0.0f;
            }
            fCenterX = rectF.right;
            if (f2 >= 0.0f) {
                if (fCenterX > i) {
                    return f2;
                }
                return 0.0f;
            }
            f = i;
        }
        return fCenterX - f;
    }

    /* JADX INFO: renamed from: K */
    public final float m63420K(RectF rectF) {
        float fCenterY;
        float f;
        float fHeight = rectF.height();
        int i = this.f41135i;
        if (fHeight < i) {
            fCenterY = rectF.centerY();
            f = this.f41135i / 2;
        } else {
            float f2 = rectF.top;
            if (f2 <= 0.0f && rectF.bottom >= i) {
                return 0.0f;
            }
            fCenterY = rectF.bottom;
            if (f2 >= 0.0f) {
                if (fCenterY > i) {
                    return f2;
                }
                return 0.0f;
            }
            f = i;
        }
        return fCenterY - f;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m63417H() {
        int i;
        int i2;
        if (this.f41130d == null) {
            wtq0.m207906a("Image uri is not set.");
            return;
        }
        if ((this.f41137k == null && this.f41131e != -1 && this.f41132f != -1) || this.f41147u.isRunning()) {
            l51.m152888H(getContext(), new Runnable() { // from class: l.tvm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176269a.m63417H();
                }
            }, 200L);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1080, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        RectF rectF = this.f41136j;
        rectF.offset(-this.f41141o, -this.f41142p);
        m63412C(this.f41143q);
        float fWidth = rectF.left / this.f41143q.width();
        float fHeight = rectF.top / this.f41143q.height();
        float fWidth2 = rectF.right / this.f41143q.width();
        float fHeight2 = rectF.bottom / this.f41143q.height();
        int iMax = Math.max(0, (int) (fWidth * this.f41131e));
        int iMax2 = Math.max(0, (int) (fHeight * this.f41132f));
        int i3 = this.f41131e;
        int iMin = Math.min(i3, (int) (fWidth2 * i3));
        int i4 = this.f41132f;
        int iMin2 = Math.min(i4, (int) (fHeight2 * i4));
        int iMin3 = iMin - iMax;
        int iMin4 = iMin2 - iMax2;
        float f = iMin3 / iMin4;
        float f2 = this.f41127a;
        if (f < f2) {
            f = f2;
        }
        float f3 = this.f41128b;
        if (f > f3) {
            f = f3;
        }
        int mode = View.MeasureSpec.getMode(iMakeMeasureSpec);
        int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(iMakeMeasureSpec2);
        int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (mode2 == Integer.MIN_VALUE ? iMin4 > size2 : mode2 == 1073741824) {
                    i = (int) (size2 * f);
                    i2 = size2;
                }
                this.f41149w = new C11380f(this.f41130d, this.f41138l, this.f41141o, this.f41142p, iMax, iMax2, iMin, iMin2, i, i2);
            }
            if (mode == 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    iMin4 = Math.min(size2, (int) (size / f));
                } else if (mode2 == 0) {
                    iMin4 = (int) (size / f);
                } else if (mode2 == 1073741824) {
                    iMin4 = size2;
                }
                i = size;
            }
            i2 = iMin4;
            this.f41149w = new C11380f(this.f41130d, this.f41138l, this.f41141o, this.f41142p, iMax, iMax2, iMin, iMin2, i, i2);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    iMin3 = Math.min(size, (int) (size2 * f));
                    iMin4 = size2;
                }
            } else if (iMin3 > size) {
                iMin4 = (int) (size / f);
                iMin3 = size;
            }
        } else if (iMin3 > size || iMin4 > size2) {
            float f4 = size;
            float f5 = size2;
            float f6 = f4 / f5;
            if (f6 != f) {
                if (f6 > f) {
                    size = (int) (f5 * f);
                } else {
                    iMin3 = size;
                    iMin4 = (int) (f4 / f);
                }
            }
            iMin3 = size;
            iMin4 = size2;
        }
        i = iMin3;
        i2 = iMin4;
        this.f41149w = new C11380f(this.f41130d, this.f41138l, this.f41141o, this.f41142p, iMax, iMax2, iMin, iMin2, i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m63422M() {
        if (NullChecker.m82486a(this.f41149w) && this.f41148v) {
            m63425P(this.f41149w);
        } else {
            m63424O();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m63423N() {
        this.f41141o = (this.f41134h - getDisplayDrawableWidth()) / 2.0f;
        this.f41142p = (this.f41135i - getDisplayDrawableHeight()) / 2.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: O */
    public final void m63424O() {
        if (this.f41147u.isRunning()) {
            this.f41147u.cancel();
        }
        if (this.f41148v) {
            m63426Q();
        } else {
            m63427R();
        }
        m63423N();
        m63431V();
        invalidate();
        m63417H();
    }

    /* JADX INFO: renamed from: P */
    public final void m63425P(C11380f c11380f) {
        if (this.f41147u.isRunning()) {
            this.f41147u.cancel();
        }
        setDrawableScale(c11380f.f41159b);
        this.f41141o = c11380f.f41160c;
        this.f41142p = c11380f.f41161d;
        m63431V();
        invalidate();
    }

    /* JADX INFO: renamed from: Q */
    public final void m63426Q() {
        setDrawableScale(getDrawableScaleToFitWithView());
    }

    /* JADX INFO: renamed from: R */
    public final void m63427R() {
        setDrawableScale(getDrawableScaleToFitWithValidRatio());
    }

    /* JADX INFO: renamed from: S */
    public void m63428S(Uri uri, C11380f c11380f) {
        this.f41149w = c11380f;
        m63434z();
        this.f41130d = uri;
        this.f41137k = null;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: T */
    public final void m63429T(float f, float f2, float f3) {
        m63412C(this.f41143q);
        RectF rectF = this.f41143q;
        float fWidth = (f2 - rectF.left) / rectF.width();
        RectF rectF2 = this.f41143q;
        float fHeight = (f3 - rectF2.top) / rectF2.height();
        this.f41138l = f;
        m63412C(this.f41143q);
        RectF rectF3 = this.f41143q;
        float fWidth2 = rectF3.left + (fWidth * rectF3.width());
        RectF rectF4 = this.f41143q;
        float fHeight2 = rectF4.top + (fHeight * rectF4.height());
        this.f41141o += f2 - fWidth2;
        this.f41142p += f3 - fHeight2;
        m63431V();
        invalidate();
    }

    /* JADX INFO: renamed from: U */
    public final void m63430U() {
        AsyncTaskC11376b asyncTaskC11376b = new AsyncTaskC11376b(getContext(), this.f41130d, this.f41134h, this.f41135i);
        this.f41133g = asyncTaskC11376b;
        asyncTaskC11376b.execute(new Void[0]);
    }

    /* JADX INFO: renamed from: V */
    public final void m63431V() {
        m63412C(this.f41143q);
        this.f41143q.intersect(0.0f, 0.0f, this.f41134h, this.f41135i);
        RectF rectF = this.f41143q;
        float f = rectF.left;
        float f2 = rectF.top;
        this.f41143q.set(f, f2, rectF.width() + f, this.f41143q.height() + f2);
        setGridBounds(this.f41143q);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41137k == null) {
            return;
        }
        m63412C(this.f41143q);
        Drawable drawable = this.f41137k;
        RectF rectF = this.f41143q;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f41137k.draw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        this.f41134h = i5;
        int i6 = i4 - i2;
        this.f41135i = i6;
        if (i5 == 0 || i6 == 0 || this.f41130d == null) {
            return;
        }
        if (m63410A()) {
            m63434z();
            return;
        }
        if (m63415F()) {
            if (m63411B()) {
                return;
            } else {
                m63434z();
            }
        }
        m63430U();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (mode2 == Integer.MIN_VALUE) {
                    f3 = size2;
                    f4 = this.f41129c;
                } else if (mode2 == 0) {
                    float f5 = this.f41146t;
                    size2 = (int) f5;
                    size = (int) f5;
                } else if (mode2 != 1073741824) {
                    size = 1;
                    size2 = 1;
                } else {
                    f3 = size2;
                    f4 = this.f41129c;
                }
                size = (int) (f3 * f4);
            } else if (mode != 1073741824) {
                size = 1;
                size2 = 1;
            } else if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, (int) (size / this.f41129c));
            } else if (mode2 == 0) {
                f = size;
                f2 = this.f41129c;
                size2 = (int) (f / f2);
            } else if (mode2 != 1073741824) {
                size2 = 1;
            }
        } else if (mode2 == Integer.MIN_VALUE) {
            float f6 = size;
            float f7 = size2;
            float f8 = f6 / f7;
            float f9 = this.f41129c;
            if (f8 != f9) {
                if (f8 > f9) {
                    size = (int) (f7 * f9);
                } else {
                    size2 = (int) (f6 / f9);
                }
            }
        } else if (mode2 == 0) {
            f = size;
            f2 = this.f41129c;
            size2 = (int) (f / f2);
        } else if (mode2 != 1073741824) {
            size = 1;
            size2 = 1;
        } else {
            size = Math.min(size, (int) (size2 * this.f41129c));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41137k == null) {
            return false;
        }
        this.f41144r.onTouchEvent(motionEvent);
        this.f41145s.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            this.f41147u.start();
        }
        return true;
    }

    public void setFitView(boolean z) {
        this.f41148v = z;
        m63424O();
    }

    public void setImageUri(Uri uri) {
        m63428S(uri, null);
    }

    /* JADX INFO: renamed from: x */
    public final float m63432x(float f, float f2) {
        if (f2 == 1.0f) {
            return f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f / f2;
        }
        float f3 = (f2 - 0.7f) / 0.3f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return f * (f3 + ((1.0f - f3) / f));
    }

    /* JADX INFO: renamed from: y */
    public final float m63433y(float f, float f2) {
        if (f2 * f <= 0.0f) {
            return f;
        }
        float fAbs = Math.abs(f2) / this.f41146t;
        double d = f;
        return (float) (d - (Math.sqrt(fAbs) * d));
    }

    /* JADX INFO: renamed from: z */
    public final void m63434z() {
        if (NullChecker.m82486a(this.f41133g)) {
            this.f41133g.cancel(true);
            this.f41133g = null;
        }
    }

    public InstaCropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41127a = 0.5625f;
        this.f41128b = 1.91f;
        this.f41129c = 1.0f;
        this.f41130d = null;
        this.f41133g = null;
        this.f41136j = new RectF();
        this.f41137k = null;
        this.f41143q = new RectF();
        this.f41148v = false;
        this.f41151y = new GestureDetectorOnGestureListenerC11377c();
        this.f41152z = new ScaleGestureDetectorOnScaleGestureListenerC11378d();
        this.f41126A = new C11379e();
        m63413D(context, attributeSet, 0, 0);
    }

    public InstaCropperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41127a = 0.5625f;
        this.f41128b = 1.91f;
        this.f41129c = 1.0f;
        this.f41130d = null;
        this.f41133g = null;
        this.f41136j = new RectF();
        this.f41137k = null;
        this.f41143q = new RectF();
        this.f41148v = false;
        this.f41151y = new GestureDetectorOnGestureListenerC11377c();
        this.f41152z = new ScaleGestureDetectorOnScaleGestureListenerC11378d();
        this.f41126A = new C11379e();
        m63413D(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public InstaCropperView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f41127a = 0.5625f;
        this.f41128b = 1.91f;
        this.f41129c = 1.0f;
        this.f41130d = null;
        this.f41133g = null;
        this.f41136j = new RectF();
        this.f41137k = null;
        this.f41143q = new RectF();
        this.f41148v = false;
        this.f41151y = new GestureDetectorOnGestureListenerC11377c();
        this.f41152z = new ScaleGestureDetectorOnScaleGestureListenerC11378d();
        this.f41126A = new C11379e();
        m63413D(context, attributeSet, i, i2);
    }
}
