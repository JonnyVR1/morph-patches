package com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import l.xdl0;
import v.VScroll_Horizontal;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RefreshHorizontalScrollView extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public float f5481a;

    /* JADX INFO: renamed from: b */
    public float f5482b;

    public RefreshHorizontalScrollView(Context context) {
        super(context);
        m8305a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m8305a(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5481a = motionEvent.getX();
            this.f5482b = motionEvent.getY();
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f5481a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f5482b);
            if ((fAbs > 0.0f || fAbs2 > 0.0f) && fAbs >= fAbs2) {
                getParent().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m8305a(context);
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8305a(context);
    }
}
