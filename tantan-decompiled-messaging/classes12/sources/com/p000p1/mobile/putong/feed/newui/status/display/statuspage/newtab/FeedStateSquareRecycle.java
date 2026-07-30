package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateSquareRecycle extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public RunnableC2180a f4285c;

    /* JADX INFO: renamed from: d */
    public boolean f4286d;

    /* JADX INFO: renamed from: e */
    public boolean f4287e;

    /* JADX INFO: renamed from: f */
    public double f4288f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareRecycle$a */
    public static class RunnableC2180a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<FeedStateSquareRecycle> f4289a;

        public RunnableC2180a(FeedStateSquareRecycle feedStateSquareRecycle) {
            this.f4289a = new WeakReference<>(feedStateSquareRecycle);
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = (FeedStateSquareRecycle) this.f4289a.get();
            if (recyclerView != null && recyclerView.f4286d && recyclerView.f4287e) {
                recyclerView.scrollBy(20, 0);
                recyclerView.postDelayed(recyclerView.f4285c, 5L);
            }
        }
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f4285c = new RunnableC2180a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m6743J() {
        if (this.f4286d) {
            m6744K();
        }
        this.f4287e = true;
        this.f4286d = true;
        postDelayed(this.f4285c, 5L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public void m6744K() {
        this.f4286d = false;
        removeCallbacks(this.f4285c);
    }

    public boolean fling(int i, int i2) {
        return super/*androidx.recyclerview.widget.RecyclerView*/.fling((int) (((double) i) * this.f4288f), i2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super/*androidx.recyclerview.widget.RecyclerView*/.onTouchEvent(motionEvent);
    }

    public void setflingScale(double d) {
        this.f4288f = d;
    }

    public FeedStateSquareRecycle(Context context) {
        this(context, null);
    }

    public FeedStateSquareRecycle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
