package p006l;

import android.graphics.Color;
import android.graphics.Paint;
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
import l.b7b0;
import l.d3c0;
import l.eqh0;
import l.m6c0;
import l.sab0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010`\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010;\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010;\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\"\u0010l\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010;\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006v"}, d2 = {"Ll/a7b0;", "Ll/n5;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", "view", "", "Y", "(Landroid/view/View;)V", "n0", "()V", "k0", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "", "show", "o0", "(Z)V", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", "s", "Ll/j5b0;", "Lv/VLinear;", "t", "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Lv/VText;", "u", "Lv/VText;", "c0", "()Lv/VText;", "set_get_privilege_text", "(Lv/VText;)V", "_get_privilege_text", "v", "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", "x", "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", "y", "i0", "set_pay_method_text", "_pay_method_text", "z", "g0", "set_pay_method_promotion", "_pay_method_promotion", "A", "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "B", "e0", "set_pay_method_arrow", "_pay_method_arrow", "C", "Z", "set_day_price_text", "_day_price_text", "D", "j0", "set_stickers", "_stickers", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "F", "Ll/zh60;", "paymentTextProcessorsHelper", "", "pageState", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a7b0 extends AbstractC1040n5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VText _day_price_text;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VText _stickers;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public fi60 paymentTipsPromotionHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final zh60 paymentTextProcessorsHelper;

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
    public final j5b0 mediator;

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
    public a7b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        zh60 zh60Var = new zh60(act, purchaseType, "purchasePage");
        zh60Var.m28714b();
        this.paymentTextProcessorsHelper = zh60Var;
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: W */
    public static void m11772W(a7b0 a7b0Var, View view) {
        AbstractC1040n5.m19658y(a7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m11773X(a7b0 a7b0Var, View view) {
        if (TEnum.equals(a7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        a7b0Var.m19671T();
    }

    /* JADX INFO: renamed from: l0 */
    private final void m11774l0() {
        m11792i0().setTypeface(eqh0.c(3));
        if (sab0.i(this.purchaseType)) {
            m11792i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m11788e0().setImageResource(d3c0.u4);
        } else {
            m11792i0().setTextColor(this.act.color(b1c0.j));
            m11788e0().setImageResource(d3c0.oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo11778G(payMethod);
        xdl0.E0(m11787d0(), new View.OnClickListener() { // from class: l.z6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a7b0.m11773X(this.f28657a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private final void m11775m0() {
        int iColor;
        int i;
        m11786c0().setTypeface(eqh0.c(3));
        boolean zI = sab0.i(this.purchaseType);
        Act act = this.act;
        m11786c0().setTextColor(zI ? act.color(b1c0.g) : act.color(b1c0.m));
        m11786c0().setText(vs80.m25865b(this.purchaseType));
        if (sab0.i(this.purchaseType)) {
            iColor = this.act.color(b1c0.g);
        } else {
            boolean zQ = sab0.q(this.purchaseType);
            Act act2 = this.act;
            iColor = zQ ? act2.color(b1c0.t) : act2.color(b1c0.t);
        }
        m11785b0().setTextColor(iColor);
        if (sab0.x(this.purchaseType)) {
            i = d3c0.V6;
        } else if (sab0.g(this.purchaseType)) {
            i = d3c0.L;
        } else if (sab0.i(this.purchaseType)) {
            i = d3c0.S6;
        } else {
            i = sab0.q(this.purchaseType) ? d3c0.T6 : d3c0.U6;
        }
        m11784a0().setBackgroundResource(i);
        xdl0.E0(m11784a0(), new View.OnClickListener() { // from class: l.y6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a7b0.m11772W(this.f28058a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    private final void m11776n0() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        m11782Z().setLayerType(1, paint);
        m11793j0().setTypeface(eqh0.c(3));
        m11793j0().setBackgroundResource(sab0.i(this.purchaseType) ? d3c0.b6 : d3c0.a6);
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
            m11792i0().setText(R.string.X9);
            m11789f0().setImageResource(sab0.i(this.purchaseType) ? d3c0.w4 : d3c0.fa);
        } else if (TEnum.equals(currentPayMethod, "jingdong")) {
            m11792i0().setText("京东支付");
            m11789f0().setImageResource(sab0.i(this.purchaseType) ? d3c0.v4 : d3c0.ea);
        } else {
            m11792i0().setText((sab0.i(this.purchaseType) || sab0.o(this.purchaseType) || !CoreModule.m1854P().m11706a().m5461j3()) ? this.act.string(R.string.R9) : this.act.string(R.string.h));
            m11789f0().setImageResource(sab0.i(this.purchaseType) ? d3c0.t4 : d3c0.da);
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
        VText vTextM11786c0 = m11786c0();
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM11786c0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
        bi60 paymentTextResponseData2 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData2 != null ? paymentTextResponseData2.getDayPriceSticker() : null)) {
            bi60 paymentTextResponseData3 = getPaymentTextResponseData();
            if (TextUtils.isEmpty(paymentTextResponseData3 != null ? paymentTextResponseData3.getSticker() : null)) {
                xdl0.M(m11793j0(), false);
                xdl0.M(m11782Z(), false);
            } else {
                xdl0.M(m11793j0(), true);
                xdl0.M(m11782Z(), false);
                VText vTextM11793j0 = m11793j0();
                bi60 paymentTextResponseData4 = getPaymentTextResponseData();
                vTextM11793j0.setText(paymentTextResponseData4 != null ? paymentTextResponseData4.getSticker() : null);
                if (g6a.m15597t()) {
                    m19672V();
                }
            }
        } else {
            xdl0.M(m11793j0(), false);
            xdl0.M(m11782Z(), true);
            VText vTextM11782Z = m11782Z();
            bi60 paymentTextResponseData5 = getPaymentTextResponseData();
            vTextM11782Z.setText(paymentTextResponseData5 != null ? paymentTextResponseData5.getDayPriceSticker() : null);
        }
        bi60 paymentTextResponseData6 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData6 != null ? paymentTextResponseData6.getSubtitle() : null)) {
            xdl0.M(m11785b0(), false);
            return;
        }
        xdl0.M(m11785b0(), true);
        VText vTextM11785b0 = m11785b0();
        bi60 paymentTextResponseData7 = getPaymentTextResponseData();
        vTextM11785b0.setText(paymentTextResponseData7 != null ? paymentTextResponseData7.getSubtitle() : null);
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
            xdl0.M(m11790g0(), false);
            xdl0.M(m11791h0(), false);
        } else if (((Boolean) pairM15350b.getSecond()).booleanValue()) {
            xdl0.M(m11790g0(), true);
            xdl0.M(m11791h0(), false);
            m11790g0().setText(charSequence);
        } else {
            xdl0.M(m11790g0(), false);
            xdl0.M(m11791h0(), true);
            m11791h0().setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m11781Y(View view) {
        b7b0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m11782Z() {
        VText vText = this._day_price_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_day_price_text");
        return null;
    }

    @Override // p006l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo11783a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.R1, root, false);
        viewInflate.getClass();
        m11781Y(viewInflate);
        m11774l0();
        m11776n0();
        m11794k0();
        m11775m0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m11784a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m11785b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m11786c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m11787d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m11788e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m11789f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m11790g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m11791h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m11792i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m11793j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11794k0() {
        m11782Z().setBackgroundResource(sab0.i(this.purchaseType) ? d3c0.W6 : d3c0.X6);
        m11782Z().setPadding(t100.q, 0, t100.j, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m11795o0(boolean show) {
        if (!show) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && g6a.m15597t()) {
            m19672V();
        }
        this.pageState = 1;
    }
}
