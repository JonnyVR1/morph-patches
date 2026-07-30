package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ScrollRecycleView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public final int f44822c;

    /* JADX INFO: renamed from: d */
    public float f44823d;

    /* JADX INFO: renamed from: e */
    public float f44824e;

    public ScrollRecycleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44822c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44823d = motionEvent.getX();
            this.f44824e = motionEvent.getY();
            return zOnInterceptTouchEvent;
        }
        if (action == 1) {
            return false;
        }
        if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f44823d);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f44824e);
            int i = this.f44822c;
            if ((fAbs > i || fAbs2 > i) && fAbs >= fAbs2) {
                requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        return zOnInterceptTouchEvent;
    }

    public ScrollRecycleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollRecycleView(Context context) {
        this(context, null);
    }
}
