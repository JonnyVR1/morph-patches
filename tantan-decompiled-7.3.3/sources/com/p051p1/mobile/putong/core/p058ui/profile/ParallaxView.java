package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p151v.VLinear;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ParallaxView extends VLinear {

    /* JADX INFO: renamed from: c */
    public y20<Boolean> f33852c;

    public ParallaxView(Context context) {
        super(context);
        this.f33852c = null;
    }

    /* JADX INFO: renamed from: P */
    public boolean m51903P(MotionEvent motionEvent) {
        return onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: Q */
    public void m51904Q(y20<Boolean> y20Var) {
        this.f33852c = y20Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        y20<Boolean> y20Var = this.f33852c;
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setScroll(int i) {
        setTranslationY(-i);
        getChildAt(0).setTranslationY(i / 2);
    }

    public ParallaxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33852c = null;
    }

    public ParallaxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33852c = null;
    }
}
