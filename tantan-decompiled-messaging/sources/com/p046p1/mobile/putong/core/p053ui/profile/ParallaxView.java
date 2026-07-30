package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p147v.VLinear;
import p149l.e30;

/* JADX INFO: loaded from: classes4.dex */
public class ParallaxView extends VLinear {

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f33004c;

    public ParallaxView(Context context) {
        super(context);
        this.f33004c = null;
    }

    /* JADX INFO: renamed from: P */
    public boolean m50720P(MotionEvent motionEvent) {
        return onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: Q */
    public void m50721Q(e30<Boolean> e30Var) {
        this.f33004c = e30Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        e30<Boolean> e30Var = this.f33004c;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setScroll(int i) {
        setTranslationY(-i);
        getChildAt(0).setTranslationY(i / 2);
    }

    public ParallaxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33004c = null;
    }

    public ParallaxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33004c = null;
    }
}
