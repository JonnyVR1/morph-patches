package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class FixedScrollView extends ScrollView {

    /* JADX INFO: renamed from: a */
    public float f51045a;

    /* JADX INFO: renamed from: b */
    public float f51046b;

    public FixedScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f51045a = x;
            this.f51046b = y;
        } else if (action == 2) {
            return Math.abs(y - this.f51046b) > Math.abs(x - this.f51045a);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public FixedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
