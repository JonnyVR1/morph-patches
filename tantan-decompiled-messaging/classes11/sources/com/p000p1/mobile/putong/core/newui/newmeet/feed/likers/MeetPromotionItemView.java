package com.p000p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.e6y;
import l.eqh0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p009l.mqi0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetPromotionItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f5003a;

    /* JADX INFO: renamed from: b */
    public VText f5004b;

    /* JADX INFO: renamed from: c */
    public VText f5005c;

    /* JADX INFO: renamed from: d */
    public VText f5006d;

    /* JADX INFO: renamed from: e */
    public DecimalFormat f5007e;

    /* JADX INFO: renamed from: f */
    public Merchandise f5008f;

    /* JADX INFO: renamed from: g */
    public Coupon f5009g;

    /* JADX INFO: renamed from: h */
    public double f5010h;

    /* JADX INFO: renamed from: i */
    public double f5011i;

    /* JADX INFO: renamed from: j */
    public List<Merchandise> f5012j;

    /* JADX INFO: renamed from: k */
    public d30 f5013k;

    /* JADX INFO: renamed from: l */
    public Runnable f5014l;

    public MeetPromotionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5007e = new DecimalFormat("#.#");
        this.f5014l = new Runnable() { // from class: l.b6y
            @Override // java.lang.Runnable
            public final void run() {
                this.f9922a.m7055j();
            }
        };
        m7049d(LayoutInflater.from(context), this);
        m7053h();
    }

    @Nullable
    private Act getAct() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            return actE;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m7049d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e6y.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m7050e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期，恢复原价");
        sb.append(this.f5007e.format(this.f5011i));
        sb.append("元");
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public void m7051f() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        if (this.f5009g.isBelongPromotion("lowPriceCallback3SVIP")) {
            CoreModule.P().g().wm(act, (e30) null, this.f5012j, "p_promotion,callback_other", (PayMethod) null, (Object) null);
        } else if (this.f5009g.isBelongPromotion("lowPriceCustomerSVIP")) {
            CoreModule.P().g().Cg(act, (e30) null, this.f5008f, this.f5009g, "p_meet,e_promotion_countdown_module,click", (PayMethod) null, (Object) null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7052g() {
        xdl0.E0(this.f5006d, new View.OnClickListener() { // from class: l.c6y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10449a.m7054i(view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m7053h() {
        this.f5004b.setTypeface(eqh0.c(3), 1);
        this.f5006d.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7054i(View view) {
        Coupon coupon;
        if (this.f5008f == null || (coupon = this.f5009g) == null) {
            return;
        }
        if (coupon.endTime - mqi0.m18550o() <= 0.0d) {
            lsi0.y("优惠券已到期");
            return;
        }
        m7051f();
        zvf0.u("e_promotion_countdown_module", "p_meet", new j760[]{vwb.Y("promotion_type", CoreModule.P().g().Z7(this.f5009g)), vwb.Y("duration", this.f5008f.quantity + "m")});
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7056k(PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && NullChecker.a(this.f5013k)) {
            this.f5013k.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7057l() {
        Act act = getAct();
        if (act == null) {
            return;
        }
        act.duringCreated(CoreModule.P().g().On()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.d6y
            public final void call(Object obj) {
                this.f11656a.m7056k((PaymentResultWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m7058m(j760<Merchandise, Coupon> j760Var, d30 d30Var) {
        Merchandise merchandise = this.f5008f;
        Object obj = j760Var.a;
        if (merchandise == obj && this.f5009g == j760Var.b) {
            return;
        }
        Merchandise merchandise2 = (Merchandise) obj;
        this.f5008f = merchandise2;
        Coupon coupon = (Coupon) j760Var.b;
        this.f5009g = coupon;
        this.f5011i = merchandise2.defaultStockKeepUnit.prices.price;
        this.f5010h = coupon.getCouponPrice();
        this.f5013k = d30Var;
        m7052g();
        m7055j();
        m7059n();
        m7057l();
        zvf0.A("e_promotion_countdown_module", "p_meet", new j760[]{vwb.Y("promotion_type", CoreModule.P().g().Z7(this.f5009g)), vwb.Y("duration", this.f5008f.quantity + "m")});
        if (this.f5009g.isBelongPromotion("lowPriceCallback3SVIP")) {
            this.f5012j = CoreModule.P().g().S7(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7059n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5007e.format(this.f5010h));
        sb.append("元解锁");
        this.f5006d.setText(sb);
    }

    /* JADX INFO: renamed from: o */
    public void m7060o(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append("立享优惠，解密喜欢我的");
            sb.append(zz6.q0(i));
            sb.append("人");
        } else {
            sb.append("立享优惠，解密谁喜欢我");
        }
        this.f5004b.setText(sb);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7055j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7062q();
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m7055j() {
        Act act;
        this.f5005c.setText("");
        if (this.f5009g == null || (act = getAct()) == null) {
            return;
        }
        j760 j760VarPk = CoreModule.P().g().pk(this.f5009g);
        this.f5005c.setText(m7050e((String) j760VarPk.b));
        e51.J(this.f5014l);
        if (((Boolean) j760VarPk.a).booleanValue()) {
            e51.H(act, this.f5014l, 1000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7062q() {
        e51.J(this.f5014l);
    }

    public MeetPromotionItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetPromotionItemView(Context context) {
        this(context, null);
    }
}
