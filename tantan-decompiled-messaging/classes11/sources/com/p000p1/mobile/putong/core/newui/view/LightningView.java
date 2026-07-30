package com.p000p1.mobile.putong.core.newui.view;

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
import l.bt0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LightningView extends VText {

    /* JADX INFO: renamed from: i */
    public Shader f5693i;

    /* JADX INFO: renamed from: j */
    public Matrix f5694j;

    /* JADX INFO: renamed from: k */
    public Paint f5695k;

    /* JADX INFO: renamed from: l */
    public int f5696l;

    /* JADX INFO: renamed from: m */
    public int f5697m;

    /* JADX INFO: renamed from: n */
    public float f5698n;

    /* JADX INFO: renamed from: o */
    public float f5699o;

    /* JADX INFO: renamed from: p */
    public boolean f5700p;

    /* JADX INFO: renamed from: q */
    public Rect f5701q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f5702r;

    /* JADX INFO: renamed from: s */
    public boolean f5703s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LightningView$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0411a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0411a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LightningView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            LightningView.this.f5700p = true;
            if (LightningView.this.f5702r != null) {
                LightningView.this.f5702r.start();
            }
        }
    }

    public LightningView(Context context) {
        super(context);
        this.f5696l = 0;
        this.f5697m = 0;
        this.f5698n = 0.0f;
        this.f5699o = 0.0f;
        this.f5700p = false;
        this.f5703s = false;
        m7977r();
    }

    /* JADX INFO: renamed from: r */
    private void m7977r() {
        this.f5701q = new Rect();
        this.f5695k = new Paint();
        m7978s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (!this.f5700p || this.f5694j == null) {
            return;
        }
        canvas.drawRect(this.f5701q, this.f5695k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        this.f5701q.set(0, 0, getWidth(), getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (this.f5696l == 0) {
            this.f5696l = getWidth();
            this.f5697m = getHeight();
            if (this.f5696l > 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f5696l / 2.0f, this.f5697m, new int[]{872415231, -1, 872415231}, new float[]{0.2f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                this.f5693i = linearGradient;
                this.f5695k.setShader(linearGradient);
                this.f5695k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                Matrix matrix = new Matrix();
                this.f5694j = matrix;
                matrix.setTranslate(this.f5696l * (-2), this.f5697m);
                this.f5693i.setLocalMatrix(this.f5694j);
                this.f5701q.set(0, 0, i, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final void m7978s() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5702r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(3000L);
        this.f5702r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rcr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f19739a.m7979t(valueAnimator);
            }
        });
        bt0.f(this.f5702r, new Runnable() { // from class: l.scr
            @Override // java.lang.Runnable
            public final void run() {
                this.f20171a.m7980u();
            }
        });
        if (this.f5703s) {
            this.f5702r.setRepeatCount(-1);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0411a());
        }
    }

    public void setAutoRun(boolean z) {
        this.f5703s = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7979t(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.f5696l;
        float f = ((i * 4) * fFloatValue) - (i * 2);
        this.f5698n = f;
        float f2 = this.f5697m * fFloatValue;
        this.f5699o = f2;
        Matrix matrix = this.f5694j;
        if (matrix != null) {
            matrix.setTranslate(f, f2);
        }
        Shader shader = this.f5693i;
        if (shader != null) {
            shader.setLocalMatrix(this.f5694j);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7980u() {
        this.f5700p = false;
    }

    /* JADX INFO: renamed from: w */
    public void m7981w() {
        ValueAnimator valueAnimator;
        if (this.f5700p || (valueAnimator = this.f5702r) == null) {
            return;
        }
        this.f5700p = true;
        valueAnimator.start();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5696l = 0;
        this.f5697m = 0;
        this.f5698n = 0.0f;
        this.f5699o = 0.0f;
        this.f5700p = false;
        this.f5703s = false;
        m7977r();
    }

    public LightningView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5696l = 0;
        this.f5697m = 0;
        this.f5698n = 0.0f;
        this.f5699o = 0.0f;
        this.f5700p = false;
        this.f5703s = false;
        m7977r();
    }
}
