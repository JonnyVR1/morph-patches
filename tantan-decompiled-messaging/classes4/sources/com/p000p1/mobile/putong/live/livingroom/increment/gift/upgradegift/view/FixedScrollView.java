package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FixedScrollView extends ScrollView {

    /* JADX INFO: renamed from: a */
    public float f6239a;

    /* JADX INFO: renamed from: b */
    public float f6240b;

    public FixedScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6239a = x;
            this.f6240b = y;
        } else if (action == 2) {
            return Math.abs(y - this.f6240b) > Math.abs(x - this.f6239a);
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
