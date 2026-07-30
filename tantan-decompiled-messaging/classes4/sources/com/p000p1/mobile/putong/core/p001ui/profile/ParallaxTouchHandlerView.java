package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ParallaxTouchHandlerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ParallaxView f825a;

    public ParallaxTouchHandlerView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f825a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f825a.m1158P(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(this.f825a.getMeasuredWidth(), this.f825a.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f825a.onTouchEvent(motionEvent);
    }

    public ParallaxTouchHandlerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParallaxTouchHandlerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
