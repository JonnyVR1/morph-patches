package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p149l.c3b0;
import p149l.d3c0;
import p149l.qib0;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseDlgItemVisitorHideFootPrint extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35132a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35133b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35134c;

    public PurchaseDlgItemVisitorHideFootPrint(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54292a(View view) {
        c3b0.m104992a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54293b() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isFemale()) {
            qib0.f154691G.m102354Y0(this.f35132a, d3c0.f83881cb);
            qib0.f154691G.m102354Y0(this.f35133b, d3c0.f83895db);
        } else {
            qib0.f154691G.m102354Y0(this.f35132a, d3c0.f83909eb);
            qib0.f154691G.m102354Y0(this.f35133b, d3c0.f83923fb);
        }
        qib0.f154691G.m102336O(this.f35134c, userM169527p9.m60124fp().profile180().formatted(), 2, 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54292a(this);
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
