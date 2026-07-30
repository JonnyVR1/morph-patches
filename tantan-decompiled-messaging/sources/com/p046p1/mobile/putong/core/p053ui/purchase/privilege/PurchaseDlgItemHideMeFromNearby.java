package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.a3b0;
import p149l.d3c0;
import p149l.qib0;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f35124a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35125b;

    /* JADX INFO: renamed from: c */
    public VImage f35126c;

    /* JADX INFO: renamed from: d */
    public VImage f35127d;

    public PurchaseDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54288a(View view) {
        a3b0.m94659a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54289b() {
        this.f35124a.setImageResource(d3c0.f83592H6);
        qib0.f154691G.m102336O(this.f35125b, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54288a(this);
    }

    public PurchaseDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PurchaseDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
