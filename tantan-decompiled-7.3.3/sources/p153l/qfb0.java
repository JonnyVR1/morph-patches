package p153l;

import android.graphics.Color;
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
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010P\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010C\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\"\u0010T\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\u0016\u0010c\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, m88121d2 = {"Ll/qfb0;", "Ll/l5;", "Ll/y3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "h0", "()V", "i0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "B", "()Z", "e", Constants.INAPP_DATA_TAG, "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/ndb0;", "Landroid/widget/LinearLayout;", Constants.KEY_T, "Landroid/widget/LinearLayout;", "b0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "d0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", ResourceDirection.f39656v, "Lv/VText;", "g0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "e0", "set_pay_method_promotion", "_pay_method_promotion", BaseSei.f14624X, "f0", "set_pay_method_promotion_right", "_pay_method_promotion_right", BaseSei.f14625Y, "c0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", BaseSei.f14626Z, "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "a0", "set_get_privilege_text", "_get_privilege_text", "Ll/kq60;", "Ll/kq60;", "paymentTipsPromotionHelper", "Ll/eq60;", c4s.C_ZONE, "Ll/eq60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qfb0 extends AbstractC18347l5 implements y3m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public kq60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final eq60 paymentTextProcessorsHelper;

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
    public LinearLayout _pay_method;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VImage _pay_method_icon;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _pay_method_text;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VText _pay_method_promotion;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VLinear _get_privilege;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        this.paymentTextProcessorsHelper = new eq60(act, purchaseType, str);
    }

    /* JADX INFO: renamed from: W */
    public static void m176356W(qfb0 qfb0Var, View view) {
        AbstractC18347l5.m152851y(qfb0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m176357X(qfb0 qfb0Var, View view) {
        if (TEnum.equals(qfb0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        qfb0Var.m152865T();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m176358h0() {
        PayMethod payMethodM55221u;
        if (wib0.m206565i(this.purchaseType)) {
            m176368g0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m176364c0().setImageResource(jbc0.f119781u4);
        } else {
            m176368g0().setTextColor(this.act.color(h9c0.f108375j));
            m176364c0().setImageResource(jbc0.f119703oa);
        }
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var == null || (payMethodM55221u = ndb0Var.m55221u()) == null) {
            payMethodM55221u = PayMethod.get("alipay");
        }
        payMethodM55221u.getClass();
        mo120654G(payMethodM55221u);
        bnl0.m105509E0(m176363b0(), new View.OnClickListener() { // from class: l.pfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qfb0.m176357X(this.f152168a, view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private final void m176359i0() {
        m176362a0().setTextColor(wib0.m206565i(this.purchaseType) ? Color.parseColor("#cc000000") : this.act.color(h9c0.f108381m));
        m176362a0().setTypeface(lyh0.m156283c(3));
        m176362a0().setText(this.act.string(R$string.f28513y8));
        m176361Z().setBackgroundResource(wib0.m206565i(this.purchaseType) ? jbc0.f119410T4 : jbc0.f119454W9);
        bnl0.m105509E0(m176361Z(), new View.OnClickListener() { // from class: l.ofb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qfb0.m176356W(this.f147063a, view);
            }
        });
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: B */
    public boolean mo152852B() {
        return !wib0.m206565i(this.purchaseType);
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
        m176368g0().setTypeface(lyh0.m156283c(3));
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m176368g0().setText(R$string.f28201X9);
            m176365d0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119809w4 : jbc0.f119577fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m176368g0().setText("京东支付");
            m176365d0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119795v4 : jbc0.f119563ea);
        } else {
            m176368g0().setText((wib0.m206565i(this.purchaseType) || !CoreModule.m30933P().m143405a().mo34527j3()) ? this.act.string(R$string.f28135R9) : this.act.string(R$string.f28308h));
            m176365d0().setImageResource(wib0.m206565i(this.purchaseType) ? jbc0.f119767t4 : jbc0.f119549da);
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
        m152864S(this.paymentTextProcessorsHelper.m121894a(new fq60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false)));
        VText vTextM176362a0 = m176362a0();
        gq60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM176362a0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
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
            bnl0.m105524M(m176366e0(), false);
            bnl0.m105524M(m176367f0(), false);
        } else if (pairM150822b.getSecond().booleanValue()) {
            bnl0.m105524M(m176366e0(), true);
            bnl0.m105524M(m176367f0(), false);
            m176366e0().setText(first);
        } else {
            bnl0.m105524M(m176366e0(), false);
            bnl0.m105524M(m176367f0(), true);
            m176367f0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m176360Y(View view) {
        rfb0.m181168a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m176361Z() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162491S1, root, false);
        viewInflate.getClass();
        m176360Y(viewInflate);
        m176358h0();
        m176359i0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m176362a0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LinearLayout m176363b0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m176364c0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_arrow");
        return null;
    }

    @Override // p153l.AbstractC18347l5, p153l.y3m
    /* JADX INFO: renamed from: d */
    public boolean mo37060d() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VImage m176365d0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_icon");
        return null;
    }

    @Override // p153l.AbstractC18347l5, p153l.y3m
    /* JADX INFO: renamed from: e */
    public boolean mo37061e() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m176366e0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VText m176367f0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m176368g0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }
}
