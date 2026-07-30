package p149l;

import android.graphics.Color;
import android.graphics.Paint;
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
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010`\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010;\u001a\u0004\b^\u0010=\"\u0004\b_\u0010?R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010;\u001a\u0004\bf\u0010=\"\u0004\bg\u0010?R\"\u0010l\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010;\u001a\u0004\bj\u0010=\"\u0004\bk\u0010?R\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006v"}, m87232d2 = {"Ll/a7b0;", "Ll/n5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Y", "(Landroid/view/View;)V", "n0", "()V", "k0", "l0", "m0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "H", "E", "()Ljava/lang/String;", "", "show", "o0", "(Z)V", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/j5b0;", "Lv/VLinear;", Constants.KEY_T, "Lv/VLinear;", "a0", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Lv/VText;", "u", "Lv/VText;", "c0", "()Lv/VText;", "set_get_privilege_text", "(Lv/VText;)V", "_get_privilege_text", ResourceDirection.f38808v, "b0", "set_get_privilege_subtitle", "_get_privilege_subtitle", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "d0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", BaseSei.f13930X, "Lv/VImage;", "f0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", BaseSei.f13931Y, "i0", "set_pay_method_text", "_pay_method_text", BaseSei.f13932Z, "g0", "set_pay_method_promotion", "_pay_method_promotion", "A", "h0", "set_pay_method_promotion_right", "_pay_method_promotion_right", "B", "e0", "set_pay_method_arrow", "_pay_method_arrow", b2s.C_ZONE, "Z", "set_day_price_text", "_day_price_text", "D", "j0", "set_stickers", "_stickers", "Ll/fi60;", "Ll/fi60;", "paymentTipsPromotionHelper", "Ll/zh60;", "F", "Ll/zh60;", "paymentTextProcessorsHelper", "", "pageState", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class a7b0 extends AbstractC18623n5 {

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
        zh60Var.m218770b();
        this.paymentTextProcessorsHelper = zh60Var;
        this.pageState = -1;
    }

    /* JADX INFO: renamed from: W */
    public static void m95233W(a7b0 a7b0Var, View view) {
        AbstractC18623n5.m157931y(a7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: X */
    public static void m95234X(a7b0 a7b0Var, View view) {
        if (TEnum.equals(a7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        a7b0Var.m157944T();
    }

    /* JADX INFO: renamed from: l0 */
    private final void m95235l0() {
        m95253i0().setTypeface(eqh0.m117752c(3));
        if (sab0.m182891i(this.purchaseType)) {
            m95253i0().setTextColor(Color.parseColor("#ccE8CA8A"));
            m95249e0().setImageResource(d3c0.f84126u4);
        } else {
            m95253i0().setTextColor(this.act.color(b1c0.f72555j));
            m95249e0().setImageResource(d3c0.f84048oa);
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo95239G(payMethod);
        xdl0.m208329E0(m95248d0(), new View.OnClickListener() { // from class: l.z6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a7b0.m95234X(this.f201904a, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    private final void m95236m0() {
        int iColor;
        int i;
        m95247c0().setTypeface(eqh0.m117752c(3));
        boolean zM182891i = sab0.m182891i(this.purchaseType);
        Act act = this.act;
        m95247c0().setTextColor(zM182891i ? act.color(b1c0.f72549g) : act.color(b1c0.f72561m));
        m95247c0().setText(vs80.m199853b(this.purchaseType));
        if (sab0.m182891i(this.purchaseType)) {
            iColor = this.act.color(b1c0.f72549g);
        } else {
            boolean zM182899q = sab0.m182899q(this.purchaseType);
            Act act2 = this.act;
            iColor = zM182899q ? act2.color(b1c0.f72575t) : act2.color(b1c0.f72575t);
        }
        m95246b0().setTextColor(iColor);
        if (sab0.m182906x(this.purchaseType)) {
            i = d3c0.f83783V6;
        } else if (sab0.m182889g(this.purchaseType)) {
            i = d3c0.f83641L;
        } else if (sab0.m182891i(this.purchaseType)) {
            i = d3c0.f83744S6;
        } else {
            i = sab0.m182899q(this.purchaseType) ? d3c0.f83757T6 : d3c0.f83770U6;
        }
        m95245a0().setBackgroundResource(i);
        xdl0.m208329E0(m95245a0(), new View.OnClickListener() { // from class: l.y6b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a7b0.m95233W(this.f196540a, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    private final void m95237n0() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        m95243Z().setLayerType(1, paint);
        m95254j0().setTypeface(eqh0.m117752c(3));
        m95254j0().setBackgroundResource(sab0.m182891i(this.purchaseType) ? d3c0.f83862b6 : d3c0.f83848a6);
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
            m95253i0().setText(R$string.f27353X9);
            m95250f0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84154w4 : d3c0.f83922fa);
        } else if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
            m95253i0().setText("京东支付");
            m95250f0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84140v4 : d3c0.f83908ea);
        } else {
            m95253i0().setText((sab0.m182891i(this.purchaseType) || sab0.m182897o(this.purchaseType) || !CoreModule.m29935P().m94651a().mo33524j3()) ? this.act.string(R$string.f27287R9) : this.act.string(R$string.f27460h));
            m95250f0().setImageResource(sab0.m182891i(this.purchaseType) ? d3c0.f84112t4 : d3c0.f83894da);
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
        VText vTextM95247c0 = m95247c0();
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        vTextM95247c0.setText(paymentTextResponseData != null ? paymentTextResponseData.getTitle() : null);
        bi60 paymentTextResponseData2 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData2 != null ? paymentTextResponseData2.getDayPriceSticker() : null)) {
            bi60 paymentTextResponseData3 = getPaymentTextResponseData();
            if (TextUtils.isEmpty(paymentTextResponseData3 != null ? paymentTextResponseData3.getSticker() : null)) {
                xdl0.m208344M(m95254j0(), false);
                xdl0.m208344M(m95243Z(), false);
            } else {
                xdl0.m208344M(m95254j0(), true);
                xdl0.m208344M(m95243Z(), false);
                VText vTextM95254j0 = m95254j0();
                bi60 paymentTextResponseData4 = getPaymentTextResponseData();
                vTextM95254j0.setText(paymentTextResponseData4 != null ? paymentTextResponseData4.getSticker() : null);
                if (g6a.m124571t()) {
                    m157945V();
                }
            }
        } else {
            xdl0.m208344M(m95254j0(), false);
            xdl0.m208344M(m95243Z(), true);
            VText vTextM95243Z = m95243Z();
            bi60 paymentTextResponseData5 = getPaymentTextResponseData();
            vTextM95243Z.setText(paymentTextResponseData5 != null ? paymentTextResponseData5.getDayPriceSticker() : null);
        }
        bi60 paymentTextResponseData6 = getPaymentTextResponseData();
        if (TextUtils.isEmpty(paymentTextResponseData6 != null ? paymentTextResponseData6.getSubtitle() : null)) {
            xdl0.m208344M(m95246b0(), false);
            return;
        }
        xdl0.m208344M(m95246b0(), true);
        VText vTextM95246b0 = m95246b0();
        bi60 paymentTextResponseData7 = getPaymentTextResponseData();
        vTextM95246b0.setText(paymentTextResponseData7 != null ? paymentTextResponseData7.getSubtitle() : null);
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
            xdl0.m208344M(m95251g0(), false);
            xdl0.m208344M(m95252h0(), false);
        } else if (pairM121492b.getSecond().booleanValue()) {
            xdl0.m208344M(m95251g0(), true);
            xdl0.m208344M(m95252h0(), false);
            m95251g0().setText(first);
        } else {
            xdl0.m208344M(m95251g0(), false);
            xdl0.m208344M(m95252h0(), true);
            m95252h0().setText(first);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m95242Y(View view) {
        b7b0.m100622a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m95243Z() {
        VText vText = this._day_price_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_day_price_text");
        return null;
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131527R1, root, false);
        viewInflate.getClass();
        m95242Y(viewInflate);
        m95235l0();
        m95237n0();
        m95255k0();
        m95236m0();
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final VLinear m95245a0() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VText m95246b0() {
        VText vText = this._get_privilege_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final VText m95247c0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LinearLayout m95248d0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m95249e0() {
        VImage vImage = this._pay_method_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_arrow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final VImage m95250f0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VText m95251g0() {
        VText vText = this._pay_method_promotion;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m95252h0() {
        VText vText = this._pay_method_promotion_right;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_promotion_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VText m95253i0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VText m95254j0() {
        VText vText = this._stickers;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_stickers");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m95255k0() {
        m95243Z().setBackgroundResource(sab0.m182891i(this.purchaseType) ? d3c0.f83796W6 : d3c0.f83809X6);
        m95243Z().setPadding(t100.f167268q, 0, t100.f167261j, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m95256o0(boolean show) {
        if (!show) {
            this.pageState = 0;
            return;
        }
        if (this.pageState == 0 && g6a.m124571t()) {
            m157945V();
        }
        this.pageState = 1;
    }
}
