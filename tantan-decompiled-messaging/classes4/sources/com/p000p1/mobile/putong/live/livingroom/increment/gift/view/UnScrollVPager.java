package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UnScrollVPager extends VPager {
    public UnScrollVPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public UnScrollVPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
