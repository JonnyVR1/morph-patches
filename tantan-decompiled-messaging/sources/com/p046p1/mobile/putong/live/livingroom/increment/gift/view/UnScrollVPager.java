package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class UnScrollVPager extends VPager {
    public UnScrollVPager(Context context) {
        super(context);
    }

    @Override // p147v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public UnScrollVPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
