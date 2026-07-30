package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.b290;
import p153l.bnl0;
import p153l.gbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemDiamondServiceView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondServiceView f38593a;

    /* JADX INFO: renamed from: b */
    public VImage f38594b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f38595c;

    public PrivilegeContentDlgItemDiamondServiceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58508a(View view) {
        b290.m102140a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58509b() {
        bnl0.m105501A0(getContext(), this.f38594b, gbc0.f103199S1);
        uqb0.f180374G.m127115L0(this.f38595c, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58508a(this);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondServiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
