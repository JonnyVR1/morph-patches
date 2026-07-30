package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class ParallaxTouchHandlerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ParallaxView f33003a;

    public ParallaxTouchHandlerView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f33003a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f33003a.m50720P(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(this.f33003a.getMeasuredWidth(), this.f33003a.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f33003a.onTouchEvent(motionEvent);
    }

    public ParallaxTouchHandlerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParallaxTouchHandlerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
