package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b!\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, m87232d2 = {"Ll/m4p;", "", "<init>", "()V", "", "from", "g", "(Ljava/lang/String;)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", NotificationCompat.CATEGORY_PROMO, "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "interceptReason", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "promoEntry", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Ljava/lang/String;)V", "c", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "e", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;)Ljava/lang/String;", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)Ljava/lang/String;", "f", "", "m", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)I", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "value", "a", "(D)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class m4p {

    @NotNull
    public static final m4p INSTANCE = new m4p();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m153077c() {
        return "offer_expired";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m153078d() {
        return "other";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m153079e(@NotNull CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab tab) {
        tab.getClass();
        String strM182006b = s1n.m182006b(tab);
        strM182006b.getClass();
        return strM182006b;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m153080f(@Nullable IapAffiliatePromotion promo) {
        String strM182007c = s1n.m182007c(promo);
        strM182007c.getClass();
        return strM182007c;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m153081g(@Nullable String from) {
        return Intrinsics.m87488d("intl_swipe_first_enter_fullscreen_discount", from) ? "auto_popup" : "user_click";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m153082h(@Nullable IapAffiliatePromotion promo) {
        String str;
        String string = (promo == null || (str = promo.promotionType) == null) ? null : StringsKt.m93433Z0(str).toString();
        if (string == null) {
            string = "";
        }
        if (C15386d.m93490x(string, "freeTrial", true)) {
            return "free_trial";
        }
        if (C15386d.m93490x(string, "discount", true)) {
            return "discount";
        }
        if (string.length() == 0) {
            return "";
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m153083i() {
        return CoreModule.f17545c.f19696x0.m30195c4() ? "p_intl_promo_full_ft_view,e_intl_pay_btn,click" : "p_intl_promo_full_promo_view,e_intl_pay_btn,click";
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m153084j(@NotNull Act act, @Nullable IapAffiliatePromotion promo, @NotNull String promoEntry) {
        act.getClass();
        promoEntry.getClass();
        o6j0.m162870n("e_intl_promo_external_entry", act.pageId(), o6j0.C18854a.m162878h("promo_type", m153082h(promo)), o6j0.C18854a.m162878h("promo_id", m153080f(promo)), o6j0.C18854a.m162878h("promo_entry", promoEntry));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m153085k(@NotNull Act act, @NotNull String interceptReason) {
        act.getClass();
        interceptReason.getClass();
        o6j0.m162864h("e_intl_promo_iap_intercept", act.pageId(), o6j0.C18854a.m162878h("intercept_reason", interceptReason));
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m153086l(@NotNull Act act, @NotNull C8765d.a detail, @Nullable IapAffiliatePromotion promo) {
        act.getClass();
        detail.getClass();
        Merchandise merchandiseM53601s = detail.m53601s();
        if (merchandiseM53601s == null) {
            return;
        }
        String strM153082h = m153082h(promo);
        String strM153089b = Intrinsics.m87488d(strM153082h, "free_trial") ? "0" : INSTANCE.m153089b(merchandiseM53601s);
        String strM182008d = s1n.m182008d(promo);
        o6j0.m162859c("e_intl_promo_pay_btn", "p_intl_promo_full_view", o6j0.C18854a.m162878h("promo_price", strM153089b), o6j0.C18854a.m162878h("promo_type", strM153082h), o6j0.C18854a.m162878h(FirebaseAnalytics.Param.ITEM_ID, strM182008d.length() != 0 ? strM182008d : "0"), o6j0.C18854a.m162878h("promo_id", m153080f(promo)), o6j0.C18854a.m162876f("timer_remain_sec", m153087m(promo)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m153087m(@Nullable IapAffiliatePromotion promo) {
        if (promo == null) {
            return 0;
        }
        long jM30173F3 = (CoreModule.f17545c.f19696x0.m30173F3(promo) - mqi0.m155944o()) / 1000;
        if (jM30173F3 < 0) {
            return 0;
        }
        return (int) jM30173F3;
    }

    /* JADX INFO: renamed from: a */
    public final String m153088a(double value) {
        String str = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US)).format(value);
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final String m153089b(Merchandise merchandise) {
        Prices prices;
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String str = prices.currencySymbol;
        String string = str != null ? StringsKt.m93433Z0(str).toString() : null;
        String str2 = string != null ? string : "";
        String strM153088a = m153088a(prices.price);
        if (str2.length() <= 0) {
            return strM153088a;
        }
        return str2 + strM153088a;
    }
}
