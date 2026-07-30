package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class IntlSwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f46731S;

    /* JADX INFO: renamed from: T */
    public float f46732T;

    public IntlSwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m71559w();
    }

    /* JADX INFO: renamed from: w */
    private void m71559w() {
        this.f46731S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46732T = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f46732T) > this.f46731S) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public IntlSwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
