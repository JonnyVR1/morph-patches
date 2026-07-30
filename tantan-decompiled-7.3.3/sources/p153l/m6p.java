package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b!\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, m88121d2 = {"Ll/m6p;", "", "<init>", "()V", "", "from", "g", "(Ljava/lang/String;)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", NotificationCompat.CATEGORY_PROMO, "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "interceptReason", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "promoEntry", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Ljava/lang/String;)V", "c", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "e", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;)Ljava/lang/String;", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)Ljava/lang/String;", "f", "", "m", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)I", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "value", "a", "(D)Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m6p {

    @NotNull
    public static final m6p INSTANCE = new m6p();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m157243c() {
        return "offer_expired";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m157244d() {
        return "other";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m157245e(@NotNull CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab tab) {
        tab.getClass();
        String strM184284b = s3n.m184284b(tab);
        strM184284b.getClass();
        return strM184284b;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m157246f(@Nullable IapAffiliatePromotion promo) {
        String strM184285c = s3n.m184285c(promo);
        strM184285c.getClass();
        return strM184285c;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m157247g(@Nullable String from) {
        return Intrinsics.m88377d("intl_swipe_first_enter_fullscreen_discount", from) ? "auto_popup" : "user_click";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m157248h(@Nullable IapAffiliatePromotion promo) {
        String str;
        String string = (promo == null || (str = promo.promotionType) == null) ? null : StringsKt.m94324Z0(str).toString();
        if (string == null) {
            string = "";
        }
        if (C15493d.m94381x(string, "freeTrial", true)) {
            return "free_trial";
        }
        if (C15493d.m94381x(string, "discount", true)) {
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
    public static final String m157249i() {
        return CoreModule.f18264c.f20438x0.m31193c4() ? "p_intl_promo_full_ft_view,e_intl_pay_btn,click" : "p_intl_promo_full_promo_view,e_intl_pay_btn,click";
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m157250j(@NotNull Act act, @Nullable IapAffiliatePromotion promo, @NotNull String promoEntry) {
        act.getClass();
        promoEntry.getClass();
        sfj0.m185607n("e_intl_promo_external_entry", act.pageId(), sfj0.C20032a.m185615h("promo_type", m157248h(promo)), sfj0.C20032a.m185615h("promo_id", m157246f(promo)), sfj0.C20032a.m185615h("promo_entry", promoEntry));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m157251k(@NotNull Act act, @NotNull String interceptReason) {
        act.getClass();
        interceptReason.getClass();
        sfj0.m185601h("e_intl_promo_iap_intercept", act.pageId(), sfj0.C20032a.m185615h("intercept_reason", interceptReason));
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m157252l(@NotNull Act act, @NotNull C8928d.a detail, @Nullable IapAffiliatePromotion promo) {
        act.getClass();
        detail.getClass();
        Merchandise merchandiseM54784s = detail.m54784s();
        if (merchandiseM54784s == null) {
            return;
        }
        String strM157248h = m157248h(promo);
        String strM157255b = Intrinsics.m88377d(strM157248h, "free_trial") ? "0" : INSTANCE.m157255b(merchandiseM54784s);
        String strM184286d = s3n.m184286d(promo);
        sfj0.m185596c("e_intl_promo_pay_btn", "p_intl_promo_full_view", sfj0.C20032a.m185615h("promo_price", strM157255b), sfj0.C20032a.m185615h("promo_type", strM157248h), sfj0.C20032a.m185615h(FirebaseAnalytics.Param.ITEM_ID, strM184286d.length() != 0 ? strM184286d : "0"), sfj0.C20032a.m185615h("promo_id", m157246f(promo)), sfj0.C20032a.m185613f("timer_remain_sec", m157253m(promo)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m157253m(@Nullable IapAffiliatePromotion promo) {
        if (promo == null) {
            return 0;
        }
        long jM31171F3 = (CoreModule.f18264c.f20438x0.m31171F3(promo) - pzi0.m174454o()) / 1000;
        if (jM31171F3 < 0) {
            return 0;
        }
        return (int) jM31171F3;
    }

    /* JADX INFO: renamed from: a */
    public final String m157254a(double value) {
        String str = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US)).format(value);
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final String m157255b(Merchandise merchandise) {
        Prices prices;
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String str = prices.currencySymbol;
        String string = str != null ? StringsKt.m94324Z0(str).toString() : null;
        String str2 = string != null ? string : "";
        String strM157254a = m157254a(prices.price);
        if (str2.length() <= 0) {
            return strM157254a;
        }
        return str2 + strM157254a;
    }
}
