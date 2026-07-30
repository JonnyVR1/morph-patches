package com.p051p1.mobile.putong.core.p058ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p151v.VLinear;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class CountDownTopicChatView extends VLinear implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: c */
    public float f37582c;

    /* JADX INFO: renamed from: d */
    public float f37583d;

    /* JADX INFO: renamed from: e */
    public long f37584e;

    /* JADX INFO: renamed from: f */
    public float f37585f;

    /* JADX INFO: renamed from: g */
    public long f37586g;

    /* JADX INFO: renamed from: h */
    public long f37587h;

    /* JADX INFO: renamed from: i */
    public Paint f37588i;

    /* JADX INFO: renamed from: j */
    public Path f37589j;

    /* JADX INFO: renamed from: k */
    public RectF f37590k;

    /* JADX INFO: renamed from: l */
    public boolean f37591l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.CountDownTopicChatView$a */
    public interface InterfaceC9089a {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37585f = 1.0f;
        this.f37591l = false;
        float fM175859d = qa00.m175859d(3.0f);
        this.f37582c = fM175859d;
        this.f37583d = qa00.f156323j - (fM175859d / 2.0f);
        Paint paint = new Paint(1);
        this.f37588i = paint;
        paint.setStrokeWidth(this.f37582c);
        this.f37588i.setColor(1090519039);
        this.f37588i.setStyle(Paint.Style.STROKE);
        this.f37589j = new Path();
        this.f37590k = new RectF();
    }

    /* JADX INFO: renamed from: P */
    public final void m57292P(Canvas canvas) {
        float f = this.f37582c;
        float f2 = f / 2.0f;
        float f3 = f / 2.0f;
        float measuredWidth = getMeasuredWidth() - (this.f37582c / 2.0f);
        float measuredHeight = getMeasuredHeight() - (this.f37582c / 2.0f);
        float measuredWidth2 = (getMeasuredWidth() - (this.f37583d * 2.0f)) - this.f37582c;
        float measuredHeight2 = getMeasuredHeight();
        float f4 = this.f37583d;
        float f5 = (measuredHeight2 - (f4 * 2.0f)) - this.f37582c;
        float f6 = (float) (((double) f4) * 3.141592653589793d * 2.0d);
        float f7 = ((measuredWidth2 * 2.0f) + (f5 * 2.0f) + f6) * this.f37585f;
        this.f37589j.reset();
        this.f37589j.moveTo(this.f37583d + f2, f3);
        Path path = this.f37589j;
        if (f7 <= measuredWidth2) {
            path.lineTo(f2 + this.f37583d + f7, f3);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path.lineTo(measuredWidth - this.f37583d, f3);
        RectF rectF = this.f37590k;
        float f8 = this.f37583d;
        rectF.left = measuredWidth - (f8 * 2.0f);
        rectF.top = f3;
        rectF.right = measuredWidth;
        rectF.bottom = (f8 * 2.0f) + f3;
        float f9 = f6 / 4.0f;
        float f10 = measuredWidth2 + f9;
        Path path2 = this.f37589j;
        if (f7 <= f10) {
            path2.arcTo(rectF, 270.0f, (((f7 - f10) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path2.arcTo(rectF, 270.0f, 90.0f);
        float f11 = f10 + f5;
        Path path3 = this.f37589j;
        if (f7 <= f11) {
            path3.lineTo(measuredWidth, ((measuredHeight - this.f37583d) - f11) + f7);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path3.lineTo(measuredWidth, measuredHeight - this.f37583d);
        RectF rectF2 = this.f37590k;
        float f12 = this.f37583d;
        rectF2.left = measuredWidth - (f12 * 2.0f);
        rectF2.top = measuredHeight - (f12 * 2.0f);
        rectF2.right = measuredWidth;
        rectF2.bottom = measuredHeight;
        float f13 = f11 + f9;
        Path path4 = this.f37589j;
        if (f7 <= f13) {
            path4.arcTo(rectF2, 0.0f, (((f7 - f13) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path4.arcTo(rectF2, 0.0f, 90.0f);
        float f14 = f13 + measuredWidth2;
        Path path5 = this.f37589j;
        if (f7 <= f14) {
            path5.lineTo((f14 - f7) + f2 + this.f37583d, measuredHeight);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path5.lineTo(this.f37583d + f2, measuredHeight);
        float f15 = f14 + f9;
        RectF rectF3 = this.f37590k;
        rectF3.left = f2;
        float f16 = this.f37583d;
        rectF3.top = measuredHeight - (f16 * 2.0f);
        rectF3.right = (f16 * 2.0f) + f2;
        rectF3.bottom = measuredHeight;
        Path path6 = this.f37589j;
        if (f7 <= f15) {
            path6.arcTo(rectF3, 90.0f, (((f7 - f15) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path6.arcTo(rectF3, 90.0f, 90.0f);
        float f17 = f15 + f5;
        Path path7 = this.f37589j;
        if (f7 <= f17) {
            path7.lineTo(f2, ((f3 + this.f37583d) + f17) - f7);
            canvas.drawPath(this.f37589j, this.f37588i);
            return;
        }
        path7.lineTo(f2, this.f37583d + f3);
        float f18 = f17 + f9;
        RectF rectF4 = this.f37590k;
        rectF4.left = f2;
        rectF4.top = f3;
        float f19 = this.f37583d;
        rectF4.right = f2 + (f19 * 2.0f);
        rectF4.bottom = f3 + (f19 * 2.0f);
        Path path8 = this.f37589j;
        if (f7 <= f18) {
            path8.arcTo(rectF4, 180.0f, (((f7 - f18) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f37589j, this.f37588i);
        } else {
            path8.arcTo(rectF4, 180.0f, 90.0f);
            canvas.drawPath(this.f37589j, this.f37588i);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f37585f = ((this.f37587h - (SystemClock.uptimeMillis() - this.f37584e)) * 1.0f) / this.f37586g;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37591l) {
            m57292P(canvas);
        }
    }

    public void setOnProgressChangeListener(InterfaceC9089a interfaceC9089a) {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownTopicChatView(Context context) {
        this(context, null);
    }
}
