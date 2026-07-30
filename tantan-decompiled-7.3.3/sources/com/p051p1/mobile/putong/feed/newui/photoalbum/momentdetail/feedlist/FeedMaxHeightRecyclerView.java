package com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p153l.bnl0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f42946c;

    /* JADX INFO: renamed from: d */
    public boolean f42947d;

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f42946c = -1;
        this.f42947d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f42946c;
        return i > 0 ? i : bnl0.m105588w0();
    }

    public int getMaxHeight() {
        return this.f42946c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f42946c == -1 || !this.f42947d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public void setMaxHeight(int i) {
        this.f42946c = i;
        requestLayout();
        invalidate();
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42946c = -1;
        this.f42947d = true;
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42946c = -1;
        this.f42947d = true;
    }
}
