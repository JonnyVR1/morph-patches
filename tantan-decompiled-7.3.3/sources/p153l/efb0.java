package p153l;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010`\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010;\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010;\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\"\u0010l\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010;\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006v"}, m88121d2 = {"Ll/efb0;", "Ll/l5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "n0", "()V", "k0", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "", "show", "o0", "(Z)V", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/ndb0;", "Lv/VLinear;", Constants.KEY_T, "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Lv/VText;", "u", "Lv/VText;", "c0", "()Lv/VText;", "set_get_privilege_text", "(Lv/VText;)V", "_get_privilege_text", ResourceDirection.f39656v, "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", BaseSei.f14624X, "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", BaseSei.f14625Y, "i0", "set_pay_method_text", "_pay_method_text", BaseSei.f14626Z, "g0", "set_pay_method_promotion", "_pay_method_promotion", "A", "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "B", "e0", "set_pay_method_arrow", "_pay_method_arrow", c4s.C_ZONE, "Z", "set_day_price_text", "_day_price_text", "D", "j0", "set_stickers", "_stickers", "Ll/kq60;", "Ll/kq60;", "paymentTipsPromotionHelper", "Ll/eq60;", "F", "Ll/eq60;", "paymentTextProcessorsHelper", "", "pageState", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class efb0 extends AbstractC18347l5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _day_price_text;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public kq60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final eq60 paymentTextProcessorsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int pageState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final ndb0 mediator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VLinear _get_privilege;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _get_privilege_subtitle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public LinearLayout _pay_method;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VImage _pay_method_icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _pay_method_text;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText _pay_method_promotion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        eq60 eq60Var = new eq60(act, purchaseType, "purchasePage");
        eq60Var.m121895b();
        this.paymentTextProcessorsHelper = eq60Var;
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: W */
    public static void m120648W(efb0 efb0Var, View view) {
        AbstractC18347l5.m152851y(efb0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m120649X(efb0 efb0Var, View view) {
        if (TEnum.equals(efb0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        efb0Var.m152865T();
    }

    /* JADX INFO: renamed from: l0 */
    private final void m120650l0() {
        m120667i0().setTypeface(lyh0.m156283c(3));
        if (wib0.m206565i(this.purchaseType)) {
            m120667i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m120663e0().setImageResource(jbc0.f119781u4);
        } else {
            m120667i0().setTextColor(this.act.color(h9c0.f108375j));
            m120663e0().setImageResource(jbc0.f119703oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo120654G(payMethod);
        bnl0.m105509E0(m120662d0(), new View.OnClickListener() { // from class: l.dfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efb0.m120649X(this.f88147a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private final void m120651m0() {
        int iColor;
        int i;
        m120661c0().setTypeface(lyh0.m156283c(3));
        boolean zM206565i = wib0.m206565i(this.purchaseType);
        Act act = this.act;
        m120661c0().setTextColor(zM206565i ? act.color(h9c0.f108369g) : act.color(h9c0.f108381m));
        m120661c0().setText(z090.m218107b(this.purchaseType));
        if (wib0.m206565i(this.purchaseType)) {
            iColor = this.act.color(h9c0.f108369g);
        } else {
            boolean zM206573q = wib0.m206573q(this.purchaseType);
            Act act2 = this.act;
            iColor = zM206573q ? act2.color(h9c0.f108395t) : act2.color(h9c0.f108395t);
        }
        m120660b0().setTextColor(iColor);
        if (wib0.m206580x(this.purchaseType)) {
            i = jbc0.f119438V6;
        } else if (wib0.m206563g(this.purchaseType)) {
            i = jbc0.f119296L;
        } else if (wib0.m206565i(this.purchaseType)) {
            i = jbc0.f119399S6;
        } else {
            i = wib0.m206573q(this.purchaseType) ? jbc0.f119412T6 : jbc0.f119425U6;
        }
        m120659a0().setBackgroundResource(i);
        bnl0.m105509E0(m120659a0(), new View.OnClickListener() { // from class: l.cfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efb0.m120648W(this.f81498a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    private final void m120652n0() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        m120658Z().setLayerType(1, paint);
        m120668j0().setTypeface(lyh0.m156283c(3));
        m120668j0().setBackgroundResource(wib0.m206565i(this.purchaseType) ? jbc0.f119517b6 : jbc0.f119503a6);
    }

    @Override // p153l.AbstractC18347l5
    @NotNull
    /* JADX INFO: renamed from: E */
    public String mo120653E() {
        return "p_purchase_page";
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: G */
    public void mo120654G(@NotNull PayMethod currentPayMethod) {
        currentPayMethod.getClass();
        if (TEnum.equals(currentPayMethod, "unknown_")) {
            return;
        }
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m120667i0().setText(R$string.f28201X9);
            m120664f0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119809w4 : jbc0.f119577fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m120667i0().setText("京东支付");
            m120664f0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119795v4 : jbc0.f119563ea);
        } else {
            m120667i0().setText((wib0.m206565i(this.purchaseType) || wib0.m206571o(this.purchaseType) || !CoreModule.m30933P().m143405a().mo34527j3()) ? this.act.string(R$string.f28135R9) : this.act.string(R$string.f28308h));
            m120664f0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119767t4 : jbc0.f119549da);
        }
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: H */
    public void mo120655H() {
        if (getCurrentPurchaseSection() == null) {
            return;
        }
        C8928d currentPurchaseSection = getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        m152864S(this.paymentTextProcessorsHelper.m121894a(new fq60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false, 8, null)));
        VText vTextM120661c0 = m120661c0();
        gq60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM120661c0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
        gq60 paymentTextResponseData2 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData2 != null ? paymentTextResponseData2.getDayPriceSticker() : null)) {
            gq60 paymentTextResponseData3 = getPaymentTextResponseData();
            if (TextUtils.isEmpty(paymentTextResponseData3 != null ? paymentTextResponseData3.getSticker() : null)) {
                bnl0.m105524M(m120668j0(), false);
                bnl0.m105524M(m120658Z(), false);
            } else {
                bnl0.m105524M(m120668j0(), true);
                bnl0.m105524M(m120658Z(), false);
                VText vTextM120668j0 = m120668j0();
                gq60 paymentTextResponseData4 = getPaymentTextResponseData();
                vTextM120668j0.setText(paymentTextResponseData4 != null ? paymentTextResponseData4.getSticker() : null);
                if (s7a.m184991t()) {
                    m152866V();
                }
            }
        } else {
            bnl0.m105524M(m120668j0(), false);
            bnl0.m105524M(m120658Z(), true);
            VText vTextM120658Z = m120658Z();
            gq60 paymentTextResponseData5 = getPaymentTextResponseData();
            vTextM120658Z.setText(paymentTextResponseData5 != null ? paymentTextResponseData5.getDayPriceSticker() : null);
        }
        gq60 paymentTextResponseData6 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData6 != null ? paymentTextResponseData6.getSubtitle() : null)) {
            bnl0.m105524M(m120660b0(), false);
            return;
        }
        bnl0.m105524M(m120660b0(), true);
        VText vTextM120660b0 = m120660b0();
        gq60 paymentTextResponseData7 = getPaymentTextResponseData();
        vTextM120660b0.setText(paymentTextResponseData7 != null ? paymentTextResponseData7.getSubtitle() : null);
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: I */
    public void mo120656I(@NotNull PayMethod currentPayMethod, @NotNull C8928d section) {
        currentPayMethod.getClass();
        section.getClass();
        if (this.paymentTipsPromotionHelper == null) {
            this.paymentTipsPromotionHelper = new kq60(this.purchaseType, this.from);
        }
        kq60 kq60Var = this.paymentTipsPromotionHelper;
        if (kq60Var == null) {
            Intrinsics.m88391r("paymentTipsPromotionHelper");
            kq60Var = null;
        }
        Pair<CharSequence, Boolean> pairM150822b = kq60Var.m150822b(currentPayMethod, section, mo152852B());
        CharSequence first = pairM150822b.getFirst();
        if (TextUtils.isEmpty(first)) {
            bnl0.m105524M(m120665g0(), false);
            bnl0.m105524M(m120666h0(), false);
        } else if (pairM150822b.getSecond().booleanValue()) {
            bnl0.m105524M(m120665g0(), true);
            bnl0.m105524M(m120666h0(), false);
            m120665g0().setText(first);
        } else {
            bnl0.m105524M(m120665g0(), false);
            bnl0.m105524M(m120666h0(), true);
            m120666h0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m120657Y(View view) {
        ffb0.m125361a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m120658Z() {
        VText vText = this._day_price_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_day_price_text");
        return null;
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162487R1, root, false);
        viewInflate.getClass();
        m120657Y(viewInflate);
        m120650l0();
        m120652n0();
        m120669k0();
        m120651m0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m120659a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m120660b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m120661c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m120662d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m120663e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m120664f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m120665g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m120666h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m120667i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m120668j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m120669k0() {
        m120658Z().setBackgroundResource(wib0.m206565i(this.purchaseType) ? jbc0.f119451W6 : jbc0.f119464X6);
        m120658Z().setPadding(qa00.f156330q, 0, qa00.f156323j, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m120670o0(boolean show) {
        if (!show) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && s7a.m184991t()) {
            m152866V();
        }
        this.pageState = 1;
    }
}
