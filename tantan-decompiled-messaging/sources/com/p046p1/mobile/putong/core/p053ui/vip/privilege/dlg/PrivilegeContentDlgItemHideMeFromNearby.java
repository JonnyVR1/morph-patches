package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.b3c0;
import p149l.qib0;
import p149l.zt80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemHideMeFromNearby extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f37752a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37753b;

    /* JADX INFO: renamed from: c */
    public View f37754c;

    /* JADX INFO: renamed from: d */
    public VImage f37755d;

    public PrivilegeContentDlgItemHideMeFromNearby(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57329a(View view) {
        zt80.m220117a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m57330b() {
        this.f37752a.setImageResource(b3c0.f72976W1);
        qib0.f154691G.m102336O(this.f37753b, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57329a(this);
        m57330b();
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
