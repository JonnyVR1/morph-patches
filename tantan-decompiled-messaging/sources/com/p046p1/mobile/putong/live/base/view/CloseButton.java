package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.n9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class CloseButton extends View {

    /* JADX INFO: renamed from: a */
    public int f44636a;

    /* JADX INFO: renamed from: b */
    public int f44637b;

    /* JADX INFO: renamed from: c */
    public float f44638c;

    /* JADX INFO: renamed from: d */
    public Paint f44639d;

    public CloseButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137769i);
        this.f44636a = typedArrayObtainStyledAttributes.getColor(n9c0.f137770j, -7829368);
        this.f44637b = typedArrayObtainStyledAttributes.getColor(n9c0.f137771k, -1);
        this.f44638c = typedArrayObtainStyledAttributes.getDimension(n9c0.f137772l, t100.f167254c);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f44639d = paint;
        paint.setAntiAlias(true);
        this.f44639d.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i = width >> 1;
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i2 = height >> 1;
        int iMin = Math.min(i, i2);
        float f = this.f44638c / 2.0f;
        canvas.translate(getWidth() >> 1, getHeight() >> 1);
        this.f44639d.setColor(this.f44636a);
        canvas.drawCircle(0.0f, 0.0f, iMin, this.f44639d);
        this.f44639d.setColor(this.f44637b);
        canvas.rotate(45.0f);
        float f2 = (-i) >> 1;
        float f3 = -f;
        canvas.drawRoundRect(f2, f3, width >> 2, f, f, f, this.f44639d);
        canvas.drawRoundRect(f3, (-i2) >> 1, f, height >> 2, f, f, this.f44639d);
    }

    public CloseButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseButton(Context context) {
        this(context, null);
    }
}
