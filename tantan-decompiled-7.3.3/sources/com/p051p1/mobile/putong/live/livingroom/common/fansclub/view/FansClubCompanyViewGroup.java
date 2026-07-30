package com.p051p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubCompanyViewGroup extends ViewGroup {
    public FansClubCompanyViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int marginStart = measuredWidth + marginLayoutParams.getMarginStart();
            childAt.layout(marginStart, 0, childAt.getMeasuredWidth() + marginStart, childAt.getMeasuredHeight());
            measuredWidth = marginStart + childAt.getMeasuredWidth() + marginLayoutParams.getMarginEnd();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int marginStart = size;
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getChildAt(i3).getLayoutParams();
            marginStart -= marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        int i4 = marginStart / childCount;
        int i5 = (int) (((double) i4) / 0.492d);
        for (int i6 = 0; i6 < childCount; i6++) {
            measureChild(getChildAt(i6), View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        setMeasuredDimension(size, i5);
    }

    public FansClubCompanyViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubCompanyViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
