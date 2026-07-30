package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Media;
import l.b3b0;
import l.d3c0;
import l.zz6;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PurchaseDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseDlgItemSVipSayHiView f4909a;

    /* JADX INFO: renamed from: b */
    public VImage f4910b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f4911c;

    /* JADX INFO: renamed from: d */
    public VImage f4912d;

    public PurchaseDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7625a(View view) {
        b3b0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7626b(Privilege privilege) {
        boolean zU0 = zz6.u0();
        VImage vImage = this.f4910b;
        if (zU0) {
            vImage.setImageResource(d3c0.o6);
        } else {
            vImage.setImageResource(d3c0.n6);
        }
        this.f4911c.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        if (CoreModule.f1546o.m25559d().m5637I5() || privilege == Privilege.confession_first) {
            this.f4912d.setImageResource(d3c0.m6);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7625a(this);
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
