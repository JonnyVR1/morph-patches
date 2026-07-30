package com.p051p1.mobile.putong.feed.newui.status.display.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VPager;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class VPagerWithDefaultSize extends VPager {
    public VPagerWithDefaultSize(Context context) {
        super(context);
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i2) <= qa00.m175859d(404.0f)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * 0.730198f), View.MeasureSpec.getMode(i2)), i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(qa00.m175859d(295.0f), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(404.0f), View.MeasureSpec.getMode(i2)));
        }
    }

    public VPagerWithDefaultSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
