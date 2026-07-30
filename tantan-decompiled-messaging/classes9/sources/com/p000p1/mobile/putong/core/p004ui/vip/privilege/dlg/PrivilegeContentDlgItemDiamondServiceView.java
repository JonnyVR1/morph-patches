package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import l.b3c0;
import l.xdl0;
import l.xt80;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemDiamondServiceView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondServiceView f7526a;

    /* JADX INFO: renamed from: b */
    public VImage f7527b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7528c;

    public PrivilegeContentDlgItemDiamondServiceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10808a(View view) {
        xt80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10809b() {
        xdl0.A0(getContext(), this.f7527b, b3c0.S1);
        qib0.f19782G.m12744L0(this.f7528c, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10808a(this);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
