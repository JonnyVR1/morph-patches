package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import l.au80;
import l.b3c0;
import l.t100;
import l.xdl0;
import l.zz6;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSVipSayHiView f7537a;

    /* JADX INFO: renamed from: b */
    public VImage f7538b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f7539c;

    /* JADX INFO: renamed from: d */
    public VImage f7540d;

    public PrivilegeContentDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10814a(View view) {
        au80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10815b() {
        boolean zU0 = zz6.u0();
        VImage vImage = this.f7538b;
        if (zU0) {
            vImage.setImageResource(b3c0.V1);
        } else {
            vImage.setImageResource(b3c0.T1);
        }
        this.f7539c.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        if (CoreModule.f1546o.m25559d().m5637I5()) {
            this.f7540d.setImageResource(b3c0.U1);
            xdl0.U(this.f7540d, t100.d(115.0f));
            xdl0.V(this.f7540d, t100.P);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10816c() {
        this.f7540d.setImageResource(b3c0.U1);
        xdl0.U(this.f7540d, t100.d(115.0f));
        xdl0.V(this.f7540d, t100.P);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10814a(this);
        m10815b();
    }

    public PrivilegeContentDlgItemSVipSayHiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeContentDlgItemSVipSayHiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PrivilegeContentDlgItemSVipSayHiView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
