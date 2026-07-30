package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class CloseButton extends View {

    /* JADX INFO: renamed from: a */
    public int f45484a;

    /* JADX INFO: renamed from: b */
    public int f45485b;

    /* JADX INFO: renamed from: c */
    public float f45486c;

    /* JADX INFO: renamed from: d */
    public Paint f45487d;

    public CloseButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174327i);
        this.f45484a = typedArrayObtainStyledAttributes.getColor(thc0.f174328j, -7829368);
        this.f45485b = typedArrayObtainStyledAttributes.getColor(thc0.f174329k, -1);
        this.f45486c = typedArrayObtainStyledAttributes.getDimension(thc0.f174330l, qa00.f156316c);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f45487d = paint;
        paint.setAntiAlias(true);
        this.f45487d.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i = width >> 1;
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i2 = height >> 1;
        int iMin = Math.min(i, i2);
        float f = this.f45486c / 2.0f;
        canvas.translate(getWidth() >> 1, getHeight() >> 1);
        this.f45487d.setColor(this.f45484a);
        canvas.drawCircle(0.0f, 0.0f, iMin, this.f45487d);
        this.f45487d.setColor(this.f45485b);
        canvas.rotate(45.0f);
        float f2 = (-i) >> 1;
        float f3 = -f;
        canvas.drawRoundRect(f2, f3, width >> 2, f, f, f, this.f45487d);
        canvas.drawRoundRect(f3, (-i2) >> 1, f, height >> 2, f, f, this.f45487d);
    }

    public CloseButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseButton(Context context) {
        this(context, null);
    }
}
