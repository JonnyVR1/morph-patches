package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import l.a3b0;
import l.d3c0;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4905a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4906b;

    /* JADX INFO: renamed from: c */
    public VImage f4907c;

    /* JADX INFO: renamed from: d */
    public VImage f4908d;

    public PurchaseDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7623a(View view) {
        a3b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7624b() {
        this.f4905a.setImageResource(d3c0.H6);
        qib0.f19782G.m12749O(this.f4906b, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7623a(this);
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
