package p002l;

import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.mqi0;
import l.o6j0;
import l.s1n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b!\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Ll/m4p;", "", "<init>", "()V", "", "from", "g", "(Ljava/lang/String;)Ljava/lang/String;", "i", "()Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "promo", "", "l", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/purchase/d$a;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "interceptReason", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "promoEntry", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Ljava/lang/String;)V", "c", "d", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "e", "(Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;)Ljava/lang/String;", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)Ljava/lang/String;", "f", "", "m", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)I", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "", "value", "a", "(D)Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class m4p {

    @NotNull
    public static final m4p INSTANCE = new m4p();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m17705c() {
        return "offer_expired";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m17706d() {
        return LiveMessage.LiveMessageType.OTHER;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m17707e(@NotNull CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab tab) {
        tab.getClass();
        String strB = s1n.b(tab);
        strB.getClass();
        return strB;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m17708f(@Nullable IapAffiliatePromotion promo) {
        String strC = s1n.c(promo);
        strC.getClass();
        return strC;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m17709g(@Nullable String from) {
        return Intrinsics.d("intl_swipe_first_enter_fullscreen_discount", from) ? "auto_popup" : "user_click";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m17710h(@Nullable IapAffiliatePromotion promo) {
        String str;
        String string = (promo == null || (str = promo.promotionType) == null) ? null : StringsKt.Z0(str).toString();
        if (string == null) {
            string = "";
        }
        if (d.x(string, "freeTrial", true)) {
            return "free_trial";
        }
        if (d.x(string, "discount", true)) {
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
    public static final String m17711i() {
        return CoreModule.c.x0.c4() ? "p_intl_promo_full_ft_view,e_intl_pay_btn,click" : "p_intl_promo_full_promo_view,e_intl_pay_btn,click";
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m17712j(@NotNull Act act, @Nullable IapAffiliatePromotion promo, @NotNull String promoEntry) {
        act.getClass();
        promoEntry.getClass();
        o6j0.n("e_intl_promo_external_entry", act.pageId(), new o6j0.a[]{o6j0.a.h("promo_type", m17710h(promo)), o6j0.a.h("promo_id", m17708f(promo)), o6j0.a.h("promo_entry", promoEntry)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m17713k(@NotNull Act act, @NotNull String interceptReason) {
        act.getClass();
        interceptReason.getClass();
        o6j0.h("e_intl_promo_iap_intercept", act.pageId(), new o6j0.a[]{o6j0.a.h("intercept_reason", interceptReason)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m17714l(@NotNull Act act, @NotNull C0190d.a detail, @Nullable IapAffiliatePromotion promo) {
        act.getClass();
        detail.getClass();
        Merchandise merchandiseM4167s = detail.m4167s();
        if (merchandiseM4167s == null) {
            return;
        }
        String strM17710h = m17710h(promo);
        String strM17717b = Intrinsics.d(strM17710h, "free_trial") ? "0" : INSTANCE.m17717b(merchandiseM4167s);
        String strD = s1n.d(promo);
        o6j0.c("e_intl_promo_pay_btn", "p_intl_promo_full_view", new o6j0.a[]{o6j0.a.h("promo_price", strM17717b), o6j0.a.h("promo_type", strM17710h), o6j0.a.h("item_id", strD.length() != 0 ? strD : "0"), o6j0.a.h("promo_id", m17708f(promo)), o6j0.a.f("timer_remain_sec", m17715m(promo))});
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final int m17715m(@Nullable IapAffiliatePromotion promo) {
        if (promo == null) {
            return 0;
        }
        long jF3 = (CoreModule.c.x0.F3(promo) - mqi0.o()) / 1000;
        if (jF3 < 0) {
            return 0;
        }
        return (int) jF3;
    }

    /* JADX INFO: renamed from: a */
    public final String m17716a(double value) {
        String str = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US)).format(value);
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final String m17717b(Merchandise merchandise) {
        Prices prices;
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        if (stockKeepUnit == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String str = prices.currencySymbol;
        String string = str != null ? StringsKt.Z0(str).toString() : null;
        String str2 = string != null ? string : "";
        String strM17716a = m17716a(prices.price);
        if (str2.length() <= 0) {
            return strM17716a;
        }
        return str2 + strM17716a;
    }
}
