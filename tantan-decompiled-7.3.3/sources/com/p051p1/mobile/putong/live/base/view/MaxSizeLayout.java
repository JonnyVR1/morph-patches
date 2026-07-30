package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class MaxSizeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f45636a;

    /* JADX INFO: renamed from: b */
    public int f45637b;

    public MaxSizeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174291A);
        this.f45636a = (int) typedArrayObtainStyledAttributes.getDimension(thc0.f174292B, -1.0f);
        this.f45637b = (int) typedArrayObtainStyledAttributes.getDimension(thc0.f174292B, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m69998a(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f45636a != -1) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f45636a;
            if (size > i3) {
                i = m69998a(i3);
            }
        }
        if (this.f45637b != -1) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.f45637b;
            if (size2 > i4) {
                i2 = m69998a(i4);
            }
        }
        super.onMeasure(i, i2);
    }
}
