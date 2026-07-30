package com.p046p1.mobile.putong.feed.newui.status.display.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VPager;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class VPagerWithDefaultSize extends VPager {
    public VPagerWithDefaultSize(Context context) {
        super(context);
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i2) <= t100.m186890d(404.0f)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * 0.730198f), View.MeasureSpec.getMode(i2)), i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(t100.m186890d(295.0f), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(t100.m186890d(404.0f), View.MeasureSpec.getMode(i2)));
        }
    }

    public VPagerWithDefaultSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
