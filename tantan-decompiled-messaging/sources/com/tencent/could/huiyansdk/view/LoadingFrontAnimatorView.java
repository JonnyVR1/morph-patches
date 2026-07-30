package com.tencent.could.huiyansdk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes2.dex */
public class LoadingFrontAnimatorView extends View {

    /* JADX INFO: renamed from: a */
    public float f57570a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f57571b;

    /* JADX INFO: renamed from: c */
    public Point f57572c;

    /* JADX INFO: renamed from: d */
    public int f57573d;

    /* JADX INFO: renamed from: e */
    public int f57574e;

    /* JADX INFO: renamed from: f */
    public int f57575f;

    /* JADX INFO: renamed from: g */
    public int f57576g;

    /* JADX INFO: renamed from: h */
    public Paint f57577h;

    /* JADX INFO: renamed from: i */
    public RectF f57578i;

    /* JADX INFO: renamed from: j */
    public Paint f57579j;

    /* JADX INFO: renamed from: k */
    public Path f57580k;

    /* JADX INFO: renamed from: l */
    public boolean f57581l;

    public LoadingFrontAnimatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57570a = 0.0f;
        this.f57581l = false;
        m82425a();
    }

    /* JADX INFO: renamed from: a */
    public final void m82425a() {
        this.f57572c = new Point();
        this.f57573d = getResources().getColor(C13869R.color.txy_animation_start_color);
        this.f57575f = getResources().getColor(C13869R.color.txy_animation_mid_color);
        this.f57574e = getResources().getColor(C13869R.color.txy_animation_end_color);
        Paint paint = new Paint(1);
        this.f57577h = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f57577h.setColor(this.f57575f);
        Paint paint2 = this.f57577h;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f57577h.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
        this.f57580k = new Path();
        this.f57579j = new Paint(1);
        int color = getResources().getColor(C13869R.color.txy_circle_color);
        this.f57576g = color;
        this.f57579j.setColor(color);
        this.f57579j.setStyle(style);
        this.f57579j.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
    }

    /* JADX INFO: renamed from: b */
    public void m82426b() {
        this.f57581l = true;
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f57571b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wrv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f187836a.m82422a(valueAnimator);
            }
        });
        this.f57571b.setDuration(2000L);
        this.f57571b.setRepeatMode(1);
        this.f57571b.setRepeatCount(-1);
        this.f57571b.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f57581l) {
            canvas.drawPath(this.f57580k, this.f57579j);
            return;
        }
        canvas.save();
        float f = this.f57570a * 360.0f;
        Point point = this.f57572c;
        canvas.rotate(f, point.x, point.y);
        int i = 0;
        while (i <= 360) {
            this.f57577h.setColor(i < 270 ? m82424a(i / 270.0f, this.f57573d, this.f57575f) : m82424a((i - 270) / 90.0f, this.f57575f, this.f57574e));
            canvas.drawArc(this.f57578i, i, 1.0f, false, this.f57577h);
            i++;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Point point = this.f57572c;
        int i3 = size >> 1;
        point.x = i3;
        int i4 = size2 >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        setMeasuredDimension(size, size2);
        int iDpToPx = i3 - CommonUtils.dpToPx(this, 1.9f);
        Point point2 = this.f57572c;
        int i5 = point2.x;
        int i6 = point2.y;
        this.f57578i = new RectF(i5 - iDpToPx, i6 - iDpToPx, i5 + iDpToPx, i6 + iDpToPx);
        this.f57580k.reset();
        Path path = this.f57580k;
        Point point3 = this.f57572c;
        path.addCircle(point3.x, point3.y, iDpToPx, Path.Direction.CCW);
    }

    public LoadingFrontAnimatorView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public int m82424a(float f, int i, int i2) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iBlue = Color.blue(i);
        int iGreen = Color.green(i);
        return Color.argb((int) (iAlpha + ((Color.alpha(i2) - iAlpha) * f)), (int) (iRed + ((Color.red(i2) - iRed) * f)), (int) (iGreen + (f * (Color.green(i2) - iGreen))), (int) (iBlue + ((Color.blue(i2) - iBlue) * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m82422a(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        this.f57570a = fFloatValue;
        invalidate();
    }
}
