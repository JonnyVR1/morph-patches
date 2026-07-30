package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p153l.dox;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class CoreNegativeMarginLinear extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int[] f34945a;

    public CoreNegativeMarginLinear(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public View m54074a(int i) {
        int[] iArr = this.f34945a;
        return iArr == null ? getChildAt(i) : getChildAt(iArr[i]);
    }

    /* JADX INFO: renamed from: b */
    public int m54075b() {
        if (isInEditMode()) {
            return 2500000;
        }
        return qa00.m175859d(1000000.0f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View viewM54074a = m54074a(i5);
            if (viewM54074a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM54074a.getLayoutParams();
                viewM54074a.layout(0, marginLayoutParams.topMargin + measuredHeight, i3, viewM54074a.getMeasuredHeight() + measuredHeight + marginLayoutParams.topMargin);
                measuredHeight += marginLayoutParams.topMargin + viewM54074a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View viewM54074a = m54074a(i3);
            if (viewM54074a.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM54074a.getLayoutParams();
                if (i3 == getChildCount() - 1 && marginLayoutParams.height == -2) {
                    m54074a(i3).setMinimumHeight(dox.m117366d(i2) - measuredHeight);
                }
                int i4 = marginLayoutParams.height;
                viewM54074a.measure(dox.m117364b(iM117366d), i4 != -2 ? dox.m117364b(dox.m117366d(i4)) : dox.m117363a(m54075b()));
                measuredHeight += marginLayoutParams.topMargin + viewM54074a.getMeasuredHeight() + marginLayoutParams.bottomMargin;
            }
        }
        setMeasuredDimension(iM117366d, measuredHeight);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreNegativeMarginLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
