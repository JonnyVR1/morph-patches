package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class BottomScareViewGroup extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f49341a;

    public BottomScareViewGroup(Context context) {
        super(context);
        this.f49341a = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.f49341a), 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            measureChildWithMargins(getChildAt(i3), i, 0, iMakeMeasureSpec, 0);
        }
        setMeasuredDimension(i, iMakeMeasureSpec);
    }

    public BottomScareViewGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49341a = 1.0f;
    }

    public BottomScareViewGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49341a = 1.0f;
    }
}
