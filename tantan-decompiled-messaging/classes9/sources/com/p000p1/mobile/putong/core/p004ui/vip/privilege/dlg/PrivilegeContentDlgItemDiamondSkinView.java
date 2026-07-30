package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import l.yt80;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemDiamondSkinView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondSkinView f7529a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7530b;

    /* JADX INFO: renamed from: c */
    public VImage f7531c;

    /* JADX INFO: renamed from: d */
    public VImage f7532d;

    public PrivilegeContentDlgItemDiamondSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10810a(View view) {
        yt80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10811b() {
        this.f7530b.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10810a(this);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
