package com.p000p1.mobile.putong.feed.newui.mediapicker;

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
import l.d30;
import l.e51;
import l.qkq0;
import p007l.spw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class InstaCropperView extends View {

    /* JADX INFO: renamed from: A */
    public ValueAnimator.AnimatorUpdateListener f1739A;

    /* JADX INFO: renamed from: a */
    public float f1740a;

    /* JADX INFO: renamed from: b */
    public float f1741b;

    /* JADX INFO: renamed from: c */
    public float f1742c;

    /* JADX INFO: renamed from: d */
    public Uri f1743d;

    /* JADX INFO: renamed from: e */
    public int f1744e;

    /* JADX INFO: renamed from: f */
    public int f1745f;

    /* JADX INFO: renamed from: g */
    public spw f1746g;

    /* JADX INFO: renamed from: h */
    public int f1747h;

    /* JADX INFO: renamed from: i */
    public int f1748i;

    /* JADX INFO: renamed from: j */
    public RectF f1749j;

    /* JADX INFO: renamed from: k */
    public Drawable f1750k;

    /* JADX INFO: renamed from: l */
    public float f1751l;

    /* JADX INFO: renamed from: m */
    public float f1752m;

    /* JADX INFO: renamed from: n */
    public float f1753n;

    /* JADX INFO: renamed from: o */
    public float f1754o;

    /* JADX INFO: renamed from: p */
    public float f1755p;

    /* JADX INFO: renamed from: q */
    public RectF f1756q;

    /* JADX INFO: renamed from: r */
    public GestureDetector f1757r;

    /* JADX INFO: renamed from: s */
    public ScaleGestureDetector f1758s;

    /* JADX INFO: renamed from: t */
    public float f1759t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f1760u;

    /* JADX INFO: renamed from: v */
    public boolean f1761v;

    /* JADX INFO: renamed from: w */
    public C2061f f1762w;

    /* JADX INFO: renamed from: x */
    public d30 f1763x;

    /* JADX INFO: renamed from: y */
    public GestureDetector.OnGestureListener f1764y;

    /* JADX INFO: renamed from: z */
    public ScaleGestureDetector.OnScaleGestureListener f1765z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$a */
    public class C2056a implements Animator.AnimatorListener {
        public C2056a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InstaCropperView.this.m3216H();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$b */
    public class AsyncTaskC2057b extends spw {
        public AsyncTaskC2057b(Context context, Uri uri, int i, int i2) {
            super(context, uri, i, i2);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            InstaCropperView.this.f1750k = drawable;
            InstaCropperView.this.f1744e = m14281c();
            InstaCropperView.this.f1745f = m14280b();
            InstaCropperView.this.m3221M();
            if (NullChecker.a(InstaCropperView.this.f1763x)) {
                InstaCropperView.this.f1763x.call();
                InstaCropperView.this.f1763x = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$c */
    public class GestureDetectorOnGestureListenerC2058c implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC2058c() {
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
            instaCropperView.m3211C(instaCropperView.f1756q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM3218J = instaCropperView2.m3218J(instaCropperView2.f1756q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM3219K = instaCropperView3.m3219K(instaCropperView3.f1756q);
            float fM3232y = InstaCropperView.this.m3232y(f3, fM3218J);
            float fM3232y2 = InstaCropperView.this.m3232y(f4, fM3219K);
            InstaCropperView.this.f1754o += fM3232y;
            InstaCropperView.this.f1755p += fM3232y2;
            InstaCropperView.this.m3230V();
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
    public class ScaleGestureDetectorOnScaleGestureListenerC2059d implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC2059d() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float fM3231x = InstaCropperView.this.m3231x(scaleGestureDetector.getScaleFactor(), InstaCropperView.this.m3217I());
            InstaCropperView.this.f1752m = scaleGestureDetector.getFocusX();
            InstaCropperView.this.f1753n = scaleGestureDetector.getFocusY();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m3228T(instaCropperView.f1751l * fM3231x, InstaCropperView.this.f1752m, InstaCropperView.this.f1753n);
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
    public class C2060e implements ValueAnimator.AnimatorUpdateListener {
        public C2060e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InstaCropperView instaCropperView = InstaCropperView.this;
            instaCropperView.m3211C(instaCropperView.f1756q);
            InstaCropperView instaCropperView2 = InstaCropperView.this;
            float fM3218J = instaCropperView2.m3218J(instaCropperView2.f1756q);
            InstaCropperView instaCropperView3 = InstaCropperView.this;
            float fM3219K = instaCropperView3.m3219K(instaCropperView3.f1756q);
            float fM3217I = InstaCropperView.this.m3217I();
            InstaCropperView.this.f1754o -= fM3218J * fFloatValue;
            InstaCropperView.this.f1755p -= fM3219K * fFloatValue;
            float f = ((1.0f - fFloatValue) * InstaCropperView.this.f1751l) + (fFloatValue * (InstaCropperView.this.f1751l / fM3217I));
            InstaCropperView instaCropperView4 = InstaCropperView.this;
            instaCropperView4.m3228T(f, instaCropperView4.f1752m, InstaCropperView.this.f1753n);
            InstaCropperView.this.m3230V();
            InstaCropperView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaCropperView$f */
    public static class C2061f {

        /* JADX INFO: renamed from: a */
        public Uri f1771a;

        /* JADX INFO: renamed from: b */
        public float f1772b;

        /* JADX INFO: renamed from: c */
        public float f1773c;

        /* JADX INFO: renamed from: d */
        public float f1774d;

        /* JADX INFO: renamed from: e */
        public int f1775e;

        /* JADX INFO: renamed from: f */
        public int f1776f;

        /* JADX INFO: renamed from: g */
        public int f1777g;

        /* JADX INFO: renamed from: h */
        public int f1778h;

        /* JADX INFO: renamed from: i */
        public int f1779i;

        /* JADX INFO: renamed from: j */
        public int f1780j;

        public C2061f(Uri uri, float f, float f2, float f3, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1771a = uri;
            this.f1772b = f;
            this.f1773c = f2;
            this.f1774d = f3;
            this.f1775e = i;
            this.f1776f = i2;
            this.f1777g = i3;
            this.f1778h = i4;
            this.f1779i = i5;
            this.f1780j = i6;
        }
    }

    public InstaCropperView(Context context) {
        super(context);
        this.f1740a = 0.5625f;
        this.f1741b = 1.91f;
        this.f1742c = 1.0f;
        this.f1743d = null;
        this.f1746g = null;
        this.f1749j = new RectF();
        this.f1750k = null;
        this.f1756q = new RectF();
        this.f1761v = false;
        this.f1764y = new GestureDetectorOnGestureListenerC2058c();
        this.f1765z = new ScaleGestureDetectorOnScaleGestureListenerC2059d();
        this.f1739A = new C2060e();
        m3212D(context, null, 0, 0);
    }

    private float getDisplayDrawableHeight() {
        return this.f1751l * this.f1745f;
    }

    private float getDisplayDrawableWidth() {
        return this.f1751l * this.f1744e;
    }

    private float getDrawableScaleToFitWithValidRatio() {
        float f;
        int i;
        float imageSizeRatio = getImageSizeRatio();
        if (m3213E(imageSizeRatio)) {
            int i2 = this.f1747h;
            int i3 = this.f1748i;
            float f2 = i2 / i3;
            int i4 = this.f1744e;
            i = this.f1745f;
            if (i4 / i > f2) {
                return i2 / i4;
            }
            f = i3;
        } else if (imageSizeRatio < this.f1740a) {
            f = this.f1747h * 0.5625f;
            i = this.f1744e;
        } else {
            f = this.f1748i / 1.91f;
            i = this.f1745f;
        }
        return f / i;
    }

    private float getDrawableScaleToFitWithView() {
        int i = this.f1747h;
        int i2 = this.f1748i;
        float f = i / i2;
        int i3 = this.f1744e;
        int i4 = this.f1745f;
        return ((float) i3) / ((float) i4) > f ? i2 / i4 : i / i3;
    }

    private float getImageSizeRatio() {
        return this.f1744e / this.f1745f;
    }

    private float getMaximumAllowedScale() {
        return Math.min(this.f1744e / this.f1747h, this.f1745f / this.f1748i);
    }

    private float getMinimumAllowedScale() {
        return this.f1761v ? getDrawableScaleToFitWithView() : getDrawableScaleToFitWithValidRatio();
    }

    private void setDrawableScale(float f) {
        this.f1751l = f;
        invalidate();
    }

    private void setGridBounds(RectF rectF) {
        this.f1749j.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m3209A() {
        Drawable drawable = this.f1750k;
        if (drawable == null) {
            return false;
        }
        return m3215G(drawable.getIntrinsicWidth(), this.f1750k.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3210B() {
        return m3215G(this.f1746g.m14283e(), this.f1746g.m14282d());
    }

    /* JADX INFO: renamed from: C */
    public final void m3211C(RectF rectF) {
        float f = this.f1754o;
        rectF.left = f;
        rectF.top = this.f1755p;
        rectF.right = f + getDisplayDrawableWidth();
        rectF.bottom = rectF.top + getDisplayDrawableHeight();
    }

    /* JADX INFO: renamed from: D */
    public final void m3212D(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1757r = new GestureDetector(context, this.f1764y);
        this.f1758s = new ScaleGestureDetector(context, this.f1765z);
        this.f1759t = getResources().getDisplayMetrics().density * 144.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1760u = valueAnimator;
        valueAnimator.setDuration(400L);
        this.f1760u.setFloatValues(0.0f, 1.0f);
        this.f1760u.setInterpolator(new DecelerateInterpolator(0.25f));
        this.f1760u.addUpdateListener(this.f1739A);
        this.f1760u.addListener(new C2056a());
    }

    /* JADX INFO: renamed from: E */
    public final boolean m3213E(float f) {
        return f >= this.f1740a && f <= this.f1741b;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m3214F() {
        return this.f1746g != null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3215G(int i, int i2) {
        float f = (this.f1747h * this.f1748i) / (i * i2);
        return f >= 0.5f && f <= 2.0f;
    }

    /* JADX INFO: renamed from: I */
    public final float m3217I() {
        float maximumAllowedScale = getMaximumAllowedScale();
        float minimumAllowedScale = getMinimumAllowedScale();
        if (maximumAllowedScale < minimumAllowedScale) {
            maximumAllowedScale = minimumAllowedScale;
        }
        float f = this.f1751l;
        if (f < minimumAllowedScale) {
            return f / minimumAllowedScale;
        }
        if (f > maximumAllowedScale) {
            return f / maximumAllowedScale;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: J */
    public final float m3218J(RectF rectF) {
        float fCenterX;
        float f;
        float fWidth = rectF.width();
        int i = this.f1747h;
        if (fWidth <= i) {
            fCenterX = rectF.centerX();
            f = this.f1747h / 2;
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
    public final float m3219K(RectF rectF) {
        float fCenterY;
        float f;
        float fHeight = rectF.height();
        int i = this.f1748i;
        if (fHeight < i) {
            fCenterY = rectF.centerY();
            f = this.f1748i / 2;
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
    public void m3216H() {
        int i;
        int i2;
        if (this.f1743d == null) {
            qkq0.a("Image uri is not set.");
            return;
        }
        if ((this.f1750k == null && this.f1744e != -1 && this.f1745f != -1) || this.f1760u.isRunning()) {
            e51.H(getContext(), new Runnable() { // from class: l.stm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13090a.m3216H();
                }
            }, 200L);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1080, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        RectF rectF = this.f1749j;
        rectF.offset(-this.f1754o, -this.f1755p);
        m3211C(this.f1756q);
        float fWidth = rectF.left / this.f1756q.width();
        float fHeight = rectF.top / this.f1756q.height();
        float fWidth2 = rectF.right / this.f1756q.width();
        float fHeight2 = rectF.bottom / this.f1756q.height();
        int iMax = Math.max(0, (int) (fWidth * this.f1744e));
        int iMax2 = Math.max(0, (int) (fHeight * this.f1745f));
        int i3 = this.f1744e;
        int iMin = Math.min(i3, (int) (fWidth2 * i3));
        int i4 = this.f1745f;
        int iMin2 = Math.min(i4, (int) (fHeight2 * i4));
        int iMin3 = iMin - iMax;
        int iMin4 = iMin2 - iMax2;
        float f = iMin3 / iMin4;
        float f2 = this.f1740a;
        if (f < f2) {
            f = f2;
        }
        float f3 = this.f1741b;
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
                this.f1762w = new C2061f(this.f1743d, this.f1751l, this.f1754o, this.f1755p, iMax, iMax2, iMin, iMin2, i, i2);
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
            this.f1762w = new C2061f(this.f1743d, this.f1751l, this.f1754o, this.f1755p, iMax, iMax2, iMin, iMin2, i, i2);
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
        this.f1762w = new C2061f(this.f1743d, this.f1751l, this.f1754o, this.f1755p, iMax, iMax2, iMin, iMin2, i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final void m3221M() {
        if (NullChecker.a(this.f1762w) && this.f1761v) {
            m3224P(this.f1762w);
        } else {
            m3223O();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m3222N() {
        this.f1754o = (this.f1747h - getDisplayDrawableWidth()) / 2.0f;
        this.f1755p = (this.f1748i - getDisplayDrawableHeight()) / 2.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: O */
    public final void m3223O() {
        if (this.f1760u.isRunning()) {
            this.f1760u.cancel();
        }
        if (this.f1761v) {
            m3225Q();
        } else {
            m3226R();
        }
        m3222N();
        m3230V();
        invalidate();
        m3216H();
    }

    /* JADX INFO: renamed from: P */
    public final void m3224P(C2061f c2061f) {
        if (this.f1760u.isRunning()) {
            this.f1760u.cancel();
        }
        setDrawableScale(c2061f.f1772b);
        this.f1754o = c2061f.f1773c;
        this.f1755p = c2061f.f1774d;
        m3230V();
        invalidate();
    }

    /* JADX INFO: renamed from: Q */
    public final void m3225Q() {
        setDrawableScale(getDrawableScaleToFitWithView());
    }

    /* JADX INFO: renamed from: R */
    public final void m3226R() {
        setDrawableScale(getDrawableScaleToFitWithValidRatio());
    }

    /* JADX INFO: renamed from: S */
    public void m3227S(Uri uri, C2061f c2061f) {
        this.f1762w = c2061f;
        m3233z();
        this.f1743d = uri;
        this.f1750k = null;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: T */
    public final void m3228T(float f, float f2, float f3) {
        m3211C(this.f1756q);
        RectF rectF = this.f1756q;
        float fWidth = (f2 - rectF.left) / rectF.width();
        RectF rectF2 = this.f1756q;
        float fHeight = (f3 - rectF2.top) / rectF2.height();
        this.f1751l = f;
        m3211C(this.f1756q);
        RectF rectF3 = this.f1756q;
        float fWidth2 = rectF3.left + (fWidth * rectF3.width());
        RectF rectF4 = this.f1756q;
        float fHeight2 = rectF4.top + (fHeight * rectF4.height());
        this.f1754o += f2 - fWidth2;
        this.f1755p += f3 - fHeight2;
        m3230V();
        invalidate();
    }

    /* JADX INFO: renamed from: U */
    public final void m3229U() {
        AsyncTaskC2057b asyncTaskC2057b = new AsyncTaskC2057b(getContext(), this.f1743d, this.f1747h, this.f1748i);
        this.f1746g = asyncTaskC2057b;
        asyncTaskC2057b.execute(new Void[0]);
    }

    /* JADX INFO: renamed from: V */
    public final void m3230V() {
        m3211C(this.f1756q);
        this.f1756q.intersect(0.0f, 0.0f, this.f1747h, this.f1748i);
        RectF rectF = this.f1756q;
        float f = rectF.left;
        float f2 = rectF.top;
        this.f1756q.set(f, f2, rectF.width() + f, this.f1756q.height() + f2);
        setGridBounds(this.f1756q);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1750k == null) {
            return;
        }
        m3211C(this.f1756q);
        Drawable drawable = this.f1750k;
        RectF rectF = this.f1756q;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.f1750k.draw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        this.f1747h = i5;
        int i6 = i4 - i2;
        this.f1748i = i6;
        if (i5 == 0 || i6 == 0 || this.f1743d == null) {
            return;
        }
        if (m3209A()) {
            m3233z();
            return;
        }
        if (m3214F()) {
            if (m3210B()) {
                return;
            } else {
                m3233z();
            }
        }
        m3229U();
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
                    f4 = this.f1742c;
                } else if (mode2 == 0) {
                    float f5 = this.f1759t;
                    size2 = (int) f5;
                    size = (int) f5;
                } else if (mode2 != 1073741824) {
                    size = 1;
                    size2 = 1;
                } else {
                    f3 = size2;
                    f4 = this.f1742c;
                }
                size = (int) (f3 * f4);
            } else if (mode != 1073741824) {
                size = 1;
                size2 = 1;
            } else if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, (int) (size / this.f1742c));
            } else if (mode2 == 0) {
                f = size;
                f2 = this.f1742c;
                size2 = (int) (f / f2);
            } else if (mode2 != 1073741824) {
                size2 = 1;
            }
        } else if (mode2 == Integer.MIN_VALUE) {
            float f6 = size;
            float f7 = size2;
            float f8 = f6 / f7;
            float f9 = this.f1742c;
            if (f8 != f9) {
                if (f8 > f9) {
                    size = (int) (f7 * f9);
                } else {
                    size2 = (int) (f6 / f9);
                }
            }
        } else if (mode2 == 0) {
            f = size;
            f2 = this.f1742c;
            size2 = (int) (f / f2);
        } else if (mode2 != 1073741824) {
            size = 1;
            size2 = 1;
        } else {
            size = Math.min(size, (int) (size2 * this.f1742c));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1750k == null) {
            return false;
        }
        this.f1757r.onTouchEvent(motionEvent);
        this.f1758s.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            this.f1760u.start();
        }
        return true;
    }

    public void setFitView(boolean z) {
        this.f1761v = z;
        m3223O();
    }

    public void setImageUri(Uri uri) {
        m3227S(uri, null);
    }

    /* JADX INFO: renamed from: x */
    public final float m3231x(float f, float f2) {
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
    public final float m3232y(float f, float f2) {
        if (f2 * f <= 0.0f) {
            return f;
        }
        float fAbs = Math.abs(f2) / this.f1759t;
        double d = f;
        return (float) (d - (Math.sqrt(fAbs) * d));
    }

    /* JADX INFO: renamed from: z */
    public final void m3233z() {
        if (NullChecker.a(this.f1746g)) {
            this.f1746g.cancel(true);
            this.f1746g = null;
        }
    }

    public InstaCropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1740a = 0.5625f;
        this.f1741b = 1.91f;
        this.f1742c = 1.0f;
        this.f1743d = null;
        this.f1746g = null;
        this.f1749j = new RectF();
        this.f1750k = null;
        this.f1756q = new RectF();
        this.f1761v = false;
        this.f1764y = new GestureDetectorOnGestureListenerC2058c();
        this.f1765z = new ScaleGestureDetectorOnScaleGestureListenerC2059d();
        this.f1739A = new C2060e();
        m3212D(context, attributeSet, 0, 0);
    }

    public InstaCropperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1740a = 0.5625f;
        this.f1741b = 1.91f;
        this.f1742c = 1.0f;
        this.f1743d = null;
        this.f1746g = null;
        this.f1749j = new RectF();
        this.f1750k = null;
        this.f1756q = new RectF();
        this.f1761v = false;
        this.f1764y = new GestureDetectorOnGestureListenerC2058c();
        this.f1765z = new ScaleGestureDetectorOnScaleGestureListenerC2059d();
        this.f1739A = new C2060e();
        m3212D(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public InstaCropperView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1740a = 0.5625f;
        this.f1741b = 1.91f;
        this.f1742c = 1.0f;
        this.f1743d = null;
        this.f1746g = null;
        this.f1749j = new RectF();
        this.f1750k = null;
        this.f1756q = new RectF();
        this.f1761v = false;
        this.f1764y = new GestureDetectorOnGestureListenerC2058c();
        this.f1765z = new ScaleGestureDetectorOnScaleGestureListenerC2059d();
        this.f1739A = new C2060e();
        m3212D(context, attributeSet, i, i2);
    }
}
