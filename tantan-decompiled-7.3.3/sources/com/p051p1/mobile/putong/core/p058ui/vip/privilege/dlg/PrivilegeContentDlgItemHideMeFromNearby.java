package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.d290;
import p153l.gbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f38600a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38601b;

    /* JADX INFO: renamed from: c */
    public View f38602c;

    /* JADX INFO: renamed from: d */
    public VImage f38603d;

    public PrivilegeContentDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58512a(View view) {
        d290.m113677a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m58513b() {
        this.f38600a.setImageResource(gbc0.f103227W1);
        uqb0.f180374G.m127120O(this.f38601b, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58512a(this);
        m58513b();
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
