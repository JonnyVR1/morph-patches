package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p149l.b3b0;
import p149l.d3c0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseDlgItemSVipSayHiView f35128a;

    /* JADX INFO: renamed from: b */
    public VImage f35129b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35130c;

    /* JADX INFO: renamed from: d */
    public VImage f35131d;

    public PurchaseDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54290a(View view) {
        b3b0.m100056a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54291b(Privilege privilege) {
        boolean zM221004u0 = zz6.m221004u0();
        VImage vImage = this.f35129b;
        if (zM221004u0) {
            vImage.setImageResource(d3c0.f84044o6);
        } else {
            vImage.setImageResource(d3c0.f84030n6);
        }
        this.f35130c.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        if (CoreModule.f17557o.m195057d().mo33700I5() || privilege == Privilege.confession_first) {
            this.f35131d.setImageResource(d3c0.f84016m6);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54290a(this);
    }

    public PurchaseDlgItemSVipSayHiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseDlgItemSVipSayHiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PurchaseDlgItemSVipSayHiView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
