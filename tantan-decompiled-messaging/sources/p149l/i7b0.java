package p149l;

import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010>\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0010R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010/\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R\"\u0010V\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010/\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\"\u0010Z\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010/\u001a\u0004\bX\u00101\"\u0004\bY\u00103R\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010h¨\u0006j"}, m87232d2 = {"Ll/i7b0;", "Ll/n5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c0", "(Landroid/view/View;)V", "i0", "()V", "j0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "b", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "release", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/j5b0;", "Lv/VText;", Constants.KEY_T, "Lv/VText;", "d0", "()Lv/VText;", "set_get_privilege_text", "(Lv/VText;)V", "_get_privilege_text", "u", "e0", "set_origin_price", "_origin_price", ResourceDirection.f38808v, "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "f0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", BaseSei.f13930X, "Lv/VImage;", "g0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", BaseSei.f13931Y, "h0", "set_pay_method_text", "_pay_method_text", BaseSei.f13932Z, "get_pay_method_promotion", "set_pay_method_promotion", "_pay_method_promotion", "A", "get_pay_method_promotion_right", "set_pay_method_promotion_right", "_pay_method_promotion_right", "B", "get_pay_method_arrow", "set_pay_method_arrow", "_pay_method_arrow", "Ll/c4g0;", b2s.C_ZONE, "Ll/c4g0;", "officialPriceSub", "Ljava/text/NumberFormat;", "D", "Ljava/text/NumberFormat;", "numberFormat", "Ll/zh60;", "Ll/zh60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class i7b0 extends AbstractC18623n5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public c4g0 officialPriceSub;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
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
    public VText _get_privilege_text;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _origin_price;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public LinearLayout _pay_method;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VImage _pay_method_icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _pay_method_text;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText _pay_method_promotion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7b0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        super(act, purchaseType, str, j5b0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setGroupingUsed(false);
        this.numberFormat = numberInstance;
        zh60 zh60Var = new zh60(act, purchaseType, "purchasePage");
        zh60Var.m218771c();
        this.paymentTextProcessorsHelper = zh60Var;
    }

    /* JADX INFO: renamed from: W */
    public static Boolean m134746W(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: X */
    public static void m134747X(i7b0 i7b0Var, View view) {
        AbstractC18623n5.m157931y(i7b0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m134749Z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m134750a0(i7b0 i7b0Var, View view) {
        if (TEnum.equals(i7b0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        i7b0Var.m157944T();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m134751b0(i7b0 i7b0Var, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.h7b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return i7b0.m134754k0((Merchandise) obj);
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            SpannableString spannableString = new SpannableString("正式版" + i7b0Var.numberFormat.format(merchandise.defaultStockKeepUnit.prices.price) + "元");
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            i7b0Var.m134757e0().setText(spannableString);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m134752i0() {
        m134760h0().setTypeface(eqh0.m117752c(3));
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo95239G(payMethod);
        xdl0.m208329E0(m134758f0(), new View.OnClickListener() { // from class: l.g7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i7b0.m134750a0(this.f101348a, view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    private final void m134753j0() {
        m134756d0().setTypeface(eqh0.m117752c(3));
        m134756d0().setText(this.act.string(R$string.f27388b));
        m134756d0().setBackgroundResource(d3c0.f83831Z2);
        xdl0.m208329E0(m134756d0(), new View.OnClickListener() { // from class: l.f7b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i7b0.m134747X(this.f96236a, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m134754k0(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
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
            m134760h0().setText(R$string.f27353X9);
            m134759g0().setImageResource(d3c0.f83873c3);
        } else {
            if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
                m134760h0().setText("京东支付");
                m134759g0().setImageResource(d3c0.f83859b3);
                return;
            }
            VText vTextM134760h0 = m134760h0();
            boolean zMo33524j3 = CoreModule.m29935P().m94651a().mo33524j3();
            Act act = this.act;
            vTextM134760h0.setText(zMo33524j3 ? act.string(R$string.f27460h) : act.string(R$string.f27287R9));
            m134759g0().setImageResource(d3c0.f83845a3);
        }
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: H */
    public void mo95240H() {
        String strString;
        if (getCurrentPurchaseSection() == null) {
            return;
        }
        C8765d currentPurchaseSection = getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        m157943S(this.paymentTextProcessorsHelper.m218769a(new ai60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false, 8, null)));
        VText vTextM134756d0 = m134756d0();
        bi60 paymentTextResponseData = getPaymentTextResponseData();
        if (paymentTextResponseData == null || (strString = paymentTextResponseData.getTitle()) == null) {
            strString = this.act.string(R$string.f27388b);
        }
        vTextM134756d0.setText(strString);
    }

    @Override // p149l.AbstractC18623n5
    /* JADX INFO: renamed from: I */
    public void mo95241I(@NotNull PayMethod currentPayMethod, @NotNull C8765d section) {
        currentPayMethod.getClass();
        section.getClass();
    }

    @Override // p149l.d1m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo95244a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(m6c0.f131578d1, root, false);
        viewInflate.getClass();
        m134755c0(viewInflate);
        m134752i0();
        m134753j0();
        return viewInflate;
    }

    @Override // p149l.AbstractC18623n5, p149l.d1m
    /* JADX INFO: renamed from: b */
    public void mo100278b() {
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("svip")));
        final Function1 function1 = new Function1() { // from class: l.c7b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i7b0.m134746W((List) obj);
            }
        };
        this.officialPriceSub = c22306cDuringCreated.filter(new w9j() { // from class: l.d7b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return i7b0.m134749Z(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.e7b0
            @Override // p149l.e30
            public final void call(Object obj) {
                i7b0.m134751b0(this.f89692a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m134755c0(View view) {
        j7b0.m140081a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m134756d0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m134757e0() {
        VText vText = this._origin_price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_origin_price");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final LinearLayout m134758f0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VImage m134759g0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m134760h0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_pay_method_text");
        return null;
    }

    @Override // p149l.AbstractC18623n5, p149l.d1m
    public void release() {
        super.release();
        mkd0.m154992z(this.officialPriceSub);
        this.officialPriceSub = null;
    }
}
