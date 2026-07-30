package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class SwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f21581S;

    /* JADX INFO: renamed from: T */
    public float f21582T;

    /* JADX INFO: renamed from: U */
    public boolean f21583U;

    public SwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21583U = false;
        m36617w();
    }

    /* JADX INFO: renamed from: w */
    private void m36617w() {
        this.f21581S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21582T = MotionEvent.obtain(motionEvent).getX();
            this.f21583U = false;
        } else if (action == 2 && (Math.abs(motionEvent.getX() - this.f21582T) > this.f21581S || this.f21583U)) {
            this.f21583U = true;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
