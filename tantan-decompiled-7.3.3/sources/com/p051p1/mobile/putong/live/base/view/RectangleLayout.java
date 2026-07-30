package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class RectangleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f45640a;

    /* JADX INFO: renamed from: b */
    public final int f45641b;

    /* JADX INFO: renamed from: c */
    public final int f45642c;

    /* JADX INFO: renamed from: d */
    public final int f45643d;

    /* JADX INFO: renamed from: e */
    public final Path f45644e;

    /* JADX INFO: renamed from: f */
    public final float[] f45645f;

    public RectangleLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45644e = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174296F);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174299I, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174300J, dimensionPixelSize);
        this.f45640a = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174301K, dimensionPixelSize);
        this.f45641b = dimensionPixelSize3;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174297G, dimensionPixelSize);
        this.f45642c = dimensionPixelSize4;
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174298H, dimensionPixelSize);
        this.f45643d = dimensionPixelSize5;
        typedArrayObtainStyledAttributes.recycle();
        this.f45645f = new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize4};
    }

    /* JADX INFO: renamed from: a */
    public final void m70000a(Canvas canvas) {
        this.f45644e.reset();
        this.f45644e.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.f45645f, Path.Direction.CW);
        canvas.clipPath(this.f45644e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f45640a + this.f45641b + this.f45642c + this.f45643d > 0) {
            m70000a(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
