package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class SwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f46383S;

    /* JADX INFO: renamed from: T */
    public float f46384T;

    public SwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m70930w();
    }

    /* JADX INFO: renamed from: w */
    private void m70930w() {
        this.f46383S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46384T = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f46384T) > this.f46383S) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
