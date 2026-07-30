package com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f3559c;

    /* JADX INFO: renamed from: d */
    public boolean f3560d;

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f3559c = -1;
        this.f3560d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f3559c;
        return i > 0 ? i : xdl0.w0();
    }

    public int getMaxHeight() {
        return this.f3559c;
    }

    public void onMeasure(int i, int i2) {
        if (this.f3559c == -1 || !this.f3560d) {
            super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, i2);
        } else {
            super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxHeight(int i) {
        this.f3559c = i;
        requestLayout();
        invalidate();
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3559c = -1;
        this.f3560d = true;
    }

    public FeedMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3559c = -1;
        this.f3560d = true;
    }
}
