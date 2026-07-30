package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes10.dex */
public class ExpandCardMaximumScroll extends MaximumScroll {
    public ExpandCardMaximumScroll(Context context) {
        super(context);
    }

    @Override // p147v.VScroll, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((canScrollVertically(1) || canScrollVertically(-1)) && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ExpandCardMaximumScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandCardMaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
