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
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes12.dex */
public class LoadingFrontAnimatorView extends View {

    /* JADX INFO: renamed from: a */
    public float f58418a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f58419b;

    /* JADX INFO: renamed from: c */
    public Point f58420c;

    /* JADX INFO: renamed from: d */
    public int f58421d;

    /* JADX INFO: renamed from: e */
    public int f58422e;

    /* JADX INFO: renamed from: f */
    public int f58423f;

    /* JADX INFO: renamed from: g */
    public int f58424g;

    /* JADX INFO: renamed from: h */
    public Paint f58425h;

    /* JADX INFO: renamed from: i */
    public RectF f58426i;

    /* JADX INFO: renamed from: j */
    public Paint f58427j;

    /* JADX INFO: renamed from: k */
    public Path f58428k;

    /* JADX INFO: renamed from: l */
    public boolean f58429l;

    public LoadingFrontAnimatorView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58418a = 0.0f;
        this.f58429l = false;
        m83608a();
    }

    /* JADX INFO: renamed from: a */
    public final void m83608a() {
        this.f58420c = new Point();
        this.f58421d = getResources().getColor(C14032R.color.txy_animation_start_color);
        this.f58423f = getResources().getColor(C14032R.color.txy_animation_mid_color);
        this.f58422e = getResources().getColor(C14032R.color.txy_animation_end_color);
        Paint paint = new Paint(1);
        this.f58425h = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f58425h.setColor(this.f58423f);
        Paint paint2 = this.f58425h;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f58425h.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
        this.f58428k = new Path();
        this.f58427j = new Paint(1);
        int color = getResources().getColor(C14032R.color.txy_circle_color);
        this.f58424g = color;
        this.f58427j.setColor(color);
        this.f58427j.setStyle(style);
        this.f58427j.setStrokeWidth(CommonUtils.dpToPx(this, 3.5f));
    }

    /* JADX INFO: renamed from: b */
    public void m83609b() {
        this.f58429l = true;
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f58419b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xtv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f196245a.m83605a(valueAnimator);
            }
        });
        this.f58419b.setDuration(2000L);
        this.f58419b.setRepeatMode(1);
        this.f58419b.setRepeatCount(-1);
        this.f58419b.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f58429l) {
            canvas.drawPath(this.f58428k, this.f58427j);
            return;
        }
        canvas.save();
        float f = this.f58418a * 360.0f;
        Point point = this.f58420c;
        canvas.rotate(f, point.x, point.y);
        int i = 0;
        while (i <= 360) {
            this.f58425h.setColor(i < 270 ? m83607a(i / 270.0f, this.f58421d, this.f58423f) : m83607a((i - 270) / 90.0f, this.f58423f, this.f58422e));
            canvas.drawArc(this.f58426i, i, 1.0f, false, this.f58425h);
            i++;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Point point = this.f58420c;
        int i3 = size >> 1;
        point.x = i3;
        int i4 = size2 >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        setMeasuredDimension(size, size2);
        int iDpToPx = i3 - CommonUtils.dpToPx(this, 1.9f);
        Point point2 = this.f58420c;
        int i5 = point2.x;
        int i6 = point2.y;
        this.f58426i = new RectF(i5 - iDpToPx, i6 - iDpToPx, i5 + iDpToPx, i6 + iDpToPx);
        this.f58428k.reset();
        Path path = this.f58428k;
        Point point3 = this.f58420c;
        path.addCircle(point3.x, point3.y, iDpToPx, Path.Direction.CCW);
    }

    public LoadingFrontAnimatorView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public int m83607a(float f, int i, int i2) {
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
    public /* synthetic */ void m83605a(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            return;
        }
        this.f58418a = fFloatValue;
        invalidate();
    }
}
