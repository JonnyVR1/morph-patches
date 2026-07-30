package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.c3b0;
import l.d3c0;
import p006l.qib0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseDlgItemVisitorHideFootPrint extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f4913a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f4914b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f4915c;

    public PurchaseDlgItemVisitorHideFootPrint(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7627a(View view) {
        c3b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7628b() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9.isFemale()) {
            qib0.f19782G.m12767Y0(this.f4913a, d3c0.cb);
            qib0.f19782G.m12767Y0(this.f4914b, d3c0.db);
        } else {
            qib0.f19782G.m12767Y0(this.f4913a, d3c0.eb);
            qib0.f19782G.m12767Y0(this.f4914b, d3c0.fb);
        }
        qib0.f19782G.m12749O(this.f4915c, userM21490p9.fp().profile180().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7627a(this);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PurchaseDlgItemVisitorHideFootPrint(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
