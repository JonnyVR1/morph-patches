package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import p149l.p9c0;
import p149l.t100;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class LiveIsoscelesTriangleView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f49165a;

    /* JADX INFO: renamed from: b */
    public final Path f49166b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f49167c;

    /* JADX INFO: renamed from: d */
    public int f49168d;

    public LiveIsoscelesTriangleView(Context context) {
        super(context);
        this.f49165a = new Paint();
        this.f49166b = new Path();
        this.f49167c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f49168d = 0;
        m73007a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m73007a(Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147758y);
            this.f49167c = typedArrayObtainStyledAttributes.getColor(p9c0.f147759z, RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f49168d = typedArrayObtainStyledAttributes.getInt(p9c0.f147691A, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f49168d;
        if (i % 90 != 0) {
            this.f49168d = 0;
        } else {
            this.f49168d = i % 360;
        }
        this.f49165a.setAntiAlias(true);
        this.f49165a.setDither(true);
        this.f49165a.setStyle(Paint.Style.FILL);
        this.f49165a.setColor(this.f49167c);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f49166b.reset();
        int i = this.f49168d;
        if (i == 0) {
            float f = width;
            this.f49166b.moveTo(f / 2.0f, 0.0f);
            float f2 = height;
            this.f49166b.lineTo(f, f2);
            this.f49166b.lineTo(0.0f, f2);
        } else if (i == 90) {
            this.f49166b.moveTo(0.0f, 0.0f);
            float f3 = height;
            this.f49166b.lineTo(width, f3 / 2.0f);
            this.f49166b.lineTo(0.0f, f3);
        } else if (i == 180) {
            this.f49166b.moveTo(0.0f, 0.0f);
            float f4 = width;
            this.f49166b.lineTo(f4, 0.0f);
            this.f49166b.lineTo(f4 / 2.0f, height);
        } else if (i == 270) {
            float f5 = height;
            this.f49166b.moveTo(0.0f, f5 / 2.0f);
            float f6 = width;
            this.f49166b.lineTo(f6, f5);
            this.f49166b.lineTo(f6, 0.0f);
        }
        this.f49166b.close();
        canvas.drawPath(this.f49166b, this.f49165a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + t100.f167258g + getPaddingLeft();
        }
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size2 = t100.f167255d + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @MainThread
    public void setColor(@ColorInt int i) {
        this.f49167c = i;
        this.f49165a.setColor(i);
        invalidate();
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49165a = new Paint();
        this.f49166b = new Path();
        this.f49167c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f49168d = 0;
        m73007a(context, attributeSet);
    }

    public LiveIsoscelesTriangleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49165a = new Paint();
        this.f49166b = new Path();
        this.f49167c = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f49168d = 0;
        m73007a(context, attributeSet);
    }
}
