package com.p000p1.mobile.putong.core.newui.view;

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
import l.dqi0;
import p009l.c1c0;
import p009l.k9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShimmerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f5761a;

    /* JADX INFO: renamed from: b */
    public Rect f5762b;

    /* JADX INFO: renamed from: c */
    public Paint f5763c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f5764d;

    /* JADX INFO: renamed from: e */
    public Bitmap f5765e;

    /* JADX INFO: renamed from: f */
    public Bitmap f5766f;

    /* JADX INFO: renamed from: g */
    public Canvas f5767g;

    /* JADX INFO: renamed from: h */
    public boolean f5768h;

    /* JADX INFO: renamed from: i */
    public boolean f5769i;

    /* JADX INFO: renamed from: j */
    public boolean f5770j;

    /* JADX INFO: renamed from: k */
    public int f5771k;

    /* JADX INFO: renamed from: l */
    public int f5772l;

    /* JADX INFO: renamed from: m */
    public int f5773m;

    /* JADX INFO: renamed from: n */
    public float f5774n;

    /* JADX INFO: renamed from: o */
    public float f5775o;

    /* JADX INFO: renamed from: p */
    public boolean f5776p;

    /* JADX INFO: renamed from: q */
    public boolean f5777q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnPreDrawListener f5778r;

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5776p = false;
        this.f5777q = true;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k9c0.f15496I, 0, 0);
        try {
            this.f5773m = typedArrayObtainStyledAttributes.getInteger(k9c0.f15497J, 45);
            this.f5771k = typedArrayObtainStyledAttributes.getInteger(k9c0.f15498K, 3000);
            this.f5772l = typedArrayObtainStyledAttributes.getColor(k9c0.f15500M, m8021k(c1c0.f10411o));
            this.f5770j = typedArrayObtainStyledAttributes.getBoolean(k9c0.f15499L, false);
            this.f5774n = typedArrayObtainStyledAttributes.getFloat(k9c0.f15502O, 0.5f);
            this.f5775o = typedArrayObtainStyledAttributes.getFloat(k9c0.f15501N, 0.1f);
            this.f5768h = typedArrayObtainStyledAttributes.getBoolean(k9c0.f15503P, false);
            typedArrayObtainStyledAttributes.recycle();
            setMaskWidth(this.f5774n);
            setGradientCenterColorWidth(this.f5775o);
            setShimmerAngle(this.f5773m);
            m8020j();
            if (this.f5770j && getVisibility() == 0) {
                m8029s();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private float[] getGradientColorDistribution() {
        float[] fArr = {0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
        float f = this.f5775o;
        return fArr;
    }

    private Bitmap getMaskBitmap() {
        if (this.f5766f == null) {
            this.f5766f = m8016f(this.f5762b.width(), getHeight());
        }
        return this.f5766f;
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f5764d;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.f5762b == null) {
            this.f5762b = m8014d();
        }
        int width = getWidth();
        final int i = getWidth() > this.f5762b.width() ? -width : -this.f5762b.width();
        final int iWidth = this.f5762b.width();
        int i2 = width - i;
        ValueAnimator valueAnimatorOfInt = this.f5768h ? ValueAnimator.ofInt(i2, 0) : ValueAnimator.ofInt(0, i2);
        this.f5764d = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.f5771k);
        this.f5764d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.owe0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f18262a.m8022l(i, iWidth, valueAnimator2);
            }
        });
        if (this.f5776p) {
            this.f5764d.setRepeatCount(-1);
        }
        return this.f5764d;
    }

    /* JADX INFO: renamed from: d */
    public final Rect m8014d() {
        return new Rect(0, 0, m8015e(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.f5769i || getWidth() <= 0 || ((NullChecker.a(this.f5762b) && this.f5762b.width() <= 0) || getHeight() <= 0)) {
            super.dispatchDraw(canvas);
        } else {
            m8018h(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m8015e() {
        return (int) ((((double) (getWidth() * this.f5774n)) / Math.cos(Math.toRadians(Math.abs(this.f5773m)))) + (((double) getHeight()) * Math.tan(Math.toRadians(Math.abs(this.f5773m)))));
    }

    /* JADX INFO: renamed from: f */
    public final Bitmap m8016f(int i, int i2) {
        if (i > 0 && i2 > 0) {
            try {
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
            } catch (Exception e) {
                CrashHelper.c(e);
                System.gc();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m8017g() {
        if (this.f5763c != null) {
            return;
        }
        int iM8025o = m8025o(this.f5772l);
        float width = getWidth() * this.f5774n;
        float height = this.f5773m >= 0 ? getHeight() : 0.0f;
        float fCos = ((float) Math.cos(Math.toRadians(this.f5773m))) * width;
        float fSin = height + (((float) Math.sin(Math.toRadians(this.f5773m))) * width);
        int i = this.f5772l;
        float[] gradientColorDistribution = getGradientColorDistribution();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, fCos, fSin, new int[]{iM8025o, i, i, iM8025o}, gradientColorDistribution, tileMode), new BitmapShader(this.f5765e, tileMode, tileMode), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.f5763c = paint;
        paint.setAntiAlias(true);
        this.f5763c.setDither(true);
        this.f5763c.setFilterBitmap(true);
        this.f5763c.setShader(composeShader);
    }

    /* JADX INFO: renamed from: h */
    public final void m8018h(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.f5765e = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.f5767g == null) {
            this.f5767g = new Canvas(this.f5765e);
        }
        this.f5767g.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f5767g.save();
        this.f5767g.translate(-this.f5761a, 0.0f);
        super.dispatchDraw(this.f5767g);
        this.f5767g.restore();
        try {
            m8019i(canvas);
        } catch (Exception e) {
            if (!this.f5777q) {
                this.f5777q = true;
                CrashHelper.c(new NullPointerException("[ShimmerLayout] err = " + e.toString()));
            }
        }
        this.f5765e = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m8019i(Canvas canvas) {
        m8017g();
        canvas.save();
        canvas.translate(this.f5761a, 0.0f);
        Rect rect = this.f5762b;
        canvas.drawRect(rect.left, 0.0f, rect.width(), this.f5762b.height(), this.f5763c);
        canvas.restore();
    }

    /* JADX INFO: renamed from: j */
    public final void m8020j() {
    }

    /* JADX INFO: renamed from: k */
    public final int m8021k(int i) {
        return getContext().getColor(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8022l(int i, int i2, ValueAnimator valueAnimator) {
        int iIntValue = i + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f5761a = iIntValue;
        if (iIntValue + i2 >= 0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8023m() {
        if (getVisibility() == 0) {
            getShimmerAnimation().start();
            this.f5769i = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m8024n() {
        if (getVisibility() != 0 || this.f5769i) {
            return;
        }
        getShimmerAnimation().start();
        this.f5769i = true;
    }

    /* JADX INFO: renamed from: o */
    public final int m8025o(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m8028r();
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final void m8026p() {
        this.f5767g = null;
        Bitmap bitmap = this.f5766f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f5766f = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8027q() {
        if (this.f5769i) {
            m8028r();
            m8029s();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8028r() {
        ValueAnimator valueAnimator = this.f5764d;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f5764d.removeAllUpdateListeners();
        }
        this.f5764d = null;
        this.f5763c = null;
        this.f5769i = false;
        m8026p();
    }

    /* JADX INFO: renamed from: s */
    public void m8029s() {
        if (this.f5769i) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.nwe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17751a.m8023m();
            }
        }, 800L);
    }

    public void setAnimationReversed(boolean z) {
        this.f5768h = z;
        m8027q();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            dqi0.a("gradientCenterColorWidth value must be higher than %d and less than %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f5775o = f;
            m8027q();
        }
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            dqi0.a("maskWidth value must be higher than %d and less or equal to %d", new Object[]{(byte) 0, (byte) 1});
        } else {
            this.f5774n = f;
            m8027q();
        }
    }

    public void setShimmerAngle(int i) {
        this.f5773m = i;
        m8027q();
    }

    public void setShimmerAnimationDuration(int i) {
        this.f5771k = i;
        m8027q();
    }

    public void setShimmerColor(int i) {
        this.f5772l = i;
        m8027q();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            m8031u();
        } else if (this.f5770j) {
            m8029s();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m8030t() {
        this.f5777q = false;
        if (this.f5769i) {
            return;
        }
        post(new Runnable() { // from class: l.pwe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18937a.m8024n();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m8031u() {
        if (this.f5778r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5778r);
        }
        m8028r();
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }
}
