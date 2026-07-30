package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VText;
import p149l.dv80;
import p149l.g6a;
import p149l.sab0;
import p149l.uu80;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListDiamondServiceItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37576a;

    /* JADX INFO: renamed from: b */
    public VIcon f37577b;

    /* JADX INFO: renamed from: c */
    public VText f37578c;

    /* JADX INFO: renamed from: d */
    public VText f37579d;

    /* JADX INFO: renamed from: e */
    public VIcon f37580e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem$a */
    public static class C8986a implements dv80 {

        /* JADX INFO: renamed from: a */
        public String f37581a;

        /* JADX INFO: renamed from: b */
        public String f37582b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f37583c;

        public C8986a(String str, String str2, PurchaseType purchaseType) {
            this.f37581a = str;
            this.f37582b = str2;
            this.f37583c = purchaseType;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 8;
        }
    }

    public PrivilegeDescListDiamondServiceItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m57100v(View view) {
        C8456b.m47639s(xdl0.m208328E(this));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57101u(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.su80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166456a.m57100v(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m57101u(View view) {
        uu80.m195328a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m57102w(C8986a c8986a) {
        this.f37578c.setText(c8986a.f37581a);
        this.f37579d.setText(c8986a.f37582b);
        if (sab0.m182891i(c8986a.f37583c) && g6a.m124566o()) {
            this.f37577b.setImageResource(x2c0.f190016bi);
            this.f37578c.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37579d.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37580e.setImageResource(x2c0.f190238ii);
            return;
        }
        PurchaseType purchaseType = c8986a.f37583c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
        VIcon vIcon = this.f37577b;
        if (purchaseType != purchaseType2) {
            vIcon.setImageResource(x2c0.f190113ek);
            return;
        }
        vIcon.setImageResource(x2c0.f190082dk);
        this.f37578c.setTextColor(getResources().getColor(w0c0.f183879q0));
        this.f37579d.setTextColor(getResources().getColor(w0c0.f183828a0));
        this.f37580e.setImageResource(x2c0.f189987al);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.tu80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lsi0.m151595y("请联系至尊合伙人微信专属客服");
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
