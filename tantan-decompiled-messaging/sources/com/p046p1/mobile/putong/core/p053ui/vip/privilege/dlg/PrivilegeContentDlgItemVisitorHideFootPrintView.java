package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.b3c0;
import p149l.iu80;
import p149l.qib0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemVisitorHideFootPrintView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f37782a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f37783b;

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57401a(View view) {
        iu80.m138354a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57402b() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean zIsFemale = userM169527p9.isFemale();
        VImage vImage = this.f37782a;
        if (zIsFemale) {
            vImage.setImageResource(b3c0.f72889J5);
        } else {
            vImage.setImageResource(b3c0.f72896K5);
        }
        qib0.f154691G.m102336O(this.f37783b, userM169527p9.m60124fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57401a(this);
        m57402b();
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
