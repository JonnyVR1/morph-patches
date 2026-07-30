package com.p000p1.mobile.putong.oms.view;

import android.content.Context;
import android.view.View;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OmsViewPager extends VPager {
    public OmsViewPager(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d0 */
    public final int m9600d0(int i, View view) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        return mode == Integer.MIN_VALUE ? Math.min(measuredHeight, size) : measuredHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        View childAt = null;
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            childAt = getChildAt(i4);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), m9600d0(i2, childAt));
    }
}
