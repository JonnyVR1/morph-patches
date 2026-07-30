package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCustomSGLayoutManager extends StaggeredGridLayoutManager {

    /* JADX INFO: renamed from: y */
    public double f4243y;

    public FeedCustomSGLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m6723f0(double d) {
        this.f4243y = d;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        double d = i;
        int iScrollHorizontallyBy = super.scrollHorizontallyBy((int) (this.f4243y * d), vVar, zVar);
        return iScrollHorizontallyBy == ((int) (this.f4243y * d)) ? i : iScrollHorizontallyBy;
    }

    public FeedCustomSGLayoutManager(int i, int i2) {
        super(i, i2);
    }
}
