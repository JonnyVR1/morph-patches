package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.match.b;
import l.lsi0;
import l.sab0;
import l.uu80;
import l.xdl0;
import p006l.dv80;
import p006l.g6a;
import p006l.w0c0;
import p006l.x2c0;
import v.VFrame;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListDiamondServiceItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7357a;

    /* JADX INFO: renamed from: b */
    public VIcon f7358b;

    /* JADX INFO: renamed from: c */
    public VText f7359c;

    /* JADX INFO: renamed from: d */
    public VText f7360d;

    /* JADX INFO: renamed from: e */
    public VIcon f7361e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem$a */
    public static class C0422a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f7362a;

        /* JADX INFO: renamed from: b */
        public String f7363b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f7364c;

        public C0422a(String str, String str2, PurchaseType purchaseType) {
            this.f7362a = str;
            this.f7363b = str2;
            this.f7364c = purchaseType;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 8;
        }
    }

    public PrivilegeDescListDiamondServiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m10571v(View view) {
        b.s(xdl0.E(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10572u(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.su80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21661a.m10571v(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m10572u(View view) {
        uu80.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m10573w(C0422a c0422a) {
        this.f7359c.setText(c0422a.f7362a);
        this.f7360d.setText(c0422a.f7363b);
        if (sab0.i(c0422a.f7364c) && g6a.m15592o()) {
            this.f7358b.setImageResource(x2c0.f26552bi);
            this.f7359c.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7360d.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7361e.setImageResource(x2c0.f26774ii);
            return;
        }
        PurchaseType purchaseType = c0422a.f7364c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        VIcon vIcon = this.f7358b;
        if (purchaseType != purchaseType2) {
            vIcon.setImageResource(x2c0.f26649ek);
            return;
        }
        vIcon.setImageResource(x2c0.f26618dk);
        this.f7359c.setTextColor(getResources().getColor(w0c0.f24719q0));
        this.f7360d.setTextColor(getResources().getColor(w0c0.f24668a0));
        this.f7361e.setImageResource(x2c0.f26523al);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.tu80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lsi0.y("请联系至尊合伙人微信专属客服");
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
