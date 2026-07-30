package com.p046p1.mobile.putong.core.p053ui.growth.fakenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VScroll;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class MaxHeightScrollView extends VScroll {
    public MaxHeightScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (xdl0.m208408w0() * 0.55f), 1073741824));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
