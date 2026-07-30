package com.p051p1.mobile.putong.core.newui.group;

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
    public int f22323S;

    /* JADX INFO: renamed from: T */
    public float f22324T;

    /* JADX INFO: renamed from: U */
    public boolean f22325U;

    public SwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22325U = false;
        m37620w();
    }

    /* JADX INFO: renamed from: w */
    private void m37620w() {
        this.f22323S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22324T = MotionEvent.obtain(motionEvent).getX();
            this.f22325U = false;
        } else if (action == 2 && (Math.abs(motionEvent.getX() - this.f22324T) > this.f22323S || this.f22325U)) {
            this.f22325U = true;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
