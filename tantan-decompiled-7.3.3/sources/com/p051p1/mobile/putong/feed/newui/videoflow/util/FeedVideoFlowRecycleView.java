package com.p051p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVideoFlowRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public float f44152a;

    /* JADX INFO: renamed from: b */
    public float f44153b;

    public FeedVideoFlowRecycleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    private void m67397E() {
        if (getContext() instanceof Act) {
            ((Act) getContext()).hideInput();
        }
    }

    private int getShowPosition() {
        if (getContext() instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) getContext()).m67373d2();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getShowPosition() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f44152a = motionEvent.getX();
                this.f44153b = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f44152a) < Math.abs(y - this.f44153b)) {
                    return this.f44153b > y;
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            m67397E();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public FeedVideoFlowRecycleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedVideoFlowRecycleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
