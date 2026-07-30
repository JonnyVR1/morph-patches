package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CoreNegativeMarginLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f1919a;

    public CoreNegativeMarginLinear(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m3444a(int i) {
        int[] iArr = this.f1919a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: b */
    public int m3445b() {
        if (isInEditMode()) {
            return 2500000;
        }
        return t100.d(1000000.0f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM3444a = m3444a(i5);
            if (viewM3444a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM3444a.getLayoutParams();
                viewM3444a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM3444a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM3444a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM3444a = m3444a(i3);
            if (viewM3444a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM3444a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m3444a(i3).setMinimumHeight(ffx.d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM3444a.measure(ffx.b(iD), i4 != -2 ? ffx.b(ffx.d(i4)) : ffx.a(m3445b()));
                measuredHeight += marginLayoutParams.topMargin + viewM3444a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iD, measuredHeight);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
