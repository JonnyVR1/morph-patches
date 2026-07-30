package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.yt80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemDiamondSkinView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondSkinView f37748a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37749b;

    /* JADX INFO: renamed from: c */
    public VImage f37750c;

    /* JADX INFO: renamed from: d */
    public VImage f37751d;

    public PrivilegeContentDlgItemDiamondSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57327a(View view) {
        yt80.m215997a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57328b() {
        this.f37749b.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57327a(this);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
