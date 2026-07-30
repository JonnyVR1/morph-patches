package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
public class s5b0 extends g1e {

    /* JADX INFO: renamed from: A */
    public LinearLayout f166321A;

    /* JADX INFO: renamed from: B */
    public VText f166322B;

    /* JADX INFO: renamed from: C */
    public VText f166323C;

    /* JADX INFO: renamed from: D */
    public Act f166324D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public x20 f166325E;

    /* JADX INFO: renamed from: F */
    public String f166326F;

    /* JADX INFO: renamed from: G */
    public l4g0 f166327G;

    /* JADX INFO: renamed from: H */
    public Merchandise f166328H;

    /* JADX INFO: renamed from: I */
    public Coupon f166329I;

    /* JADX INFO: renamed from: J */
    public PayMethod f166330J;

    /* JADX INFO: renamed from: K */
    public DecimalFormat f166331K;

    /* JADX INFO: renamed from: L */
    public double f166332L;

    /* JADX INFO: renamed from: M */
    public double f166333M;

    /* JADX INFO: renamed from: N */
    public lib0 f166334N;

    /* JADX INFO: renamed from: j */
    public VImage f166335j;

    /* JADX INFO: renamed from: k */
    public Guideline f166336k;

    /* JADX INFO: renamed from: l */
    public VImage f166337l;

    /* JADX INFO: renamed from: m */
    public Guideline f166338m;

    /* JADX INFO: renamed from: n */
    public VImage f166339n;

    /* JADX INFO: renamed from: o */
    public VImage f166340o;

    /* JADX INFO: renamed from: p */
    public VText f166341p;

    /* JADX INFO: renamed from: q */
    public VText f166342q;

    /* JADX INFO: renamed from: r */
    public VText f166343r;

    /* JADX INFO: renamed from: s */
    public VText f166344s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f166345t;

    /* JADX INFO: renamed from: u */
    public VImage f166346u;

    /* JADX INFO: renamed from: v */
    public VText f166347v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f166348w;

    /* JADX INFO: renamed from: x */
    public TextView f166349x;

    /* JADX INFO: renamed from: y */
    public VText f166350y;

    /* JADX INFO: renamed from: z */
    public View f166351z;

    public s5b0(Act act, final y20<Boolean> y20Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, dgc0.f88277b);
        this.f166331K = new DecimalFormat("#.#");
        this.f166324D = act;
        this.f166325E = new x20() { // from class: l.k5b0
            @Override // p153l.x20
            public final void call() {
                this.f123995a.m184636Z(y20Var);
            }
        };
        this.f166328H = merchandise;
        this.f166329I = coupon;
        this.f166333M = merchandise.defaultStockKeepUnit.prices.price;
        this.f166332L = ((double) coupon.benefit.localBenefit.giftBenefit.discount.value) / 100.0d;
        this.f166326F = str;
    }

    /* JADX INFO: renamed from: T */
    private void m184631T() {
        this.f166346u.setSelected(false);
        bnl0.m105540X(this.f166340o, bnl0.m105511F0() + qa00.f156320g);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.l5b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f130094a.m184647U(dialogInterface, i, keyEvent);
            }
        });
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m5b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f134884a.m184632V(dialogInterface);
            }
        });
        bnl0.m105509E0(this.f166340o, new View.OnClickListener() { // from class: l.n5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140324a.m184633W(view);
            }
        });
        bnl0.m105509E0(this.f166321A, new View.OnClickListener() { // from class: l.o5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145047a.m184634X(view);
            }
        });
        bnl0.m105509E0(this.f166346u, new View.OnClickListener() { // from class: l.p5b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150632a.m184635Y(view);
            }
        });
        m184639f0();
        m184645R();
        m184646S();
        m184644Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m184632V(DialogInterface dialogInterface) {
        w1e.m204401e(this.f166327G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m184633W(View view) {
        this.f166325E.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m184634X(View view) {
        this.f166334N.m154345w(this.f166328H, this.f166330J, true, CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3() && TEnum.equals(this.f166330J, "alipay"));
        if (this.f166329I.endTime - pzi0.m174454o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m184638e0();
        } else {
            o1j0.m165651y("优惠券已失效");
            lib0.INSTANCE.m154349a(this.f166334N.getPurchaseTrackId(), this.f166328H.defaultStockKeepUnit.f21249id, "coupon expired");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m184635Y(View view) {
        VImage vImage = this.f166346u;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m184636Z(y20 y20Var) {
        dismiss();
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m184637d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    private void m184638e0() {
        if (!CoreModule.m30933P().m143405a().mo34527j3() && !xl60.m211506k()) {
            lib0.INSTANCE.m154349a(this.f166334N.getPurchaseTrackId(), this.f166328H.defaultStockKeepUnit.f21249id, "alipay not install");
            return;
        }
        if (!this.f166346u.isSelected()) {
            pta.m173705B(this.f166324D, this.f166334N.mo103692e(), new x20() { // from class: l.q5b0
                @Override // p153l.x20
                public final void call() {
                    this.f155700a.m184650c0();
                }
            });
            return;
        }
        wn60 wn60Var = new wn60(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, this.f166324D, "", "");
        if (NullChecker.m82486a(this.f166334N)) {
            wn60Var.m207144C(this.f166334N.getPurchaseTrackId());
        }
        wn60Var.m207167r(this.f166329I.couponID);
        if (this.f166328H.autoRenewable()) {
            wn60Var.m207150I(false, this.f166328H.defaultStockKeepUnit.f21249id, new y20() { // from class: l.r5b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161334a.m184637d0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m184639f0() {
        long jM174454o = (long) (this.f166329I.endTime - pzi0.m174454o());
        if (jM174454o <= 0) {
            this.f166323C.setText(m184643P("优惠 %s 后到期", "00:00:00"));
        } else {
            if (jM174454o > 86400000) {
                this.f166323C.setText(m184643P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jM174454o / 86400000)))));
                return;
            }
            this.f166323C.setText(m184643P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jM174454o / 3600000)), Integer.valueOf((int) ((jM174454o % 3600000) / Constants.ONE_MIN_IN_MILLIS)), Integer.valueOf(((int) (jM174454o % Constants.ONE_MIN_IN_MILLIS)) / 1000))));
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m184640h0() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m184641i0(Act act, y20<Boolean> y20Var, Merchandise merchandise, String str) {
        if (NullChecker.m82486a(merchandise)) {
            new s5b0(act, y20Var, merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.giftDurationSVIP), str).show();
        } else {
            o1j0.m165621C(R$string.f28105P1);
        }
    }

    /* JADX INFO: renamed from: O */
    public View m184642O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t5b0.m189378b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final CharSequence m184643P(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#FFFAE9"), qa00.m175861f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Q */
    public final void m184644Q() {
        this.f166330J = PayMethod.get("alipay");
        if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3()) {
            this.f166322B.setText(String.format("确认协议免密付¥%s", this.f166331K.format(this.f166332L)));
        } else {
            this.f166322B.setText(String.format("确认协议并支付¥%s", this.f166331K.format(this.f166332L)));
        }
        m184651g0();
    }

    /* JADX INFO: renamed from: R */
    public final void m184645R() {
        String strConcat = String.format(CoreModule.f18263b.getString(R$string.f28005G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f166333M), "半年").concat("；赠送的3个月会员立刻发放，当自动续费合约取消时，赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        int iIndexOf = strConcat.indexOf("会员及自动续费协议");
        int iIndexOf2 = strConcat.indexOf("赠送的3个月将失效");
        int i = iIndexOf + 9;
        spannableStringBuilder.setSpan(new da5(bn60.f77437b).m115113b(Color.parseColor("#99FFECAF")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(true), iIndexOf, i, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
        int i2 = iIndexOf2 + 9;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#99FFECAF")), iIndexOf2, i2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf2, i2, 18);
        this.f166347v.setOnTouchListener(new od0(spannableStringBuilder));
        this.f166347v.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m184646S() {
        this.f166342q.setText("查看谁喜欢了我");
        this.f166343r.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size();
        this.f166344s.setText(q8g0.m175800f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), jyb.m147507f0(String.valueOf(size)), Color.parseColor("#FFE350"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m184647U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f166325E.call();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m184648a0(Long l2) {
        return Boolean.valueOf(this.f166329I.endTime - ((double) pzi0.m174454o()) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m184649b0(Long l2) {
        m184639f0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m184650c0() {
        this.f166346u.setSelected(true);
        this.f166321A.callOnClick();
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        super.dismiss();
        v5b0.m199800z(false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m184651g0() {
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            if (!TEnum.equals(this.f166330J, "alipay")) {
                bnl0.m105524M(this.f166350y, false);
                return;
            }
            this.f166350y.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f166350y, true);
        }
    }

    @Override // p153l.g1e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(psd0.m173632y())).takeUntil(new qcj() { // from class: l.i5b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113025a.m184648a0((Long) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.j5b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118412a.m184649b0((Long) obj);
            }
        }));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m184642O(this.f166324D.getLayoutInflater(), null));
        m184640h0();
        beb0 beb0Var = new beb0(this.f166328H.category, PurchaseTrackPageType.page_discount_6m, this.f166326F);
        this.f166334N = beb0Var;
        beb0Var.m154344v(this.f166328H.category);
        m184631T();
        CoreModule.f18264c.f20333O0.m31073C3();
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_page", getClass().getName());
        this.f166327G = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f166326F)), jyb.m147494Y("productType", this.f166328H.category.toString()), jyb.m147494Y("default_duration", this.f166328H.quantity + "m"), jyb.m147494Y("promotion_type", g2f.m128612d(this.f166329I)), jyb.m147494Y("page_style", SchemeKey.promotion));
        w1e.m204402f(this.f166327G);
        v5b0.m199800z(true);
    }
}
