package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCustomSGLayoutManager extends StaggeredGridLayoutManager {

    /* JADX INFO: renamed from: y */
    public double f43630y;

    public FeedCustomSGLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m66769f0(double d) {
        this.f43630y = d;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        double d = i;
        int iScrollHorizontallyBy = super.scrollHorizontallyBy((int) (this.f43630y * d), c0586v, c0561a0);
        return iScrollHorizontallyBy == ((int) (this.f43630y * d)) ? i : iScrollHorizontallyBy;
    }

    public FeedCustomSGLayoutManager(int i, int i2) {
        super(i, i2);
    }
}
