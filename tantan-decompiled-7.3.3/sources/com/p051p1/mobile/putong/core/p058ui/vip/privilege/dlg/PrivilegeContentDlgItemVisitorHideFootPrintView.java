package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.gbc0;
import p153l.m290;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemVisitorHideFootPrintView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f38630a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38631b;

    public PrivilegeContentDlgItemVisitorHideFootPrintView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58584a(View view) {
        m290.m156798a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58585b() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean zIsFemale = userM116600p9.isFemale();
        VImage vImage = this.f38630a;
        if (zIsFemale) {
            vImage.setImageResource(gbc0.f103140J5);
        } else {
            vImage.setImageResource(gbc0.f103147K5);
        }
        uqb0.f180374G.m127120O(this.f38631b, userM116600p9.m61308fp().profileMiddle().formatted(), 2, 35);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58584a(this);
        m58585b();
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
