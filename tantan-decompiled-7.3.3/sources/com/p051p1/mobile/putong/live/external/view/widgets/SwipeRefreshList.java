package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class SwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f47231S;

    /* JADX INFO: renamed from: T */
    public float f47232T;

    public SwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m72113w();
    }

    /* JADX INFO: renamed from: w */
    private void m72113w() {
        this.f47231S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47232T = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f47232T) > this.f47231S) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
