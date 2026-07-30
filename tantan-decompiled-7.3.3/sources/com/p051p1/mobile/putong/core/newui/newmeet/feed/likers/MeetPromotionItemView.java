package com.p051p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import p151v.VText;
import p153l.bfy;
import p153l.bnl0;
import p153l.c17;
import p153l.fo0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.lyh0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class MeetPromotionItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f26967a;

    /* JADX INFO: renamed from: b */
    public VText f26968b;

    /* JADX INFO: renamed from: c */
    public VText f26969c;

    /* JADX INFO: renamed from: d */
    public VText f26970d;

    /* JADX INFO: renamed from: e */
    public DecimalFormat f26971e;

    /* JADX INFO: renamed from: f */
    public Merchandise f26972f;

    /* JADX INFO: renamed from: g */
    public Coupon f26973g;

    /* JADX INFO: renamed from: h */
    public double f26974h;

    /* JADX INFO: renamed from: i */
    public double f26975i;

    /* JADX INFO: renamed from: j */
    public List<Merchandise> f26976j;

    /* JADX INFO: renamed from: k */
    public x20 f26977k;

    /* JADX INFO: renamed from: l */
    public Runnable f26978l;

    public MeetPromotionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26971e = new DecimalFormat("#.#");
        this.f26978l = new Runnable() { // from class: l.yey
            @Override // java.lang.Runnable
            public final void run() {
                this.f199432a.m43892j();
            }
        };
        m43886d(LayoutInflater.from(context), this);
        m43890h();
    }

    @Nullable
    private Act getAct() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            return (Act) activityM105508E;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m43886d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bfy.m104087b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m43887e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期，恢复原价");
        sb.append(this.f26971e.format(this.f26975i));
        sb.append("元");
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public void m43888f() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (this.f26973g.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            CoreModule.m30933P().m143410g().mo36084wm(act, null, this.f26976j, "p_promotion,callback_other", null, null);
        } else if (this.f26973g.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            CoreModule.m30933P().m143410g().mo36002Cg(act, null, this.f26972f, this.f26973g, "p_meet,e_promotion_countdown_module,click", null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43889g() {
        bnl0.m105509E0(this.f26970d, new View.OnClickListener() { // from class: l.zey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204093a.m43891i(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m43890h() {
        this.f26968b.setTypeface(lyh0.m156283c(3), 1);
        this.f26970d.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m43891i(View view) {
        Coupon coupon;
        if (this.f26972f == null || (coupon = this.f26973g) == null) {
            return;
        }
        if (coupon.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            o1j0.m165651y("优惠券已到期");
            return;
        }
        m43888f();
        i4g0.m138523u("e_promotion_countdown_module", "p_meet", jyb.m147494Y("promotion_type", CoreModule.m30933P().m143410g().mo36046Z7(this.f26973g)), jyb.m147494Y(BLiveOperationTitleShowType.duration, this.f26972f.quantity + "m"));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43893k(PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.m82486a(this.f26977k)) {
            this.f26977k.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m43894l() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        act.duringCreated(CoreModule.m30933P().m143410g().mo36025On()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.afy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71073a.m43893k((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m43895m(pf60<Merchandise, Coupon> pf60Var, x20 x20Var) {
        Merchandise merchandise = this.f26972f;
        Merchandise merchandise2 = pf60Var.f152156a;
        if (merchandise == merchandise2 && this.f26973g == pf60Var.f152157b) {
            return;
        }
        Merchandise merchandise3 = merchandise2;
        this.f26972f = merchandise3;
        Coupon coupon = pf60Var.f152157b;
        this.f26973g = coupon;
        this.f26975i = merchandise3.defaultStockKeepUnit.prices.price;
        this.f26974h = coupon.getCouponPrice();
        this.f26977k = x20Var;
        m43889g();
        m43892j();
        m43896n();
        m43894l();
        i4g0.m138492A("e_promotion_countdown_module", "p_meet", jyb.m147494Y("promotion_type", CoreModule.m30933P().m143410g().mo36046Z7(this.f26973g)), jyb.m147494Y(BLiveOperationTitleShowType.duration, this.f26972f.quantity + "m"));
        if (this.f26973g.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            this.f26976j = CoreModule.m30933P().m143410g().mo36031S7(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m43896n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26971e.format(this.f26974h));
        sb.append("元解锁");
        this.f26970d.setText(sb);
    }

    /* JADX INFO: renamed from: o */
    public void m43897o(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append("立享优惠，解密喜欢我的");
            sb.append(c17.m107524q0(i));
            sb.append("人");
        } else {
            sb.append("立享优惠，解密谁喜欢我");
        }
        this.f26968b.setText(sb);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m43892j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43899q();
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m43892j() {
        Act act;
        this.f26969c.setText("");
        if (this.f26973g == null || (act = getAct()) == null) {
            return;
        }
        pf60<Boolean, String> pf60VarMo36076pk = CoreModule.m30933P().m143410g().mo36076pk(this.f26973g);
        this.f26969c.setText(m43887e(pf60VarMo36076pk.f152157b));
        l51.m152890J(this.f26978l);
        if (pf60VarMo36076pk.f152156a.booleanValue()) {
            l51.m152888H(act, this.f26978l, 1000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m43899q() {
        l51.m152890J(this.f26978l);
    }

    public MeetPromotionItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetPromotionItemView(Context context) {
        this(context, null);
    }
}
