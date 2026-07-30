package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCustomSGLayoutManager extends StaggeredGridLayoutManager {

    /* JADX INFO: renamed from: y */
    public double f42782y;

    public FeedCustomSGLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m65586f0(double d) {
        this.f42782y = d;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        double d = i;
        int iScrollHorizontallyBy = super.scrollHorizontallyBy((int) (this.f42782y * d), c0584v, c0588z);
        return iScrollHorizontallyBy == ((int) (this.f42782y * d)) ? i : iScrollHorizontallyBy;
    }

    public FeedCustomSGLayoutManager(int i, int i2) {
        super(i, i2);
    }
}
