package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.b3c0;
import l.iu80;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemVisitorHideFootPrintView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f7563a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f7564b;

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10884a(View view) {
        iu80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10885b() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        boolean zIsFemale = userM21490p9.isFemale();
        VImage vImage = this.f7563a;
        if (zIsFemale) {
            vImage.setImageResource(b3c0.J5);
        } else {
            vImage.setImageResource(b3c0.K5);
        }
        qib0.f19782G.m12749O(this.f7564b, userM21490p9.fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10884a(this);
        m10885b();
    }

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
