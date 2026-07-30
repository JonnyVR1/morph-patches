package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import p153l.qa00;
import p153l.vhc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class LiveIsoscelesTriangleView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f50013a;

    /* JADX INFO: renamed from: b */
    public final Path f50014b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f50015c;

    /* JADX INFO: renamed from: d */
    public int f50016d;

    public LiveIsoscelesTriangleView(Context context) {
        super(context);
        this.f50013a = new Paint();
        this.f50014b = new Path();
        this.f50015c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f50016d = 0;
        m74190a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m74190a(Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184157y);
            this.f50015c = typedArrayObtainStyledAttributes.getColor(vhc0.f184158z, RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f50016d = typedArrayObtainStyledAttributes.getInt(vhc0.f184090A, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f50016d;
        if (i % 90 != 0) {
            this.f50016d = 0;
        } else {
            this.f50016d = i % 360;
        }
        this.f50013a.setAntiAlias(true);
        this.f50013a.setDither(true);
        this.f50013a.setStyle(Paint.Style.FILL);
        this.f50013a.setColor(this.f50015c);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f50014b.reset();
        int i = this.f50016d;
        if (i == 0) {
            float f = width;
            this.f50014b.moveTo(f / 2.0f, 0.0f);
            float f2 = height;
            this.f50014b.lineTo(f, f2);
            this.f50014b.lineTo(0.0f, f2);
        } else if (i == 90) {
            this.f50014b.moveTo(0.0f, 0.0f);
            float f3 = height;
            this.f50014b.lineTo(width, f3 / 2.0f);
            this.f50014b.lineTo(0.0f, f3);
        } else if (i == 180) {
            this.f50014b.moveTo(0.0f, 0.0f);
            float f4 = width;
            this.f50014b.lineTo(f4, 0.0f);
            this.f50014b.lineTo(f4 / 2.0f, height);
        } else if (i == 270) {
            float f5 = height;
            this.f50014b.moveTo(0.0f, f5 / 2.0f);
            float f6 = width;
            this.f50014b.lineTo(f6, f5);
            this.f50014b.lineTo(f6, 0.0f);
        }
        this.f50014b.close();
        canvas.drawPath(this.f50014b, this.f50013a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + qa00.f156320g + getPaddingLeft();
        }
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size2 = qa00.f156317d + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @MainThread
    public void setColor(@ColorInt int i) {
        this.f50015c = i;
        this.f50013a.setColor(i);
        invalidate();
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50013a = new Paint();
        this.f50014b = new Path();
        this.f50015c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f50016d = 0;
        m74190a(context, attributeSet);
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50013a = new Paint();
        this.f50014b = new Path();
        this.f50015c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f50016d = 0;
        m74190a(context, attributeSet);
    }
}
