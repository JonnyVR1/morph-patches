package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
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
@Metadata(m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010L\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006t"}, m88121d2 = {"Ll/xeb0;", "Ll/l5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "n0", "()V", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "k0", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/ndb0;", "Landroid/widget/LinearLayout;", Constants.KEY_T, "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", ResourceDirection.f39656v, "Lv/VText;", "i0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "g0", "set_pay_method_promotion", "_pay_method_promotion", BaseSei.f14624X, "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", BaseSei.f14625Y, "e0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", BaseSei.f14626Z, "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "c0", "set_get_privilege_text", "_get_privilege_text", "B", "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", c4s.C_ZONE, "j0", "set_stickers", "_stickers", "Landroid/widget/FrameLayout;", "D", "Landroid/widget/FrameLayout;", "Z", "()Landroid/widget/FrameLayout;", "set_append", "(Landroid/widget/FrameLayout;)V", "_append", "Ll/kq60;", "Ll/kq60;", "paymentTipsPromotionHelper", "Ll/eq60;", "F", "Ll/eq60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class xeb0 extends AbstractC18347l5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _get_privilege_subtitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public FrameLayout _append;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public kq60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
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
    public xeb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
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
    public static void m210658W(xeb0 xeb0Var, View view) {
        if (TEnum.equals(xeb0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        xeb0Var.m152865T();
    }

    /* JADX INFO: renamed from: X */
    public static void m210659X(xeb0 xeb0Var, View view) {
        AbstractC18347l5.m152851y(xeb0Var, null, 1, null);
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
            m210670i0().setText(R$string.f28201X9);
            m210667f0().setImageResource((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) ? jbc0.f119809w4 : jbc0.f119577fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m210670i0().setText("京东支付");
            m210667f0().setImageResource((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) ? jbc0.f119795v4 : jbc0.f119563ea);
        } else {
            m210670i0().setText((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType) || wib0.m206571o(this.purchaseType) || !CoreModule.m30933P().m143405a().mo34527j3()) ? this.act.string(R$string.f28135R9) : this.act.string(R$string.f28308h));
            m210667f0().setImageResource((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) ? jbc0.f119767t4 : jbc0.f119549da);
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
        gq60 paymentTextResponseData = getPaymentTextResponseData();
        if (paymentTextResponseData != null) {
            m210664c0().setText(paymentTextResponseData.getTitle());
            if (TextUtils.isEmpty(paymentTextResponseData.getSticker())) {
                bnl0.m105524M(m210671j0(), false);
            } else {
                bnl0.m105524M(m210671j0(), true);
                m210671j0().setText(paymentTextResponseData.getSticker());
                if (s7a.m184991t()) {
                    m152866V();
                }
            }
            if (TextUtils.isEmpty(paymentTextResponseData.getSubtitle())) {
                bnl0.m105524M(m210663b0(), false);
            } else {
                bnl0.m105524M(m210663b0(), true);
                m210663b0().setText(paymentTextResponseData.getSubtitle());
            }
        }
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
            bnl0.m105524M(m210668g0(), false);
            bnl0.m105524M(m210669h0(), false);
        } else if (pairM150822b.getSecond().booleanValue()) {
            bnl0.m105524M(m210668g0(), true);
            bnl0.m105524M(m210669h0(), false);
            m210668g0().setText(first);
        } else {
            bnl0.m105524M(m210668g0(), false);
            bnl0.m105524M(m210669h0(), true);
            m210669h0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m210660Y(View view) {
        yeb0.m215410a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m210661Z() {
        FrameLayout frameLayout = this._append;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_append");
        return null;
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162467M1, root, false);
        viewInflate.getClass();
        m210660Y(viewInflate);
        m210672l0();
        m210674n0();
        m210673m0();
        mo97329k0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m210662a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m210663b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m210664c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m210665d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m210666e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m210667f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m210668g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m210669h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m210670i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m210671j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo97329k0() {
        m210661Z().addView(new Space(this.act), new ConstraintLayout.C0221a(-1, txq.m193530c(32)));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m210672l0() {
        if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            m210670i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m210666e0().setImageResource(jbc0.f119781u4);
        } else {
            m210670i0().setTextColor(this.act.color(h9c0.f108375j));
            m210666e0().setImageResource(jbc0.f119703oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo120654G(payMethod);
        bnl0.m105509E0(m210665d0(), new View.OnClickListener() { // from class: l.web0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xeb0.m210658W(this.f188683a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m210673m0() {
        int i;
        m210664c0().setTypeface(lyh0.m156283c(3));
        m210664c0().setTextColor((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) ? this.act.color(h9c0.f108369g) : this.act.color(h9c0.f108381m));
        m210664c0().setText(z090.m218107b(this.purchaseType));
        if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            i = jbc0.f119410T4;
        } else if (wib0.m206571o(this.purchaseType)) {
            i = jbc0.f119306L9;
        } else if (wib0.m206557a(this.purchaseType) || wib0.m206561e(this.purchaseType) || wib0.m206559c(this.purchaseType)) {
            i = jbc0.f119320M9;
        } else if (wib0.m206563g(this.purchaseType)) {
            i = jbc0.f119296L;
        } else {
            i = wib0.m206580x(this.purchaseType) ? jbc0.f119830xb : jbc0.f119334N9;
        }
        m210662a0().setBackgroundResource(i);
        bnl0.m105509E0(m210662a0(), new View.OnClickListener() { // from class: l.veb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xeb0.m210659X(this.f183718a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m210674n0() {
        m210671j0().setTypeface(lyh0.m156283c(3));
        if (wib0.m206563g(this.purchaseType)) {
            m210671j0().setBackgroundResource(jbc0.f119483Z);
        } else if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            m210671j0().setBackgroundResource(jbc0.f119517b6);
        } else {
            m210671j0().setBackgroundResource(jbc0.f119503a6);
        }
    }
}
