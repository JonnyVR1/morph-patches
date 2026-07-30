package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFadeRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public boolean f44658c;

    /* JADX INFO: renamed from: d */
    public boolean f44659d;

    /* JADX INFO: renamed from: e */
    public boolean f44660e;

    public LiveFadeRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: G */
    public void m68725G() {
        this.f44658c = true;
    }

    /* JADX INFO: renamed from: H */
    public void m68726H() {
        this.f44659d = true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.f44658c) {
            return 0.0f;
        }
        return super.getBottomFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.f44659d) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.f44660e ? 0.0f : 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    public LiveFadeRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFadeRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
