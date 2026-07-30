package com.p000p1.mobile.putong.core.p001ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AutoScaleChildFrameLayout extends FrameLayout {
    public AutoScaleChildFrameLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            int measuredHeight = getMeasuredHeight();
            View childAt = getChildAt(0);
            measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(xdl0.w0(), View.MeasureSpec.getMode(i2)));
            int iMax = Math.max(childAt.getMeasuredHeight(), childAt.getHeight());
            int i3 = measuredHeight - iMax;
            int iD = t100.d(0.0f);
            if (i3 >= iD || iMax <= 0) {
                return;
            }
            childAt.setPivotX(childAt.getMeasuredWidth() / 2);
            childAt.setPivotY(childAt.getMeasuredHeight() / 2);
            float f = 1.0f - ((iD - i3) / iMax);
            if (f <= 0.0f) {
                return;
            }
            childAt.setScaleX(f);
            childAt.setScaleY(f);
        }
    }

    public AutoScaleChildFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoScaleChildFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
