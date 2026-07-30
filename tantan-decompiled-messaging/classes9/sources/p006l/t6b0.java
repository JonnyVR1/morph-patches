package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import l.m6c0;
import l.sab0;
import l.svq;
import l.u6b0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010L\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006t"}, d2 = {"Ll/t6b0;", "Ll/n5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", "view", "", "Y", "(Landroid/view/View;)V", "n0", "()V", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "k0", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", "s", "Ll/j5b0;", "Landroid/widget/LinearLayout;", "t", "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "u", "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "Lv/VText;", "v", "Lv/VText;", "i0", "()Lv/VText;", "set_pay_method_text", "(Lv/VText;)V", "_pay_method_text", "w", "g0", "set_pay_method_promotion", "_pay_method_promotion", "x", "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "y", "e0", "set_pay_method_arrow", "_pay_method_arrow", "Lv/VLinear;", "z", "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "A", "c0", "set_get_privilege_text", "_get_privilege_text", "B", "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", "C", "j0", "set_stickers", "_stickers", "Landroid/widget/FrameLayout;", "D", "Landroid/widget/FrameLayout;", "Z", "()Landroid/widget/FrameLayout;", "set_append", "(Landroid/widget/FrameLayout;)V", "_append", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "F", "Ll/zh60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class t6b0 extends AbstractC1040n5 {

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
    public static void m24483W(t6b0 t6b0Var, View view) {
        if (TEnum.equals(t6b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        t6b0Var.m19671T();
    }

    /* JADX INFO: renamed from: X */
    public static void m24484X(t6b0 t6b0Var, View view) {
        AbstractC1040n5.m19658y(t6b0Var, null, 1, null);
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
        if (TEnum.equals(currentPayMethod, "wechat")) {
            m24495i0().setText(R.string.X9);
            m24492f0().setImageResource((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) ? d3c0.w4 : d3c0.fa);
        } else if (TEnum.equals(currentPayMethod, "jingdong")) {
            m24495i0().setText("京东支付");
            m24492f0().setImageResource((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) ? d3c0.v4 : d3c0.ea);
        } else {
            m24495i0().setText((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType) || sab0.o(this.purchaseType) || !CoreModule.m1854P().m11706a().m5461j3()) ? this.act.string(R.string.R9) : this.act.string(R.string.h));
            m24492f0().setImageResource((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) ? d3c0.t4 : d3c0.da);
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
        m19670S(this.paymentTextProcessorsHelper.m28713a(new ai60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false, 8, null)));
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        if (paymentTextResponseData != null) {
            m24489c0().setText(paymentTextResponseData.getTitle());
            if (TextUtils.isEmpty(paymentTextResponseData.getSticker())) {
                xdl0.M(m24496j0(), false);
            } else {
                xdl0.M(m24496j0(), true);
                m24496j0().setText(paymentTextResponseData.getSticker());
                if (g6a.m15597t()) {
                    m19672V();
                }
            }
            if (TextUtils.isEmpty(paymentTextResponseData.getSubtitle())) {
                xdl0.M(m24488b0(), false);
            } else {
                xdl0.M(m24488b0(), true);
                m24488b0().setText(paymentTextResponseData.getSubtitle());
            }
        }
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
            xdl0.M(m24493g0(), false);
            xdl0.M(m24494h0(), false);
        } else if (((Boolean) pairM15350b.getSecond()).booleanValue()) {
            xdl0.M(m24493g0(), true);
            xdl0.M(m24494h0(), false);
            m24493g0().setText(charSequence);
        } else {
            xdl0.M(m24493g0(), false);
            xdl0.M(m24494h0(), true);
            m24494h0().setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m24485Y(View view) {
        u6b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final FrameLayout m24486Z() {
        FrameLayout frameLayout = this._append;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_append");
        return null;
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.M1, root, false);
        viewInflate.getClass();
        m24485Y(viewInflate);
        m24497l0();
        m24499n0();
        m24498m0();
        mo21045k0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m24487a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m24488b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m24489c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m24490d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m24491e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m24492f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m24493g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m24494h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m24495i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m24496j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void mo21045k0() {
        m24486Z().addView((View) new Space(this.act), (ViewGroup.LayoutParams) new ConstraintLayout.a(-1, svq.c(32)));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m24497l0() {
        if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            m24495i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m24491e0().setImageResource(d3c0.u4);
        } else {
            m24495i0().setTextColor(this.act.color(b1c0.j));
            m24491e0().setImageResource(d3c0.oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo11778G(payMethod);
        xdl0.E0(m24490d0(), new View.OnClickListener() { // from class: l.s6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t6b0.m24483W(this.f21124a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m24498m0() {
        int i;
        m24489c0().setTypeface(eqh0.c(3));
        m24489c0().setTextColor((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) ? this.act.color(b1c0.g) : this.act.color(b1c0.m));
        m24489c0().setText(vs80.m25865b(this.purchaseType));
        if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            i = d3c0.T4;
        } else if (sab0.o(this.purchaseType)) {
            i = d3c0.L9;
        } else if (sab0.a(this.purchaseType) || sab0.e(this.purchaseType) || sab0.c(this.purchaseType)) {
            i = d3c0.M9;
        } else if (sab0.g(this.purchaseType)) {
            i = d3c0.L;
        } else {
            i = sab0.x(this.purchaseType) ? d3c0.xb : d3c0.N9;
        }
        m24487a0().setBackgroundResource(i);
        xdl0.E0(m24487a0(), new View.OnClickListener() { // from class: l.r6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t6b0.m24484X(this.f20386a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m24499n0() {
        m24496j0().setTypeface(eqh0.c(3));
        if (sab0.g(this.purchaseType)) {
            m24496j0().setBackgroundResource(d3c0.Z);
        } else if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            m24496j0().setBackgroundResource(d3c0.b6);
        } else {
            m24496j0().setBackgroundResource(d3c0.a6);
        }
    }
}
