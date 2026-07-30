package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import l.t100;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveIsoscelesTriangleView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f5207a;

    /* JADX INFO: renamed from: b */
    public final Path f5208b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f5209c;

    /* JADX INFO: renamed from: d */
    public int f5210d;

    public LiveIsoscelesTriangleView(Context context) {
        super(context);
        this.f5207a = new Paint();
        this.f5208b = new Path();
        this.f5209c = -16777216;
        this.f5210d = 0;
        m6530a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6530a(Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17155y);
            this.f5209c = typedArrayObtainStyledAttributes.getColor(p9c0.f17156z, -16777216);
            this.f5210d = typedArrayObtainStyledAttributes.getInt(p9c0.f17088A, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f5210d;
        if (i % 90 != 0) {
            this.f5210d = 0;
        } else {
            this.f5210d = i % 360;
        }
        this.f5207a.setAntiAlias(true);
        this.f5207a.setDither(true);
        this.f5207a.setStyle(Paint.Style.FILL);
        this.f5207a.setColor(this.f5209c);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f5208b.reset();
        int i = this.f5210d;
        if (i == 0) {
            float f = width;
            this.f5208b.moveTo(f / 2.0f, 0.0f);
            float f2 = height;
            this.f5208b.lineTo(f, f2);
            this.f5208b.lineTo(0.0f, f2);
        } else if (i == 90) {
            this.f5208b.moveTo(0.0f, 0.0f);
            float f3 = height;
            this.f5208b.lineTo(width, f3 / 2.0f);
            this.f5208b.lineTo(0.0f, f3);
        } else if (i == 180) {
            this.f5208b.moveTo(0.0f, 0.0f);
            float f4 = width;
            this.f5208b.lineTo(f4, 0.0f);
            this.f5208b.lineTo(f4 / 2.0f, height);
        } else if (i == 270) {
            float f5 = height;
            this.f5208b.moveTo(0.0f, f5 / 2.0f);
            float f6 = width;
            this.f5208b.lineTo(f6, f5);
            this.f5208b.lineTo(f6, 0.0f);
        }
        this.f5208b.close();
        canvas.drawPath(this.f5208b, this.f5207a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + t100.g + getPaddingLeft();
        }
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size2 = t100.d + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @MainThread
    public void setColor(@ColorInt int i) {
        this.f5209c = i;
        this.f5207a.setColor(i);
        invalidate();
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5207a = new Paint();
        this.f5208b = new Path();
        this.f5209c = -16777216;
        this.f5210d = 0;
        m6530a(context, attributeSet);
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5207a = new Paint();
        this.f5208b = new Path();
        this.f5209c = -16777216;
        this.f5210d = 0;
        m6530a(context, attributeSet);
    }
}
