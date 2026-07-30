package com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import p147v.VScroll_Horizontal;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class RefreshHorizontalScrollView extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public float f44020a;

    /* JADX INFO: renamed from: b */
    public float f44021b;

    public RefreshHorizontalScrollView(Context context) {
        super(context);
        m67098a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m67098a(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44020a = motionEvent.getX();
            this.f44021b = motionEvent.getY();
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f44020a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f44021b);
            if ((fAbs > 0.0f || fAbs2 > 0.0f) && fAbs >= fAbs2) {
                getParent().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67098a(context);
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67098a(context);
    }
}
