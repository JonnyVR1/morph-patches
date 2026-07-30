package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes9.dex */
public class IntlAlphaTransformerViewPager extends ViewPager {
    public IntlAlphaTransformerViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public IntlAlphaTransformerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
