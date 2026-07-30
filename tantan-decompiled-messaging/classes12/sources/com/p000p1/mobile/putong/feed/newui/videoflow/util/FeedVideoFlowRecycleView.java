package com.p000p1.mobile.putong.feed.newui.videoflow.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVideoFlowRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public float f4765a;

    /* JADX INFO: renamed from: b */
    public float f4766b;

    public FeedVideoFlowRecycleView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m7374E() {
        if (getContext() instanceof Act) {
            getContext().hideInput();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getShowPosition() {
        if (getContext() instanceof FeedVideoFlowAct) {
            return ((FeedVideoFlowAct) getContext()).m7348c2();
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getShowPosition() == 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f4765a = motionEvent.getX();
                this.f4766b = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f4765a) < Math.abs(y - this.f4766b)) {
                    return this.f4766b > y;
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            m7374E();
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
