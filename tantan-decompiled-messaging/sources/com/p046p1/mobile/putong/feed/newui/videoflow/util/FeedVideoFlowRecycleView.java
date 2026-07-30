package com.p046p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVideoFlowRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public float f43304a;

    /* JADX INFO: renamed from: b */
    public float f43305b;

    public FeedVideoFlowRecycleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: E */
    private void m66214E() {
        if (getContext() instanceof Act) {
            ((Act) getContext()).hideInput();
        }
    }

    private int getShowPosition() {
        if (getContext() instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) getContext()).m66190c2();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getShowPosition() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f43304a = motionEvent.getX();
                this.f43305b = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f43304a) < Math.abs(y - this.f43305b)) {
                    return this.f43305b > y;
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            m66214E();
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
