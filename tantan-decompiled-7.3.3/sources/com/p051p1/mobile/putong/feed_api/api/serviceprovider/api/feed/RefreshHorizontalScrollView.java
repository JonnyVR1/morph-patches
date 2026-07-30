package com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import p151v.VScroll_Horizontal;
import p153l.bnl0;

/* JADX INFO: loaded from: classes13.dex */
public class RefreshHorizontalScrollView extends VScroll_Horizontal {

    /* JADX INFO: renamed from: a */
    public float f44868a;

    /* JADX INFO: renamed from: b */
    public float f44869b;

    public RefreshHorizontalScrollView(Context context) {
        super(context);
        m68281a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m68281a(Context context) {
        if (bnl0.f77541b) {
            setOverScrollMode(2);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44868a = motionEvent.getX();
            this.f44869b = motionEvent.getY();
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f44868a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f44869b);
            if ((fAbs > 0.0f || fAbs2 > 0.0f) && fAbs >= fAbs2) {
                getParent().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m68281a(context);
    }

    public RefreshHorizontalScrollView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68281a(context);
    }
}
