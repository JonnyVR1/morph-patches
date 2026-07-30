package com.p000p1.mobile.putong.feed.newui.status.display.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.t100;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VPagerWithDefaultSize extends VPager {
    public VPagerWithDefaultSize(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i2) <= t100.d(404.0f)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * 0.730198f), View.MeasureSpec.getMode(i2)), i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(t100.d(295.0f), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(t100.d(404.0f), View.MeasureSpec.getMode(i2)));
        }
    }

    public VPagerWithDefaultSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
