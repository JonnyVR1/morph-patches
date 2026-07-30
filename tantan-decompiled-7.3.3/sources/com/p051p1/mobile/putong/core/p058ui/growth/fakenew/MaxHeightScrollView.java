package com.p051p1.mobile.putong.core.p058ui.growth.fakenew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VScroll;
import p153l.bnl0;

/* JADX INFO: loaded from: classes3.dex */
public class MaxHeightScrollView extends VScroll {
    public MaxHeightScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (bnl0.m105588w0() * 0.55f), 1073741824));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
