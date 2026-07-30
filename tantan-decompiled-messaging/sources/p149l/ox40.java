package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ox40 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f146115A;

    /* JADX INFO: renamed from: B */
    public VText f146116B;

    /* JADX INFO: renamed from: C */
    public RelativeLayout f146117C;

    /* JADX INFO: renamed from: D */
    public VText f146118D;

    /* JADX INFO: renamed from: E */
    public VText f146119E;

    /* JADX INFO: renamed from: F */
    public View f146120F;

    /* JADX INFO: renamed from: G */
    public Act f146121G;

    /* JADX INFO: renamed from: H */
    public PayMethod f146122H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public d30 f146123I;

    /* JADX INFO: renamed from: J */
    public DecimalFormat f146124J;

    /* JADX INFO: renamed from: K */
    public Merchandise f146125K;

    /* JADX INFO: renamed from: L */
    public Coupon f146126L;

    /* JADX INFO: renamed from: M */
    public Merchandise f146127M;

    /* JADX INFO: renamed from: N */
    public Coupon f146128N;

    /* JADX INFO: renamed from: O */
    public Merchandise f146129O;

    /* JADX INFO: renamed from: P */
    public Coupon f146130P;

    /* JADX INFO: renamed from: Q */
    public Coupon f146131Q;

    /* JADX INFO: renamed from: R */
    public String f146132R;

    /* JADX INFO: renamed from: S */
    public cwf0 f146133S;

    /* JADX INFO: renamed from: T */
    public double f146134T;

    /* JADX INFO: renamed from: U */
    public rf60 f146135U;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f146136j;

    /* JADX INFO: renamed from: k */
    public VImage f146137k;

    /* JADX INFO: renamed from: l */
    public VText f146138l;

    /* JADX INFO: renamed from: m */
    public VLinear f146139m;

    /* JADX INFO: renamed from: n */
    public VText f146140n;

    /* JADX INFO: renamed from: o */
    public VText f146141o;

    /* JADX INFO: renamed from: p */
    public VText f146142p;

    /* JADX INFO: renamed from: q */
    public VText f146143q;

    /* JADX INFO: renamed from: r */
    public VText f146144r;

    /* JADX INFO: renamed from: s */
    public VText f146145s;

    /* JADX INFO: renamed from: t */
    public VLinear f146146t;

    /* JADX INFO: renamed from: u */
    public VText f146147u;

    /* JADX INFO: renamed from: v */
    public VText f146148v;

    /* JADX INFO: renamed from: w */
    public VText f146149w;

    /* JADX INFO: renamed from: x */
    public VText f146150x;

    /* JADX INFO: renamed from: y */
    public VText f146151y;

    /* JADX INFO: renamed from: z */
    public VText f146152z;

    public ox40(Act act, Merchandise merchandise, Coupon coupon, Merchandise merchandise2, Coupon coupon2, String str) {
        super(act, false, y7c0.f196692b);
        this.f146124J = new DecimalFormat("#.#");
        this.f146121G = act;
        this.f146123I = new d30() { // from class: l.nx40
            @Override // p149l.d30
            public final void call() {
                this.f140998a.dismiss();
            }
        };
        this.f146132R = str;
        this.f146125K = merchandise;
        this.f146131Q = coupon;
        this.f146126L = coupon;
        this.f146127M = merchandise2;
        this.f146128N = coupon2;
    }

    /* JADX INFO: renamed from: S */
    private void m166472S() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.bx40
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f77738a.m166482V(dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fx40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f99723a.m166483W(dialogInterface);
            }
        });
        this.f146137k.setOnClickListener(new View.OnClickListener() { // from class: l.gx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104827a.m166474X(view);
            }
        });
        this.f146139m.setOnClickListener(new View.OnClickListener() { // from class: l.hx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109828a.m166475Y(view);
            }
        });
        this.f146146t.setOnClickListener(new View.OnClickListener() { // from class: l.ix40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115329a.m166484Z(view);
            }
        });
        this.f146115A.setOnClickListener(new View.OnClickListener() { // from class: l.jx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120191a.m166485a0(view);
            }
        });
        this.f146117C.setOnClickListener(new View.OnClickListener() { // from class: l.kx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125058a.m166486b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    private void m166473T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f146137k.getLayoutParams();
        int iM208331F0 = xdl0.m208331F0();
        int i = t100.f167258g;
        layoutParams.topMargin = iM208331F0 + i;
        ((FrameLayout.LayoutParams) this.f146136j.getLayoutParams()).topMargin = xdl0.m208331F0() + i;
        SVGALoader.with(this.f146121G).from("https://auto.tancdn.com/v1/raw/9a15b83d-2300-4a62-8059-bf2da05730b514.pdf").autoPlay(true).repeatCount(-1).into(this.f146136j);
        m166472S();
        SpannableString spannableString = new SpannableString("解锁后配对最高增加20倍");
        spannableString.setSpan(new StyleSpan(1), 9, 11, 33);
        this.f146138l.setText(spannableString);
        m166480R(this.f146125K, this.f146126L);
        m166493k0();
        m166492j0();
        m166491i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m166474X(View view) {
        this.f146123I.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m166475Y(View view) {
        if (m166481U(this.f146129O)) {
            return;
        }
        m166480R(this.f146125K, this.f146126L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m166476g0(PayMethod payMethod) {
        this.f146122H = payMethod;
        if (TEnum.equals(payMethod, "alipay")) {
            this.f146118D.setText("支付宝");
            this.f146118D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83522C6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f146122H, "wechat")) {
            this.f146118D.setText("微信");
            this.f146118D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83550E6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f146122H, PayMethod.jingdong)) {
            this.f146118D.setText("京东支付");
            this.f146118D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83536D6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f146115A.setText(String.format("¥%s立即购买", this.f146124J.format(this.f146134T)));
    }

    /* JADX INFO: renamed from: h0 */
    private void m166477h0() {
        boolean zM183460k;
        if (TEnum.equals(this.f146122H, "wechat")) {
            zM183460k = sd60.m183465p();
        } else if (TEnum.equals(this.f146122H, PayMethod.jingdong)) {
            zM183460k = sd60.m183462m();
        } else {
            zM183460k = !CoreModule.m29935P().m94651a().mo33524j3() ? sd60.m183460k() : true;
        }
        if (zM183460k) {
            this.f146135U = new rf60(PurchaseType.TYPE_O_DIAMOND, this.f146121G, this.f146132R, "").m179101r(this.f146130P.couponID);
            boolean zEquals = TEnum.equals(this.f146122H, PayMethod.jingdong);
            rf60 rf60Var = this.f146135U;
            if (zEquals) {
                rf60Var.m179092i(new e30() { // from class: l.dx40
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f88234a.m166489e0((Integer) obj);
                    }
                }, this.f146129O);
            } else {
                rf60Var.m179098o(this.f146129O.defaultStockKeepUnit.f20507id, TEnum.equals(this.f146122H, "wechat"), new e30() { // from class: l.ex40
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f93573a.m166490f0((Integer) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m166478m0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: Q */
    public View m166479Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return px40.m171820b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m166480R(Merchandise merchandise, Coupon coupon) {
        if (NullChecker.m81303a(this.f146129O) && this.f146129O.quantity == merchandise.quantity) {
            return;
        }
        this.f146129O = merchandise;
        this.f146130P = coupon;
        this.f146134T = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        boolean zM166481U = m166481U(merchandise);
        this.f146139m.setBackgroundResource(zM166481U ? d3c0.f83847a5 : d3c0.f83861b5);
        this.f146140n.setTextColor(Color.parseColor(zM166481U ? "#4B1A0A" : "#66FFDEA2"));
        this.f146141o.setTextColor(Color.parseColor(zM166481U ? "#4B1A0A" : "#66FFDEA2"));
        this.f146142p.setTextColor(Color.parseColor(zM166481U ? "#4B1A0A" : "#66FFDEA2"));
        this.f146143q.setTextColor(Color.parseColor(zM166481U ? "#4B1A0A" : "#66FFDEA2"));
        this.f146144r.setTextColor(Color.parseColor(zM166481U ? "#4B1A0A" : "#66FFDEA2"));
        this.f146145s.setTextColor(Color.parseColor(zM166481U ? "#334B1A0A" : "#66FFDEA2"));
        this.f146146t.setBackgroundResource(zM166481U ? d3c0.f83861b5 : d3c0.f83847a5);
        this.f146147u.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#4B1A0A"));
        this.f146148v.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#4B1A0A"));
        this.f146149w.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#4B1A0A"));
        this.f146150x.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#4B1A0A"));
        this.f146151y.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#4B1A0A"));
        this.f146152z.setTextColor(Color.parseColor(zM166481U ? "#66FFDEA2" : "#334B1A0A"));
        this.f146115A.setText(String.format("¥%s立即购买", this.f146124J.format(this.f146134T)));
    }

    /* JADX INFO: renamed from: U */
    public final boolean m166481U(Merchandise merchandise) {
        return merchandise.quantity == 12;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m166482V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f146123I.call();
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m166483W(DialogInterface dialogInterface) {
        i0e.m133796e(this.f146133S);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m166484Z(View view) {
        if (m166481U(this.f146129O)) {
            m166480R(this.f146127M, this.f146128N);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m166485a0(View view) {
        zvf0.m220399u("e_purchase_button", "p_purchase_page", vwb.m200311Y("purchaseShowFrom", this.f146132R), vwb.m200311Y("productType", this.f146129O.category.toString()), vwb.m200311Y("default_duration", this.f146129O.quantity + "m"), vwb.m200311Y("promotion_type", b1f.m99831d(this.f146130P)), vwb.m200311Y("page_style", SchemeKey.promotion));
        if (this.f146131Q.endTime - mqi0.m155944o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            lsi0.m151595y("优惠已失效");
        } else {
            m166477h0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m166486b0(View view) {
        new wf60(this.f146121G, PurchaseType.TYPE_O_DIAMOND).m202975r(this.f146122H).m202969l(true).m202974q(new e30() { // from class: l.cx40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82834a.m166476g0((PayMethod) obj);
            }
        }).m202976s();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m166487c0(Long l2) {
        m166492j0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m166488d0(Long l2) {
        return Boolean.valueOf(this.f146131Q.endTime - ((double) mqi0.m155944o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        super.dismiss();
        this.f146136j.stopAnimation(true);
        rxa0.m181505z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m166489e0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m166490f0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m166491i0() {
        StringBuilder sb = new StringBuilder("开通前请阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(sb.toString(), vwb.m200324f0("会员服务协议"), Color.parseColor("#CCFFDEA2"), eqh0.m117752c(3));
        int iIndexOf = sb.indexOf("会员服务协议");
        spannableStringBuilderM133861b0.setSpan(new c95(we60.f185909c).m105841b(Color.parseColor("#CCFFDEA2")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, iIndexOf + 6, 18);
        this.f146119E.setText(spannableStringBuilderM133861b0);
        this.f146119E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m166492j0() {
        long jM155944o = (long) (this.f146131Q.endTime - mqi0.m155944o());
        if (jM155944o <= 0) {
            this.f146116B.setText("优惠已结束");
            return;
        }
        VText vText = this.f146116B;
        if (jM155944o > 86400000) {
            vText.setText(String.format("优惠倒计时： %d天后失效", Integer.valueOf((int) (jM155944o / 86400000))));
            return;
        }
        vText.setText(String.format("优惠倒计时： %02d:%02d:%02d后失效", Integer.valueOf((int) (jM155944o / 3600000)), Integer.valueOf((int) ((jM155944o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM155944o % Constants.ONE_MIN_IN_MILLIS)) / 1000)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m166493k0() {
        this.f146141o.setTypeface(eqh0.m117752c(3), 1);
        this.f146143q.setText("12个月");
        SpannableString spannableString = new SpannableString(String.format("¥%s", this.f146124J.format(((double) this.f146126L.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.5625f);
        spannableString.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f146144r.setText(spannableString);
        this.f146144r.setTypeface(eqh0.m117752c(3), 1);
        VText vText = this.f146145s;
        DecimalFormat decimalFormat = this.f146124J;
        Merchandise merchandise = this.f146125K;
        vText.setText(String.format("原价¥%s", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise.quantity))));
        this.f146145s.getPaint().setFlags(17);
        this.f146148v.setTypeface(eqh0.m117752c(3), 1);
        this.f146150x.setText("3个月");
        this.f146151y.setTypeface(eqh0.m117752c(3), 1);
        SpannableString spannableString2 = new SpannableString(String.format("¥%s", this.f146124J.format(((double) this.f146128N.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        spannableString2.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f146151y.setText(spannableString2);
        VText vText2 = this.f146152z;
        DecimalFormat decimalFormat2 = this.f146124J;
        Merchandise merchandise2 = this.f146127M;
        vText2.setText(String.format("原价¥%s", decimalFormat2.format(merchandise2.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise2.quantity))));
        this.f146152z.getPaint().setFlags(17);
        this.f146115A.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m166494l0(PayMethod payMethod) {
        this.f146122H = payMethod;
        if (payMethod == null) {
            this.f146122H = PayMethod.get("alipay");
        }
        m166476g0(this.f146122H);
    }

    @Override // p149l.szd, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.m81303a(this.f146131Q)) {
            duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.m154991y())).takeUntil(new w9j() { // from class: l.lx40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f130357a.m166488d0((Long) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.mx40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136128a.m166487c0((Long) obj);
                }
            }));
        }
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM166479Q = m166479Q(this.f146121G.getLayoutInflater(), null);
        this.f146120F = viewM166479Q;
        setContentView(viewM166479Q);
        m166478m0();
        m166473T();
        m166494l0(PayMethod.get("alipay"));
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_page", getClass().getName());
        this.f146133S = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", this.f146132R), vwb.m200311Y("productType", this.f146129O.category.toString()), vwb.m200311Y("default_duration", this.f146129O.quantity + "m"), vwb.m200311Y("promotion_type", b1f.m99831d(this.f146130P)), vwb.m200311Y("page_style", SchemeKey.promotion));
        i0e.m133797f(this.f146133S);
        rxa0.m181505z(true);
    }
}
