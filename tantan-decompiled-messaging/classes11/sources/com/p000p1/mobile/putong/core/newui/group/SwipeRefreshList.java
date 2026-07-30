package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SwipeRefreshList extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: S */
    public int f359S;

    /* JADX INFO: renamed from: T */
    public float f360T;

    /* JADX INFO: renamed from: U */
    public boolean f361U;

    public SwipeRefreshList(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f361U = false;
        m559w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m559w() {
        this.f359S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f360T = MotionEvent.obtain(motionEvent).getX();
            this.f361U = false;
        } else if (action == 2 && (Math.abs(motionEvent.getX() - this.f360T) > this.f359S || this.f361U)) {
            this.f361U = true;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwipeRefreshList(@NonNull Context context) {
        this(context, null);
    }
}
