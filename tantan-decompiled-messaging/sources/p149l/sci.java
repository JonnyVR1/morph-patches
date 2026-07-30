package p149l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u0019\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u000eJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR\"\u0010N\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010Q\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010f\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m87232d2 = {"Ll/sci;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "F", "(Landroid/view/View;)V", j6f.GPS_DIRECTION_TRUE, "()V", j6f.GPS_MEASUREMENT_INTERRUPTED, "G", "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "J", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "isPromotion", "", FirebaseAnalytics.Param.PRICE, "originalUnitPrice", "quantityName", "K", "(ZDDLjava/lang/String;)Ljava/lang/String;", "I", "(ZLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "H", "(DLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "W", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", SysnotifListener.ACTION_DISMISS, "onDetachedFromWindow", "X", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Lv/VLinear;", "h", "Lv/VLinear;", "M", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Landroid/widget/TextView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/TextView;", BloodType.f38728O, "()Landroid/widget/TextView;", "set_get_privilege_text", "(Landroid/widget/TextView;)V", "_get_privilege_text", "j", "N", "set_get_privilege_subtitle", "_get_privilege_subtitle", "k", "Q", "set_stickers", "_stickers", BLiveStormDanmakuGiftResourceType.f44444l, "R", "set_subtitle", "_subtitle", j6f.LATITUDE_SOUTH, "set_title", "_title", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "P", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/cwf0;", "o", "Ll/cwf0;", "pageHelper", "Ll/c4g0;", "p", "Ll/c4g0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "q", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sci extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VLinear _get_privilege;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _get_privilege_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _get_privilege_subtitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _stickers;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public c4g0 merchandiseSubs;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final NumberFormat numberFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sci(@NotNull Act act, @Nullable String str) {
        super(act);
        act.getClass();
        this.act = act;
        this.from = str;
        cwf0 cwf0VarM133794c = i0e.m133794c("p_femalevip_guide_pop", sci.class.getName());
        cwf0VarM133794c.getClass();
        this.pageHelper = cwf0VarM133794c;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m183375A(sci sciVar) {
        super.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m183376C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public static void m183377D(final sci sciVar, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.rci
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sci.m183382U(this.f158774a, (Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            String strM183380L = m183380L(sciVar, false, d, d2, null, 8, null);
            String strM183389I = sciVar.m183389I(false, merchandise, d);
            if (sciVar.m183399W(merchandise)) {
                double firstCouponPrice = merchandise.getFirstCouponPrice();
                String strM183391K = sciVar.m183391K(true, firstCouponPrice, d2, sciVar.m183390J(merchandise));
                String strM183389I2 = sciVar.m183389I(true, merchandise, firstCouponPrice);
                xdl0.m208344M(sciVar.m183393N(), true);
                sciVar.m183393N().setText(sciVar.m183388H(d2, merchandise, firstCouponPrice));
                strM183380L = strM183391K;
                strM183389I = strM183389I2;
            }
            sciVar.m183397R().setText(strM183380L);
            sciVar.m183394O().setText(strM183389I);
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m183378E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    private final void m183379G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(d3c0.f83930g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        e51.m114742G(new Runnable() { // from class: l.lci
            @Override // java.lang.Runnable
            public final void run() {
                sci.m183386z(this.f127414a);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m183380L(sci sciVar, boolean z, double d, double d2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        return sciVar.m183391K(z, d, d2, str);
    }

    /* JADX INFO: renamed from: T */
    private final void m183381T() {
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("femaleVip")));
        final Function1 function1 = new Function1() { // from class: l.oci
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sci.m183376C((List) obj);
            }
        };
        this.merchandiseSubs = c22306cDuringCreated.filter(new w9j() { // from class: l.pci
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sci.m183378E(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.qci
            @Override // p149l.e30
            public final void call(Object obj) {
                sci.m183377D(this.f153756a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static final Boolean m183382U(sci sciVar, Merchandise merchandise) {
        boolean z = false;
        if (!g6a.m124560i() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || (!sciVar.m183399W(merchandise) && !merchandise.weekly()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: V */
    private final void m183383V() {
        qib0.f154691G.m102354Y0(m183395P(), d3c0.f83655M);
        m183398S().setText("全新 · 她专享会员");
        m183397R().setText("新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！");
        if (g6a.m124560i()) {
            m183394O().setText("成为女性会员");
        } else {
            m183394O().setText("¥1/周购买");
        }
        m183392M().setBackgroundResource(d3c0.f83641L);
        m183396Q().setText("限时特惠");
        m183396Q().setBackgroundResource(d3c0.f83828Z);
        xdl0.m208344M(m183396Q(), true);
        xdl0.m208329E0(m183392M(), new View.OnClickListener() { // from class: l.mci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sci.m183384x(this.f133134a, view);
            }
        });
        xdl0.m208344M(m183393N(), false);
    }

    /* JADX INFO: renamed from: x */
    public static void m183384x(sci sciVar, View view) {
        sciVar.dismiss();
        zvf0.m220396r("e_femalevip_guide_button", "p_femalevip_guide_pop");
        C8764c.m53433X(sciVar.act, "p_home,femalevip_guide", null, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m183386z(sci sciVar) {
        Window window = sciVar.getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.f196695e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m183387F(View view) {
        tci.m187987a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final String m183388H(double originalUnitPrice, Merchandise m, double price) {
        return "已优惠：" + m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(Math.abs((originalUnitPrice * ((double) m.quantity)) - price));
    }

    /* JADX INFO: renamed from: I */
    public final String m183389I(boolean isPromotion, Merchandise m, double price) {
        if (isPromotion) {
            return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + " 立即购买";
        }
        return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + "/周购买";
    }

    /* JADX INFO: renamed from: J */
    public final String m183390J(Merchandise m) {
        if (m.weekly()) {
            return "周";
        }
        if (m.monthly()) {
            return "月";
        }
        return m.quantity + "个月";
    }

    /* JADX INFO: renamed from: K */
    public final String m183391K(boolean isPromotion, double price, double originalUnitPrice, String quantityName) {
        NumberFormat numberFormat = this.numberFormat;
        if (isPromotion) {
            return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验!限时特惠，只需" + numberFormat.format(price) + "元首" + quantityName;
        }
        return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！原价" + numberFormat.format(originalUnitPrice) + "元/周，限时特惠，只需" + this.numberFormat.format(price) + "元";
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m183392M() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m183393N() {
        TextView textView = this._get_privilege_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final TextView m183394O() {
        TextView textView = this._get_privilege_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m183395P() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m183396Q() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m183397R() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TextView m183398S() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m183399W(Merchandise m) {
        return rxa0.m181491l(m, MonetizationPromotionsId.lowPriceCustomerFemaleVIP);
    }

    /* JADX INFO: renamed from: X */
    public final void m183400X() {
        mkd0.m154992z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.f196691a);
        }
        e51.m114742G(new Runnable() { // from class: l.nci
            @Override // java.lang.Runnable
            public final void run() {
                sci.m183375A(this.f138171a);
            }
        });
        i0e.m133796e(this.pageHelper);
        m183400X();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(m6c0.f131566b, (ViewGroup) null);
        viewInflate.getClass();
        m183387F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m183383V();
        m183381T();
    }

    @Override // p149l.l5j0, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m183400X();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m183379G();
        i0e.m133797f(this.pageHelper);
    }
}
