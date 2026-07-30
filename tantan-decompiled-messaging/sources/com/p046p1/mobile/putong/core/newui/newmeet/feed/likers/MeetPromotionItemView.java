package com.p046p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.e6y;
import p149l.eqh0;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class MeetPromotionItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f26225a;

    /* JADX INFO: renamed from: b */
    public VText f26226b;

    /* JADX INFO: renamed from: c */
    public VText f26227c;

    /* JADX INFO: renamed from: d */
    public VText f26228d;

    /* JADX INFO: renamed from: e */
    public DecimalFormat f26229e;

    /* JADX INFO: renamed from: f */
    public Merchandise f26230f;

    /* JADX INFO: renamed from: g */
    public Coupon f26231g;

    /* JADX INFO: renamed from: h */
    public double f26232h;

    /* JADX INFO: renamed from: i */
    public double f26233i;

    /* JADX INFO: renamed from: j */
    public List<Merchandise> f26234j;

    /* JADX INFO: renamed from: k */
    public d30 f26235k;

    /* JADX INFO: renamed from: l */
    public Runnable f26236l;

    public MeetPromotionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26229e = new DecimalFormat("#.#");
        this.f26236l = new Runnable() { // from class: l.b6y
            @Override // java.lang.Runnable
            public final void run() {
                this.f73889a.m42881j();
            }
        };
        m42875d(LayoutInflater.from(context), this);
        m42879h();
    }

    @Nullable
    private Act getAct() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            return (Act) activityM208328E;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m42875d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e6y.m115121b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m42876e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期，恢复原价");
        sb.append(this.f26229e.format(this.f26233i));
        sb.append("元");
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public void m42877f() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (this.f26231g.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            CoreModule.m29935P().m94656g().mo35081wm(act, null, this.f26234j, "p_promotion,callback_other", null, null);
        } else if (this.f26231g.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            CoreModule.m29935P().m94656g().mo34999Cg(act, null, this.f26230f, this.f26231g, "p_meet,e_promotion_countdown_module,click", null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m42878g() {
        xdl0.m208329E0(this.f26228d, new View.OnClickListener() { // from class: l.c6y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79580a.m42880i(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m42879h() {
        this.f26226b.setTypeface(eqh0.m117752c(3), 1);
        this.f26228d.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m42880i(View view) {
        Coupon coupon;
        if (this.f26230f == null || (coupon = this.f26231g) == null) {
            return;
        }
        if (coupon.endTime - mqi0.m155944o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            lsi0.m151595y("优惠券已到期");
            return;
        }
        m42877f();
        zvf0.m220399u("e_promotion_countdown_module", "p_meet", vwb.m200311Y("promotion_type", CoreModule.m29935P().m94656g().mo35043Z7(this.f26231g)), vwb.m200311Y(BLiveOperationTitleShowType.duration, this.f26230f.quantity + "m"));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m42882k(PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.m81303a(this.f26235k)) {
            this.f26235k.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m42883l() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        act.duringCreated(CoreModule.m29935P().m94656g().mo35022On()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.d6y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84685a.m42882k((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m42884m(j760<Merchandise, Coupon> j760Var, d30 d30Var) {
        Merchandise merchandise = this.f26230f;
        Merchandise merchandise2 = j760Var.f116564a;
        if (merchandise == merchandise2 && this.f26231g == j760Var.f116565b) {
            return;
        }
        Merchandise merchandise3 = merchandise2;
        this.f26230f = merchandise3;
        Coupon coupon = j760Var.f116565b;
        this.f26231g = coupon;
        this.f26233i = merchandise3.defaultStockKeepUnit.prices.price;
        this.f26232h = coupon.getCouponPrice();
        this.f26235k = d30Var;
        m42878g();
        m42881j();
        m42885n();
        m42883l();
        zvf0.m220368A("e_promotion_countdown_module", "p_meet", vwb.m200311Y("promotion_type", CoreModule.m29935P().m94656g().mo35043Z7(this.f26231g)), vwb.m200311Y(BLiveOperationTitleShowType.duration, this.f26230f.quantity + "m"));
        if (this.f26231g.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            this.f26234j = CoreModule.m29935P().m94656g().mo35028S7(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m42885n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26229e.format(this.f26232h));
        sb.append("元解锁");
        this.f26228d.setText(sb);
    }

    /* JADX INFO: renamed from: o */
    public void m42886o(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append("立享优惠，解密喜欢我的");
            sb.append(zz6.m221000q0(i));
            sb.append("人");
        } else {
            sb.append("立享优惠，解密谁喜欢我");
        }
        this.f26226b.setText(sb);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m42881j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42888q();
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m42881j() {
        Act act;
        this.f26227c.setText("");
        if (this.f26231g == null || (act = getAct()) == null) {
            return;
        }
        j760<Boolean, String> j760VarMo35073pk = CoreModule.m29935P().m94656g().mo35073pk(this.f26231g);
        this.f26227c.setText(m42876e(j760VarMo35073pk.f116565b));
        e51.m114745J(this.f26236l);
        if (j760VarMo35073pk.f116564a.booleanValue()) {
            e51.m114743H(act, this.f26236l, 1000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m42888q() {
        e51.m114745J(this.f26236l);
    }

    public MeetPromotionItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetPromotionItemView(Context context) {
        this(context, null);
    }
}
