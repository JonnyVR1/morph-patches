package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateSquareRecycle extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public RunnableC11336a f42824c;

    /* JADX INFO: renamed from: d */
    public boolean f42825d;

    /* JADX INFO: renamed from: e */
    public boolean f42826e;

    /* JADX INFO: renamed from: f */
    public double f42827f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle$a */
    public static class RunnableC11336a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<FeedStateSquareRecycle> f42828a;

        public RunnableC11336a(FeedStateSquareRecycle feedStateSquareRecycle) {
            this.f42828a = new WeakReference<>(feedStateSquareRecycle);
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedStateSquareRecycle feedStateSquareRecycle = this.f42828a.get();
            if (feedStateSquareRecycle != null && feedStateSquareRecycle.f42825d && feedStateSquareRecycle.f42826e) {
                feedStateSquareRecycle.scrollBy(20, 0);
                feedStateSquareRecycle.postDelayed(feedStateSquareRecycle.f42824c, 5L);
            }
        }
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f42824c = new RunnableC11336a(this);
    }

    /* JADX INFO: renamed from: J */
    public void m65606J() {
        if (this.f42825d) {
            m65607K();
        }
        this.f42826e = true;
        this.f42825d = true;
        postDelayed(this.f42824c, 5L);
    }

    /* JADX INFO: renamed from: K */
    public void m65607K() {
        this.f42825d = false;
        removeCallbacks(this.f42824c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling((int) (((double) i) * this.f42827f), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    public void setflingScale(double d) {
        this.f42827f = d;
    }

    public FeedStateSquareRecycle(Context context) {
        this(context, null);
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
