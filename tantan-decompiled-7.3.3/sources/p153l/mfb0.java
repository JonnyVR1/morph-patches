package p153l;

import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010>\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0010R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010/\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R\"\u0010V\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010/\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\"\u0010Z\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010/\u001a\u0004\bX\u00101\"\u0004\bY\u00103R\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010h¨\u0006j"}, m88121d2 = {"Ll/mfb0;", "Ll/l5;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c0", "(Landroid/view/View;)V", "i0", "()V", "j0", "Landroid/view/ViewGroup;", "root", "a", "(Landroid/view/ViewGroup;)Landroid/view/View;", "H", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "G", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "b", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "release", "E", "()Ljava/lang/String;", "p", "Lcom/p1/mobile/android/app/Act;", "q", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "r", "Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/ndb0;", "Lv/VText;", Constants.KEY_T, "Lv/VText;", "d0", "()Lv/VText;", "set_get_privilege_text", "(Lv/VText;)V", "_get_privilege_text", "u", "e0", "set_origin_price", "_origin_price", ResourceDirection.f39656v, "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "f0", "()Landroid/widget/LinearLayout;", "set_pay_method", "(Landroid/widget/LinearLayout;)V", "_pay_method", "Lv/VImage;", BaseSei.f14624X, "Lv/VImage;", "g0", "()Lv/VImage;", "set_pay_method_icon", "(Lv/VImage;)V", "_pay_method_icon", BaseSei.f14625Y, "h0", "set_pay_method_text", "_pay_method_text", BaseSei.f14626Z, "get_pay_method_promotion", "set_pay_method_promotion", "_pay_method_promotion", "A", "get_pay_method_promotion_right", "set_pay_method_promotion_right", "_pay_method_promotion_right", "B", "get_pay_method_arrow", "set_pay_method_arrow", "_pay_method_arrow", "Ll/kcg0;", c4s.C_ZONE, "Ll/kcg0;", "officialPriceSub", "Ljava/text/NumberFormat;", "D", "Ljava/text/NumberFormat;", "numberFormat", "Ll/eq60;", "Ll/eq60;", "paymentTextProcessorsHelper", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class mfb0 extends AbstractC18347l5 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _pay_method_promotion_right;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VImage _pay_method_arrow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public kcg0 officialPriceSub;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
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
    public mfb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        super(act, purchaseType, str, ndb0Var);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setGroupingUsed(false);
        this.numberFormat = numberInstance;
        eq60 eq60Var = new eq60(act, purchaseType, "purchasePage");
        eq60Var.m121896c();
        this.paymentTextProcessorsHelper = eq60Var;
    }

    /* JADX INFO: renamed from: W */
    public static Boolean m158149W(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: X */
    public static void m158150X(mfb0 mfb0Var, View view) {
        AbstractC18347l5.m152851y(mfb0Var, null, 1, null);
    }

    /* JADX INFO: renamed from: Z */
    public static Boolean m158152Z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m158153a0(mfb0 mfb0Var, View view) {
        if (TEnum.equals(mfb0Var.getCurrentPayMethod(), "unknown_")) {
            return;
        }
        mfb0Var.m152865T();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m158154b0(mfb0 mfb0Var, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.lfb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mfb0.m158157k0((Merchandise) obj);
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            SpannableString spannableString = new SpannableString("正式版" + mfb0Var.numberFormat.format(merchandise.defaultStockKeepUnit.prices.price) + "元");
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            mfb0Var.m158160e0().setText(spannableString);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m158155i0() {
        m158163h0().setTypeface(lyh0.m156283c(3));
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        mo120654G(payMethod);
        bnl0.m105509E0(m158161f0(), new View.OnClickListener() { // from class: l.kfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfb0.m158153a0(this.f126263a, view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    private final void m158156j0() {
        m158159d0().setTypeface(lyh0.m156283c(3));
        m158159d0().setText(this.act.string(R$string.f28236b));
        m158159d0().setBackgroundResource(jbc0.f119486Z2);
        bnl0.m105509E0(m158159d0(), new View.OnClickListener() { // from class: l.jfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfb0.m158150X(this.f120579a, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m158157k0(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
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
            m158163h0().setText(R$string.f28201X9);
            m158162g0().setImageResource(jbc0.f119528c3);
        } else {
            if (TEnum.equals(currentPayMethod, PayMethod.jingdong)) {
                m158163h0().setText("京东支付");
                m158162g0().setImageResource(jbc0.f119514b3);
                return;
            }
            VText vTextM158163h0 = m158163h0();
            boolean zMo34527j3 = CoreModule.m30933P().m143405a().mo34527j3();
            Act act = this.act;
            vTextM158163h0.setText(zMo34527j3 ? act.string(R$string.f28308h) : act.string(R$string.f28135R9));
            m158162g0().setImageResource(jbc0.f119500a3);
        }
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: H */
    public void mo120655H() {
        String strString;
        if (getCurrentPurchaseSection() == null) {
            return;
        }
        C8928d currentPurchaseSection = getCurrentPurchaseSection();
        currentPurchaseSection.getClass();
        m152864S(this.paymentTextProcessorsHelper.m121894a(new fq60(currentPurchaseSection, getCurrentPayMethod(), getRefundAmount(), false, 8, null)));
        VText vTextM158159d0 = m158159d0();
        gq60 paymentTextResponseData = getPaymentTextResponseData();
        if (paymentTextResponseData == null || (strString = paymentTextResponseData.getTitle()) == null) {
            strString = this.act.string(R$string.f28236b);
        }
        vTextM158159d0.setText(strString);
    }

    @Override // p153l.AbstractC18347l5
    /* JADX INFO: renamed from: I */
    public void mo120656I(@NotNull PayMethod currentPayMethod, @NotNull C8928d section) {
        currentPayMethod.getClass();
        section.getClass();
    }

    @Override // p153l.w3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96551a(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = this.act.inflater().inflate(rec0.f162538d1, root, false);
        viewInflate.getClass();
        m158158c0(viewInflate);
        m158155i0();
        m158156j0();
        return viewInflate;
    }

    @Override // p153l.AbstractC18347l5, p153l.w3m
    /* JADX INFO: renamed from: b */
    public void mo152867b() {
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            CoreModule.f18264c.f20333O0.m31073C3();
            CoreModule.f18264c.f20333O0.m31072B3();
        }
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("svip")));
        final Function1 function1 = new Function1() { // from class: l.gfb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mfb0.m158149W((List) obj);
            }
        };
        this.officialPriceSub = c22421cDuringCreated.filter(new qcj() { // from class: l.hfb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mfb0.m158152Z(function1, obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.ifb0
            @Override // p153l.y20
            public final void call(Object obj) {
                mfb0.m158154b0(this.f114653a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m158158c0(View view) {
        nfb0.m162922a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m158159d0() {
        VText vText = this._get_privilege_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VText m158160e0() {
        VText vText = this._origin_price;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_origin_price");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final LinearLayout m158161f0() {
        LinearLayout linearLayout = this._pay_method;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_pay_method");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final VImage m158162g0() {
        VImage vImage = this._pay_method_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_pay_method_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final VText m158163h0() {
        VText vText = this._pay_method_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_pay_method_text");
        return null;
    }

    @Override // p153l.AbstractC18347l5, p153l.w3m
    public void release() {
        super.release();
        psd0.m173633z(this.officialPriceSub);
        this.officialPriceSub = null;
    }
}
