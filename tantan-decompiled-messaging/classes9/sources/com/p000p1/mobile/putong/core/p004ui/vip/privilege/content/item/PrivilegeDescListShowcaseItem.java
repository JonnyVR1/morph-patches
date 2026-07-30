package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import l.b1f;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.p2b0;
import l.sab0;
import l.w9j;
import l.xdl0;
import l.zw80;
import p006l.aab0;
import p006l.d1m;
import p006l.dab0;
import p006l.dv80;
import p006l.ef60;
import p006l.g6a;
import p006l.hab0;
import p006l.j5b0;
import p006l.x2c0;
import v.VIcon;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListShowcaseItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f7470a;

    /* JADX INFO: renamed from: b */
    public VIcon f7471b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f7472c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f7473d;

    /* JADX INFO: renamed from: e */
    public C0434a f7474e;

    /* JADX INFO: renamed from: f */
    public Coupon f7475f;

    /* JADX INFO: renamed from: g */
    public Runnable f7476g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem$a */
    public static class C0434a implements dv80 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f7477a;

        /* JADX INFO: renamed from: b */
        public final Merchandise f7478b;

        /* JADX INFO: renamed from: c */
        public final hab0 f7479c;

        /* JADX INFO: renamed from: d */
        public final j5b0 f7480d;

        public C0434a(PurchaseType purchaseType, Merchandise merchandise, hab0 hab0Var, j5b0 j5b0Var) {
            this.f7477a = purchaseType;
            this.f7478b = merchandise;
            this.f7479c = hab0Var;
            this.f7480d = j5b0Var;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 12;
        }
    }

    public PrivilegeDescListShowcaseItem(Context context) {
        super(context);
        this.f7476g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f22307a.m10735k();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10725a(VipFrag vipFrag, ef60 ef60Var, PurchaseType purchaseType) {
        if (NullChecker.a(ef60Var.getPaymentTrackSource())) {
            int iIntValue = ef60Var.getPaymentTrackSource().intValue();
            if (iIntValue == 4 || iIntValue == 3) {
                vipFrag.m10912R4().m16127s(ef60Var, purchaseType);
                return;
            }
            if (iIntValue == 2) {
                vipFrag.m10912R4().m16128t(ef60Var, purchaseType, true);
                return;
            }
            vipFrag.m10912R4().m16131x(ef60Var, purchaseType);
            if (g6a.m15597t() && NullChecker.a(ef60Var.getPaymentTextResponseData()) && ef60Var.getPaymentTextResponseData().getNeedTrackSticker()) {
                vipFrag.m10912R4().m16132y(ef60Var, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10727c(VipFrag vipFrag, PurchaseType purchaseType, j5b0 j5b0Var, List list) {
        if (vipFrag.f7593C.e() == purchaseType) {
            vipFrag.m10912R4().m16107C(j5b0Var.m7350M());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10731g(View view) {
        zw80.a(this, view);
    }

    @Nullable
    public Act getAct() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            return actE;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m10732h() {
        if (!g6a.m15597t()) {
            this.f7475f = null;
            return;
        }
        boolean zQ = sab0.q(this.f7474e.f7477a);
        C0434a c0434a = this.f7474e;
        if (zQ) {
            this.f7475f = c0434a.f7478b.getCouponForPromotionNew("lowPriceCustomerSVIP");
        } else if (sab0.w(c0434a.f7477a)) {
            this.f7475f = this.f7474e.f7478b.getCouponForPromotionNew("lowPriceCustomerVIP");
        } else {
            this.f7475f = null;
        }
        if (NullChecker.a(this.f7475f)) {
            m10735k();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10733i(final VipFrag vipFrag, final PurchaseType purchaseType, String str, final j5b0 j5b0Var) {
        d1m dab0Var = p2b0.h().z() ? new dab0(vipFrag.act(), purchaseType, str, j5b0Var) : new aab0(vipFrag.act(), purchaseType, str, j5b0Var);
        FrameLayout frameLayout = this.f7473d;
        frameLayout.addView(dab0Var.mo11783a(frameLayout));
        dab0Var.register();
        j5b0Var.m7346I(new AbstractC0212a.d() { // from class: l.uw80
            @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
            /* JADX INFO: renamed from: a */
            public final void mo7332a(d dVar, boolean z, boolean z2, d dVar2) {
                this.f23778a.m10734j(dVar, z, z2, dVar2);
            }
        });
        j5b0Var.m7344G(new AbstractC0212a.b() { // from class: l.vw80
            @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.b
            /* JADX INFO: renamed from: a */
            public final void mo7333a(ef60 ef60Var, PurchaseType purchaseType2) {
                PrivilegeDescListShowcaseItem.m10725a(vipFrag, ef60Var, purchaseType2);
            }
        });
        j5b0Var.m7347J(new AbstractC0212a.e() { // from class: l.ww80
            @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
            /* JADX INFO: renamed from: a */
            public final void mo7331a(List list) {
                PrivilegeDescListShowcaseItem.m10727c(vipFrag, purchaseType, j5b0Var, list);
            }
        });
        j5b0Var.mo7375w();
        vipFrag.duringCreated(vipFrag.f7593C).filter(new w9j() { // from class: l.xw80
            public final Object call(Object obj) {
                return Boolean.valueOf(purchaseType == ((PurchaseType) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yw80
            public final void call(Object obj) {
                vipFrag.m10912R4().m16107C(j5b0Var.m7350M());
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10734j(d dVar, boolean z, boolean z2, d dVar2) {
        if (NullChecker.a(this.f7474e) && z2) {
            boolean zA = NullChecker.a(dVar2);
            C0434a c0434a = this.f7474e;
            if (zA) {
                c0434a.f7479c.m16106B(dVar2);
            } else {
                c0434a.f7479c.m16106B(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10736l(C0434a c0434a) {
        this.f7475f = null;
        this.f7474e = c0434a;
        boolean zA = NullChecker.a(c0434a.f7478b);
        LinearLayout linearLayout = this.f7470a;
        if (zA) {
            xdl0.M(linearLayout, true);
            m10737m(c0434a.f7477a, c0434a.f7478b);
            m10732h();
        } else {
            xdl0.M(linearLayout, false);
        }
        c0434a.f7480d.m17278b0();
    }

    /* JADX INFO: renamed from: m */
    public final void m10737m(PurchaseType purchaseType, Merchandise merchandise) {
        if (sab0.x(purchaseType)) {
            this.f7470a.setBackgroundResource(x2c0.f26942nr);
            this.f7471b.setImageResource(x2c0.f26974or);
            this.f7472c.setTextColor(Color.parseColor("#6AA631"));
        } else if (sab0.g(purchaseType)) {
            this.f7470a.setBackgroundResource(x2c0.f26199Q7);
            this.f7471b.setImageResource(x2c0.f26230R7);
            this.f7472c.setTextColor(Color.parseColor("#EA74C5"));
        } else {
            boolean zW = sab0.w(purchaseType);
            LinearLayout linearLayout = this.f7470a;
            if (zW) {
                linearLayout.setBackgroundResource(x2c0.f26619dl);
                this.f7471b.setImageResource(x2c0.f26311Tq);
                this.f7472c.setTextColor(Color.parseColor("#E0DE9551"));
            } else {
                linearLayout.setBackgroundResource(x2c0.f26155Op);
                this.f7471b.setImageResource(x2c0.f26186Pp);
                this.f7472c.setTextColor(Color.parseColor("#E0F27310"));
            }
        }
        String strL = "限时特惠，支付立享优惠";
        if (sab0.g(purchaseType)) {
            if (NullChecker.a(merchandise)) {
                if (merchandise.isBelongPromotion("lowPriceCustomerFemaleVIP")) {
                    strL = p2b0.h().l(merchandise, merchandise.quantity);
                } else {
                    strL = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
                }
            }
        } else if (!sab0.x(purchaseType)) {
            strL = p2b0.h().l(merchandise, merchandise.quantity);
        } else if (NullChecker.a(merchandise)) {
            strL = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
        }
        this.f7472c.setText(strL);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m10735k() {
        Act act;
        if (this.f7475f == null || (act = getAct()) == null) {
            return;
        }
        e51.J(this.f7476g);
        j760 j760VarC = b1f.c(this.f7475f);
        StringBuilder sb = new StringBuilder();
        if (this.f7474e.f7478b.quantity == 1) {
            sb.append("首月低价，专属优惠，");
        } else if (this.f7474e.f7478b.quantity == 6) {
            sb.append("首6个月低价，专属优惠，");
        } else if (this.f7474e.f7478b.quantity == 12) {
            sb.append("首年低价，专属优惠，");
        } else {
            sb.append("新客优惠，");
        }
        sb.append((String) j760VarC.b);
        sb.append("到期");
        this.f7472c.setText(sb.toString());
        if (((Boolean) j760VarC.a).booleanValue()) {
            e51.H(act, this.f7476g, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (g6a.m15597t()) {
            e51.J(this.f7476g);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10731g(this);
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7476g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f22307a.m10735k();
            }
        };
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7476g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f22307a.m10735k();
            }
        };
    }
}
