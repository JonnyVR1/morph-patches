package com.p000p1.mobile.putong.core.p004ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import l.t100;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CountDownTopicChatView extends VLinear implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: c */
    public float f6515c;

    /* JADX INFO: renamed from: d */
    public float f6516d;

    /* JADX INFO: renamed from: e */
    public long f6517e;

    /* JADX INFO: renamed from: f */
    public float f6518f;

    /* JADX INFO: renamed from: g */
    public long f6519g;

    /* JADX INFO: renamed from: h */
    public long f6520h;

    /* JADX INFO: renamed from: i */
    public Paint f6521i;

    /* JADX INFO: renamed from: j */
    public Path f6522j;

    /* JADX INFO: renamed from: k */
    public RectF f6523k;

    /* JADX INFO: renamed from: l */
    public boolean f6524l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.CountDownTopicChatView$a */
    public interface InterfaceC0362a {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6518f = 1.0f;
        this.f6524l = false;
        float fD = t100.d(3.0f);
        this.f6515c = fD;
        this.f6516d = t100.j - (fD / 2.0f);
        Paint paint = new Paint(1);
        this.f6521i = paint;
        paint.setStrokeWidth(this.f6515c);
        this.f6521i.setColor(1090519039);
        this.f6521i.setStyle(Paint.Style.STROKE);
        this.f6522j = new Path();
        this.f6523k = new RectF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final void m9534P(Canvas canvas) {
        float f = this.f6515c;
        float f2 = f / 2.0f;
        float f3 = f / 2.0f;
        float measuredWidth = getMeasuredWidth() - (this.f6515c / 2.0f);
        float measuredHeight = getMeasuredHeight() - (this.f6515c / 2.0f);
        float measuredWidth2 = (getMeasuredWidth() - (this.f6516d * 2.0f)) - this.f6515c;
        float measuredHeight2 = getMeasuredHeight();
        float f4 = this.f6516d;
        float f5 = (measuredHeight2 - (f4 * 2.0f)) - this.f6515c;
        float f6 = (float) (((double) f4) * 3.141592653589793d * 2.0d);
        float f7 = ((measuredWidth2 * 2.0f) + (f5 * 2.0f) + f6) * this.f6518f;
        this.f6522j.reset();
        this.f6522j.moveTo(this.f6516d + f2, f3);
        Path path = this.f6522j;
        if (f7 <= measuredWidth2) {
            path.lineTo(f2 + this.f6516d + f7, f3);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path.lineTo(measuredWidth - this.f6516d, f3);
        RectF rectF = this.f6523k;
        float f8 = this.f6516d;
        rectF.left = measuredWidth - (f8 * 2.0f);
        rectF.top = f3;
        rectF.right = measuredWidth;
        rectF.bottom = (f8 * 2.0f) + f3;
        float f9 = f6 / 4.0f;
        float f10 = measuredWidth2 + f9;
        Path path2 = this.f6522j;
        if (f7 <= f10) {
            path2.arcTo(rectF, 270.0f, (((f7 - f10) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path2.arcTo(rectF, 270.0f, 90.0f);
        float f11 = f10 + f5;
        Path path3 = this.f6522j;
        if (f7 <= f11) {
            path3.lineTo(measuredWidth, ((measuredHeight - this.f6516d) - f11) + f7);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path3.lineTo(measuredWidth, measuredHeight - this.f6516d);
        RectF rectF2 = this.f6523k;
        float f12 = this.f6516d;
        rectF2.left = measuredWidth - (f12 * 2.0f);
        rectF2.top = measuredHeight - (f12 * 2.0f);
        rectF2.right = measuredWidth;
        rectF2.bottom = measuredHeight;
        float f13 = f11 + f9;
        Path path4 = this.f6522j;
        if (f7 <= f13) {
            path4.arcTo(rectF2, 0.0f, (((f7 - f13) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path4.arcTo(rectF2, 0.0f, 90.0f);
        float f14 = f13 + measuredWidth2;
        Path path5 = this.f6522j;
        if (f7 <= f14) {
            path5.lineTo((f14 - f7) + f2 + this.f6516d, measuredHeight);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path5.lineTo(this.f6516d + f2, measuredHeight);
        float f15 = f14 + f9;
        RectF rectF3 = this.f6523k;
        rectF3.left = f2;
        float f16 = this.f6516d;
        rectF3.top = measuredHeight - (f16 * 2.0f);
        rectF3.right = (f16 * 2.0f) + f2;
        rectF3.bottom = measuredHeight;
        Path path6 = this.f6522j;
        if (f7 <= f15) {
            path6.arcTo(rectF3, 90.0f, (((f7 - f15) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path6.arcTo(rectF3, 90.0f, 90.0f);
        float f17 = f15 + f5;
        Path path7 = this.f6522j;
        if (f7 <= f17) {
            path7.lineTo(f2, ((f3 + this.f6516d) + f17) - f7);
            canvas.drawPath(this.f6522j, this.f6521i);
            return;
        }
        path7.lineTo(f2, this.f6516d + f3);
        float f18 = f17 + f9;
        RectF rectF4 = this.f6523k;
        rectF4.left = f2;
        rectF4.top = f3;
        float f19 = this.f6516d;
        rectF4.right = f2 + (f19 * 2.0f);
        rectF4.bottom = f3 + (f19 * 2.0f);
        Path path8 = this.f6522j;
        if (f7 <= f18) {
            path8.arcTo(rectF4, 180.0f, (((f7 - f18) + f9) / f6) * 360.0f);
            canvas.drawPath(this.f6522j, this.f6521i);
        } else {
            path8.arcTo(rectF4, 180.0f, 90.0f);
            canvas.drawPath(this.f6522j, this.f6521i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6518f = ((this.f6520h - (SystemClock.uptimeMillis() - this.f6517e)) * 1.0f) / this.f6519g;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.f6524l) {
            m9534P(canvas);
        }
    }

    public void setOnProgressChangeListener(InterfaceC0362a interfaceC0362a) {
    }

    public CountDownTopicChatView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownTopicChatView(Context context) {
        this(context, null);
    }
}
