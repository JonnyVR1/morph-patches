package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class CircularProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f45469a;

    /* JADX INFO: renamed from: b */
    public Paint f45470b;

    /* JADX INFO: renamed from: c */
    public RectF f45471c;

    /* JADX INFO: renamed from: d */
    public int[] f45472d;

    /* JADX INFO: renamed from: e */
    public float f45473e;

    public CircularProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174317a);
        Paint paint = new Paint();
        this.f45469a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f45469a;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f45469a.setAntiAlias(true);
        this.f45469a.setDither(true);
        this.f45469a.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(thc0.f174321c, 5.0f));
        this.f45469a.setColor(typedArrayObtainStyledAttributes.getColor(thc0.f174319b, -3355444));
        Paint paint3 = new Paint();
        this.f45470b = paint3;
        paint3.setStyle(style);
        this.f45470b.setStrokeCap(cap);
        this.f45470b.setAntiAlias(true);
        this.f45470b.setDither(true);
        this.f45470b.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(thc0.f174325g, 10.0f));
        this.f45470b.setColor(typedArrayObtainStyledAttributes.getColor(thc0.f174322d, -16776961));
        int color = typedArrayObtainStyledAttributes.getColor(thc0.f174324f, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(thc0.f174323e, -1);
        if (color == -1 || color2 == -1) {
            this.f45472d = null;
        } else {
            this.f45472d = new int[]{color, color2};
        }
        this.f45473e = typedArrayObtainStyledAttributes.getInteger(thc0.f174326h, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f45471c, 0.0f, 360.0f, false, this.f45469a);
        canvas.drawArc(this.f45471c, 95.0f, (this.f45473e * 360.0f) / 100.0f, false, this.f45470b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int strokeWidth = (int) ((measuredWidth > measuredHeight ? measuredHeight : measuredWidth) - (this.f45469a.getStrokeWidth() > this.f45470b.getStrokeWidth() ? this.f45469a.getStrokeWidth() : this.f45470b.getStrokeWidth()));
        int paddingLeft = getPaddingLeft() + ((measuredWidth - strokeWidth) / 2);
        int paddingTop = getPaddingTop() + ((measuredHeight - strokeWidth) / 2);
        this.f45471c = new RectF(paddingLeft, paddingTop, paddingLeft + strokeWidth, paddingTop + strokeWidth);
        int[] iArr = this.f45472d;
        if (iArr == null || iArr.length <= 1) {
            return;
        }
        this.f45470b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredWidth(), this.f45472d, (float[]) null, Shader.TileMode.MIRROR));
    }

    public void setProgress(float f) {
        this.f45473e = f;
        invalidate();
    }

    public CircularProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularProgressView(Context context) {
        this(context, null);
    }
}
