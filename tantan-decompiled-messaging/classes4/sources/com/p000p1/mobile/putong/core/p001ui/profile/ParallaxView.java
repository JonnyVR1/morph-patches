package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import l.e30;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ParallaxView extends VLinear {

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f826c;

    public ParallaxView(Context context) {
        super(context);
        this.f826c = null;
    }

    /* JADX INFO: renamed from: P */
    public boolean m1158P(MotionEvent motionEvent) {
        return onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: Q */
    public void m1159Q(e30<Boolean> e30Var) {
        this.f826c = e30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void requestDisallowInterceptTouchEvent(boolean z) {
        e30<Boolean> e30Var = this.f826c;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(z));
        }
        super/*android.view.ViewGroup*/.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScroll(int i) {
        setTranslationY(-i);
        getChildAt(0).setTranslationY(i / 2);
    }

    public ParallaxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f826c = null;
    }

    public ParallaxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f826c = null;
    }
}
