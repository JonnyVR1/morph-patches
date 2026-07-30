package com.p051p1.mobile.putong.live.base.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p153l.cej0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class LiveLoadingView extends View {

    /* JADX INFO: renamed from: h */
    public static final int f45527h = qa00.f156319f;

    /* JADX INFO: renamed from: i */
    public static final int f45528i = qa00.f156320g;

    /* JADX INFO: renamed from: a */
    public LinearGradient f45529a;

    /* JADX INFO: renamed from: b */
    public int f45530b;

    /* JADX INFO: renamed from: c */
    public int f45531c;

    /* JADX INFO: renamed from: d */
    public Path f45532d;

    /* JADX INFO: renamed from: e */
    public Paint f45533e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f45534f;

    /* JADX INFO: renamed from: g */
    public int f45535g;

    public LiveLoadingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m69923c();
    }

    /* JADX INFO: renamed from: b */
    public final void m69922b(Canvas canvas, int i, int i2) {
        int i3 = i - this.f45531c;
        if (i3 > i2) {
            return;
        }
        cej0.m109373a("draw path");
        this.f45532d.reset();
        float f = i;
        this.f45532d.moveTo(f, 0.0f);
        Path path = this.f45532d;
        int i4 = f45527h;
        path.lineTo(i + i4, 0.0f);
        this.f45532d.lineTo((i + i4) - this.f45531c, this.f45530b);
        this.f45532d.lineTo(i3, this.f45530b);
        this.f45532d.lineTo(f, 0.0f);
        canvas.drawPath(this.f45532d, this.f45533e);
        cej0.m109374b();
        m69922b(canvas, i + i4 + f45528i, i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m69923c() {
        Paint paint = new Paint();
        this.f45533e = paint;
        paint.setAntiAlias(true);
        this.f45533e.setStyle(Paint.Style.FILL);
        this.f45532d = new Path();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -(f45527h + f45528i));
        this.f45534f = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.f45534f.setRepeatCount(-1);
        this.f45534f.setDuration(400L);
        this.f45534f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u2t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f177241a.m69926f(valueAnimator);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m69924d(int i) {
        int i2 = (int) (i * 0.8f);
        this.f45530b = i2;
        this.f45531c = (int) (((double) i2) * Math.tan(Math.toRadians(25.0d)));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f45530b, new int[]{-2130706433, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f45529a = linearGradient;
        this.f45533e.setShader(linearGradient);
    }

    /* JADX INFO: renamed from: e */
    public boolean m69925e() {
        ValueAnimator valueAnimator = this.f45534f;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m69926f(ValueAnimator valueAnimator) {
        this.f45535g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m69927g() {
        if (this.f45534f.isRunning()) {
            return;
        }
        this.f45534f.start();
    }

    /* JADX INFO: renamed from: h */
    public void m69928h() {
        if (this.f45534f.isRunning()) {
            this.f45534f.cancel();
        }
        this.f45535g = 0;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m69928h();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.f45529a == null) {
            m69924d(height);
        }
        cej0.m109373a("LiveLoadingView#drawLine");
        m69922b(canvas, this.f45535g, width);
        cej0.m109374b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m69924d(i2);
    }
}
