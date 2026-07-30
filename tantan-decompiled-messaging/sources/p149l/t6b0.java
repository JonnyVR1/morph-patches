package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010L\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006t"}, m87232d2 = {"Ll/t6b0;", "Ll/n5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "n0", "()V", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "k0", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/j5b0;", "Landroid/widget/LinearLayout;", Constants.KEY_T, "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", ResourceDirection.f38808v, "Lv/VText;", "i0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "g0", "set_pay_method_promotion", "_pay_method_promotion", BaseSei.f13930X, "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", BaseSei.f13931Y, "e0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", BaseSei.f13932Z, "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "c0", "set_get_privilege_text", "_get_privilege_text", "B", "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", b2s.C_ZONE, "j0", "set_stickers", "_stickers", "Landroid/widget/FrameLayout;", "D", "Landroid/widget/FrameLayout;", "Z", "()Landroid/widget/FrameLayout;", "set_append", "(Landroid/widget/FrameLayout;)V", "_append", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "F", "Ll/zh60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class t6b0 extends AbstractC18623n5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _get_privilege_subtitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public FrameLayout _append;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public fi60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final zh60 paymentTextProcessorsHelper;

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
    public final j5b0 mediator;

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
    public t6b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        this.paymentTextProcessorsHelper = new zh60(act, purchaseType, str);
    }

    /* JADX INFO: renamed from: W */
    public static void m187362W(t6b0 t6b0Var, View view) {
        if (TEnum.equals(t6b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        t6b0Var.m157944T();
    }

    /* JADX INFO: renamed from: X */
    public static void m187363X(t6b0 t6b0Var, View view) {
        AbstractC18623n5.m157931y(t6b0Var, null, 1, null);
    }

    @Override // p149l.AbstractC18623n5
    @NotNull
    /* JADX INFO: renamed from: E */
    public String mo95238E() {
        return "p_purchase_page";
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: G */
    public void mo95239G(@NotNull PayMethod currentPayMethod) {
        currentPayMethod.getClass();
        if (TEnum.equals(currentPayMethod, "unknown_")) {
            return;
        }
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m187374i0().setText(R$string.f27353X9);
            m187371f0().setImageResource((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) ? d3c0.f84154w4 : d3c0.f83922fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m187374i0().setText("京东支付");
            m187371f0().setImageResource((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) ? d3c0.f84140v4 : d3c0.f83908ea);
        } else {
            m187374i0().setText((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType) || sab0.m182897o(this.purchaseType) || !CoreModule.m29935P().m94651a().mo33524j3()) ? this.act.string(R$string.f27287R9) : this.act.string(R$string.f27460h));
            m187371f0().setImageResource((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) ? d3c0.f84112t4 : d3c0.f83894da);
        }
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: H */
    public void mo95240H() {
        if (getCurrentPurchaseSection() == null) {
            return;
        }
        C8765d currentPurchaseSection = getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        m157943S(this.paymentTextProcessorsHelper.m218769a(new ai60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false, 8, null)));
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        if (paymentTextResponseData != null) {
            m187368c0().setText(paymentTextResponseData.getTitle());
            if (TextUtils.isEmpty(paymentTextResponseData.getSticker())) {
                xdl0.m208344M(m187375j0(), false);
            } else {
                xdl0.m208344M(m187375j0(), true);
                m187375j0().setText(paymentTextResponseData.getSticker());
                if (g6a.m124571t()) {
                    m157945V();
                }
            }
            if (TextUtils.isEmpty(paymentTextResponseData.getSubtitle())) {
                xdl0.m208344M(m187367b0(), false);
            } else {
                xdl0.m208344M(m187367b0(), true);
                m187367b0().setText(paymentTextResponseData.getSubtitle());
            }
        }
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: I */
    public void mo95241I(@NotNull PayMethod currentPayMethod, @NotNull C8765d section) {
        currentPayMethod.getClass();
        section.getClass();
        if (this.paymentTipsPromotionHelper == null) {
            this.paymentTipsPromotionHelper = new fi60(this.purchaseType, this.from);
        }
        fi60 fi60Var = this.paymentTipsPromotionHelper;
        if (fi60Var == null) {
            Intrinsics.m87502r("paymentTipsPromotionHelper");
            fi60Var = null;
        }
        Pair<CharSequence, Boolean> pairM121492b = fi60Var.m121492b(currentPayMethod, section, mo153356B());
        CharSequence first = pairM121492b.getFirst();
        if (TextUtils.isEmpty(first)) {
            xdl0.m208344M(m187372g0(), false);
            xdl0.m208344M(m187373h0(), false);
        } else if (pairM121492b.getSecond().booleanValue()) {
            xdl0.m208344M(m187372g0(), true);
            xdl0.m208344M(m187373h0(), false);
            m187372g0().setText(first);
        } else {
            xdl0.m208344M(m187372g0(), false);
            xdl0.m208344M(m187373h0(), true);
            m187373h0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m187364Y(View view) {
        u6b0.m191974a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m187365Z() {
        FrameLayout frameLayout = this._append;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_append");
        return null;
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131507M1, root, false);
        viewInflate.getClass();
        m187364Y(viewInflate);
        m187376l0();
        m187378n0();
        m187377m0();
        mo167658k0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m187366a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m187367b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m187368c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m187369d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m187370e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m187371f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m187372g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m187373h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m187374i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m187375j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo167658k0() {
        m187365Z().addView(new Space(this.act), new ConstraintLayout.C0220a(-1, svq.m186103c(32)));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m187376l0() {
        if (sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            m187374i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m187370e0().setImageResource(d3c0.f84126u4);
        } else {
            m187374i0().setTextColor(this.act.color(b1c0.f72555j));
            m187370e0().setImageResource(d3c0.f84048oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo95239G(payMethod);
        xdl0.m208329E0(m187369d0(), new View.OnClickListener() { // from class: l.s6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t6b0.m187362W(this.f162647a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m187377m0() {
        int i;
        m187368c0().setTypeface(eqh0.m117752c(3));
        m187368c0().setTextColor((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) ? this.act.color(b1c0.f72549g) : this.act.color(b1c0.f72561m));
        m187368c0().setText(vs80.m199853b(this.purchaseType));
        if (sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            i = d3c0.f83755T4;
        } else if (sab0.m182897o(this.purchaseType)) {
            i = d3c0.f83651L9;
        } else if (sab0.m182883a(this.purchaseType) || sab0.m182887e(this.purchaseType) || sab0.m182885c(this.purchaseType)) {
            i = d3c0.f83665M9;
        } else if (sab0.m182889g(this.purchaseType)) {
            i = d3c0.f83641L;
        } else {
            i = sab0.m182906x(this.purchaseType) ? d3c0.f84175xb : d3c0.f83679N9;
        }
        m187366a0().setBackgroundResource(i);
        xdl0.m208329E0(m187366a0(), new View.OnClickListener() { // from class: l.r6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t6b0.m187363X(this.f157908a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m187378n0() {
        m187375j0().setTypeface(eqh0.m117752c(3));
        if (sab0.m182889g(this.purchaseType)) {
            m187375j0().setBackgroundResource(d3c0.f83828Z);
        } else if (sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            m187375j0().setBackgroundResource(d3c0.f83862b6);
        } else {
            m187375j0().setBackgroundResource(d3c0.f83848a6);
        }
    }
}
