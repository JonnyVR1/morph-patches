package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchPicViewPager extends ViewPager {
    public MatchPicViewPager(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = (int) (View.MeasureSpec.getSize(i) / 0.56f);
        if (size2 > size) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(i2)));
        }
    }

    public MatchPicViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
