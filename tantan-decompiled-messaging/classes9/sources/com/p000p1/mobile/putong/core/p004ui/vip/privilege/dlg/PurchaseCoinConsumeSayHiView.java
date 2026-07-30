package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import l.f1b0;
import l.zz6;
import p006l.qib0;
import p006l.x2c0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseCoinConsumeSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseCoinConsumeSayHiView f7568a;

    /* JADX INFO: renamed from: b */
    public VImage f7569b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7570c;

    /* JADX INFO: renamed from: d */
    public VImage f7571d;

    public PurchaseCoinConsumeSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10887a(View view) {
        f1b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10888b(boolean z) {
        if (CoreModule.f1546o.m25559d().m5637I5() || z) {
            this.f7571d.setImageResource(x2c0.f25994Jj);
        } else {
            this.f7571d.setImageResource(x2c0.f25963Ij);
        }
        boolean zU0 = zz6.u0();
        VImage vImage = this.f7569b;
        if (zU0) {
            vImage.setImageResource(x2c0.f26056Lj);
        } else {
            vImage.setImageResource(x2c0.f26025Kj);
        }
        qib0.f19782G.m12744L0(this.f7570c, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10887a(this);
    }

    public PurchaseCoinConsumeSayHiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchaseCoinConsumeSayHiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PurchaseCoinConsumeSayHiView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
