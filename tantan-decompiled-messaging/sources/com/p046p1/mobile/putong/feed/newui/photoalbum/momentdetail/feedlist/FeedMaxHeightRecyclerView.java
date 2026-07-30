package com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f42098c;

    /* JADX INFO: renamed from: d */
    public boolean f42099d;

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f42098c = -1;
        this.f42099d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f42098c;
        return i > 0 ? i : xdl0.m208408w0();
    }

    public int getMaxHeight() {
        return this.f42098c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f42098c == -1 || !this.f42099d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public void setMaxHeight(int i) {
        this.f42098c = i;
        requestLayout();
        invalidate();
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42098c = -1;
        this.f42099d = true;
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42098c = -1;
        this.f42099d = true;
    }
}
