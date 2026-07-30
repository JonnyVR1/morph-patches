package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p151v.VIcon;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.d590;
import p153l.dbc0;
import p153l.eib0;
import p153l.g2f;
import p153l.h390;
import p153l.hib0;
import p153l.jn60;
import p153l.l51;
import p153l.lib0;
import p153l.ndb0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.s7a;
import p153l.tab0;
import p153l.w3m;
import p153l.wib0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListShowcaseItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f38537a;

    /* JADX INFO: renamed from: b */
    public VIcon f38538b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f38539c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f38540d;

    /* JADX INFO: renamed from: e */
    public C9161a f38541e;

    /* JADX INFO: renamed from: f */
    public Coupon f38542f;

    /* JADX INFO: renamed from: g */
    public Runnable f38543g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem$a */
    public static class C9161a implements h390 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f38544a;

        /* JADX INFO: renamed from: b */
        public final Merchandise f38545b;

        /* JADX INFO: renamed from: c */
        public final lib0 f38546c;

        /* JADX INFO: renamed from: d */
        public final ndb0 f38547d;

        public C9161a(PurchaseType purchaseType, Merchandise merchandise, lib0 lib0Var, ndb0 ndb0Var) {
            this.f38544a = purchaseType;
            this.f38545b = merchandise;
            this.f38546c = lib0Var;
            this.f38547d = ndb0Var;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 12;
        }
    }

    public PrivilegeDescListShowcaseItem(Context context) {
        super(context);
        this.f38543g = new Runnable() { // from class: l.x490
            @Override // java.lang.Runnable
            public final void run() {
                this.f192358a.m58438k();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58428a(VipFrag vipFrag, jn60 jn60Var, PurchaseType purchaseType) {
        if (NullChecker.m82486a(jn60Var.getPaymentTrackSource())) {
            int iIntValue = jn60Var.getPaymentTrackSource().intValue();
            if (iIntValue == 4 || iIntValue == 3) {
                vipFrag.m58609R4().m154342s(jn60Var, purchaseType);
                return;
            }
            if (iIntValue == 2) {
                vipFrag.m58609R4().m154343t(jn60Var, purchaseType, true);
                return;
            }
            vipFrag.m58609R4().m154346x(jn60Var, purchaseType);
            if (s7a.m184991t() && NullChecker.m82486a(jn60Var.getPaymentTextResponseData()) && jn60Var.getPaymentTextResponseData().getNeedTrackSticker()) {
                vipFrag.m58609R4().m154347y(jn60Var, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58430c(VipFrag vipFrag, PurchaseType purchaseType, ndb0 ndb0Var, List list) {
        if (vipFrag.f38660C.m222761e() == purchaseType) {
            vipFrag.m58609R4().m154334C(ndb0Var.m55198M());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m58434g(View view) {
        d590.m114292a(this, view);
    }

    @Nullable
    public Act getAct() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            return (Act) activityM105508E;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m58435h() {
        if (!s7a.m184991t()) {
            this.f38542f = null;
            return;
        }
        boolean zM206573q = wib0.m206573q(this.f38541e.f38544a);
        C9161a c9161a = this.f38541e;
        if (zM206573q) {
            this.f38542f = c9161a.f38545b.getCouponForPromotionNew(MonetizationPromotionsId.lowPriceCustomerSVIP);
        } else if (wib0.m206579w(c9161a.f38544a)) {
            this.f38542f = this.f38541e.f38545b.getCouponForPromotionNew(MonetizationPromotionsId.lowPriceCustomerVIP);
        } else {
            this.f38542f = null;
        }
        if (NullChecker.m82486a(this.f38542f)) {
            m58438k();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m58436i(final VipFrag vipFrag, final PurchaseType purchaseType, String str, final ndb0 ndb0Var) {
        w3m hib0Var = tab0.m189811h().m189835z() ? new hib0(vipFrag.act(), purchaseType, str, ndb0Var) : new eib0(vipFrag.act(), purchaseType, str, ndb0Var);
        FrameLayout frameLayout = this.f38540d;
        frameLayout.addView(hib0Var.mo96551a(frameLayout));
        hib0Var.register();
        ndb0Var.m55194I(new AbstractC8939a.d() { // from class: l.y490
            @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
            /* JADX INFO: renamed from: a */
            public final void mo55180a(C8928d c8928d, boolean z, boolean z2, C8928d c8928d2) {
                this.f197441a.m58437j(c8928d, z, z2, c8928d2);
            }
        });
        ndb0Var.m55192G(new AbstractC8939a.b() { // from class: l.z490
            @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.b
            /* JADX INFO: renamed from: a */
            public final void mo55181a(jn60 jn60Var, PurchaseType purchaseType2) {
                PrivilegeDescListShowcaseItem.m58428a(vipFrag, jn60Var, purchaseType2);
            }
        });
        ndb0Var.m55195J(new AbstractC8939a.e() { // from class: l.a590
            @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
            /* JADX INFO: renamed from: a */
            public final void mo55179a(List list) {
                PrivilegeDescListShowcaseItem.m58430c(vipFrag, purchaseType, ndb0Var, list);
            }
        });
        ndb0Var.mo55223w();
        vipFrag.duringCreated(vipFrag.f38660C).filter(new qcj() { // from class: l.b590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(purchaseType == ((PurchaseType) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.c590
            @Override // p153l.y20
            public final void call(Object obj) {
                vipFrag.m58609R4().m154334C(ndb0Var.m55198M());
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m58437j(C8928d c8928d, boolean z, boolean z2, C8928d c8928d2) {
        if (NullChecker.m82486a(this.f38541e) && z2) {
            boolean zM82486a = NullChecker.m82486a(c8928d2);
            C9161a c9161a = this.f38541e;
            if (zM82486a) {
                c9161a.f38546c.m154333B(c8928d2);
            } else {
                c9161a.f38546c.m154333B(c8928d);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m58439l(C9161a c9161a) throws Exception {
        this.f38542f = null;
        this.f38541e = c9161a;
        boolean zM82486a = NullChecker.m82486a(c9161a.f38545b);
        LinearLayout linearLayout = this.f38537a;
        if (zM82486a) {
            bnl0.m105524M(linearLayout, true);
            m58440m(c9161a.f38544a, c9161a.f38545b);
            m58435h();
        } else {
            bnl0.m105524M(linearLayout, false);
        }
        c9161a.f38547d.m162676b0();
    }

    /* JADX INFO: renamed from: m */
    public final void m58440m(PurchaseType purchaseType, Merchandise merchandise) {
        if (wib0.m206580x(purchaseType)) {
            this.f38537a.setBackgroundResource(dbc0.f86870bs);
            this.f38538b.setImageResource(dbc0.f86903cs);
            this.f38539c.setTextColor(Color.parseColor("#6AA631"));
        } else if (wib0.m206563g(purchaseType)) {
            this.f38537a.setBackgroundResource(dbc0.f86528R7);
            this.f38538b.setImageResource(dbc0.f86560S7);
            this.f38539c.setTextColor(Color.parseColor("#EA74C5"));
        } else {
            boolean zM206579w = wib0.m206579w(purchaseType);
            LinearLayout linearLayout = this.f38537a;
            if (zM206579w) {
                linearLayout.setBackgroundResource(dbc0.f86542Rl);
                this.f38538b.setImageResource(dbc0.f86228Hr);
                this.f38539c.setTextColor(Color.parseColor("#E0DE9551"));
            } else {
                linearLayout.setBackgroundResource(dbc0.f86067Cq);
                this.f38538b.setImageResource(dbc0.f86099Dq);
                this.f38539c.setTextColor(Color.parseColor("#E0F27310"));
            }
        }
        String strM189821l = "限时特惠，支付立享优惠";
        if (wib0.m206563g(purchaseType)) {
            if (NullChecker.m82486a(merchandise)) {
                if (merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerFemaleVIP)) {
                    strM189821l = tab0.m189811h().m189821l(merchandise, merchandise.quantity);
                } else {
                    strM189821l = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
                }
            }
        } else if (!wib0.m206580x(purchaseType)) {
            strM189821l = tab0.m189811h().m189821l(merchandise, merchandise.quantity);
        } else if (NullChecker.m82486a(merchandise)) {
            strM189821l = String.format(Locale.getDefault(), "限时特惠，支付%.0f元立享优惠", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
        }
        this.f38539c.setText(strM189821l);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m58438k() {
        Act act;
        if (this.f38542f == null || (act = getAct()) == null) {
            return;
        }
        l51.m152890J(this.f38543g);
        pf60<Boolean, String> pf60VarM128611c = g2f.m128611c(this.f38542f);
        StringBuilder sb = new StringBuilder();
        if (this.f38541e.f38545b.quantity == 1) {
            sb.append("首月低价，专属优惠，");
        } else if (this.f38541e.f38545b.quantity == 6) {
            sb.append("首6个月低价，专属优惠，");
        } else if (this.f38541e.f38545b.quantity == 12) {
            sb.append("首年低价，专属优惠，");
        } else {
            sb.append("新客优惠，");
        }
        sb.append(pf60VarM128611c.f152157b);
        sb.append("到期");
        this.f38539c.setText(sb.toString());
        if (pf60VarM128611c.f152156a.booleanValue()) {
            l51.m152888H(act, this.f38543g, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (s7a.m184991t()) {
            l51.m152890J(this.f38543g);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58434g(this);
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38543g = new Runnable() { // from class: l.x490
            @Override // java.lang.Runnable
            public final void run() {
                this.f192358a.m58438k();
            }
        };
    }

    public PrivilegeDescListShowcaseItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38543g = new Runnable() { // from class: l.x490
            @Override // java.lang.Runnable
            public final void run() {
                this.f192358a.m58438k();
            }
        };
    }
}
