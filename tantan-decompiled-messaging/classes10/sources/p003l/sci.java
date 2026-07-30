package p003l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p000p1.mobile.putong.core.data.Prices;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.e51;
import l.g6a;
import l.i0e;
import l.l5j0;
import l.m6c0;
import l.mkd0;
import l.qib0;
import l.rxa0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y7c0;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u0019\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u000eJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR\"\u0010N\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010Q\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010f\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, d2 = {"Ll/sci;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "F", "(Landroid/view/View;)V", "T", "()V", "V", "G", "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "J", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "isPromotion", "", "price", "originalUnitPrice", "quantityName", "K", "(ZDDLjava/lang/String;)Ljava/lang/String;", "I", "(ZLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "H", "(DLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "W", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "dismiss", "onDetachedFromWindow", "X", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Lv/VLinear;", "h", "Lv/VLinear;", "M", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "O", "()Landroid/widget/TextView;", "set_get_privilege_text", "(Landroid/widget/TextView;)V", "_get_privilege_text", "j", "N", "set_get_privilege_subtitle", "_get_privilege_subtitle", "k", "Q", "set_stickers", "_stickers", "l", "R", "set_subtitle", "_subtitle", "S", "set_title", "_title", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "P", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/cwf0;", "o", "Ll/cwf0;", "pageHelper", "Ll/c4g0;", "p", "Ll/c4g0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "q", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
        cwf0 cwf0VarC = i0e.c("p_femalevip_guide_pop", sci.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m9308A(sci sciVar) {
        super.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m9309C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public static void m9310D(final sci sciVar, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.rci
            public final Object call(Object obj) {
                return sci.m9315U(this.f7168a, (Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            String strM9313L = m9313L(sciVar, false, d, d2, null, 8, null);
            String strM9322I = sciVar.m9322I(false, merchandise, d);
            if (sciVar.m9332W(merchandise)) {
                double firstCouponPrice = merchandise.getFirstCouponPrice();
                String strM9324K = sciVar.m9324K(true, firstCouponPrice, d2, sciVar.m9323J(merchandise));
                String strM9322I2 = sciVar.m9322I(true, merchandise, firstCouponPrice);
                xdl0.M(sciVar.m9326N(), true);
                sciVar.m9326N().setText(sciVar.m9321H(d2, merchandise, firstCouponPrice));
                strM9313L = strM9324K;
                strM9322I = strM9322I2;
            }
            sciVar.m9330R().setText(strM9313L);
            sciVar.m9327O().setText(strM9322I);
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m9311E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private final void m9312G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(d3c0.g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        e51.G(new Runnable() { // from class: l.lci
            @Override // java.lang.Runnable
            public final void run() {
                sci.m9319z(this.f6145a);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m9313L(sci sciVar, boolean z, double d, double d2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        return sciVar.m9324K(z, d, d2, str);
    }

    /* JADX INFO: renamed from: T */
    private final void m9314T() {
        c cVarDuringCreated = this.act.duringCreated(CoreModule.c.j0.y5(ProductCategory.get("femaleVip")));
        final Function1 function1 = new Function1() { // from class: l.oci
            public final Object invoke(Object obj) {
                return sci.m9309C((List) obj);
            }
        };
        this.merchandiseSubs = cVarDuringCreated.filter(new w9j() { // from class: l.pci
            public final Object call(Object obj) {
                return sci.m9311E(function1, obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.qci
            public final void call(Object obj) {
                sci.m9310D(this.f7004a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static final Boolean m9315U(sci sciVar, Merchandise merchandise) {
        boolean z = false;
        if (!g6a.i() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || (!sciVar.m9332W(merchandise) && !merchandise.weekly()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: V */
    private final void m9316V() {
        qib0.G.Y0(m9328P(), d3c0.M);
        m9331S().setText("全新 · 她专享会员");
        m9330R().setText("新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！");
        if (g6a.i()) {
            m9327O().setText("成为女性会员");
        } else {
            m9327O().setText("¥1/周购买");
        }
        m9325M().setBackgroundResource(d3c0.L);
        m9329Q().setText("限时特惠");
        m9329Q().setBackgroundResource(d3c0.Z);
        xdl0.M(m9329Q(), true);
        xdl0.E0(m9325M(), new View.OnClickListener() { // from class: l.mci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sci.m9317x(this.f6329a, view);
            }
        });
        xdl0.M(m9326N(), false);
    }

    /* JADX INFO: renamed from: x */
    public static void m9317x(sci sciVar, View view) {
        sciVar.dismiss();
        zvf0.r("e_femalevip_guide_button", "p_femalevip_guide_pop");
        com.p1.mobile.putong.core.ui.purchase.c.X(sciVar.act, "p_home,femalevip_guide", (Privilege) null, (e30) null, (d30) null, (d30) null, (d30) null, 120, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m9319z(sci sciVar) {
        Window window = sciVar.getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9320F(View view) {
        tci.m9565a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final String m9321H(double originalUnitPrice, Merchandise m, double price) {
        return "已优惠：" + m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(Math.abs((originalUnitPrice * ((double) m.quantity)) - price));
    }

    /* JADX INFO: renamed from: I */
    public final String m9322I(boolean isPromotion, Merchandise m, double price) {
        if (isPromotion) {
            return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + " 立即购买";
        }
        return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + "/周购买";
    }

    /* JADX INFO: renamed from: J */
    public final String m9323J(Merchandise m) {
        if (m.weekly()) {
            return "周";
        }
        if (m.monthly()) {
            return "月";
        }
        return m.quantity + "个月";
    }

    /* JADX INFO: renamed from: K */
    public final String m9324K(boolean isPromotion, double price, double originalUnitPrice, String quantityName) {
        NumberFormat numberFormat = this.numberFormat;
        if (isPromotion) {
            return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验!限时特惠，只需" + numberFormat.format(price) + "元首" + quantityName;
        }
        return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！原价" + numberFormat.format(originalUnitPrice) + "元/周，限时特惠，只需" + this.numberFormat.format(price) + "元";
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m9325M() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m9326N() {
        TextView textView = this._get_privilege_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final TextView m9327O() {
        TextView textView = this._get_privilege_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m9328P() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m9329Q() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m9330R() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TextView m9331S() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m9332W(Merchandise m) {
        return rxa0.l(m, MonetizationPromotionsId.lowPriceCustomerFemaleVIP);
    }

    /* JADX INFO: renamed from: X */
    public final void m9333X() {
        mkd0.z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.a);
        }
        e51.G(new Runnable() { // from class: l.nci
            @Override // java.lang.Runnable
            public final void run() {
                sci.m9308A(this.f6502a);
            }
        });
        i0e.e(this.pageHelper);
        m9333X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(m6c0.b, (ViewGroup) null);
        viewInflate.getClass();
        m9320F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m9316V();
        m9314T();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9333X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m9312G();
        i0e.f(this.pageHelper);
    }
}
