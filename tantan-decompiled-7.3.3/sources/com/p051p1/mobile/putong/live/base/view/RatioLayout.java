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
public class RatioLayout extends FrameLayout {
    private static final int BASE_WIDTH = 0;
    private static final int DEFAULT_BASE = 0;
    private int mBase;
    private float mRatio;

    public RatioLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174293C);
        this.mBase = typedArrayObtainStyledAttributes.getInt(thc0.f174294D, 0);
        this.mRatio = typedArrayObtainStyledAttributes.getFloat(thc0.f174295E, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m69999a(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.mBase;
        float f = this.mRatio;
        if (i3 == 0) {
            i2 = m69999a((int) Math.ceil(size / f));
        } else {
            i = m69999a((int) Math.ceil(size2 * f));
        }
        super.onMeasure(i, i2);
    }

    public void setRatio(float f) {
        this.mRatio = f;
    }

    public RatioLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioLayout(@NonNull Context context) {
        this(context, null);
    }
}
