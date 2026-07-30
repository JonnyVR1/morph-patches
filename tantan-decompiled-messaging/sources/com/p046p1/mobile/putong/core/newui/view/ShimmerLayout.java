package com.p046p1.mobile.putong.core.newui.view;

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
import p149l.c1c0;
import p149l.dqi0;
import p149l.k9c0;

/* JADX INFO: loaded from: classes11.dex */
public class ShimmerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f26983a;

    /* JADX INFO: renamed from: b */
    public Rect f26984b;

    /* JADX INFO: renamed from: c */
    public Paint f26985c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f26986d;

    /* JADX INFO: renamed from: e */
    public Bitmap f26987e;

    /* JADX INFO: renamed from: f */
    public Bitmap f26988f;

    /* JADX INFO: renamed from: g */
    public Canvas f26989g;

    /* JADX INFO: renamed from: h */
    public boolean f26990h;

    /* JADX INFO: renamed from: i */
    public boolean f26991i;

    /* JADX INFO: renamed from: j */
    public boolean f26992j;

    /* JADX INFO: renamed from: k */
    public int f26993k;

    /* JADX INFO: renamed from: l */
    public int f26994l;

    /* JADX INFO: renamed from: m */
    public int f26995m;

    /* JADX INFO: renamed from: n */
    public float f26996n;

    /* JADX INFO: renamed from: o */
    public float f26997o;

    /* JADX INFO: renamed from: p */
    public boolean f26998p;

    /* JADX INFO: renamed from: q */
    public boolean f26999q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnPreDrawListener f27000r;

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26998p = false;
        this.f26999q = true;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k9c0.f121941I, 0, 0);
        try {
            this.f26995m = typedArrayObtainStyledAttributes.getInteger(k9c0.f121942J, 45);
            this.f26993k = typedArrayObtainStyledAttributes.getInteger(k9c0.f121943K, 3000);
            this.f26994l = typedArrayObtainStyledAttributes.getColor(k9c0.f121945M, m43757k(c1c0.f78258o));
            this.f26992j = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121944L, false);
            this.f26996n = typedArrayObtainStyledAttributes.getFloat(k9c0.f121947O, 0.5f);
            this.f26997o = typedArrayObtainStyledAttributes.getFloat(k9c0.f121946N, 0.1f);
            this.f26990h = typedArrayObtainStyledAttributes.getBoolean(k9c0.f121948P, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f26996n);
            setGradientCenterColorWidth(this.f26997o);
            setShimmerAngle(this.f26995m);
            m43756j();
            if (this.f26992j && getVisibility() == 0) {
                m43765s();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f = this.f26997o;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f26988f == null) {
            this.f26988f = m43752f(this.f26984b.width(), getHeight());
        }
        return this.f26988f;
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f26986d;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f26984b == null) {
            this.f26984b = m43750d();
        }
        int width = getWidth();
        final int i = getWidth() > this.f26984b.width() ? -width : -this.f26984b.width();
        final int iWidth = this.f26984b.width();
        int i2 = width - i;
        ValueAnimator valueAnimatorOfInt = this.f26990h ? ValueAnimator.ofInt(i2, 0) : ValueAnimator.ofInt(0, i2);
        this.f26986d = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f26993k);
        this.f26986d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.owe0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f146046a.m43758l(i, iWidth, valueAnimator2);
            }
        });
        if (this.f26998p) {
            this.f26986d.setRepeatCount(-1);
        }
        return this.f26986d;
    }

    /* JADX INFO: renamed from: d */
    public final Rect m43750d() {
        return new Rect(0, 0, m43751e(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.f26991i || getWidth() <= 0 || ((NullChecker.m81303a(this.f26984b) && this.f26984b.width() <= 0) || getHeight() <= 0)) {
            super.dispatchDraw(canvas);
        } else {
            m43754h(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m43751e() {
        return (int) ((((double) (getWidth() * this.f26996n)) / Math.cos(Math.toRadians(Math.abs(this.f26995m)))) + (((double) getHeight()) * Math.tan(Math.toRadians(Math.abs(this.f26995m)))));
    }

    /* JADX INFO: renamed from: f */
    public final Bitmap m43752f(int i, int i2) {
        if (i > 0 && i2 > 0) {
            try {
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                System.gc();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m43753g() {
        if (this.f26985c != null) {
            return;
        }
        int iM43761o = m43761o(this.f26994l);
        float width = getWidth() * this.f26996n;
        float height = this.f26995m >= 0 ? getHeight() : 0.0f;
        float fCos = ((float) Math.cos(Math.toRadians(this.f26995m))) * width;
        float fSin = height + (((float) Math.sin(Math.toRadians(this.f26995m))) * width);
        int i = this.f26994l;
        float[] gradientColorDistribution = getGradientColorDistribution();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, fCos, fSin, new int[]{iM43761o, i, i, iM43761o}, gradientColorDistribution, tileMode), new BitmapShader(this.f26987e, tileMode, tileMode), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.f26985c = paint;
        paint.setAntiAlias(true);
        this.f26985c.setDither(true);
        this.f26985c.setFilterBitmap(true);
        this.f26985c.setShader(composeShader);
    }

    /* JADX INFO: renamed from: h */
    public final void m43754h(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f26987e = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.f26989g == null) {
            this.f26989g = new Canvas(this.f26987e);
        }
        this.f26989g.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f26989g.save();
        this.f26989g.translate(-this.f26983a, 0.0f);
        super.dispatchDraw(this.f26989g);
        this.f26989g.restore();
        try {
            m43755i(canvas);
        } catch (Exception e) {
            if (!this.f26999q) {
                this.f26999q = true;
                CrashHelper.m81296c(new NullPointerException("[ShimmerLayout] err = " + e.toString()));
            }
        }
        this.f26987e = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m43755i(Canvas canvas) {
        m43753g();
        canvas.save();
        canvas.translate(this.f26983a, 0.0f);
        Rect rect = this.f26984b;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f26984b.height(), this.f26985c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: j */
    public final void m43756j() {
    }

    /* JADX INFO: renamed from: k */
    public final int m43757k(int i) {
        return getContext().getColor(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43758l(int i, int i2, ValueAnimator valueAnimator) {
        int iIntValue = i + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f26983a = iIntValue;
        if (iIntValue + i2 >= 0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m43759m() {
        if (getVisibility() == 0) {
            getShimmerAnimation().start();
            this.f26991i = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m43760n() {
        if (getVisibility() != 0 || this.f26991i) {
            return;
        }
        getShimmerAnimation().start();
        this.f26991i = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m43761o(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m43764r();
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final void m43762p() {
        this.f26989g = null;
        Bitmap bitmap = this.f26988f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f26988f = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m43763q() {
        if (this.f26991i) {
            m43764r();
            m43765s();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43764r() {
        ValueAnimator valueAnimator = this.f26986d;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f26986d.removeAllUpdateListeners();
        }
        this.f26986d = null;
        this.f26985c = null;
        this.f26991i = false;
        m43762p();
    }

    /* JADX INFO: renamed from: s */
    public void m43765s() {
        if (this.f26991i) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.nwe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140943a.m43759m();
            }
        }, 800L);
    }

    public void setAnimationReversed(boolean z) {
        this.f26990h = z;
        m43763q();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            dqi0.m113073a("gradientCenterColorWidth value must be higher than %d and less than %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f26997o = f;
            m43763q();
        }
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            dqi0.m113073a("maskWidth value must be higher than %d and less or equal to %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f26996n = f;
            m43763q();
        }
    }

    public void setShimmerAngle(int i) {
        this.f26995m = i;
        m43763q();
    }

    public void setShimmerAnimationDuration(int i) {
        this.f26993k = i;
        m43763q();
    }

    public void setShimmerColor(int i) {
        this.f26994l = i;
        m43763q();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            m43767u();
        } else if (this.f26992j) {
            m43765s();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m43766t() {
        this.f26999q = false;
        if (this.f26991i) {
            return;
        }
        post(new Runnable() { // from class: l.pwe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151560a.m43760n();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m43767u() {
        if (this.f27000r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f27000r);
        }
        m43764r();
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }
}
