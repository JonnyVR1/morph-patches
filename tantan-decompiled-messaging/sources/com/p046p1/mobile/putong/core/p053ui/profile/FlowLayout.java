package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f32943a;

    public FlowLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iM186890d = t100.m186890d(10.0f);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f32943a;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += measuredWidth + iM186890d;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int iM186890d = t100.m186890d(10.0f);
        int iMax = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + iM186890d);
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += iMax;
                }
                paddingLeft += measuredWidth + iM186890d;
            }
        }
        this.f32943a = iMax;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size2 = paddingTop + iMax;
        } else if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = paddingTop + iMax) < size2) {
            size2 = i3;
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
