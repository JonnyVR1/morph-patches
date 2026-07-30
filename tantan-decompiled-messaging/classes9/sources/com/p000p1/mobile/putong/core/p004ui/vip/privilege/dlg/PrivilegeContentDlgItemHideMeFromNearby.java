package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import l.b3c0;
import l.zt80;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f7533a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7534b;

    /* JADX INFO: renamed from: c */
    public View f7535c;

    /* JADX INFO: renamed from: d */
    public VImage f7536d;

    public PrivilegeContentDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10812a(View view) {
        zt80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m10813b() {
        this.f7533a.setImageResource(b3c0.W1);
        qib0.f19782G.m12749O(this.f7534b, CoreModule.f1534c.f3628e0.m21490p9().fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10812a(this);
        m10813b();
    }

    public PrivilegeContentDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemHideMeFromNearby(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
