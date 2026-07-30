package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.f1m;
import l.m6c0;
import l.n7b0;
import l.sab0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010P\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010C\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\"\u0010T\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?R\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\u0016\u0010c\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, d2 = {"Ll/m7b0;", "Ll/n5;", "Ll/f1m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", "view", "", "Y", "(Landroid/view/View;)V", "h0", "()V", "i0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "", "B", "()Z", "e", "d", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", "s", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "t", "Landroid/widget/LinearLayout;", "b0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "d0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", "v", "Lv/VText;", "g0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "e0", "set_pay_method_promotion", "_pay_method_promotion", "x", "f0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "y", "c0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", "z", "Lv/VLinear;", "Z", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "a0", "set_get_privilege_text", "_get_privilege_text", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "C", "Ll/zh60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m7b0 extends AbstractC1040n5 implements f1m {

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
    public static void m19127W(m7b0 m7b0Var, View view) {
        AbstractC1040n5.m19658y(m7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m19128X(m7b0 m7b0Var, View view) {
        if (TEnum.equals(m7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        m7b0Var.m19671T();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m19129h0() {
        PayMethod payMethodM7373u;
        if (sab0.i(this.purchaseType)) {
            m19142g0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m19136c0().setImageResource(d3c0.u4);
        } else {
            m19142g0().setTextColor(this.act.color(b1c0.j));
            m19136c0().setImageResource(d3c0.oa);
        }
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var == null || (payMethodM7373u = j5b0Var.m7373u()) == null) {
            payMethodM7373u = PayMethod.get("alipay");
        }
        payMethodM7373u.getClass();
        mo11778G(payMethodM7373u);
        xdl0.E0(m19135b0(), new View.OnClickListener() { // from class: l.l7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m7b0.m19128X(this.f16255a, view);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    private final void m19130i0() {
        m19134a0().setTextColor(sab0.i(this.purchaseType) ? Color.parseColor("#cc000000") : this.act.color(b1c0.m));
        m19134a0().setTypeface(eqh0.c(3));
        m19134a0().setText(this.act.string(R.string.y8));
        m19133Z().setBackgroundResource(sab0.i(this.purchaseType) ? d3c0.T4 : d3c0.W9);
        xdl0.E0(m19133Z(), new View.OnClickListener() { // from class: l.k7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m7b0.m19127W(this.f15644a, view);
            }
        });
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: B */
    public boolean mo19131B() {
        return !sab0.i(this.purchaseType);
    }

    @Override // p006l.AbstractC1040n5
    @NotNull
    /* JADX INFO: renamed from: E */
    public String mo11777E() {
        return "p_purchase_page";
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: G */
    public void mo11778G(@NotNull PayMethod currentPayMethod) {
        currentPayMethod.getClass();
        if (TEnum.equals(currentPayMethod, "unknown_")) {
            return;
        }
        m19142g0().setTypeface(eqh0.c(3));
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m19142g0().setText(R.string.X9);
            m19138d0().setImageResource(sab0.i(this.purchaseType) ? d3c0.w4 : d3c0.fa);
        } else if (TEnum.equals(currentPayMethod, "jingdong")) {
            m19142g0().setText("京东支付");
            m19138d0().setImageResource(sab0.i(this.purchaseType) ? d3c0.v4 : d3c0.ea);
        } else {
            m19142g0().setText((sab0.i(this.purchaseType) || !CoreModule.m1854P().m11706a().m5461j3()) ? this.act.string(R.string.R9) : this.act.string(R.string.h));
            m19138d0().setImageResource(sab0.i(this.purchaseType) ? d3c0.t4 : d3c0.da);
        }
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: H */
    public void mo11779H() {
        if (getCurrentPurchaseSection() == null) {
            return;
        }
        d currentPurchaseSection = getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        m19670S(this.paymentTextProcessorsHelper.m28713a(new ai60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false)));
        VText vTextM19134a0 = m19134a0();
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM19134a0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: I */
    public void mo11780I(@NotNull PayMethod currentPayMethod, @NotNull d section) {
        currentPayMethod.getClass();
        section.getClass();
        if (this.paymentTipsPromotionHelper == null) {
            this.paymentTipsPromotionHelper = new fi60(this.purchaseType, this.from);
        }
        fi60 fi60Var = this.paymentTipsPromotionHelper;
        if (fi60Var == null) {
            Intrinsics.r("paymentTipsPromotionHelper");
            fi60Var = null;
        }
        Pair<CharSequence, Boolean> pairM15350b = fi60Var.m15350b(currentPayMethod, section, mo19131B());
        CharSequence charSequence = (CharSequence) pairM15350b.getFirst();
        if (TextUtils.isEmpty(charSequence)) {
            xdl0.M(m19140e0(), false);
            xdl0.M(m19141f0(), false);
        } else if (((Boolean) pairM15350b.getSecond()).booleanValue()) {
            xdl0.M(m19140e0(), true);
            xdl0.M(m19141f0(), false);
            m19140e0().setText(charSequence);
        } else {
            xdl0.M(m19140e0(), false);
            xdl0.M(m19141f0(), true);
            m19141f0().setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m19132Y(View view) {
        n7b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VLinear m19133Z() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.S1, root, false);
        viewInflate.getClass();
        m19132Y(viewInflate);
        m19129h0();
        m19130i0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VText m19134a0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LinearLayout m19135b0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VImage m19136c0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_arrow");
        return null;
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: d */
    public boolean mo19137d() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VImage m19138d0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_icon");
        return null;
    }

    @Override // p006l.AbstractC1040n5
    /* JADX INFO: renamed from: e */
    public boolean mo19139e() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m19140e0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VText m19141f0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m19142g0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_text");
        return null;
    }
}
