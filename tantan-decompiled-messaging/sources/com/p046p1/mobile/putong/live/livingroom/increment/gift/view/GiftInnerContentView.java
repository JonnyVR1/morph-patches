package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import p147v.VRecyclerView;
import p149l.ahs;
import p149l.drj;
import p149l.mqj;
import p149l.nqj;
import p149l.vxj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInnerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView f50335c;

    /* JADX INFO: renamed from: d */
    public drj f50336d;

    public GiftInnerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m74490r() {
        this.f50335c.setNestedScrollingEnabled(false);
        this.f50335c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f50335c.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m74491G(View view) {
        mqj.m155956a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m74492H() {
        vxj.m200566f(this);
    }

    /* JADX INFO: renamed from: I */
    public void m74493I(nqj nqjVar, ahs<?> ahsVar) {
        drj drjVar = this.f50336d;
        if (drjVar != null) {
            drjVar.m113309G(nqjVar.f140073a);
            return;
        }
        drj drjVar2 = new drj(ahsVar, nqjVar.f140073a);
        this.f50336d = drjVar2;
        this.f50335c.setAdapter(drjVar2);
    }

    public VRecyclerView getRecyclerView() {
        return this.f50335c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74491G(this);
        m74490r();
    }

    public GiftInnerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
