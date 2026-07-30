package com.p000p1.mobile.putong.core.p001ui.growth.fakenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.xdl0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MaxHeightScrollView extends VScroll {
    public MaxHeightScrollView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (xdl0.w0() * 0.55f), 1073741824));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
