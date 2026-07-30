package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010P\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010C\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\"\u0010T\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\u0016\u0010c\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, m87232d2 = {"Ll/m7b0;", "Ll/n5;", "Ll/f1m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "h0", "()V", "i0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "B", "()Z", "e", Constants.INAPP_DATA_TAG, "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/j5b0;", "Landroid/widget/LinearLayout;", Constants.KEY_T, "Landroid/widget/LinearLayout;", "b0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "d0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", ResourceDirection.f38808v, "Lv/VText;", "g0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "e0", "set_pay_method_promotion", "_pay_method_promotion", BaseSei.f13930X, "f0", "set_pay_method_promotion_right", "_pay_method_promotion_right", BaseSei.f13931Y, "c0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", BaseSei.f13932Z, "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "a0", "set_get_privilege_text", "_get_privilege_text", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", b2s.C_ZONE, "Ll/zh60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m7b0 extends AbstractC18623n5 implements f1m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public fi60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
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
    public m7b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
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
    public static void m153352W(m7b0 m7b0Var, View view) {
        AbstractC18623n5.m157931y(m7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m153353X(m7b0 m7b0Var, View view) {
        if (TEnum.equals(m7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        m7b0Var.m157944T();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m153354h0() {
        PayMethod payMethodM54038u;
        if (sab0.m182891i(this.purchaseType)) {
            m153365g0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m153361c0().setImageResource(d3c0.f84126u4);
        } else {
            m153365g0().setTextColor(this.act.color(b1c0.f72555j));
            m153361c0().setImageResource(d3c0.f84048oa);
        }
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var == null || (payMethodM54038u = j5b0Var.m54038u()) == null) {
            payMethodM54038u = PayMethod.get("alipay");
        }
        payMethodM54038u.getClass();
        mo95239G(payMethodM54038u);
        xdl0.m208329E0(m153360b0(), new View.OnClickListener() { // from class: l.l7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m7b0.m153353X(this.f126710a, view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private final void m153355i0() {
        m153359a0().setTextColor(sab0.m182891i(this.purchaseType) ? Color.parseColor("#cc000000") : this.act.color(b1c0.f72561m));
        m153359a0().setTypeface(eqh0.m117752c(3));
        m153359a0().setText(this.act.string(R$string.f27665y8));
        m153358Z().setBackgroundResource(sab0.m182891i(this.purchaseType) ? d3c0.f83755T4 : d3c0.f83799W9);
        xdl0.m208329E0(m153358Z(), new View.OnClickListener() { // from class: l.k7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m7b0.m153352W(this.f121566a, view);
            }
        });
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: B */
    public boolean mo153356B() {
        return !sab0.m182891i(this.purchaseType);
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
        m153365g0().setTypeface(eqh0.m117752c(3));
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m153365g0().setText(R$string.f27353X9);
            m153362d0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84154w4 : d3c0.f83922fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m153365g0().setText("京东支付");
            m153362d0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84140v4 : d3c0.f83908ea);
        } else {
            m153365g0().setText((sab0.m182891i(this.purchaseType) || !CoreModule.m29935P().m94651a().mo33524j3()) ? this.act.string(R$string.f27287R9) : this.act.string(R$string.f27460h));
            m153362d0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84112t4 : d3c0.f83894da);
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
        m157943S(this.paymentTextProcessorsHelper.m218769a(new ai60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false)));
        VText vTextM153359a0 = m153359a0();
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM153359a0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
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
            xdl0.m208344M(m153363e0(), false);
            xdl0.m208344M(m153364f0(), false);
        } else if (pairM121492b.getSecond().booleanValue()) {
            xdl0.m208344M(m153363e0(), true);
            xdl0.m208344M(m153364f0(), false);
            m153363e0().setText(first);
        } else {
            xdl0.m208344M(m153363e0(), false);
            xdl0.m208344M(m153364f0(), true);
            m153364f0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m153357Y(View view) {
        n7b0.m158117a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m153358Z() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131531S1, root, false);
        viewInflate.getClass();
        m153357Y(viewInflate);
        m153354h0();
        m153355i0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m153359a0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LinearLayout m153360b0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m153361c0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_arrow");
        return null;
    }

    @Override // p149l.AbstractC18623n5, p149l.f1m
    /* JADX INFO: renamed from: d */
    public boolean mo36057d() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VImage m153362d0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_icon");
        return null;
    }

    @Override // p149l.AbstractC18623n5, p149l.f1m
    /* JADX INFO: renamed from: e */
    public boolean mo36058e() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m153363e0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VText m153364f0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m153365g0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_text");
        return null;
    }
}
