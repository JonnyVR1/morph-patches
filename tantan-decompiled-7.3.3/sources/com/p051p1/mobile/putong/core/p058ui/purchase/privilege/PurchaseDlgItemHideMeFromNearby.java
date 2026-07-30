package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.ebb0;
import p153l.jbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f35972a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35973b;

    /* JADX INFO: renamed from: c */
    public VImage f35974c;

    /* JADX INFO: renamed from: d */
    public VImage f35975d;

    public PurchaseDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55471a(View view) {
        ebb0.m120158a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55472b() {
        this.f35972a.setImageResource(jbc0.f119247H6);
        uqb0.f180374G.m127120O(this.f35973b, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55471a(this);
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
