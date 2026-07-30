package com.p046p1.mobile.putong.feed.newui.status.display.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSmoothSpeedRecycle extends RecyclerView {
    public FeedSmoothSpeedRecycle(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling((int) (i * 0.5f), i2);
    }

    public FeedSmoothSpeedRecycle(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSmoothSpeedRecycle(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
