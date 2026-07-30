package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import p002l.ahs;
import p002l.drj;
import p002l.mqj;
import p002l.nqj;
import p002l.vxj;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftInnerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView f6377c;

    /* JADX INFO: renamed from: d */
    public drj f6378d;

    public GiftInnerContentView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m8077r() {
        this.f6377c.setNestedScrollingEnabled(false);
        this.f6377c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f6377c.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m8078G(View view) {
        mqj.m18141a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m8079H() {
        vxj.m24197f(this);
    }

    /* JADX INFO: renamed from: I */
    public void m8080I(nqj nqjVar, ahs<?> ahsVar) {
        drj drjVar = this.f6378d;
        if (drjVar != null) {
            drjVar.m12012G(nqjVar.f16163a);
            return;
        }
        drj drjVar2 = new drj(ahsVar, nqjVar.f16163a);
        this.f6378d = drjVar2;
        this.f6377c.setAdapter(drjVar2);
    }

    public VRecyclerView getRecyclerView() {
        return this.f6377c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8078G(this);
        m8077r();
    }

    public GiftInnerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
