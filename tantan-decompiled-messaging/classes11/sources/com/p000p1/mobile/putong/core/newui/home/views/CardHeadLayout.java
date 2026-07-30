package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import l.t100;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardHeadLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public int f2372c;

    public CardHeadLayout(Context context) {
        super(context);
        this.f2372c = t100.d(12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        View view = null;
        int measuredHeight = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getTag() instanceof String) && TextUtils.equals((String) childAt.getTag(), "image_container")) {
                view = childAt;
            } else {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() == 0) {
                    measureChild(childAt2, i, i2);
                    measuredHeight += childAt2.getMeasuredHeight();
                }
            }
        }
        if (view != null) {
            measureChild(view, i, View.MeasureSpec.makeMeasureSpec(Math.min((size - this.f2372c) - measuredHeight, (int) (((double) size2) / 0.67d)) + t100.d(4.0f), View.MeasureSpec.getMode(1073741824)));
            setMeasuredDimension(size2, view.getMeasuredHeight() + measuredHeight);
        }
    }

    public void setNextInfoExposureSize(int i) {
        this.f2372c = t100.d(i);
    }

    public CardHeadLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2372c = t100.d(12.0f);
    }

    public CardHeadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2372c = t100.d(12.0f);
    }
}
