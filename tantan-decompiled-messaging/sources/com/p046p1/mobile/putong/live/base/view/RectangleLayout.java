package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
public class RectangleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f44792a;

    /* JADX INFO: renamed from: b */
    public final int f44793b;

    /* JADX INFO: renamed from: c */
    public final int f44794c;

    /* JADX INFO: renamed from: d */
    public final int f44795d;

    /* JADX INFO: renamed from: e */
    public final Path f44796e;

    /* JADX INFO: renamed from: f */
    public final float[] f44797f;

    public RectangleLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44796e = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137738F);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137741I, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137742J, dimensionPixelSize);
        this.f44792a = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137743K, dimensionPixelSize);
        this.f44793b = dimensionPixelSize3;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137739G, dimensionPixelSize);
        this.f44794c = dimensionPixelSize4;
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137740H, dimensionPixelSize);
        this.f44795d = dimensionPixelSize5;
        typedArrayObtainStyledAttributes.recycle();
        this.f44797f = new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize4};
    }

    /* JADX INFO: renamed from: a */
    public final void m68817a(Canvas canvas) {
        this.f44796e.reset();
        this.f44796e.addRoundRect(0.0f, 0.0f, getWidth(), getHeight(), this.f44797f, Path.Direction.CW);
        canvas.clipPath(this.f44796e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f44792a + this.f44793b + this.f44794c + this.f44795d > 0) {
            m68817a(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
