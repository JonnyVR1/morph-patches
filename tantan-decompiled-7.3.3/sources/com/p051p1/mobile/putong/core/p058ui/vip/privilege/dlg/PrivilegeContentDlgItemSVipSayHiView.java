package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.c17;
import p153l.e290;
import p153l.gbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PrivilegeContentDlgItemSVipSayHiView f38604a;

    /* JADX INFO: renamed from: b */
    public VImage f38605b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f38606c;

    /* JADX INFO: renamed from: d */
    public VImage f38607d;

    public PrivilegeContentDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58514a(View view) {
        e290.m119048a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58515b() {
        boolean zM107528u0 = c17.m107528u0();
        VImage vImage = this.f38605b;
        if (zM107528u0) {
            vImage.setImageResource(gbc0.f103220V1);
        } else {
            vImage.setImageResource(gbc0.f103206T1);
        }
        this.f38606c.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        if (CoreModule.f18276o.m132214d().mo34703I5()) {
            this.f38607d.setImageResource(gbc0.f103213U1);
            bnl0.m105537U(this.f38607d, qa00.m175859d(115.0f));
            bnl0.m105538V(this.f38607d, qa00.f156303P);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m58516c() {
        this.f38607d.setImageResource(gbc0.f103213U1);
        bnl0.m105537U(this.f38607d, qa00.m175859d(115.0f));
        bnl0.m105538V(this.f38607d, qa00.f156303P);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58514a(this);
        m58515b();
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
