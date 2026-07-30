package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.c3c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.gbq;
import p149l.j760;
import p149l.knb0;
import p149l.mep0;
import p149l.mqi0;
import p149l.osi0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPendingPayment extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemPendingPayment f31336a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f31337b;

    /* JADX INFO: renamed from: c */
    public ImageView f31338c;

    /* JADX INFO: renamed from: d */
    public ImageView f31339d;

    /* JADX INFO: renamed from: e */
    public VText f31340e;

    /* JADX INFO: renamed from: f */
    public VText f31341f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f31342g;

    /* JADX INFO: renamed from: h */
    public VImage f31343h;

    /* JADX INFO: renamed from: i */
    public VText f31344i;

    /* JADX INFO: renamed from: j */
    public ImageView f31345j;

    /* JADX INFO: renamed from: k */
    public VText f31346k;

    /* JADX INFO: renamed from: l */
    public VLinear f31347l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f31348m;

    /* JADX INFO: renamed from: n */
    public VText f31349n;

    /* JADX INFO: renamed from: o */
    public Act f31350o;

    /* JADX INFO: renamed from: p */
    public Merchandise f31351p;

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance f31352q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f31353r;

    /* JADX INFO: renamed from: s */
    public PayMethod f31354s;

    /* JADX INFO: renamed from: t */
    public Coupon f31355t;

    /* JADX INFO: renamed from: u */
    public String f31356u;

    /* JADX INFO: renamed from: v */
    public Runnable f31357v;

    /* JADX INFO: renamed from: w */
    public DecimalFormat f31358w;

    public ItemPendingPayment(Context context) {
        super(context);
        this.f31353r = PurchaseType.TYPE_GET_VIP;
        this.f31354s = PayMethod.get("alipay");
        this.f31357v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f68741a.m48553v();
            }
        };
        this.f31358w = new DecimalFormat("#.#");
    }

    private String getSubTitle() {
        double couponPrice = this.f31351p.defaultStockKeepUnit.prices.price;
        if (m48561o() && NullChecker.m81303a(this.f31355t)) {
            long jM155944o = mqi0.m155944o();
            Coupon coupon = this.f31355t;
            if (coupon.endTime - jM155944o > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                couponPrice = coupon.getCouponPrice();
            }
        }
        return String.format("%s个月仅需%s元", Integer.valueOf(this.f31351p.quantity), this.f31358w.format(couponPrice));
    }

    private void setNoDataView(boolean z) {
        if (z) {
            m48567w();
            this.f31341f.setText(R$string.f21123x6);
        } else {
            xdl0.m208344M(this.f31342g, true);
            xdl0.m208344M(this.f31347l, true);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m48552u() {
        CoreModule.f17554l.m94656g().mo35000Ci(this.f31350o, this.f31351p, this.f31353r, this.f31354s, this.f31356u, this.f31352q, this.f31355t, "p_navigation,privilege_button", new e30() { // from class: l.fbq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96740a.m48565s((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m48553v() {
        e51.m114745J(this.f31357v);
        if (m48555h()) {
            m48567w();
            return;
        }
        j760<Boolean, String> j760VarMo35079vt = CoreModule.f17554l.m94656g().mo35079vt(this.f31352q.endTime);
        this.f31346k.setText(m48557j(j760VarMo35079vt.f116565b));
        if (Boolean.TRUE.equals(j760VarMo35079vt.f116564a)) {
            e51.m114743H(this.f31350o, this.f31357v, 1000L);
        } else {
            m48567w();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31355t = null;
        setNoDataView(true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m48554g(View view) {
        gbq.m125327a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48555h() {
        long jMo34994Ag = CoreModule.m29935P().m94656g().mo34994Ag();
        long j = this.f31352q.endTime;
        if (j < jMo34994Ag) {
            return true;
        }
        if (j > jMo34994Ag) {
            CoreModule.m29935P().m94656g().mo35065lf(this.f31352q.endTime);
        }
        return this.f31352q.endTime - mqi0.m155944o() <= 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48556i() {
        if (!m48555h() && CoreModule.m29935P().m94656g().mo35031Sj()) {
            return true;
        }
        m48567w();
        e51.m114745J(this.f31357v);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final StringBuilder m48557j(String str) {
        StringBuilder sb = new StringBuilder();
        if (CoreModule.m29935P().m94656g().mo35068ng(this.f31352q.guideType, this.f31354s, this.f31353r)) {
            sb.append("免密支付·");
        } else {
            sb.append("去支付·");
        }
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public final void m48558k() {
        if (m48561o() && NullChecker.m81303a(this.f31355t)) {
            if (this.f31355t.endTime - mqi0.m155944o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                osi0.m165783g("优惠券已过期");
                CoreModule.f17545c.f19634c1.m137864N3();
                return;
            }
        }
        if (!m48560n() || this.f31348m.isChecked()) {
            m48552u();
        } else {
            CoreModule.f17554l.m94656g().mo35076td(this.f31350o, this.f31351p, this.f31354s, Boolean.valueOf(CoreModule.m29935P().m94656g().mo35068ng(this.f31352q.guideType, this.f31354s, this.f31353r)), this.f31353r, OMSDialogPositon.p_chat_view, CoreModule.f17554l.m94656g().mo35033Uk(this.f31352q.guideType), this.f31356u, new d30() { // from class: l.ebq
                @Override // p149l.d30
                public final void call() {
                    this.f90373a.m48562p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m48559l() {
        xdl0.m208329E0(this.f31342g, new View.OnClickListener() { // from class: l.bbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74871a.m48563q(view);
            }
        });
        xdl0.m208329E0(this.f31346k, new View.OnClickListener() { // from class: l.cbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80177a.m48564r(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final boolean m48560n() {
        return CoreModule.m29935P().m94656g().mo35020Of(this.f31351p, this.f31352q.guideType);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m48561o() {
        return CoreModule.m29935P().m94656g().mo35003D7(this.f31352q.guideType);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f31357v);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48554g(this);
        mep0.m154301c1(this.f31337b, 0, 0, 0, 0, t100.f167260i);
        this.f31350o = (Act) xdl0.m208328E(this);
        m48559l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m48562p() {
        this.f31348m.setChecked(true);
        m48558k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m48563q(View view) {
        if (this.f31351p == null || this.f31352q == null) {
            return;
        }
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.f17554l.m94656g();
        PendingPaymentGuidance pendingPaymentGuidance = this.f31352q;
        CoreModule.f17554l.m94656g().mo35012Gs(this.f31350o, this.f31353r, this.f31354s, this.f31352q.guideType, corePayInnerServiceM94656g.mo35070om(pendingPaymentGuidance.guideType, this.f31351p, pendingPaymentGuidance.platform), new e30() { // from class: l.dbq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85335a.m48566t((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m48564r(View view) {
        if (this.f31351p == null || this.f31352q == null) {
            return;
        }
        m48556i();
        if (TextUtils.equals(this.f31346k.getText(), "查看会员权益")) {
            zvf0.m220399u("e_vas_guide_assistant", OMSDialogPositon.p_chat_view, vwb.m200311Y("vas_guide_type", CoreModule.f17554l.m94656g().mo35060fj(this.f31352q.guideType)));
            CoreModule.m29935P().m94651a().mo33569qd(this.f31350o, "p_privilege,assistant_guide", CoreModule.f17554l.m94656g().mo35015Jf(this.f31351p.category));
        } else {
            m48568x();
            m48558k();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m48565s(Integer num) {
        e51.m114745J(this.f31357v);
    }

    /* JADX INFO: renamed from: t */
    public final void m48566t(PayMethod payMethod) {
        this.f31354s = payMethod;
        if (TEnum.equals(payMethod, "wechat")) {
            this.f31344i.setText("微信支付");
            this.f31343h.setImageResource(c3c0.f78618Q6);
        } else {
            this.f31344i.setText(CoreModule.m29935P().m94656g().mo35068ng(this.f31352q.guideType, this.f31354s, this.f31353r) ? "支付宝免密支付" : "支付宝");
            this.f31343h.setImageResource(c3c0.f78609P6);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m48567w() {
        xdl0.m208344M(this.f31342g, false);
        xdl0.m208344M(this.f31347l, false);
        this.f31346k.setText("查看会员权益");
    }

    /* JADX INFO: renamed from: x */
    public final void m48568x() {
        this.f31356u = CoreModule.f17554l.m94656g().mo35030Sb(this.f31351p, this.f31354s, false, CoreModule.m29935P().m94656g().mo35068ng(this.f31352q.guideType, this.f31354s, this.f31353r), CoreModule.f17554l.m94656g().mo35033Uk(this.f31352q.guideType), OMSDialogPositon.p_chat_view);
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31353r = PurchaseType.TYPE_GET_VIP;
        this.f31354s = PayMethod.get("alipay");
        this.f31357v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f68741a.m48553v();
            }
        };
        this.f31358w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31353r = PurchaseType.TYPE_GET_VIP;
        this.f31354s = PayMethod.get("alipay");
        this.f31357v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f68741a.m48553v();
            }
        };
        this.f31358w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31353r = PurchaseType.TYPE_GET_VIP;
        this.f31354s = PayMethod.get("alipay");
        this.f31357v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f68741a.m48553v();
            }
        };
        this.f31358w = new DecimalFormat("#.#");
    }
}
