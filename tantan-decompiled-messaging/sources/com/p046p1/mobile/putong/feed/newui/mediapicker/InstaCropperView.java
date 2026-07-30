package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import p149l.d30;
import p149l.e51;
import p149l.qkq0;
import p149l.spw;

/* JADX INFO: loaded from: classes12.dex */
public class InstaCropperView extends View {

    /* JADX INFO: renamed from: A */
    public ValueAnimator.AnimatorUpdateListener f40278A;

    /* JADX INFO: renamed from: a */
    public float f40279a;

    /* JADX INFO: renamed from: b */
    public float f40280b;

    /* JADX INFO: renamed from: c */
    public float f40281c;

    /* JADX INFO: renamed from: d */
    public Uri f40282d;

    /* JADX INFO: renamed from: e */
    public int f40283e;

    /* JADX INFO: renamed from: f */
    public int f40284f;

    /* JADX INFO: renamed from: g */
    public spw f40285g;

    /* JADX INFO: renamed from: h */
    public int f40286h;

    /* JADX INFO: renamed from: i */
    public int f40287i;

    /* JADX INFO: renamed from: j */
    public RectF f40288j;

    /* JADX INFO: renamed from: k */
    public Drawable f40289k;

    /* JADX INFO: renamed from: l */
    public float f40290l;

    /* JADX INFO: renamed from: m */
    public float f40291m;

    /* JADX INFO: renamed from: n */
    public float f40292n;

    /* JADX INFO: renamed from: o */
    public float f40293o;

    /* JADX INFO: renamed from: p */
    public float f40294p;

    /* JADX INFO: renamed from: q */
    public RectF f40295q;

    /* JADX INFO: renamed from: r */
    public GestureDetector f40296r;

    /* JADX INFO: renamed from: s */
    public ScaleGestureDetector f40297s;

    /* JADX INFO: renamed from: t */
    public float f40298t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f40299u;

    /* JADX INFO: renamed from: v */
    public boolean f40300v;

    /* JADX INFO: renamed from: w */
    public C11217f f40301w;

    /* JADX INFO: renamed from: x */
    public d30 f40302x;

    /* JADX INFO: renamed from: y */
    public GestureDetector.OnGestureListener f40303y;

    /* JADX INFO: renamed from: z */
    public ScaleGestureDetector.OnScaleGestureListener f40304z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$a */
    public class C11212a implements Animator.AnimatorListener {
        public C11212a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InstaCropperView.this.m62234H();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$b */
    public class AsyncTaskC11213b extends spw {
        public AsyncTaskC11213b(Context context, Uri uri, int i, int i2) {
            super(context, uri, i, i2);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            InstaCropperView.this.f40289k = drawable;
            InstaCropperView.this.f40283e = m185392c();
            InstaCropperView.this.f40284f = m185391b();
            InstaCropperView.this.m62239M();
            if (NullChecker.m81303a(InstaCropperView.this.f40302x)) {
                InstaCropperView.this.f40302x.call();
                InstaCropperView.this.f40302x = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$c */
    public class GestureDetectorOnGestureListenerC11214c implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC11214c() {
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
            instaCropperView.m62229C(instaCropperView.f40295q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM62236J = instaCropperView2.m62236J(instaCropperView2.f40295q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM62237K = instaCropperView3.m62237K(instaCropperView3.f40295q);
            float fM62250y = InstaCropperView.this.m62250y(f3, fM62236J);
            float fM62250y2 = InstaCropperView.this.m62250y(f4, fM62237K);
            InstaCropperView.this.f40293o += fM62250y;
            InstaCropperView.this.f40294p += fM62250y2;
            InstaCropperView.this.m62248V();
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
    public class ScaleGestureDetectorOnScaleGestureListenerC11215d implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC11215d() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float fM62249x = InstaCropperView.this.m62249x(scaleGestureDetector.getScaleFactor(), InstaCropperView.this.m62235I());
            InstaCropperView.this.f40291m = scaleGestureDetector.getFocusX();
            InstaCropperView.this.f40292n = scaleGestureDetector.getFocusY();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m62246T(instaCropperView.f40290l * fM62249x, InstaCropperView.this.f40291m, InstaCropperView.this.f40292n);
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
    public class C11216e implements ValueAnimator.AnimatorUpdateListener {
        public C11216e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m62229C(instaCropperView.f40295q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM62236J = instaCropperView2.m62236J(instaCropperView2.f40295q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM62237K = instaCropperView3.m62237K(instaCropperView3.f40295q);
            float fM62235I = InstaCropperView.this.m62235I();
            InstaCropperView.this.f40293o -= fM62236J * fFloatValue;
            InstaCropperView.this.f40294p -= fM62237K * fFloatValue;
            float f = ((1.0f - fFloatValue) * InstaCropperView.this.f40290l) + (fFloatValue * (InstaCropperView.this.f40290l / fM62235I));
            InstaCropperView instaCropperView4 = InstaCropperView.this;
            instaCropperView4.m62246T(f, instaCropperView4.f40291m, InstaCropperView.this.f40292n);
            InstaCropperView.this.m62248V();
            InstaCropperView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$f */
    public static class C11217f {

        /* JADX INFO: renamed from: a */
        public Uri f40310a;

        /* JADX INFO: renamed from: b */
        public float f40311b;

        /* JADX INFO: renamed from: c */
        public float f40312c;

        /* JADX INFO: renamed from: d */
        public float f40313d;

        /* JADX INFO: renamed from: e */
        public int f40314e;

        /* JADX INFO: renamed from: f */
        public int f40315f;

        /* JADX INFO: renamed from: g */
        public int f40316g;

        /* JADX INFO: renamed from: h */
        public int f40317h;

        /* JADX INFO: renamed from: i */
        public int f40318i;

        /* JADX INFO: renamed from: j */
        public int f40319j;

        public C11217f(Uri uri, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f40310a = uri;
            this.f40311b = f;
            this.f40312c = f2;
            this.f40313d = f3;
            this.f40314e = i;
            this.f40315f = i2;
            this.f40316g = i3;
            this.f40317h = i4;
            this.f40318i = i5;
            this.f40319j = i6;
        }
    }

    public InstaCropperView(Context context) {
        super(context);
        this.f40279a = 0.5625f;
        this.f40280b = 1.91f;
        this.f40281c = 1.0f;
        this.f40282d = null;
        this.f40285g = null;
        this.f40288j = new RectF();
        this.f40289k = null;
        this.f40295q = new RectF();
        this.f40300v = false;
        this.f40303y = new GestureDetectorOnGestureListenerC11214c();
        this.f40304z = new ScaleGestureDetectorOnScaleGestureListenerC11215d();
        this.f40278A = new C11216e();
        m62230D(context, null, 0, 0);
    }

    private float getDisplayDrawableHeight() {
        return this.f40290l * this.f40284f;
    }

    private float getDisplayDrawableWidth() {
        return this.f40290l * this.f40283e;
    }

    private float getDrawableScaleToFitWithValidRatio() {
        float f;
        int i;
        float imageSizeRatio = getImageSizeRatio();
        if (m62231E(imageSizeRatio)) {
            int i2 = this.f40286h;
            int i3 = this.f40287i;
            float f2 = i2 / i3;
            int i4 = this.f40283e;
            i = this.f40284f;
            if (i4 / i > f2) {
                return i2 / i4;
            }
            f = i3;
        } else if (imageSizeRatio < this.f40279a) {
            f = this.f40286h * 0.5625f;
            i = this.f40283e;
        } else {
            f = this.f40287i / 1.91f;
            i = this.f40284f;
        }
        return f / i;
    }

    private float getDrawableScaleToFitWithView() {
        int i = this.f40286h;
        int i2 = this.f40287i;
        float f = i / i2;
        int i3 = this.f40283e;
        int i4 = this.f40284f;
        return ((float) i3) / ((float) i4) > f ? i2 / i4 : i / i3;
    }

    private float getImageSizeRatio() {
        return this.f40283e / this.f40284f;
    }

    private float getMaximumAllowedScale() {
        return Math.min(this.f40283e / this.f40286h, this.f40284f / this.f40287i);
    }

    private float getMinimumAllowedScale() {
        return this.f40300v ? getDrawableScaleToFitWithView() : getDrawableScaleToFitWithValidRatio();
    }

    private void setDrawableScale(float f) {
        this.f40290l = f;
        invalidate();
    }

    private void setGridBounds(RectF rectF) {
        this.f40288j.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m62227A() {
        Drawable drawable = this.f40289k;
        if (drawable == null) {
            return false;
        }
        return m62233G(drawable.getIntrinsicWidth(), this.f40289k.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: B */
    public final boolean m62228B() {
        return m62233G(this.f40285g.m185394e(), this.f40285g.m185393d());
    }

    /* JADX INFO: renamed from: C */
    public final void m62229C(RectF rectF) {
        float f = this.f40293o;
        rectF.left = f;
        rectF.top = this.f40294p;
        rectF.right = f + getDisplayDrawableWidth();
        rectF.bottom = rectF.top + getDisplayDrawableHeight();
    }

    /* JADX INFO: renamed from: D */
    public final void m62230D(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f40296r = new GestureDetector(context, this.f40303y);
        this.f40297s = new ScaleGestureDetector(context, this.f40304z);
        this.f40298t = getResources().getDisplayMetrics().density * 144.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f40299u = valueAnimator;
        valueAnimator.setDuration(400L);
        this.f40299u.setFloatValues(0.0f, 1.0f);
        this.f40299u.setInterpolator(new DecelerateInterpolator(0.25f));
        this.f40299u.addUpdateListener(this.f40278A);
        this.f40299u.addListener(new C11212a());
    }

    /* JADX INFO: renamed from: E */
    public final boolean m62231E(float f) {
        return f >= this.f40279a && f <= this.f40280b;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m62232F() {
        return this.f40285g != null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m62233G(int i, int i2) {
        float f = (this.f40286h * this.f40287i) / (i * i2);
        return f >= 0.5f && f <= 2.0f;
    }

    /* JADX INFO: renamed from: I */
    public final float m62235I() {
        float maximumAllowedScale = getMaximumAllowedScale();
        float minimumAllowedScale = getMinimumAllowedScale();
        if (maximumAllowedScale < minimumAllowedScale) {
            maximumAllowedScale = minimumAllowedScale;
        }
        float f = this.f40290l;
        if (f < minimumAllowedScale) {
            return f / minimumAllowedScale;
        }
        if (f > maximumAllowedScale) {
            return f / maximumAllowedScale;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: J */
    public final float m62236J(RectF rectF) {
        float fCenterX;
        float f;
        float fWidth = rectF.width();
        int i = this.f40286h;
        if (fWidth <= i) {
            fCenterX = rectF.centerX();
            f = this.f40286h / 2;
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
    public final float m62237K(RectF rectF) {
        float fCenterY;
        float f;
        float fHeight = rectF.height();
        int i = this.f40287i;
        if (fHeight < i) {
            fCenterY = rectF.centerY();
            f = this.f40287i / 2;
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
    public void m62234H() {
        int i;
        int i2;
        if (this.f40282d == null) {
            qkq0.m175383a("Image uri is not set.");
            return;
        }
        if ((this.f40289k == null && this.f40283e != -1 && this.f40284f != -1) || this.f40299u.isRunning()) {
            e51.m114743H(getContext(), new Runnable() { // from class: l.stm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166374a.m62234H();
                }
            }, 200L);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1080, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        RectF rectF = this.f40288j;
        rectF.offset(-this.f40293o, -this.f40294p);
        m62229C(this.f40295q);
        float fWidth = rectF.left / this.f40295q.width();
        float fHeight = rectF.top / this.f40295q.height();
        float fWidth2 = rectF.right / this.f40295q.width();
        float fHeight2 = rectF.bottom / this.f40295q.height();
        int iMax = Math.max(0, (int) (fWidth * this.f40283e));
        int iMax2 = Math.max(0, (int) (fHeight * this.f40284f));
        int i3 = this.f40283e;
        int iMin = Math.min(i3, (int) (fWidth2 * i3));
        int i4 = this.f40284f;
        int iMin2 = Math.min(i4, (int) (fHeight2 * i4));
        int iMin3 = iMin - iMax;
        int iMin4 = iMin2 - iMax2;
        float f = iMin3 / iMin4;
        float f2 = this.f40279a;
        if (f < f2) {
            f = f2;
        }
        float f3 = this.f40280b;
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
                this.f40301w = new C11217f(this.f40282d, this.f40290l, this.f40293o, this.f40294p, iMax, iMax2, iMin, iMin2, i, i2);
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
            this.f40301w = new C11217f(this.f40282d, this.f40290l, this.f40293o, this.f40294p, iMax, iMax2, iMin, iMin2, i, i2);
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
        this.f40301w = new C11217f(this.f40282d, this.f40290l, this.f40293o, this.f40294p, iMax, iMax2, iMin, iMin2, i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m62239M() {
        if (NullChecker.m81303a(this.f40301w) && this.f40300v) {
            m62242P(this.f40301w);
        } else {
            m62241O();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m62240N() {
        this.f40293o = (this.f40286h - getDisplayDrawableWidth()) / 2.0f;
        this.f40294p = (this.f40287i - getDisplayDrawableHeight()) / 2.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: O */
    public final void m62241O() {
        if (this.f40299u.isRunning()) {
            this.f40299u.cancel();
        }
        if (this.f40300v) {
            m62243Q();
        } else {
            m62244R();
        }
        m62240N();
        m62248V();
        invalidate();
        m62234H();
    }

    /* JADX INFO: renamed from: P */
    public final void m62242P(C11217f c11217f) {
        if (this.f40299u.isRunning()) {
            this.f40299u.cancel();
        }
        setDrawableScale(c11217f.f40311b);
        this.f40293o = c11217f.f40312c;
        this.f40294p = c11217f.f40313d;
        m62248V();
        invalidate();
    }

    /* JADX INFO: renamed from: Q */
    public final void m62243Q() {
        setDrawableScale(getDrawableScaleToFitWithView());
    }

    /* JADX INFO: renamed from: R */
    public final void m62244R() {
        setDrawableScale(getDrawableScaleToFitWithValidRatio());
    }

    /* JADX INFO: renamed from: S */
    public void m62245S(Uri uri, C11217f c11217f) {
        this.f40301w = c11217f;
        m62251z();
        this.f40282d = uri;
        this.f40289k = null;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: T */
    public final void m62246T(float f, float f2, float f3) {
        m62229C(this.f40295q);
        RectF rectF = this.f40295q;
        float fWidth = (f2 - rectF.left) / rectF.width();
        RectF rectF2 = this.f40295q;
        float fHeight = (f3 - rectF2.top) / rectF2.height();
        this.f40290l = f;
        m62229C(this.f40295q);
        RectF rectF3 = this.f40295q;
        float fWidth2 = rectF3.left + (fWidth * rectF3.width());
        RectF rectF4 = this.f40295q;
        float fHeight2 = rectF4.top + (fHeight * rectF4.height());
        this.f40293o += f2 - fWidth2;
        this.f40294p += f3 - fHeight2;
        m62248V();
        invalidate();
    }

    /* JADX INFO: renamed from: U */
    public final void m62247U() {
        AsyncTaskC11213b asyncTaskC11213b = new AsyncTaskC11213b(getContext(), this.f40282d, this.f40286h, this.f40287i);
        this.f40285g = asyncTaskC11213b;
        asyncTaskC11213b.execute(new Void[0]);
    }

    /* JADX INFO: renamed from: V */
    public final void m62248V() {
        m62229C(this.f40295q);
        this.f40295q.intersect(0.0f, 0.0f, this.f40286h, this.f40287i);
        RectF rectF = this.f40295q;
        float f = rectF.left;
        float f2 = rectF.top;
        this.f40295q.set(f, f2, rectF.width() + f, this.f40295q.height() + f2);
        setGridBounds(this.f40295q);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f40289k == null) {
            return;
        }
        m62229C(this.f40295q);
        Drawable drawable = this.f40289k;
        RectF rectF = this.f40295q;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f40289k.draw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        this.f40286h = i5;
        int i6 = i4 - i2;
        this.f40287i = i6;
        if (i5 == 0 || i6 == 0 || this.f40282d == null) {
            return;
        }
        if (m62227A()) {
            m62251z();
            return;
        }
        if (m62232F()) {
            if (m62228B()) {
                return;
            } else {
                m62251z();
            }
        }
        m62247U();
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
                    f4 = this.f40281c;
                } else if (mode2 == 0) {
                    float f5 = this.f40298t;
                    size2 = (int) f5;
                    size = (int) f5;
                } else if (mode2 != 1073741824) {
                    size = 1;
                    size2 = 1;
                } else {
                    f3 = size2;
                    f4 = this.f40281c;
                }
                size = (int) (f3 * f4);
            } else if (mode != 1073741824) {
                size = 1;
                size2 = 1;
            } else if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, (int) (size / this.f40281c));
            } else if (mode2 == 0) {
                f = size;
                f2 = this.f40281c;
                size2 = (int) (f / f2);
            } else if (mode2 != 1073741824) {
                size2 = 1;
            }
        } else if (mode2 == Integer.MIN_VALUE) {
            float f6 = size;
            float f7 = size2;
            float f8 = f6 / f7;
            float f9 = this.f40281c;
            if (f8 != f9) {
                if (f8 > f9) {
                    size = (int) (f7 * f9);
                } else {
                    size2 = (int) (f6 / f9);
                }
            }
        } else if (mode2 == 0) {
            f = size;
            f2 = this.f40281c;
            size2 = (int) (f / f2);
        } else if (mode2 != 1073741824) {
            size = 1;
            size2 = 1;
        } else {
            size = Math.min(size, (int) (size2 * this.f40281c));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40289k == null) {
            return false;
        }
        this.f40296r.onTouchEvent(motionEvent);
        this.f40297s.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            this.f40299u.start();
        }
        return true;
    }

    public void setFitView(boolean z) {
        this.f40300v = z;
        m62241O();
    }

    public void setImageUri(Uri uri) {
        m62245S(uri, null);
    }

    /* JADX INFO: renamed from: x */
    public final float m62249x(float f, float f2) {
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
    public final float m62250y(float f, float f2) {
        if (f2 * f <= 0.0f) {
            return f;
        }
        float fAbs = Math.abs(f2) / this.f40298t;
        double d = f;
        return (float) (d - (Math.sqrt(fAbs) * d));
    }

    /* JADX INFO: renamed from: z */
    public final void m62251z() {
        if (NullChecker.m81303a(this.f40285g)) {
            this.f40285g.cancel(true);
            this.f40285g = null;
        }
    }

    public InstaCropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40279a = 0.5625f;
        this.f40280b = 1.91f;
        this.f40281c = 1.0f;
        this.f40282d = null;
        this.f40285g = null;
        this.f40288j = new RectF();
        this.f40289k = null;
        this.f40295q = new RectF();
        this.f40300v = false;
        this.f40303y = new GestureDetectorOnGestureListenerC11214c();
        this.f40304z = new ScaleGestureDetectorOnScaleGestureListenerC11215d();
        this.f40278A = new C11216e();
        m62230D(context, attributeSet, 0, 0);
    }

    public InstaCropperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40279a = 0.5625f;
        this.f40280b = 1.91f;
        this.f40281c = 1.0f;
        this.f40282d = null;
        this.f40285g = null;
        this.f40288j = new RectF();
        this.f40289k = null;
        this.f40295q = new RectF();
        this.f40300v = false;
        this.f40303y = new GestureDetectorOnGestureListenerC11214c();
        this.f40304z = new ScaleGestureDetectorOnScaleGestureListenerC11215d();
        this.f40278A = new C11216e();
        m62230D(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public InstaCropperView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f40279a = 0.5625f;
        this.f40280b = 1.91f;
        this.f40281c = 1.0f;
        this.f40282d = null;
        this.f40285g = null;
        this.f40288j = new RectF();
        this.f40289k = null;
        this.f40295q = new RectF();
        this.f40300v = false;
        this.f40303y = new GestureDetectorOnGestureListenerC11214c();
        this.f40304z = new ScaleGestureDetectorOnScaleGestureListenerC11215d();
        this.f40278A = new C11216e();
        m62230D(context, attributeSet, i, i2);
    }
}
