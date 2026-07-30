package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.f1b0;
import p149l.qib0;
import p149l.x2c0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PurchaseCoinConsumeSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseCoinConsumeSayHiView f37787a;

    /* JADX INFO: renamed from: b */
    public VImage f37788b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f37789c;

    /* JADX INFO: renamed from: d */
    public VImage f37790d;

    public PurchaseCoinConsumeSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57404a(View view) {
        f1b0.m119108a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57405b(boolean z) {
        if (CoreModule.f17557o.m195057d().mo33700I5() || z) {
            this.f37790d.setImageResource(x2c0.f189458Jj);
        } else {
            this.f37790d.setImageResource(x2c0.f189427Ij);
        }
        boolean zM221004u0 = zz6.m221004u0();
        VImage vImage = this.f37788b;
        if (zM221004u0) {
            vImage.setImageResource(x2c0.f189520Lj);
        } else {
            vImage.setImageResource(x2c0.f189489Kj);
        }
        qib0.f154691G.m102331L0(this.f37789c, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57404a(this);
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
