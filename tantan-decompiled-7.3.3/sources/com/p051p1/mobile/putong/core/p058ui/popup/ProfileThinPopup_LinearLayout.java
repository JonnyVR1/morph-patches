package com.p051p1.mobile.putong.core.p058ui.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileThinPopup_LinearLayout extends LinearLayout {
    public ProfileThinPopup_LinearLayout(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() != 1) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        View childAt = getChildAt(0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        setMeasuredDimension(childAt.getMeasuredWidth(), size);
    }

    public ProfileThinPopup_LinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileThinPopup_LinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
