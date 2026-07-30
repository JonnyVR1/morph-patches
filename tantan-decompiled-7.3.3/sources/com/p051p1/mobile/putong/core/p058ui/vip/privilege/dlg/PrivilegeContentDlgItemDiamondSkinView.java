package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.c290;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemDiamondSkinView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemDiamondSkinView f38596a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38597b;

    /* JADX INFO: renamed from: c */
    public VImage f38598c;

    /* JADX INFO: renamed from: d */
    public VImage f38599d;

    public PrivilegeContentDlgItemDiamondSkinView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58510a(View view) {
        c290.m107678a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58511b() {
        this.f38597b.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58510a(this);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemDiamondSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
