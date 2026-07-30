package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
public class oxa0 extends szd {

    /* JADX INFO: renamed from: A */
    public LinearLayout f146158A;

    /* JADX INFO: renamed from: B */
    public VText f146159B;

    /* JADX INFO: renamed from: C */
    public VText f146160C;

    /* JADX INFO: renamed from: D */
    public Act f146161D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public d30 f146162E;

    /* JADX INFO: renamed from: F */
    public String f146163F;

    /* JADX INFO: renamed from: G */
    public cwf0 f146164G;

    /* JADX INFO: renamed from: H */
    public Merchandise f146165H;

    /* JADX INFO: renamed from: I */
    public Coupon f146166I;

    /* JADX INFO: renamed from: J */
    public PayMethod f146167J;

    /* JADX INFO: renamed from: K */
    public DecimalFormat f146168K;

    /* JADX INFO: renamed from: L */
    public double f146169L;

    /* JADX INFO: renamed from: M */
    public double f146170M;

    /* JADX INFO: renamed from: N */
    public hab0 f146171N;

    /* JADX INFO: renamed from: j */
    public VImage f146172j;

    /* JADX INFO: renamed from: k */
    public Guideline f146173k;

    /* JADX INFO: renamed from: l */
    public VImage f146174l;

    /* JADX INFO: renamed from: m */
    public Guideline f146175m;

    /* JADX INFO: renamed from: n */
    public VImage f146176n;

    /* JADX INFO: renamed from: o */
    public VImage f146177o;

    /* JADX INFO: renamed from: p */
    public VText f146178p;

    /* JADX INFO: renamed from: q */
    public VText f146179q;

    /* JADX INFO: renamed from: r */
    public VText f146180r;

    /* JADX INFO: renamed from: s */
    public VText f146181s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f146182t;

    /* JADX INFO: renamed from: u */
    public VImage f146183u;

    /* JADX INFO: renamed from: v */
    public VText f146184v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f146185w;

    /* JADX INFO: renamed from: x */
    public TextView f146186x;

    /* JADX INFO: renamed from: y */
    public VText f146187y;

    /* JADX INFO: renamed from: z */
    public View f146188z;

    public oxa0(Act act, final e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, y7c0.f196692b);
        this.f146168K = new DecimalFormat("#.#");
        this.f146161D = act;
        this.f146162E = new d30() { // from class: l.gxa0
            @Override // p149l.d30
            public final void call() {
                this.f104850a.m166511Z(e30Var);
            }
        };
        this.f146165H = merchandise;
        this.f146166I = coupon;
        this.f146170M = merchandise.defaultStockKeepUnit.prices.price;
        this.f146169L = ((double) coupon.benefit.localBenefit.giftBenefit.discount.value) / 100.0d;
        this.f146163F = str;
    }

    /* JADX INFO: renamed from: T */
    private void m166506T() {
        this.f146183u.setSelected(false);
        xdl0.m208360X(this.f146177o, xdl0.m208331F0() + t100.f167258g);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.hxa0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f109841a.m166522U(dialogInterface, i, keyEvent);
            }
        });
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ixa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f115343a.m166507V(dialogInterface);
            }
        });
        xdl0.m208329E0(this.f146177o, new View.OnClickListener() { // from class: l.jxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120211a.m166508W(view);
            }
        });
        xdl0.m208329E0(this.f146158A, new View.OnClickListener() { // from class: l.kxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125096a.m166509X(view);
            }
        });
        xdl0.m208329E0(this.f146183u, new View.OnClickListener() { // from class: l.lxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130403a.m166510Y(view);
            }
        });
        m166514f0();
        m166520R();
        m166521S();
        m166519Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m166507V(DialogInterface dialogInterface) {
        i0e.m133796e(this.f146164G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m166508W(View view) {
        this.f146162E.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m166509X(View view) {
        this.f146171N.m130123w(this.f146165H, this.f146167J, true, CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3() && TEnum.equals(this.f146167J, "alipay"));
        if (this.f146166I.endTime - mqi0.m155944o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m166513e0();
        } else {
            lsi0.m151595y("优惠券已失效");
            hab0.INSTANCE.m130127a(this.f146171N.getPurchaseTrackId(), this.f146165H.defaultStockKeepUnit.f20507id, "coupon expired");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m166510Y(View view) {
        VImage vImage = this.f146183u;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m166511Z(e30 e30Var) {
        dismiss();
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m166512d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    private void m166513e0() {
        if (!CoreModule.m29935P().m94651a().mo33524j3() && !sd60.m183460k()) {
            hab0.INSTANCE.m130127a(this.f146171N.getPurchaseTrackId(), this.f146165H.defaultStockKeepUnit.f20507id, "alipay not install");
            return;
        }
        if (!this.f146183u.isSelected()) {
            dsa.m113425B(this.f146161D, this.f146171N.mo130106e(), new d30() { // from class: l.mxa0
                @Override // p149l.d30
                public final void call() {
                    this.f136151a.m166525c0();
                }
            });
            return;
        }
        rf60 rf60Var = new rf60(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, this.f146161D, "", "");
        if (NullChecker.m81303a(this.f146171N)) {
            rf60Var.m179078C(this.f146171N.getPurchaseTrackId());
        }
        rf60Var.m179101r(this.f146166I.couponID);
        if (this.f146165H.autoRenewable()) {
            rf60Var.m179084I(false, this.f146165H.defaultStockKeepUnit.f20507id, new e30() { // from class: l.nxa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141009a.m166512d0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m166514f0() {
        long jM155944o = (long) (this.f146166I.endTime - mqi0.m155944o());
        if (jM155944o <= 0) {
            this.f146160C.setText(m166518P("优惠 %s 后到期", "00:00:00"));
        } else {
            if (jM155944o > 86400000) {
                this.f146160C.setText(m166518P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jM155944o / 86400000)))));
                return;
            }
            this.f146160C.setText(m166518P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jM155944o / 3600000)), Integer.valueOf((int) ((jM155944o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM155944o % Constants.ONE_MIN_IN_MILLIS)) / 1000))));
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m166515h0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m166516i0(Act act, e30<Boolean> e30Var, Merchandise merchandise, String str) {
        if (NullChecker.m81303a(merchandise)) {
            new oxa0(act, e30Var, merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.giftDurationSVIP), str).show();
        } else {
            lsi0.m151565C(R$string.f27257P1);
        }
    }

    /* JADX INFO: renamed from: O */
    public View m166517O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pxa0.m171826b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final CharSequence m166518P(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#FFFAE9"), t100.m186892f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Q */
    public final void m166519Q() {
        this.f146167J = PayMethod.get("alipay");
        if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3()) {
            this.f146159B.setText(String.format("确认协议免密付¥%s", this.f146168K.format(this.f146169L)));
        } else {
            this.f146159B.setText(String.format("确认协议并支付¥%s", this.f146168K.format(this.f146169L)));
        }
        m166526g0();
    }

    /* JADX INFO: renamed from: R */
    public final void m166520R() {
        String strConcat = String.format(CoreModule.f17544b.getString(R$string.f27157G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f146170M), "半年").concat("；赠送的3个月会员立刻发放，当自动续费合约取消时，赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        int iIndexOf = strConcat.indexOf("会员及自动续费协议");
        int iIndexOf2 = strConcat.indexOf("赠送的3个月将失效");
        int i = iIndexOf + 9;
        spannableStringBuilder.setSpan(new c95(we60.f185908b).m105841b(Color.parseColor("#99FFECAF")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(true), iIndexOf, i, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
        int i2 = iIndexOf2 + 9;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#99FFECAF")), iIndexOf2, i2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf2, i2, 18);
        this.f146184v.setOnTouchListener(new sd0(spannableStringBuilder));
        this.f146184v.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m166521S() {
        this.f146179q.setText("查看谁喜欢了我");
        this.f146180r.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size();
        this.f146181s.setText(i0g0.m133865f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), vwb.m200324f0(String.valueOf(size)), Color.parseColor("#FFE350"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m166522U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f146162E.call();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m166523a0(Long l2) {
        return Boolean.valueOf(this.f146166I.endTime - ((double) mqi0.m155944o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m166524b0(Long l2) {
        m166514f0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m166525c0() {
        this.f146183u.setSelected(true);
        this.f146158A.callOnClick();
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        super.dismiss();
        rxa0.m181505z(false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m166526g0() {
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            if (!TEnum.equals(this.f146167J, "alipay")) {
                xdl0.m208344M(this.f146187y, false);
                return;
            }
            this.f146187y.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f146187y, true);
        }
    }

    @Override // p149l.szd, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.m154991y())).takeUntil(new w9j() { // from class: l.exa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93589a.m166523a0((Long) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fxa0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99746a.m166524b0((Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m166517O(this.f146161D.getLayoutInflater(), null));
        m166515h0();
        x5b0 x5b0Var = new x5b0(this.f146165H.category, PurchaseTrackPageType.page_discount_6m, this.f146163F);
        this.f146171N = x5b0Var;
        x5b0Var.m130122v(this.f146165H.category);
        m166506T();
        CoreModule.f17545c.f19591O0.m30075C3();
    }

    @Override // p149l.szd, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_page", getClass().getName());
        this.f146164G = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f146163F)), vwb.m200311Y("productType", this.f146165H.category.toString()), vwb.m200311Y("default_duration", this.f146165H.quantity + "m"), vwb.m200311Y("promotion_type", b1f.m99831d(this.f146166I)), vwb.m200311Y("page_style", SchemeKey.promotion));
        i0e.m133797f(this.f146164G);
        rxa0.m181505z(true);
    }
}
