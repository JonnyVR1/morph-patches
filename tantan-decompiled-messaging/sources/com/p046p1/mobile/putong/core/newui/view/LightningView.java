package com.p046p1.mobile.putong.core.newui.view;

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
import p147v.VText;
import p149l.bt0;

/* JADX INFO: loaded from: classes11.dex */
public class LightningView extends VText {

    /* JADX INFO: renamed from: i */
    public Shader f26915i;

    /* JADX INFO: renamed from: j */
    public Matrix f26916j;

    /* JADX INFO: renamed from: k */
    public Paint f26917k;

    /* JADX INFO: renamed from: l */
    public int f26918l;

    /* JADX INFO: renamed from: m */
    public int f26919m;

    /* JADX INFO: renamed from: n */
    public float f26920n;

    /* JADX INFO: renamed from: o */
    public float f26921o;

    /* JADX INFO: renamed from: p */
    public boolean f26922p;

    /* JADX INFO: renamed from: q */
    public Rect f26923q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f26924r;

    /* JADX INFO: renamed from: s */
    public boolean f26925s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LightningView$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8247a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8247a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LightningView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LightningView.this.f26922p = true;
            if (LightningView.this.f26924r != null) {
                LightningView.this.f26924r.start();
            }
        }
    }

    public LightningView(Context context) {
        super(context);
        this.f26918l = 0;
        this.f26919m = 0;
        this.f26920n = 0.0f;
        this.f26921o = 0.0f;
        this.f26922p = false;
        this.f26925s = false;
        m43713r();
    }

    /* JADX INFO: renamed from: r */
    private void m43713r() {
        this.f26923q = new Rect();
        this.f26917k = new Paint();
        m43714s();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f26922p || this.f26916j == null) {
            return;
        }
        canvas.drawRect(this.f26923q, this.f26917k);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26923q.set(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f26918l == 0) {
            this.f26918l = getWidth();
            this.f26919m = getHeight();
            if (this.f26918l > 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f26918l / 2.0f, this.f26919m, new int[]{872415231, -1, 872415231}, new float[]{0.2f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                this.f26915i = linearGradient;
                this.f26917k.setShader(linearGradient);
                this.f26917k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.f26916j = matrix;
                matrix.setTranslate(this.f26918l * (-2), this.f26919m);
                this.f26915i.setLocalMatrix(this.f26916j);
                this.f26923q.set(0, 0, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m43714s() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26924r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(3000L);
        this.f26924r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rcr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f158812a.m43715t(valueAnimator);
            }
        });
        bt0.m103733f(this.f26924r, new Runnable() { // from class: l.scr
            @Override // java.lang.Runnable
            public final void run() {
                this.f163764a.m43716u();
            }
        });
        if (this.f26925s) {
            this.f26924r.setRepeatCount(-1);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8247a());
        }
    }

    public void setAutoRun(boolean z) {
        this.f26925s = z;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m43715t(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.f26918l;
        float f = ((i * 4) * fFloatValue) - (i * 2);
        this.f26920n = f;
        float f2 = this.f26919m * fFloatValue;
        this.f26921o = f2;
        Matrix matrix = this.f26916j;
        if (matrix != null) {
            matrix.setTranslate(f, f2);
        }
        Shader shader = this.f26915i;
        if (shader != null) {
            shader.setLocalMatrix(this.f26916j);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m43716u() {
        this.f26922p = false;
    }

    /* JADX INFO: renamed from: w */
    public void m43717w() {
        ValueAnimator valueAnimator;
        if (this.f26922p || (valueAnimator = this.f26924r) == null) {
            return;
        }
        this.f26922p = true;
        valueAnimator.start();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26918l = 0;
        this.f26919m = 0;
        this.f26920n = 0.0f;
        this.f26921o = 0.0f;
        this.f26922p = false;
        this.f26925s = false;
        m43713r();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26918l = 0;
        this.f26919m = 0;
        this.f26920n = 0.0f;
        this.f26921o = 0.0f;
        this.f26922p = false;
        this.f26925s = false;
        m43713r();
    }
}
