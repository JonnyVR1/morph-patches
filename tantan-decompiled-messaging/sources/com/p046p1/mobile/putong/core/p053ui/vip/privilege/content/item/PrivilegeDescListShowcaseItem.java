package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p147v.VIcon;
import p147v.VText_AutoFit;
import p149l.aab0;
import p149l.b1f;
import p149l.d1m;
import p149l.dab0;
import p149l.dv80;
import p149l.e30;
import p149l.e51;
import p149l.ef60;
import p149l.g6a;
import p149l.hab0;
import p149l.j5b0;
import p149l.j760;
import p149l.mkd0;
import p149l.p2b0;
import p149l.sab0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zw80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListShowcaseItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f37689a;

    /* JADX INFO: renamed from: b */
    public VIcon f37690b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f37691c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f37692d;

    /* JADX INFO: renamed from: e */
    public C8998a f37693e;

    /* JADX INFO: renamed from: f */
    public Coupon f37694f;

    /* JADX INFO: renamed from: g */
    public Runnable f37695g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem$a */
    public static class C8998a implements dv80 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f37696a;

        /* JADX INFO: renamed from: b */
        public final Merchandise f37697b;

        /* JADX INFO: renamed from: c */
        public final hab0 f37698c;

        /* JADX INFO: renamed from: d */
        public final j5b0 f37699d;

        public C8998a(PurchaseType purchaseType, Merchandise merchandise, hab0 hab0Var, j5b0 j5b0Var) {
            this.f37696a = purchaseType;
            this.f37697b = merchandise;
            this.f37698c = hab0Var;
            this.f37699d = j5b0Var;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 12;
        }
    }

    public PrivilegeDescListShowcaseItem(Context context) {
        super(context);
        this.f37695g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f172379a.m57255k();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57245a(VipFrag vipFrag, ef60 ef60Var, PurchaseType purchaseType) {
        if (NullChecker.m81303a(ef60Var.getPaymentTrackSource())) {
            int iIntValue = ef60Var.getPaymentTrackSource().intValue();
            if (iIntValue == 4 || iIntValue == 3) {
                vipFrag.m57426R4().m130120s(ef60Var, purchaseType);
                return;
            }
            if (iIntValue == 2) {
                vipFrag.m57426R4().m130121t(ef60Var, purchaseType, true);
                return;
            }
            vipFrag.m57426R4().m130124x(ef60Var, purchaseType);
            if (g6a.m124571t() && NullChecker.m81303a(ef60Var.getPaymentTextResponseData()) && ef60Var.getPaymentTextResponseData().getNeedTrackSticker()) {
                vipFrag.m57426R4().m130125y(ef60Var, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57247c(VipFrag vipFrag, PurchaseType purchaseType, j5b0 j5b0Var, List list) {
        if (vipFrag.f37812C.m221515e() == purchaseType) {
            vipFrag.m57426R4().m130100C(j5b0Var.m54015M());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57251g(View view) {
        zw80.m220580a(this, view);
    }

    @Nullable
    public Act getAct() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            return (Act) activityM208328E;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m57252h() {
        if (!g6a.m124571t()) {
            this.f37694f = null;
            return;
        }
        boolean zM182899q = sab0.m182899q(this.f37693e.f37696a);
        C8998a c8998a = this.f37693e;
        if (zM182899q) {
            this.f37694f = c8998a.f37697b.getCouponForPromotionNew(MonetizationPromotionsId.lowPriceCustomerSVIP);
        } else if (sab0.m182905w(c8998a.f37696a)) {
            this.f37694f = this.f37693e.f37697b.getCouponForPromotionNew(MonetizationPromotionsId.lowPriceCustomerVIP);
        } else {
            this.f37694f = null;
        }
        if (NullChecker.m81303a(this.f37694f)) {
            m57255k();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m57253i(final VipFrag vipFrag, final PurchaseType purchaseType, String str, final j5b0 j5b0Var) {
        d1m dab0Var = p2b0.m167133h().m167157z() ? new dab0(vipFrag.act(), purchaseType, str, j5b0Var) : new aab0(vipFrag.act(), purchaseType, str, j5b0Var);
        FrameLayout frameLayout = this.f37692d;
        frameLayout.addView(dab0Var.mo95244a(frameLayout));
        dab0Var.register();
        j5b0Var.m54011I(new AbstractC8776a.d() { // from class: l.uw80
            @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
            /* JADX INFO: renamed from: a */
            public final void mo53997a(C8765d c8765d, boolean z, boolean z2, C8765d c8765d2) {
                this.f178630a.m57254j(c8765d, z, z2, c8765d2);
            }
        });
        j5b0Var.m54009G(new AbstractC8776a.b() { // from class: l.vw80
            @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.b
            /* JADX INFO: renamed from: a */
            public final void mo53998a(ef60 ef60Var, PurchaseType purchaseType2) {
                PrivilegeDescListShowcaseItem.m57245a(vipFrag, ef60Var, purchaseType2);
            }
        });
        j5b0Var.m54012J(new AbstractC8776a.e() { // from class: l.ww80
            @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
            /* JADX INFO: renamed from: a */
            public final void mo53996a(List list) {
                PrivilegeDescListShowcaseItem.m57247c(vipFrag, purchaseType, j5b0Var, list);
            }
        });
        j5b0Var.mo54040w();
        vipFrag.duringCreated(vipFrag.f37812C).filter(new w9j() { // from class: l.xw80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(purchaseType == ((PurchaseType) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yw80
            @Override // p149l.e30
            public final void call(Object obj) {
                vipFrag.m57426R4().m130100C(j5b0Var.m54015M());
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m57254j(C8765d c8765d, boolean z, boolean z2, C8765d c8765d2) {
        if (NullChecker.m81303a(this.f37693e) && z2) {
            boolean zM81303a = NullChecker.m81303a(c8765d2);
            C8998a c8998a = this.f37693e;
            if (zM81303a) {
                c8998a.f37698c.m130099B(c8765d2);
            } else {
                c8998a.f37698c.m130099B(c8765d);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m57256l(C8998a c8998a) throws Exception {
        this.f37694f = null;
        this.f37693e = c8998a;
        boolean zM81303a = NullChecker.m81303a(c8998a.f37697b);
        LinearLayout linearLayout = this.f37689a;
        if (zM81303a) {
            xdl0.m208344M(linearLayout, true);
            m57257m(c8998a.f37696a, c8998a.f37697b);
            m57252h();
        } else {
            xdl0.m208344M(linearLayout, false);
        }
        c8998a.f37699d.m139832b0();
    }

    /* JADX INFO: renamed from: m */
    public final void m57257m(PurchaseType purchaseType, Merchandise merchandise) {
        if (sab0.m182906x(purchaseType)) {
            this.f37689a.setBackgroundResource(x2c0.f190406nr);
            this.f37690b.setImageResource(x2c0.f190438or);
            this.f37691c.setTextColor(Color.parseColor("#6AA631"));
        } else if (sab0.m182889g(purchaseType)) {
            this.f37689a.setBackgroundResource(x2c0.f189663Q7);
            this.f37690b.setImageResource(x2c0.f189694R7);
            this.f37691c.setTextColor(Color.parseColor("#EA74C5"));
        } else {
            boolean zM182905w = sab0.m182905w(purchaseType);
            LinearLayout linearLayout = this.f37689a;
            if (zM182905w) {
                linearLayout.setBackgroundResource(x2c0.f190083dl);
                this.f37690b.setImageResource(x2c0.f189775Tq);
                this.f37691c.setTextColor(Color.parseColor("#E0DE9551"));
            } else {
                linearLayout.setBackgroundResource(x2c0.f189619Op);
                this.f37690b.setImageResource(x2c0.f189650Pp);
                this.f37691c.setTextColor(Color.parseColor("#E0F27310"));
            }
        }
        String strM167143l = "限时特惠，支付立享优惠";
        if (sab0.m182889g(purchaseType)) {
            if (NullChecker.m81303a(merchandise)) {
                if (merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerFemaleVIP)) {
                    strM167143l = p2b0.m167133h().m167143l(merchandise, merchandise.quantity);
                } else {
                    strM167143l = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
                }
            }
        } else if (!sab0.m182906x(purchaseType)) {
            strM167143l = p2b0.m167133h().m167143l(merchandise, merchandise.quantity);
        } else if (NullChecker.m81303a(merchandise)) {
            strM167143l = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
        }
        this.f37691c.setText(strM167143l);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m57255k() {
        Act act;
        if (this.f37694f == null || (act = getAct()) == null) {
            return;
        }
        e51.m114745J(this.f37695g);
        j760<Boolean, String> j760VarM99830c = b1f.m99830c(this.f37694f);
        StringBuilder sb = new StringBuilder();
        if (this.f37693e.f37697b.quantity == 1) {
            sb.append("首月低价，专属优惠，");
        } else if (this.f37693e.f37697b.quantity == 6) {
            sb.append("首6个月低价，专属优惠，");
        } else if (this.f37693e.f37697b.quantity == 12) {
            sb.append("首年低价，专属优惠，");
        } else {
            sb.append("新客优惠，");
        }
        sb.append(j760VarM99830c.f116565b);
        sb.append("到期");
        this.f37691c.setText(sb.toString());
        if (j760VarM99830c.f116564a.booleanValue()) {
            e51.m114743H(act, this.f37695g, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (g6a.m124571t()) {
            e51.m114745J(this.f37695g);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57251g(this);
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37695g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f172379a.m57255k();
            }
        };
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37695g = new Runnable() { // from class: l.tw80
            @Override // java.lang.Runnable
            public final void run() {
                this.f172379a.m57255k();
            }
        };
    }
}
