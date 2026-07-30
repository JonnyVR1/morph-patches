package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u0019\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u000eJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR\"\u0010N\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010Q\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010f\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, m88121d2 = {"Ll/hei;", "Ll/pej0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "F", "(Landroid/view/View;)V", p7f.GPS_DIRECTION_TRUE, "()V", p7f.GPS_MEASUREMENT_INTERRUPTED, "G", "Lcom/p1/mobile/putong/core/data/Merchandise;", "m", "J", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "isPromotion", "", FirebaseAnalytics.Param.PRICE, "originalUnitPrice", "quantityName", "K", "(ZDDLjava/lang/String;)Ljava/lang/String;", "I", "(ZLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "H", "(DLcom/p1/mobile/putong/core/data/Merchandise;D)Ljava/lang/String;", "W", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", SysnotifListener.ACTION_DISMISS, "onDetachedFromWindow", "X", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Lv/VLinear;", "h", "Lv/VLinear;", "M", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "Landroid/widget/TextView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/TextView;", BloodType.f39576O, "()Landroid/widget/TextView;", "set_get_privilege_text", "(Landroid/widget/TextView;)V", "_get_privilege_text", "j", "N", "set_get_privilege_subtitle", "_get_privilege_subtitle", "k", "Q", "set_stickers", "_stickers", BLiveStormDanmakuGiftResourceType.f45292l, "R", "set_subtitle", "_subtitle", p7f.LATITUDE_SOUTH, "set_title", "_title", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "P", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/l4g0;", "o", "Ll/l4g0;", "pageHelper", "Ll/kcg0;", "p", "Ll/kcg0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "q", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hei extends pej0 {

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
    public l4g0 pageHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public kcg0 merchandiseSubs;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final NumberFormat numberFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hei(@NotNull Act act, @Nullable String str) {
        super(act);
        act.getClass();
        this.act = act;
        this.from = str;
        l4g0 l4g0VarM204399c = w1e.m204399c("p_femalevip_guide_pop", hei.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m134631A(hei heiVar) {
        super.dismiss();
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m134632C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public static void m134633D(final hei heiVar, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.gei
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hei.m134638U(this.f103836a, (Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            String strM134636L = m134636L(heiVar, false, d, d2, null, 8, null);
            String strM134645I = heiVar.m134645I(false, merchandise, d);
            if (heiVar.m134655W(merchandise)) {
                double firstCouponPrice = merchandise.getFirstCouponPrice();
                String strM134647K = heiVar.m134647K(true, firstCouponPrice, d2, heiVar.m134646J(merchandise));
                String strM134645I2 = heiVar.m134645I(true, merchandise, firstCouponPrice);
                bnl0.m105524M(heiVar.m134649N(), true);
                heiVar.m134649N().setText(heiVar.m134644H(d2, merchandise, firstCouponPrice));
                strM134636L = strM134647K;
                strM134645I = strM134645I2;
            }
            heiVar.m134653R().setText(strM134636L);
            heiVar.m134650O().setText(strM134645I);
        }
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m134634E(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    private final void m134635G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(jbc0.f119585g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        l51.m152887G(new Runnable() { // from class: l.aei
            @Override // java.lang.Runnable
            public final void run() {
                hei.m134642z(this.f70800a);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m134636L(hei heiVar, boolean z, double d, double d2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        return heiVar.m134647K(z, d, d2, str);
    }

    /* JADX INFO: renamed from: T */
    private final void m134637T() {
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("femaleVip")));
        final Function1 function1 = new Function1() { // from class: l.dei
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hei.m134632C((List) obj);
            }
        };
        this.merchandiseSubs = c22421cDuringCreated.filter(new qcj() { // from class: l.eei
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hei.m134634E(function1, obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.fei
            @Override // p153l.y20
            public final void call(Object obj) {
                hei.m134633D(this.f98677a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static final Boolean m134638U(hei heiVar, Merchandise merchandise) {
        boolean z = false;
        if (!s7a.m184980i() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || (!heiVar.m134655W(merchandise) && !merchandise.weekly()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: V */
    private final void m134639V() {
        uqb0.f180374G.m127138Y0(m134651P(), jbc0.f119310M);
        m134654S().setText("全新 · 她专享会员");
        m134653R().setText("新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！");
        if (s7a.m184980i()) {
            m134650O().setText("成为女性会员");
        } else {
            m134650O().setText("¥1/周购买");
        }
        m134648M().setBackgroundResource(jbc0.f119296L);
        m134652Q().setText("限时特惠");
        m134652Q().setBackgroundResource(jbc0.f119483Z);
        bnl0.m105524M(m134652Q(), true);
        bnl0.m105509E0(m134648M(), new View.OnClickListener() { // from class: l.bei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hei.m134640x(this.f76377a, view);
            }
        });
        bnl0.m105524M(m134649N(), false);
    }

    /* JADX INFO: renamed from: x */
    public static void m134640x(hei heiVar, View view) {
        heiVar.dismiss();
        i4g0.m138520r("e_femalevip_guide_button", "p_femalevip_guide_pop");
        C8927c.m54616X(heiVar.act, "p_home,femalevip_guide", null, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m134642z(hei heiVar) {
        Window window = heiVar.getWindow();
        if (window != null) {
            window.setWindowAnimations(dgc0.f88280e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m134643F(View view) {
        iei.m139614a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final String m134644H(double originalUnitPrice, Merchandise m, double price) {
        return "已优惠：" + m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(Math.abs((originalUnitPrice * ((double) m.quantity)) - price));
    }

    /* JADX INFO: renamed from: I */
    public final String m134645I(boolean isPromotion, Merchandise m, double price) {
        if (isPromotion) {
            return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + " 立即购买";
        }
        return m.defaultStockKeepUnit.prices.currencySymbol + this.numberFormat.format(price) + "/周购买";
    }

    /* JADX INFO: renamed from: J */
    public final String m134646J(Merchandise m) {
        if (m.weekly()) {
            return "周";
        }
        if (m.monthly()) {
            return "月";
        }
        return m.quantity + "个月";
    }

    /* JADX INFO: renamed from: K */
    public final String m134647K(boolean isPromotion, double price, double originalUnitPrice, String quantityName) {
        NumberFormat numberFormat = this.numberFormat;
        if (isPromotion) {
            return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验!限时特惠，只需" + numberFormat.format(price) + "元首" + quantityName;
        }
        return "新增更多为女性用户定制专属功能，在探探畅享安心高效社交体验！原价" + numberFormat.format(originalUnitPrice) + "元/周，限时特惠，只需" + this.numberFormat.format(price) + "元";
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m134648M() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m134649N() {
        TextView textView = this._get_privilege_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final TextView m134650O() {
        TextView textView = this._get_privilege_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m134651P() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m134652Q() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final TextView m134653R() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final TextView m134654S() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m134655W(Merchandise m) {
        return v5b0.m199786l(m, MonetizationPromotionsId.lowPriceCustomerFemaleVIP);
    }

    /* JADX INFO: renamed from: X */
    public final void m134656X() {
        psd0.m173633z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(dgc0.f88276a);
        }
        l51.m152887G(new Runnable() { // from class: l.cei
            @Override // java.lang.Runnable
            public final void run() {
                hei.m134631A(this.f81357a);
            }
        });
        w1e.m204401e(this.pageHelper);
        m134656X();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(rec0.f162526b, (ViewGroup) null);
        viewInflate.getClass();
        m134643F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m134639V();
        m134637T();
    }

    @Override // p153l.pej0, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m134656X();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m134635G();
        w1e.m204402f(this.pageHelper);
    }
}
