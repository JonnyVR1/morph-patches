package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
public class MaxSizeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f44788a;

    /* JADX INFO: renamed from: b */
    public int f44789b;

    public MaxSizeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137733A);
        this.f44788a = (int) typedArrayObtainStyledAttributes.getDimension(n9c0.f137734B, -1.0f);
        this.f44789b = (int) typedArrayObtainStyledAttributes.getDimension(n9c0.f137734B, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m68815a(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f44788a != -1) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f44788a;
            if (size > i3) {
                i = m68815a(i3);
            }
        }
        if (this.f44789b != -1) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.f44789b;
            if (size2 > i4) {
                i2 = m68815a(i4);
            }
        }
        super.onMeasure(i, i2);
    }
}
