package com.p046p1.mobile.putong.core.p053ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p147v.VLinear;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class CountDownTopicChatView extends VLinear implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: c */
    public float f36734c;

    /* JADX INFO: renamed from: d */
    public float f36735d;

    /* JADX INFO: renamed from: e */
    public long f36736e;

    /* JADX INFO: renamed from: f */
    public float f36737f;

    /* JADX INFO: renamed from: g */
    public long f36738g;

    /* JADX INFO: renamed from: h */
    public long f36739h;

    /* JADX INFO: renamed from: i */
    public Paint f36740i;

    /* JADX INFO: renamed from: j */
    public Path f36741j;

    /* JADX INFO: renamed from: k */
    public RectF f36742k;

    /* JADX INFO: renamed from: l */
    public boolean f36743l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.CountDownTopicChatView$a */
    public interface InterfaceC8926a {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36737f = 1.0f;
        this.f36743l = false;
        float fM186890d = t100.m186890d(3.0f);
        this.f36734c = fM186890d;
        this.f36735d = t100.f167261j - (fM186890d / 2.0f);
        Paint paint = new Paint(1);
        this.f36740i = paint;
        paint.setStrokeWidth(this.f36734c);
        this.f36740i.setColor(1090519039);
        this.f36740i.setStyle(Paint.Style.STROKE);
        this.f36741j = new Path();
        this.f36742k = new RectF();
    }

    /* JADX INFO: renamed from: P */
    public final void m56109P(Canvas canvas) {
        float f = this.f36734c;
        float f2 = f / 2.0f;
        float f3 = f / 2.0f;
        float measuredWidth = getMeasuredWidth() - (this.f36734c / 2.0f);
        float measuredHeight = getMeasuredHeight() - (this.f36734c / 2.0f);
        float measuredWidth2 = (getMeasuredWidth() - (this.f36735d * 2.0f)) - this.f36734c;
        float measuredHeight2 = getMeasuredHeight();
        float f4 = this.f36735d;
        float f5 = (measuredHeight2 - (f4 * 2.0f)) - this.f36734c;
        float f6 = (float) (((double) f4) * 3.141592653589793d * 2.0d);
        float f7 = ((measuredWidth2 * 2.0f) + (f5 * 2.0f) + f6) * this.f36737f;
        this.f36741j.reset();
        this.f36741j.moveTo(this.f36735d + f2, f3);
        Path path = this.f36741j;
        if (f7 <= measuredWidth2) {
            path.lineTo(f2 + this.f36735d + f7, f3);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path.lineTo(measuredWidth - this.f36735d, f3);
        RectF rectF = this.f36742k;
        float f8 = this.f36735d;
        rectF.left = measuredWidth - (f8 * 2.0f);
        rectF.top = f3;
        rectF.right = measuredWidth;
        rectF.bottom = (f8 * 2.0f) + f3;
        float f9 = f6 / 4.0f;
        float f10 = measuredWidth2 + f9;
        Path path2 = this.f36741j;
        if (f7 <= f10) {
            path2.arcTo(rectF, 270.0f, (((f7 - f10) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path2.arcTo(rectF, 270.0f, 90.0f);
        float f11 = f10 + f5;
        Path path3 = this.f36741j;
        if (f7 <= f11) {
            path3.lineTo(measuredWidth, ((measuredHeight - this.f36735d) - f11) + f7);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path3.lineTo(measuredWidth, measuredHeight - this.f36735d);
        RectF rectF2 = this.f36742k;
        float f12 = this.f36735d;
        rectF2.left = measuredWidth - (f12 * 2.0f);
        rectF2.top = measuredHeight - (f12 * 2.0f);
        rectF2.right = measuredWidth;
        rectF2.bottom = measuredHeight;
        float f13 = f11 + f9;
        Path path4 = this.f36741j;
        if (f7 <= f13) {
            path4.arcTo(rectF2, 0.0f, (((f7 - f13) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path4.arcTo(rectF2, 0.0f, 90.0f);
        float f14 = f13 + measuredWidth2;
        Path path5 = this.f36741j;
        if (f7 <= f14) {
            path5.lineTo((f14 - f7) + f2 + this.f36735d, measuredHeight);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path5.lineTo(this.f36735d + f2, measuredHeight);
        float f15 = f14 + f9;
        RectF rectF3 = this.f36742k;
        rectF3.left = f2;
        float f16 = this.f36735d;
        rectF3.top = measuredHeight - (f16 * 2.0f);
        rectF3.right = (f16 * 2.0f) + f2;
        rectF3.bottom = measuredHeight;
        Path path6 = this.f36741j;
        if (f7 <= f15) {
            path6.arcTo(rectF3, 90.0f, (((f7 - f15) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path6.arcTo(rectF3, 90.0f, 90.0f);
        float f17 = f15 + f5;
        Path path7 = this.f36741j;
        if (f7 <= f17) {
            path7.lineTo(f2, ((f3 + this.f36735d) + f17) - f7);
            canvas.drawPath(this.f36741j, this.f36740i);
            return;
        }
        path7.lineTo(f2, this.f36735d + f3);
        float f18 = f17 + f9;
        RectF rectF4 = this.f36742k;
        rectF4.left = f2;
        rectF4.top = f3;
        float f19 = this.f36735d;
        rectF4.right = f2 + (f19 * 2.0f);
        rectF4.bottom = f3 + (f19 * 2.0f);
        Path path8 = this.f36741j;
        if (f7 <= f18) {
            path8.arcTo(rectF4, 180.0f, (((f7 - f18) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f36741j, this.f36740i);
        } else {
            path8.arcTo(rectF4, 180.0f, 90.0f);
            canvas.drawPath(this.f36741j, this.f36740i);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f36737f = ((this.f36739h - (SystemClock.uptimeMillis() - this.f36736e)) * 1.0f) / this.f36738g;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f36743l) {
            m56109P(canvas);
        }
    }

    public void setOnProgressChangeListener(InterfaceC8926a interfaceC8926a) {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownTopicChatView(Context context) {
        this(context, null);
    }
}
