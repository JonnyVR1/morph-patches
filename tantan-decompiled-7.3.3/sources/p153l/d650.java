package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d650 extends g1e {

    /* JADX INFO: renamed from: A */
    public VText f85254A;

    /* JADX INFO: renamed from: B */
    public VText f85255B;

    /* JADX INFO: renamed from: C */
    public RelativeLayout f85256C;

    /* JADX INFO: renamed from: D */
    public VText f85257D;

    /* JADX INFO: renamed from: E */
    public VText f85258E;

    /* JADX INFO: renamed from: F */
    public View f85259F;

    /* JADX INFO: renamed from: G */
    public Act f85260G;

    /* JADX INFO: renamed from: H */
    public PayMethod f85261H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public x20 f85262I;

    /* JADX INFO: renamed from: J */
    public DecimalFormat f85263J;

    /* JADX INFO: renamed from: K */
    public Merchandise f85264K;

    /* JADX INFO: renamed from: L */
    public Coupon f85265L;

    /* JADX INFO: renamed from: M */
    public Merchandise f85266M;

    /* JADX INFO: renamed from: N */
    public Coupon f85267N;

    /* JADX INFO: renamed from: O */
    public Merchandise f85268O;

    /* JADX INFO: renamed from: P */
    public Coupon f85269P;

    /* JADX INFO: renamed from: Q */
    public Coupon f85270Q;

    /* JADX INFO: renamed from: R */
    public String f85271R;

    /* JADX INFO: renamed from: S */
    public l4g0 f85272S;

    /* JADX INFO: renamed from: T */
    public double f85273T;

    /* JADX INFO: renamed from: U */
    public wn60 f85274U;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f85275j;

    /* JADX INFO: renamed from: k */
    public VImage f85276k;

    /* JADX INFO: renamed from: l */
    public VText f85277l;

    /* JADX INFO: renamed from: m */
    public VLinear f85278m;

    /* JADX INFO: renamed from: n */
    public VText f85279n;

    /* JADX INFO: renamed from: o */
    public VText f85280o;

    /* JADX INFO: renamed from: p */
    public VText f85281p;

    /* JADX INFO: renamed from: q */
    public VText f85282q;

    /* JADX INFO: renamed from: r */
    public VText f85283r;

    /* JADX INFO: renamed from: s */
    public VText f85284s;

    /* JADX INFO: renamed from: t */
    public VLinear f85285t;

    /* JADX INFO: renamed from: u */
    public VText f85286u;

    /* JADX INFO: renamed from: v */
    public VText f85287v;

    /* JADX INFO: renamed from: w */
    public VText f85288w;

    /* JADX INFO: renamed from: x */
    public VText f85289x;

    /* JADX INFO: renamed from: y */
    public VText f85290y;

    /* JADX INFO: renamed from: z */
    public VText f85291z;

    public d650(Act act, Merchandise merchandise, Coupon coupon, Merchandise merchandise2, Coupon coupon2, String str) {
        super(act, false, dgc0.f88277b);
        this.f85263J = new DecimalFormat("#.#");
        this.f85260G = act;
        this.f85262I = new x20() { // from class: l.c650
            @Override // p153l.x20
            public final void call() {
                this.f79939a.dismiss();
            }
        };
        this.f85271R = str;
        this.f85264K = merchandise;
        this.f85270Q = coupon;
        this.f85265L = coupon;
        this.f85266M = merchandise2;
        this.f85267N = coupon2;
    }

    /* JADX INFO: renamed from: S */
    private void m114380S() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.q550
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f155662a.m114390V(dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u550
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f177579a.m114391W(dialogInterface);
            }
        });
        this.f85276k.setOnClickListener(new View.OnClickListener() { // from class: l.v550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182478a.m114382X(view);
            }
        });
        this.f85278m.setOnClickListener(new View.OnClickListener() { // from class: l.w550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187481a.m114383Y(view);
            }
        });
        this.f85285t.setOnClickListener(new View.OnClickListener() { // from class: l.x550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192456a.m114392Z(view);
            }
        });
        this.f85254A.setOnClickListener(new View.OnClickListener() { // from class: l.y550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197536a.m114393a0(view);
            }
        });
        this.f85256C.setOnClickListener(new View.OnClickListener() { // from class: l.z550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203006a.m114394b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    private void m114381T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f85276k.getLayoutParams();
        int iM105511F0 = bnl0.m105511F0();
        int i = qa00.f156320g;
        layoutParams.topMargin = iM105511F0 + i;
        ((FrameLayout.LayoutParams) this.f85275j.getLayoutParams()).topMargin = bnl0.m105511F0() + i;
        SVGALoader.with(this.f85260G).from("https://auto.tancdn.com/v1/raw/9a15b83d-2300-4a62-8059-bf2da05730b514.pdf").autoPlay(true).repeatCount(-1).into(this.f85275j);
        m114380S();
        SpannableString spannableString = new SpannableString("解锁后配对最高增加20倍");
        spannableString.setSpan(new StyleSpan(1), 9, 11, 33);
        this.f85277l.setText(spannableString);
        m114388R(this.f85264K, this.f85265L);
        m114401k0();
        m114400j0();
        m114399i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m114382X(View view) {
        this.f85262I.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m114383Y(View view) {
        if (m114389U(this.f85268O)) {
            return;
        }
        m114388R(this.f85264K, this.f85265L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m114384g0(PayMethod payMethod) {
        this.f85261H = payMethod;
        if (TEnum.equals(payMethod, "alipay")) {
            this.f85257D.setText("支付宝");
            this.f85257D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119177C6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f85261H, "wechat")) {
            this.f85257D.setText("微信");
            this.f85257D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119205E6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f85261H, PayMethod.jingdong)) {
            this.f85257D.setText("京东支付");
            this.f85257D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119191D6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f85254A.setText(String.format("¥%s立即购买", this.f85263J.format(this.f85273T)));
    }

    /* JADX INFO: renamed from: h0 */
    private void m114385h0() {
        boolean zM211506k;
        if (TEnum.equals(this.f85261H, "wechat")) {
            zM211506k = xl60.m211511p();
        } else if (TEnum.equals(this.f85261H, PayMethod.jingdong)) {
            zM211506k = xl60.m211508m();
        } else {
            zM211506k = !CoreModule.m30933P().m143405a().mo34527j3() ? xl60.m211506k() : true;
        }
        if (zM211506k) {
            this.f85274U = new wn60(PurchaseType.TYPE_O_DIAMOND, this.f85260G, this.f85271R, "").m207167r(this.f85269P.couponID);
            boolean zEquals = TEnum.equals(this.f85261H, PayMethod.jingdong);
            wn60 wn60Var = this.f85274U;
            if (zEquals) {
                wn60Var.m207158i(new y20() { // from class: l.s550
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f166314a.m114397e0((Integer) obj);
                    }
                }, this.f85268O);
            } else {
                wn60Var.m207164o(this.f85268O.defaultStockKeepUnit.f21249id, TEnum.equals(this.f85261H, "wechat"), new y20() { // from class: l.t550
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f172182a.m114398f0((Integer) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m114386m0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: Q */
    public View m114387Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e650.m119575b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m114388R(Merchandise merchandise, Coupon coupon) {
        if (NullChecker.m82486a(this.f85268O) && this.f85268O.quantity == merchandise.quantity) {
            return;
        }
        this.f85268O = merchandise;
        this.f85269P = coupon;
        this.f85273T = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        boolean zM114389U = m114389U(merchandise);
        this.f85278m.setBackgroundResource(zM114389U ? jbc0.f119502a5 : jbc0.f119516b5);
        this.f85279n.setTextColor(Color.parseColor(zM114389U ? "#4B1A0A" : "#66FFDEA2"));
        this.f85280o.setTextColor(Color.parseColor(zM114389U ? "#4B1A0A" : "#66FFDEA2"));
        this.f85281p.setTextColor(Color.parseColor(zM114389U ? "#4B1A0A" : "#66FFDEA2"));
        this.f85282q.setTextColor(Color.parseColor(zM114389U ? "#4B1A0A" : "#66FFDEA2"));
        this.f85283r.setTextColor(Color.parseColor(zM114389U ? "#4B1A0A" : "#66FFDEA2"));
        this.f85284s.setTextColor(Color.parseColor(zM114389U ? "#334B1A0A" : "#66FFDEA2"));
        this.f85285t.setBackgroundResource(zM114389U ? jbc0.f119516b5 : jbc0.f119502a5);
        this.f85286u.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#4B1A0A"));
        this.f85287v.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#4B1A0A"));
        this.f85288w.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#4B1A0A"));
        this.f85289x.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#4B1A0A"));
        this.f85290y.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#4B1A0A"));
        this.f85291z.setTextColor(Color.parseColor(zM114389U ? "#66FFDEA2" : "#334B1A0A"));
        this.f85254A.setText(String.format("¥%s立即购买", this.f85263J.format(this.f85273T)));
    }

    /* JADX INFO: renamed from: U */
    public final boolean m114389U(Merchandise merchandise) {
        return merchandise.quantity == 12;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m114390V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f85262I.call();
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m114391W(DialogInterface dialogInterface) {
        w1e.m204401e(this.f85272S);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m114392Z(View view) {
        if (m114389U(this.f85268O)) {
            m114388R(this.f85266M, this.f85267N);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m114393a0(View view) {
        i4g0.m138523u("e_purchase_button", "p_purchase_page", jyb.m147494Y("purchaseShowFrom", this.f85271R), jyb.m147494Y("productType", this.f85268O.category.toString()), jyb.m147494Y("default_duration", this.f85268O.quantity + "m"), jyb.m147494Y("promotion_type", g2f.m128612d(this.f85269P)), jyb.m147494Y("page_style", SchemeKey.promotion));
        if (this.f85270Q.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            o1j0.m165651y("优惠已失效");
        } else {
            m114385h0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m114394b0(View view) {
        new bo60(this.f85260G, PurchaseType.TYPE_O_DIAMOND).m105668r(this.f85261H).m105662l(true).m105667q(new y20() { // from class: l.r550
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161289a.m114384g0((PayMethod) obj);
            }
        }).m105669s();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m114395c0(Long l2) {
        m114400j0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m114396d0(Long l2) {
        return Boolean.valueOf(this.f85270Q.endTime - ((double) pzi0.m174454o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        super.dismiss();
        this.f85275j.stopAnimation(true);
        v5b0.m199800z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m114397e0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m114398f0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m114399i0() {
        StringBuilder sb = new StringBuilder("开通前请阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(sb.toString(), jyb.m147507f0("会员服务协议"), Color.parseColor("#CCFFDEA2"), lyh0.m156283c(3));
        int iIndexOf = sb.indexOf("会员服务协议");
        spannableStringBuilderM175796b0.setSpan(new da5(bn60.f77438c).m115113b(Color.parseColor("#CCFFDEA2")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, iIndexOf + 6, 18);
        this.f85258E.setText(spannableStringBuilderM175796b0);
        this.f85258E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m114400j0() {
        long jM174454o = (long) (this.f85270Q.endTime - pzi0.m174454o());
        if (jM174454o <= 0) {
            this.f85255B.setText("优惠已结束");
            return;
        }
        VText vText = this.f85255B;
        if (jM174454o > 86400000) {
            vText.setText(String.format("优惠倒计时： %d天后失效", Integer.valueOf((int) (jM174454o / 86400000))));
            return;
        }
        vText.setText(String.format("优惠倒计时： %02d:%02d:%02d后失效", Integer.valueOf((int) (jM174454o / 3600000)), Integer.valueOf((int) ((jM174454o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM174454o % Constants.ONE_MIN_IN_MILLIS)) / 1000)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m114401k0() {
        this.f85280o.setTypeface(lyh0.m156283c(3), 1);
        this.f85282q.setText("12个月");
        SpannableString spannableString = new SpannableString(String.format("¥%s", this.f85263J.format(((double) this.f85265L.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.5625f);
        spannableString.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f85283r.setText(spannableString);
        this.f85283r.setTypeface(lyh0.m156283c(3), 1);
        VText vText = this.f85284s;
        DecimalFormat decimalFormat = this.f85263J;
        Merchandise merchandise = this.f85264K;
        vText.setText(String.format("原价¥%s", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise.quantity))));
        this.f85284s.getPaint().setFlags(17);
        this.f85287v.setTypeface(lyh0.m156283c(3), 1);
        this.f85289x.setText("3个月");
        this.f85290y.setTypeface(lyh0.m156283c(3), 1);
        SpannableString spannableString2 = new SpannableString(String.format("¥%s", this.f85263J.format(((double) this.f85267N.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        spannableString2.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f85290y.setText(spannableString2);
        VText vText2 = this.f85291z;
        DecimalFormat decimalFormat2 = this.f85263J;
        Merchandise merchandise2 = this.f85266M;
        vText2.setText(String.format("原价¥%s", decimalFormat2.format(merchandise2.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise2.quantity))));
        this.f85291z.getPaint().setFlags(17);
        this.f85254A.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m114402l0(PayMethod payMethod) {
        this.f85261H = payMethod;
        if (payMethod == null) {
            this.f85261H = PayMethod.get("alipay");
        }
        m114384g0(this.f85261H);
    }

    @Override // p153l.g1e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.m82486a(this.f85270Q)) {
            duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(psd0.m173632y())).takeUntil(new qcj() { // from class: l.a650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f68672a.m114396d0((Long) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.b650
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75134a.m114395c0((Long) obj);
                }
            }));
        }
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM114387Q = m114387Q(this.f85260G.getLayoutInflater(), null);
        this.f85259F = viewM114387Q;
        setContentView(viewM114387Q);
        m114386m0();
        m114381T();
        m114402l0(PayMethod.get("alipay"));
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_page", getClass().getName());
        this.f85272S = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", this.f85271R), jyb.m147494Y("productType", this.f85268O.category.toString()), jyb.m147494Y("default_duration", this.f85268O.quantity + "m"), jyb.m147494Y("promotion_type", g2f.m128612d(this.f85269P)), jyb.m147494Y("page_style", SchemeKey.promotion));
        w1e.m204402f(this.f85272S);
        v5b0.m199800z(true);
    }
}
