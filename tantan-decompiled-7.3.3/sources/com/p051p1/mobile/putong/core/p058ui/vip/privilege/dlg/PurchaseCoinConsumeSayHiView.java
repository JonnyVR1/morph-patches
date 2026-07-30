package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.c17;
import p153l.dbc0;
import p153l.j9b0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseCoinConsumeSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseCoinConsumeSayHiView f38635a;

    /* JADX INFO: renamed from: b */
    public VImage f38636b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f38637c;

    /* JADX INFO: renamed from: d */
    public VImage f38638d;

    public PurchaseCoinConsumeSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58587a(View view) {
        j9b0.m143935a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58588b(boolean z) {
        if (CoreModule.f18276o.m132214d().mo34703I5() || z) {
            this.f38638d.setImageResource(dbc0.f87582xk);
        } else {
            this.f38638d.setImageResource(dbc0.f87550wk);
        }
        boolean zM107528u0 = c17.m107528u0();
        VImage vImage = this.f38636b;
        if (zM107528u0) {
            vImage.setImageResource(dbc0.f87646zk);
        } else {
            vImage.setImageResource(dbc0.f87614yk);
        }
        uqb0.f180374G.m127115L0(this.f38637c, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58587a(this);
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
