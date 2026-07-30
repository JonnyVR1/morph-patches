package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFadeRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public boolean f45506c;

    /* JADX INFO: renamed from: d */
    public boolean f45507d;

    /* JADX INFO: renamed from: e */
    public boolean f45508e;

    public LiveFadeRecyclerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: G */
    public void m69908G() {
        this.f45506c = true;
    }

    /* JADX INFO: renamed from: H */
    public void m69909H() {
        this.f45507d = true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.f45506c) {
            return 0.0f;
        }
        return super.getBottomFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.f45507d) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.f45508e ? 0.0f : 1.0f;
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
