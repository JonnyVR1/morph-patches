package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class MatchMaxHeightScrollView extends ScrollView {
    public MatchMaxHeightScrollView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.m186890d(68.0f), Integer.MIN_VALUE));
    }

    public MatchMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchMaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
