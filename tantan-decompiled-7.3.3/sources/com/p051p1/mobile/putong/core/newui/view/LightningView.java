package com.p051p1.mobile.putong.core.newui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.gt0;

/* JADX INFO: loaded from: classes11.dex */
public class LightningView extends VText {

    /* JADX INFO: renamed from: i */
    public Shader f27763i;

    /* JADX INFO: renamed from: j */
    public Matrix f27764j;

    /* JADX INFO: renamed from: k */
    public Paint f27765k;

    /* JADX INFO: renamed from: l */
    public int f27766l;

    /* JADX INFO: renamed from: m */
    public int f27767m;

    /* JADX INFO: renamed from: n */
    public float f27768n;

    /* JADX INFO: renamed from: o */
    public float f27769o;

    /* JADX INFO: renamed from: p */
    public boolean f27770p;

    /* JADX INFO: renamed from: q */
    public Rect f27771q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f27772r;

    /* JADX INFO: renamed from: s */
    public boolean f27773s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LightningView$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8410a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8410a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LightningView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LightningView.this.f27770p = true;
            if (LightningView.this.f27772r != null) {
                LightningView.this.f27772r.start();
            }
        }
    }

    public LightningView(Context context) {
        super(context);
        this.f27766l = 0;
        this.f27767m = 0;
        this.f27768n = 0.0f;
        this.f27769o = 0.0f;
        this.f27770p = false;
        this.f27773s = false;
        m44899r();
    }

    /* JADX INFO: renamed from: r */
    private void m44899r() {
        this.f27771q = new Rect();
        this.f27765k = new Paint();
        m44900s();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f27770p || this.f27764j == null) {
            return;
        }
        canvas.drawRect(this.f27771q, this.f27765k);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27771q.set(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f27766l == 0) {
            this.f27766l = getWidth();
            this.f27767m = getHeight();
            if (this.f27766l > 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f27766l / 2.0f, this.f27767m, new int[]{872415231, -1, 872415231}, new float[]{0.2f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                this.f27763i = linearGradient;
                this.f27765k.setShader(linearGradient);
                this.f27765k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.f27764j = matrix;
                matrix.setTranslate(this.f27766l * (-2), this.f27767m);
                this.f27763i.setLocalMatrix(this.f27764j);
                this.f27771q.set(0, 0, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m44900s() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f27772r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(3000L);
        this.f27772r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ser
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f167640a.m44901t(valueAnimator);
            }
        });
        gt0.m132160f(this.f27772r, new Runnable() { // from class: l.ter
            @Override // java.lang.Runnable
            public final void run() {
                this.f173892a.m44902u();
            }
        });
        if (this.f27773s) {
            this.f27772r.setRepeatCount(-1);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8410a());
        }
    }

    public void setAutoRun(boolean z) {
        this.f27773s = z;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m44901t(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.f27766l;
        float f = ((i * 4) * fFloatValue) - (i * 2);
        this.f27768n = f;
        float f2 = this.f27767m * fFloatValue;
        this.f27769o = f2;
        Matrix matrix = this.f27764j;
        if (matrix != null) {
            matrix.setTranslate(f, f2);
        }
        Shader shader = this.f27763i;
        if (shader != null) {
            shader.setLocalMatrix(this.f27764j);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m44902u() {
        this.f27770p = false;
    }

    /* JADX INFO: renamed from: w */
    public void m44903w() {
        ValueAnimator valueAnimator;
        if (this.f27770p || (valueAnimator = this.f27772r) == null) {
            return;
        }
        this.f27770p = true;
        valueAnimator.start();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27766l = 0;
        this.f27767m = 0;
        this.f27768n = 0.0f;
        this.f27769o = 0.0f;
        this.f27770p = false;
        this.f27773s = false;
        m44899r();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27766l = 0;
        this.f27767m = 0;
        this.f27768n = 0.0f;
        this.f27769o = 0.0f;
        this.f27770p = false;
        this.f27773s = false;
        m44899r();
    }
}
