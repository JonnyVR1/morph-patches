package com.p051p1.mobile.putong.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import p153l.azk0;

/* JADX INFO: loaded from: classes9.dex */
public class TTFullScreenAutoFitSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: a */
    public final String f18018a;

    /* JADX INFO: renamed from: b */
    public float f18019b;

    public TTFullScreenAutoFitSurfaceView(Context context) {
        super(context);
        this.f18018a = getClass().getSimpleName();
        this.f18019b = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m30883a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            azk0.m101074a("Size cannot be negative!!");
            return;
        }
        this.f18019b = i / i2;
        getHolder().setFixedSize(i, i2);
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = this.f18019b;
        if (f == 0.0f) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size <= size2) {
            f = 1.0f / f;
        }
        float f2 = size;
        float f3 = size2 * f;
        if (f2 < f3) {
            size = Math.round(f3);
        } else {
            size2 = Math.round(f2 / f);
        }
        setMeasuredDimension(size, size2);
    }

    public TTFullScreenAutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18018a = getClass().getSimpleName();
        this.f18019b = 0.0f;
    }

    public TTFullScreenAutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18018a = getClass().getSimpleName();
        this.f18019b = 0.0f;
    }
}
