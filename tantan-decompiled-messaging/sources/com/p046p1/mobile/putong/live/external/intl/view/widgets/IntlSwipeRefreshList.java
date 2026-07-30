package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class IntlSwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f45883S;

    /* JADX INFO: renamed from: T */
    public float f45884T;

    public IntlSwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m70376w();
    }

    /* JADX INFO: renamed from: w */
    private void m70376w() {
        this.f45883S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45884T = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f45884T) > this.f45883S) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public IntlSwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
