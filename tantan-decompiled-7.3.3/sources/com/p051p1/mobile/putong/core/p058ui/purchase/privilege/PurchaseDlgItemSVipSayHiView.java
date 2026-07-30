package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p153l.c17;
import p153l.fbb0;
import p153l.jbc0;

/* JADX INFO: loaded from: classes12.dex */
public class PurchaseDlgItemSVipSayHiView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PurchaseDlgItemSVipSayHiView f35976a;

    /* JADX INFO: renamed from: b */
    public VImage f35977b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f35978c;

    /* JADX INFO: renamed from: d */
    public VImage f35979d;

    public PurchaseDlgItemSVipSayHiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55473a(View view) {
        fbb0.m124889a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55474b(Privilege privilege) {
        boolean zM107528u0 = c17.m107528u0();
        VImage vImage = this.f35977b;
        if (zM107528u0) {
            vImage.setImageResource(jbc0.f119699o6);
        } else {
            vImage.setImageResource(jbc0.f119685n6);
        }
        this.f35978c.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        if (CoreModule.f18276o.m132214d().mo34703I5() || privilege == Privilege.confession_first) {
            this.f35979d.setImageResource(jbc0.f119671m6);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55473a(this);
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
