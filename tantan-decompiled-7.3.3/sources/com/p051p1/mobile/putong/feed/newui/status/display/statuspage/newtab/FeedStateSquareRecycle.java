package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateSquareRecycle extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public RunnableC11499a f43672c;

    /* JADX INFO: renamed from: d */
    public boolean f43673d;

    /* JADX INFO: renamed from: e */
    public boolean f43674e;

    /* JADX INFO: renamed from: f */
    public double f43675f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle$a */
    public static class RunnableC11499a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<FeedStateSquareRecycle> f43676a;

        public RunnableC11499a(FeedStateSquareRecycle feedStateSquareRecycle) {
            this.f43676a = new WeakReference<>(feedStateSquareRecycle);
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedStateSquareRecycle feedStateSquareRecycle = this.f43676a.get();
            if (feedStateSquareRecycle != null && feedStateSquareRecycle.f43673d && feedStateSquareRecycle.f43674e) {
                feedStateSquareRecycle.scrollBy(20, 0);
                feedStateSquareRecycle.postDelayed(feedStateSquareRecycle.f43672c, 5L);
            }
        }
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f43672c = new RunnableC11499a(this);
    }

    /* JADX INFO: renamed from: J */
    public void m66789J() {
        if (this.f43673d) {
            m66790K();
        }
        this.f43674e = true;
        this.f43673d = true;
        postDelayed(this.f43672c, 5L);
    }

    /* JADX INFO: renamed from: K */
    public void m66790K() {
        this.f43673d = false;
        removeCallbacks(this.f43672c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling((int) (((double) i) * this.f43675f), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    public void setflingScale(double d) {
        this.f43675f = d;
    }

    public FeedStateSquareRecycle(Context context) {
        this(context, null);
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
