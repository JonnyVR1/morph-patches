package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.au80;
import p149l.b3c0;
import p149l.t100;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSVipSayHiView f37756a;

    /* JADX INFO: renamed from: b */
    public VImage f37757b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f37758c;

    /* JADX INFO: renamed from: d */
    public VImage f37759d;

    public PrivilegeContentDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57331a(View view) {
        au80.m98959a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57332b() {
        boolean zM221004u0 = zz6.m221004u0();
        VImage vImage = this.f37757b;
        if (zM221004u0) {
            vImage.setImageResource(b3c0.f72969V1);
        } else {
            vImage.setImageResource(b3c0.f72955T1);
        }
        this.f37758c.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        if (CoreModule.f17557o.m195057d().mo33700I5()) {
            this.f37759d.setImageResource(b3c0.f72962U1);
            xdl0.m208357U(this.f37759d, t100.m186890d(115.0f));
            xdl0.m208358V(this.f37759d, t100.f167241P);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m57333c() {
        this.f37759d.setImageResource(b3c0.f72962U1);
        xdl0.m208357U(this.f37759d, t100.m186890d(115.0f));
        xdl0.m208358V(this.f37759d, t100.f167241P);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57331a(this);
        m57332b();
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
