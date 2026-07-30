package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class CoreNegativeMarginLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f34097a;

    public CoreNegativeMarginLinear(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m52891a(int i) {
        int[] iArr = this.f34097a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: b */
    public int m52892b() {
        if (isInEditMode()) {
            return 2500000;
        }
        return t100.m186890d(1000000.0f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM52891a = m52891a(i5);
            if (viewM52891a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM52891a.getLayoutParams();
                viewM52891a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM52891a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM52891a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM52891a = m52891a(i3);
            if (viewM52891a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM52891a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m52891a(i3).setMinimumHeight(ffx.m121201d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM52891a.measure(ffx.m121199b(iM121201d), i4 != -2 ? ffx.m121199b(ffx.m121201d(i4)) : ffx.m121198a(m52892b()));
                measuredHeight += marginLayoutParams.topMargin + viewM52891a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iM121201d, measuredHeight);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
