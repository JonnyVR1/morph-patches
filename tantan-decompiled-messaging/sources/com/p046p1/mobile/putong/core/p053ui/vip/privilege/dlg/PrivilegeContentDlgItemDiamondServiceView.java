package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.b3c0;
import p149l.qib0;
import p149l.xdl0;
import p149l.xt80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemDiamondServiceView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondServiceView f37745a;

    /* JADX INFO: renamed from: b */
    public VImage f37746b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f37747c;

    public PrivilegeContentDlgItemDiamondServiceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57325a(View view) {
        xt80.m210962a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57326b() {
        xdl0.m208321A0(getContext(), this.f37746b, b3c0.f72948S1);
        qib0.f154691G.m102331L0(this.f37747c, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57325a(this);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
