package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import p151v.VRecyclerView;
import p153l.bjs;
import p153l.ctj;
import p153l.dtj;
import p153l.l0k;
import p153l.ttj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInnerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView f51183c;

    /* JADX INFO: renamed from: d */
    public ttj f51184d;

    public GiftInnerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m75673r() {
        this.f51183c.setNestedScrollingEnabled(false);
        this.f51183c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f51183c.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m75674G(View view) {
        ctj.m112490a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m75675H() {
        l0k.m152352f(this);
    }

    /* JADX INFO: renamed from: I */
    public void m75676I(dtj dtjVar, bjs<?> bjsVar) {
        ttj ttjVar = this.f51184d;
        if (ttjVar != null) {
            ttjVar.m192673G(dtjVar.f90600a);
            return;
        }
        ttj ttjVar2 = new ttj(bjsVar, dtjVar.f90600a);
        this.f51184d = ttjVar2;
        this.f51183c.setAdapter(ttjVar2);
    }

    public VRecyclerView getRecyclerView() {
        return this.f51183c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75674G(this);
        m75673r();
    }

    public GiftInnerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
