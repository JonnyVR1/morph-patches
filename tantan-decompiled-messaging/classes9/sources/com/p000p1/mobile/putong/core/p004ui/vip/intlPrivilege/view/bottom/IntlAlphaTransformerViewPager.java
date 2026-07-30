package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlAlphaTransformerViewPager extends ViewPager {
    public IntlAlphaTransformerViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public IntlAlphaTransformerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
