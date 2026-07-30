package com.p051p1.mobile.putong.core.newui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.gzi0;
import p153l.j9c0;
import p153l.rhc0;

/* JADX INFO: loaded from: classes11.dex */
public class ShimmerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f27831a;

    /* JADX INFO: renamed from: b */
    public Rect f27832b;

    /* JADX INFO: renamed from: c */
    public Paint f27833c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f27834d;

    /* JADX INFO: renamed from: e */
    public Bitmap f27835e;

    /* JADX INFO: renamed from: f */
    public Bitmap f27836f;

    /* JADX INFO: renamed from: g */
    public Canvas f27837g;

    /* JADX INFO: renamed from: h */
    public boolean f27838h;

    /* JADX INFO: renamed from: i */
    public boolean f27839i;

    /* JADX INFO: renamed from: j */
    public boolean f27840j;

    /* JADX INFO: renamed from: k */
    public int f27841k;

    /* JADX INFO: renamed from: l */
    public int f27842l;

    /* JADX INFO: renamed from: m */
    public int f27843m;

    /* JADX INFO: renamed from: n */
    public float f27844n;

    /* JADX INFO: renamed from: o */
    public float f27845o;

    /* JADX INFO: renamed from: p */
    public boolean f27846p;

    /* JADX INFO: renamed from: q */
    public boolean f27847q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnPreDrawListener f27848r;

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27846p = false;
        this.f27847q = true;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rhc0.f163102I, 0, 0);
        try {
            this.f27843m = typedArrayObtainStyledAttributes.getInteger(rhc0.f163103J, 45);
            this.f27841k = typedArrayObtainStyledAttributes.getInteger(rhc0.f163104K, 3000);
            this.f27842l = typedArrayObtainStyledAttributes.getColor(rhc0.f163106M, m44943k(j9c0.f118878o));
            this.f27840j = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163105L, false);
            this.f27844n = typedArrayObtainStyledAttributes.getFloat(rhc0.f163108O, 0.5f);
            this.f27845o = typedArrayObtainStyledAttributes.getFloat(rhc0.f163107N, 0.1f);
            this.f27838h = typedArrayObtainStyledAttributes.getBoolean(rhc0.f163109P, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f27844n);
            setGradientCenterColorWidth(this.f27845o);
            setShimmerAngle(this.f27843m);
            m44942j();
            if (this.f27840j && getVisibility() == 0) {
                m44951s();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f = this.f27845o;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f27836f == null) {
            this.f27836f = m44938f(this.f27832b.width(), getHeight());
        }
        return this.f27836f;
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f27834d;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f27832b == null) {
            this.f27832b = m44936d();
        }
        int width = getWidth();
        final int i = getWidth() > this.f27832b.width() ? -width : -this.f27832b.width();
        final int iWidth = this.f27832b.width();
        int i2 = width - i;
        ValueAnimator valueAnimatorOfInt = this.f27838h ? ValueAnimator.ofInt(i2, 0) : ValueAnimator.ofInt(0, i2);
        this.f27834d = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f27841k);
        this.f27834d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v4f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f182362a.m44944l(i, iWidth, valueAnimator2);
            }
        });
        if (this.f27846p) {
            this.f27834d.setRepeatCount(-1);
        }
        return this.f27834d;
    }

    /* JADX INFO: renamed from: d */
    public final Rect m44936d() {
        return new Rect(0, 0, m44937e(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.f27839i || getWidth() <= 0 || ((NullChecker.m82486a(this.f27832b) && this.f27832b.width() <= 0) || getHeight() <= 0)) {
            super.dispatchDraw(canvas);
        } else {
            m44940h(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m44937e() {
        return (int) ((((double) (getWidth() * this.f27844n)) / Math.cos(Math.toRadians(Math.abs(this.f27843m)))) + (((double) getHeight()) * Math.tan(Math.toRadians(Math.abs(this.f27843m)))));
    }

    /* JADX INFO: renamed from: f */
    public final Bitmap m44938f(int i, int i2) {
        if (i > 0 && i2 > 0) {
            try {
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                System.gc();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m44939g() {
        if (this.f27833c != null) {
            return;
        }
        int iM44947o = m44947o(this.f27842l);
        float width = getWidth() * this.f27844n;
        float height = this.f27843m >= 0 ? getHeight() : 0.0f;
        float fCos = ((float) Math.cos(Math.toRadians(this.f27843m))) * width;
        float fSin = height + (((float) Math.sin(Math.toRadians(this.f27843m))) * width);
        int i = this.f27842l;
        float[] gradientColorDistribution = getGradientColorDistribution();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, fCos, fSin, new int[]{iM44947o, i, i, iM44947o}, gradientColorDistribution, tileMode), new BitmapShader(this.f27835e, tileMode, tileMode), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.f27833c = paint;
        paint.setAntiAlias(true);
        this.f27833c.setDither(true);
        this.f27833c.setFilterBitmap(true);
        this.f27833c.setShader(composeShader);
    }

    /* JADX INFO: renamed from: h */
    public final void m44940h(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f27835e = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.f27837g == null) {
            this.f27837g = new Canvas(this.f27835e);
        }
        this.f27837g.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f27837g.save();
        this.f27837g.translate(-this.f27831a, 0.0f);
        super.dispatchDraw(this.f27837g);
        this.f27837g.restore();
        try {
            m44941i(canvas);
        } catch (Exception e) {
            if (!this.f27847q) {
                this.f27847q = true;
                CrashHelper.m82479c(new NullPointerException("[ShimmerLayout] err = " + e.toString()));
            }
        }
        this.f27835e = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m44941i(Canvas canvas) {
        m44939g();
        canvas.save();
        canvas.translate(this.f27831a, 0.0f);
        Rect rect = this.f27832b;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f27832b.height(), this.f27833c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: j */
    public final void m44942j() {
    }

    /* JADX INFO: renamed from: k */
    public final int m44943k(int i) {
        return getContext().getColor(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m44944l(int i, int i2, ValueAnimator valueAnimator) {
        int iIntValue = i + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f27831a = iIntValue;
        if (iIntValue + i2 >= 0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m44945m() {
        if (getVisibility() == 0) {
            getShimmerAnimation().start();
            this.f27839i = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m44946n() {
        if (getVisibility() != 0 || this.f27839i) {
            return;
        }
        getShimmerAnimation().start();
        this.f27839i = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m44947o(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m44950r();
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final void m44948p() {
        this.f27837g = null;
        Bitmap bitmap = this.f27836f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27836f = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m44949q() {
        if (this.f27839i) {
            m44950r();
            m44951s();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m44950r() {
        ValueAnimator valueAnimator = this.f27834d;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f27834d.removeAllUpdateListeners();
        }
        this.f27834d = null;
        this.f27833c = null;
        this.f27839i = false;
        m44948p();
    }

    /* JADX INFO: renamed from: s */
    public void m44951s() {
        if (this.f27839i) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.u4f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f177461a.m44945m();
            }
        }, 800L);
    }

    public void setAnimationReversed(boolean z) {
        this.f27838h = z;
        m44949q();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            gzi0.m133102a("gradientCenterColorWidth value must be higher than %d and less than %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f27845o = f;
            m44949q();
        }
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            gzi0.m133102a("maskWidth value must be higher than %d and less or equal to %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f27844n = f;
            m44949q();
        }
    }

    public void setShimmerAngle(int i) {
        this.f27843m = i;
        m44949q();
    }

    public void setShimmerAnimationDuration(int i) {
        this.f27841k = i;
        m44949q();
    }

    public void setShimmerColor(int i) {
        this.f27842l = i;
        m44949q();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            m44953u();
        } else if (this.f27840j) {
            m44951s();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m44952t() {
        this.f27847q = false;
        if (this.f27839i) {
            return;
        }
        post(new Runnable() { // from class: l.w4f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187407a.m44946n();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m44953u() {
        if (this.f27848r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f27848r);
        }
        m44950r();
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }
}
