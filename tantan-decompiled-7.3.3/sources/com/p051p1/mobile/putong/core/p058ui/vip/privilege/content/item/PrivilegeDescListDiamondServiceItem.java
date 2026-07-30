package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.s7a;
import p153l.wib0;
import p153l.y290;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListDiamondServiceItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38424a;

    /* JADX INFO: renamed from: b */
    public VIcon f38425b;

    /* JADX INFO: renamed from: c */
    public VText f38426c;

    /* JADX INFO: renamed from: d */
    public VText f38427d;

    /* JADX INFO: renamed from: e */
    public VIcon f38428e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem$a */
    public static class C9149a implements h390 {

        /* JADX INFO: renamed from: a */
        public String f38429a;

        /* JADX INFO: renamed from: b */
        public String f38430b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f38431c;

        public C9149a(String str, String str2, PurchaseType purchaseType) {
            this.f38429a = str;
            this.f38430b = str2;
            this.f38431c = purchaseType;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 8;
        }
    }

    public PrivilegeDescListDiamondServiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m58283v(View view) {
        C8619b.m48822s(bnl0.m105508E(this));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58284u(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.w290
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186889a.m58283v(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m58284u(View view) {
        y290.m214047a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m58285w(C9149a c9149a) {
        this.f38426c.setText(c9149a.f38429a);
        this.f38427d.setText(c9149a.f38430b);
        if (wib0.m206565i(c9149a.f38431c) && s7a.m184986o()) {
            this.f38425b.setImageResource(dbc0.f86475Pi);
            this.f38426c.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38427d.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38428e.setImageResource(dbc0.f86699Wi);
            return;
        }
        PurchaseType purchaseType = c9149a.f38431c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        VIcon vIcon = this.f38425b;
        if (purchaseType != purchaseType2) {
            vIcon.setImageResource(dbc0.f86573Sk);
            return;
        }
        vIcon.setImageResource(dbc0.f86541Rk);
        this.f38426c.setTextColor(getResources().getColor(c9c0.f80452r0));
        this.f38427d.setTextColor(getResources().getColor(c9c0.f80401b0));
        this.f38428e.setImageResource(dbc0.f86446Ol);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.x290
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o1j0.m165651y("请联系至尊合伙人微信专属客服");
            }
        });
    }

    public PrivilegeDescListDiamondServiceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListDiamondServiceItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
