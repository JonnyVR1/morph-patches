package com.p046p1.mobile.putong.live.base.view;

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
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
public class CircularProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f44621a;

    /* JADX INFO: renamed from: b */
    public Paint f44622b;

    /* JADX INFO: renamed from: c */
    public RectF f44623c;

    /* JADX INFO: renamed from: d */
    public int[] f44624d;

    /* JADX INFO: renamed from: e */
    public float f44625e;

    public CircularProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137759a);
        Paint paint = new Paint();
        this.f44621a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f44621a;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f44621a.setAntiAlias(true);
        this.f44621a.setDither(true);
        this.f44621a.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(n9c0.f137763c, 5.0f));
        this.f44621a.setColor(typedArrayObtainStyledAttributes.getColor(n9c0.f137761b, -3355444));
        Paint paint3 = new Paint();
        this.f44622b = paint3;
        paint3.setStyle(style);
        this.f44622b.setStrokeCap(cap);
        this.f44622b.setAntiAlias(true);
        this.f44622b.setDither(true);
        this.f44622b.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(n9c0.f137767g, 10.0f));
        this.f44622b.setColor(typedArrayObtainStyledAttributes.getColor(n9c0.f137764d, -16776961));
        int color = typedArrayObtainStyledAttributes.getColor(n9c0.f137766f, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(n9c0.f137765e, -1);
        if (color == -1 || color2 == -1) {
            this.f44624d = null;
        } else {
            this.f44624d = new int[]{color, color2};
        }
        this.f44625e = typedArrayObtainStyledAttributes.getInteger(n9c0.f137768h, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f44623c, 0.0f, 360.0f, false, this.f44621a);
        canvas.drawArc(this.f44623c, 95.0f, (this.f44625e * 360.0f) / 100.0f, false, this.f44622b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int strokeWidth = (int) ((measuredWidth > measuredHeight ? measuredHeight : measuredWidth) - (this.f44621a.getStrokeWidth() > this.f44622b.getStrokeWidth() ? this.f44621a.getStrokeWidth() : this.f44622b.getStrokeWidth()));
        int paddingLeft = getPaddingLeft() + ((measuredWidth - strokeWidth) / 2);
        int paddingTop = getPaddingTop() + ((measuredHeight - strokeWidth) / 2);
        this.f44623c = new RectF(paddingLeft, paddingTop, paddingLeft + strokeWidth, paddingTop + strokeWidth);
        int[] iArr = this.f44624d;
        if (iArr == null || iArr.length <= 1) {
            return;
        }
        this.f44622b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredWidth(), this.f44624d, (float[]) null, Shader.TileMode.MIRROR));
    }

    public void setProgress(float f) {
        this.f44625e = f;
        invalidate();
    }

    public CircularProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularProgressView(Context context) {
        this(context, null);
    }
}
