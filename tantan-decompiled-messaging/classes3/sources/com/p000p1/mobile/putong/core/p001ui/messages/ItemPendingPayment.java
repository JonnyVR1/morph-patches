package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import l.c3c0;
import l.e51;
import l.gbq;
import l.j760;
import l.knb0;
import l.mqi0;
import l.osi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.d30;
import p003l.e30;
import p003l.mep0;
import p028v.VCheckBox;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPendingPayment extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemPendingPayment f1227a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f1228b;

    /* JADX INFO: renamed from: c */
    public ImageView f1229c;

    /* JADX INFO: renamed from: d */
    public ImageView f1230d;

    /* JADX INFO: renamed from: e */
    public VText f1231e;

    /* JADX INFO: renamed from: f */
    public VText f1232f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f1233g;

    /* JADX INFO: renamed from: h */
    public VImage f1234h;

    /* JADX INFO: renamed from: i */
    public VText f1235i;

    /* JADX INFO: renamed from: j */
    public ImageView f1236j;

    /* JADX INFO: renamed from: k */
    public VText f1237k;

    /* JADX INFO: renamed from: l */
    public VLinear f1238l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f1239m;

    /* JADX INFO: renamed from: n */
    public VText f1240n;

    /* JADX INFO: renamed from: o */
    public Act f1241o;

    /* JADX INFO: renamed from: p */
    public Merchandise f1242p;

    /* JADX INFO: renamed from: q */
    public PendingPaymentGuidance f1243q;

    /* JADX INFO: renamed from: r */
    public PurchaseType f1244r;

    /* JADX INFO: renamed from: s */
    public PayMethod f1245s;

    /* JADX INFO: renamed from: t */
    public Coupon f1246t;

    /* JADX INFO: renamed from: u */
    public String f1247u;

    /* JADX INFO: renamed from: v */
    public Runnable f1248v;

    /* JADX INFO: renamed from: w */
    public DecimalFormat f1249w;

    public ItemPendingPayment(Context context) {
        super(context);
        this.f1244r = PurchaseType.TYPE_GET_VIP;
        this.f1245s = PayMethod.get("alipay");
        this.f1248v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2104a.m1637v();
            }
        };
        this.f1249w = new DecimalFormat("#.#");
    }

    private String getSubTitle() {
        double couponPrice = this.f1242p.defaultStockKeepUnit.prices.price;
        if (m1645o() && NullChecker.a(this.f1246t)) {
            long jO = mqi0.o();
            Coupon coupon = this.f1246t;
            if (coupon.endTime - jO > 0.0d) {
                couponPrice = coupon.getCouponPrice();
            }
        }
        return String.format("%s个月仅需%s元", Integer.valueOf(this.f1242p.quantity), this.f1249w.format(couponPrice));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setNoDataView(boolean z) {
        if (z) {
            m1651w();
            this.f1232f.setText(R.string.x6);
        } else {
            xdl0.M(this.f1233g, true);
            xdl0.M(this.f1238l, true);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m1636u() {
        CoreModule.l.g().Ci(this.f1241o, this.f1242p, this.f1244r, this.f1245s, this.f1247u, this.f1243q, this.f1246t, "p_navigation,privilege_button", new e30() { // from class: l.fbq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3488a.m1649s((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m1637v() {
        e51.J(this.f1248v);
        if (m1639h()) {
            m1651w();
            return;
        }
        j760 j760VarVt = CoreModule.l.g().vt(this.f1243q.endTime);
        this.f1237k.setText(m1641j((String) j760VarVt.b));
        if (Boolean.TRUE.equals(j760VarVt.a)) {
            e51.H(this.f1241o, this.f1248v, 1000L);
        } else {
            m1651w();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1246t = null;
        setNoDataView(true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m1638g(View view) {
        gbq.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1639h() {
        long jAg = CoreModule.P().g().Ag();
        long j = this.f1243q.endTime;
        if (j < jAg) {
            return true;
        }
        if (j > jAg) {
            CoreModule.P().g().lf(this.f1243q.endTime);
        }
        return this.f1243q.endTime - mqi0.o() <= 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1640i() {
        if (!m1639h() && CoreModule.P().g().Sj()) {
            return true;
        }
        m1651w();
        e51.J(this.f1248v);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final StringBuilder m1641j(String str) {
        StringBuilder sb = new StringBuilder();
        if (CoreModule.P().g().ng(this.f1243q.guideType, this.f1245s, this.f1244r)) {
            sb.append("免密支付·");
        } else {
            sb.append("去支付·");
        }
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public final void m1642k() {
        if (m1645o() && NullChecker.a(this.f1246t)) {
            if (this.f1246t.endTime - mqi0.o() <= 0.0d) {
                osi0.g("优惠券已过期");
                CoreModule.c.c1.N3();
                return;
            }
        }
        if (!m1644n() || this.f1239m.isChecked()) {
            m1636u();
        } else {
            CoreModule.l.g().td(this.f1241o, this.f1242p, this.f1245s, Boolean.valueOf(CoreModule.P().g().ng(this.f1243q.guideType, this.f1245s, this.f1244r)), this.f1244r, "p_chat_view", CoreModule.l.g().Uk(this.f1243q.guideType), this.f1247u, new d30() { // from class: l.ebq
                @Override // p003l.d30
                public final void call() {
                    this.f3246a.m1646p();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1643l() {
        xdl0.E0(this.f1233g, new View.OnClickListener() { // from class: l.bbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2369a.m1647q(view);
            }
        });
        xdl0.E0(this.f1237k, new View.OnClickListener() { // from class: l.cbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2612a.m1648r(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1644n() {
        return CoreModule.P().g().Of(this.f1242p, this.f1243q.guideType);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1645o() {
        return CoreModule.P().g().D7(this.f1243q.guideType);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.J(this.f1248v);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1638g(this);
        mep0.m6389c1(this.f1228b, 0, 0, 0, 0, t100.i);
        this.f1241o = xdl0.E(this);
        m1643l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1646p() {
        this.f1239m.setChecked(true);
        m1642k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1647q(View view) {
        if (this.f1242p == null || this.f1243q == null) {
            return;
        }
        CorePayInnerService corePayInnerServiceG = CoreModule.l.g();
        PendingPaymentGuidance pendingPaymentGuidance = this.f1243q;
        CoreModule.l.g().Gs(this.f1241o, this.f1244r, this.f1245s, this.f1243q.guideType, corePayInnerServiceG.om(pendingPaymentGuidance.guideType, this.f1242p, pendingPaymentGuidance.platform), new e30() { // from class: l.dbq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2934a.m1650t((PayMethod) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m1648r(View view) {
        if (this.f1242p == null || this.f1243q == null) {
            return;
        }
        m1640i();
        if (TextUtils.equals(this.f1237k.getText(), "查看会员权益")) {
            zvf0.u("e_vas_guide_assistant", "p_chat_view", new j760[]{vwb.Y("vas_guide_type", CoreModule.l.g().fj(this.f1243q.guideType))});
            CoreModule.P().a().qd(this.f1241o, "p_privilege,assistant_guide", CoreModule.l.g().Jf(this.f1242p.category));
        } else {
            m1652x();
            m1642k();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m1649s(Integer num) {
        e51.J(this.f1248v);
    }

    /* JADX INFO: renamed from: t */
    public final void m1650t(PayMethod payMethod) {
        this.f1245s = payMethod;
        if (TEnum.equals(payMethod, "wechat")) {
            this.f1235i.setText("微信支付");
            this.f1234h.setImageResource(c3c0.Q6);
        } else {
            this.f1235i.setText(CoreModule.P().g().ng(this.f1243q.guideType, this.f1245s, this.f1244r) ? "支付宝免密支付" : "支付宝");
            this.f1234h.setImageResource(c3c0.P6);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1651w() {
        xdl0.M(this.f1233g, false);
        xdl0.M(this.f1238l, false);
        this.f1237k.setText("查看会员权益");
    }

    /* JADX INFO: renamed from: x */
    public final void m1652x() {
        this.f1247u = CoreModule.l.g().Sb(this.f1242p, this.f1245s, false, CoreModule.P().g().ng(this.f1243q.guideType, this.f1245s, this.f1244r), CoreModule.l.g().Uk(this.f1243q.guideType), "p_chat_view");
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1244r = PurchaseType.TYPE_GET_VIP;
        this.f1245s = PayMethod.get("alipay");
        this.f1248v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2104a.m1637v();
            }
        };
        this.f1249w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1244r = PurchaseType.TYPE_GET_VIP;
        this.f1245s = PayMethod.get("alipay");
        this.f1248v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2104a.m1637v();
            }
        };
        this.f1249w = new DecimalFormat("#.#");
    }

    public ItemPendingPayment(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1244r = PurchaseType.TYPE_GET_VIP;
        this.f1245s = PayMethod.get("alipay");
        this.f1248v = new Runnable() { // from class: l.abq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2104a.m1637v();
            }
        };
        this.f1249w = new DecimalFormat("#.#");
    }
}
