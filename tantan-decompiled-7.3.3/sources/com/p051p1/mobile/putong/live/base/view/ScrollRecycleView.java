package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ScrollRecycleView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public final int f45670c;

    /* JADX INFO: renamed from: d */
    public float f45671d;

    /* JADX INFO: renamed from: e */
    public float f45672e;

    public ScrollRecycleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45670c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45671d = motionEvent.getX();
            this.f45672e = motionEvent.getY();
            return zOnInterceptTouchEvent;
        }
        if (action == 1) {
            return false;
        }
        if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f45671d);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f45672e);
            int i = this.f45670c;
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
