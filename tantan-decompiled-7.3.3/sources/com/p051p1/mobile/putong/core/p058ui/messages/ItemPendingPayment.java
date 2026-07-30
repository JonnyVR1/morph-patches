package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gdq;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.qnp0;
import p153l.r1j0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPendingPayment extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemPendingPayment f32184a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f32185b;

    /* JADX INFO: renamed from: c */
    public ImageView f32186c;

    /* JADX INFO: renamed from: d */
    public ImageView f32187d;

    /* JADX INFO: renamed from: e */
    public VText f32188e;

    /* JADX INFO: renamed from: f */
    public VText f32189f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f32190g;

    /* JADX INFO: renamed from: h */
    public VImage f32191h;

    /* JADX INFO: renamed from: i */
    public VText f32192i;

    /* JADX INFO: renamed from: j */
    public ImageView f32193j;

    /* JADX INFO: renamed from: k */
    public VText f32194k;

    /* JADX INFO: renamed from: l */
    public VLinear f32195l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f32196m;

    /* JADX INFO: renamed from: n */
    public VText f32197n;

    /* JADX INFO: renamed from: o */
    public Act f32198o;

    /* JADX INFO: renamed from: p */
    public Merchandise f32199p;

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance f32200q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f32201r;

    /* JADX INFO: renamed from: s */
    public PayMethod f32202s;

    /* JADX INFO: renamed from: t */
    public Coupon f32203t;

    /* JADX INFO: renamed from: u */
    public String f32204u;

    /* JADX INFO: renamed from: v */
    public Runnable f32205v;

    /* JADX INFO: renamed from: w */
    public DecimalFormat f32206w;

    public ItemPendingPayment(Context context) {
        super(context);
        this.f32201r = PurchaseType.TYPE_GET_VIP;
        this.f32202s = PayMethod.get("alipay");
        this.f32205v = new Runnable() { // from class: l.adq
            @Override // java.lang.Runnable
            public final void run() {
                this.f70722a.m49736v();
            }
        };
        this.f32206w = new DecimalFormat("#.#");
    }

    private String getSubTitle() {
        double couponPrice = this.f32199p.defaultStockKeepUnit.prices.price;
        if (m49744o() && NullChecker.m82486a(this.f32203t)) {
            long jM174454o = pzi0.m174454o();
            Coupon coupon = this.f32203t;
            if (coupon.endTime - jM174454o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                couponPrice = coupon.getCouponPrice();
            }
        }
        return String.format("%s个月仅需%s元", Integer.valueOf(this.f32199p.quantity), this.f32206w.format(couponPrice));
    }

    private void setNoDataView(boolean z) {
        if (z) {
            m49750w();
            this.f32189f.setText(R$string.f21865x6);
        } else {
            bnl0.m105524M(this.f32190g, true);
            bnl0.m105524M(this.f32195l, true);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m49735u() {
        CoreModule.f18273l.m143410g().mo36003Ci(this.f32198o, this.f32199p, this.f32201r, this.f32202s, this.f32204u, this.f32200q, this.f32203t, "p_navigation,privilege_button", new y20() { // from class: l.fdq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98491a.m49748s((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m49736v() {
        l51.m152890J(this.f32205v);
        if (m49738h()) {
            m49750w();
            return;
        }
        pf60<Boolean, String> pf60VarMo36082vt = CoreModule.f18273l.m143410g().mo36082vt(this.f32200q.endTime);
        this.f32194k.setText(m49740j(pf60VarMo36082vt.f152157b));
        if (Boolean.TRUE.equals(pf60VarMo36082vt.f152156a)) {
            l51.m152888H(this.f32198o, this.f32205v, 1000L);
        } else {
            m49750w();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32203t = null;
        setNoDataView(true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m49737g(View view) {
        gdq.m129937a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m49738h() {
        long jMo35997Ag = CoreModule.m30933P().m143410g().mo35997Ag();
        long j = this.f32200q.endTime;
        if (j < jMo35997Ag) {
            return true;
        }
        if (j > jMo35997Ag) {
            CoreModule.m30933P().m143410g().mo36068lf(this.f32200q.endTime);
        }
        return this.f32200q.endTime - pzi0.m174454o() <= 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m49739i() {
        if (!m49738h() && CoreModule.m30933P().m143410g().mo36034Sj()) {
            return true;
        }
        m49750w();
        l51.m152890J(this.f32205v);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final StringBuilder m49740j(String str) {
        StringBuilder sb = new StringBuilder();
        if (CoreModule.m30933P().m143410g().mo36071ng(this.f32200q.guideType, this.f32202s, this.f32201r)) {
            sb.append("免密支付·");
        } else {
            sb.append("去支付·");
        }
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public final void m49741k() {
        if (m49744o() && NullChecker.m82486a(this.f32203t)) {
            if (this.f32203t.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                r1j0.m179420g("优惠券已过期");
                CoreModule.f18264c.f20376c1.m197851N3();
                return;
            }
        }
        if (!m49743n() || this.f32196m.isChecked()) {
            m49735u();
        } else {
            CoreModule.f18273l.m143410g().mo36079td(this.f32198o, this.f32199p, this.f32202s, Boolean.valueOf(CoreModule.m30933P().m143410g().mo36071ng(this.f32200q.guideType, this.f32202s, this.f32201r)), this.f32201r, OMSDialogPositon.p_chat_view, CoreModule.f18273l.m143410g().mo36036Uk(this.f32200q.guideType), this.f32204u, new x20() { // from class: l.edq
                @Override // p153l.x20
                public final void call() {
                    this.f93569a.m49745p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m49742l() {
        bnl0.m105509E0(this.f32190g, new View.OnClickListener() { // from class: l.bdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76286a.m49746q(view);
            }
        });
        bnl0.m105509E0(this.f32194k, new View.OnClickListener() { // from class: l.cdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81258a.m49747r(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final boolean m49743n() {
        return CoreModule.m30933P().m143410g().mo36023Of(this.f32199p, this.f32200q.guideType);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m49744o() {
        return CoreModule.m30933P().m143410g().mo36006D7(this.f32200q.guideType);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f32205v);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49737g(this);
        qnp0.m177260c1(this.f32185b, 0, 0, 0, 0, qa00.f156322i);
        this.f32198o = (Act) bnl0.m105508E(this);
        m49742l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m49745p() {
        this.f32196m.setChecked(true);
        m49741k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m49746q(View view) {
        if (this.f32199p == null || this.f32200q == null) {
            return;
        }
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.f18273l.m143410g();
        PendingPaymentGuidance pendingPaymentGuidance = this.f32200q;
        CoreModule.f18273l.m143410g().mo36015Gs(this.f32198o, this.f32201r, this.f32202s, this.f32200q.guideType, corePayInnerServiceM143410g.mo36073om(pendingPaymentGuidance.guideType, this.f32199p, pendingPaymentGuidance.platform), new y20() { // from class: l.ddq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87957a.m49749t((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m49747r(View view) {
        if (this.f32199p == null || this.f32200q == null) {
            return;
        }
        m49739i();
        if (TextUtils.equals(this.f32194k.getText(), "查看会员权益")) {
            i4g0.m138523u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, jyb.m147494Y("vas_guide_type", CoreModule.f18273l.m143410g().mo36063fj(this.f32200q.guideType)));
            CoreModule.m30933P().m143405a().mo34572qd(this.f32198o, "p_privilege,assistant_guide", CoreModule.f18273l.m143410g().mo36018Jf(this.f32199p.category));
        } else {
            m49751x();
            m49741k();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m49748s(Integer num) {
        l51.m152890J(this.f32205v);
    }

    /* JADX INFO: renamed from: t */
    public final void m49749t(PayMethod payMethod) {
        this.f32202s = payMethod;
        if (TEnum.equals(payMethod, "wechat")) {
            this.f32192i.setText("微信支付");
            this.f32191h.setImageResource(ibc0.f113893Q6);
        } else {
            this.f32192i.setText(CoreModule.m30933P().m143410g().mo36071ng(this.f32200q.guideType, this.f32202s, this.f32201r) ? "支付宝免密支付" : "支付宝");
            this.f32191h.setImageResource(ibc0.f113884P6);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m49750w() {
        bnl0.m105524M(this.f32190g, false);
        bnl0.m105524M(this.f32195l, false);
        this.f32194k.setText("查看会员权益");
    }

    /* JADX INFO: renamed from: x */
    public final void m49751x() {
        this.f32204u = CoreModule.f18273l.m143410g().mo36033Sb(this.f32199p, this.f32202s, false, CoreModule.m30933P().m143410g().mo36071ng(this.f32200q.guideType, this.f32202s, this.f32201r), CoreModule.f18273l.m143410g().mo36036Uk(this.f32200q.guideType), OMSDialogPositon.p_chat_view);
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32201r = PurchaseType.TYPE_GET_VIP;
        this.f32202s = PayMethod.get("alipay");
        this.f32205v = new Runnable() { // from class: l.adq
            @Override // java.lang.Runnable
            public final void run() {
                this.f70722a.m49736v();
            }
        };
        this.f32206w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32201r = PurchaseType.TYPE_GET_VIP;
        this.f32202s = PayMethod.get("alipay");
        this.f32205v = new Runnable() { // from class: l.adq
            @Override // java.lang.Runnable
            public final void run() {
                this.f70722a.m49736v();
            }
        };
        this.f32206w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32201r = PurchaseType.TYPE_GET_VIP;
        this.f32202s = PayMethod.get("alipay");
        this.f32205v = new Runnable() { // from class: l.adq
            @Override // java.lang.Runnable
            public final void run() {
                this.f70722a.m49736v();
            }
        };
        this.f32206w = new DecimalFormat("#.#");
    }
}
