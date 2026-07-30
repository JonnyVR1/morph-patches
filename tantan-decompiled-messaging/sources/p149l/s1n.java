package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.data.Visitor;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class s1n {

    /* JADX INFO: renamed from: l.s1n$a */
    public static /* synthetic */ class C19827a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f161916a;

        static {
            int[] iArr = new int[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.values().length];
            f161916a = iArr;
            try {
                iArr[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.HOME_SWIPE_CARD_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_VISITORS_NEW_VISITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_VISITORS_OLD_VISITOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_ILIKE_NEW_LIKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_ILIKE_OLD_LIKE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.WHISPER_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f161916a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m182005a(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return "";
        }
        iapAffiliatePromotion.nullCheck();
        String str = iapAffiliatePromotion.iapId;
        String strTrim = str == null ? "" : str.trim();
        String str2 = iapAffiliatePromotion.offerId;
        String strTrim2 = str2 == null ? "" : str2.trim();
        if (strTrim.isEmpty() && strTrim2.isEmpty()) {
            return "";
        }
        if (strTrim.isEmpty()) {
            return strTrim2;
        }
        if (strTrim2.isEmpty()) {
            return strTrim;
        }
        return strTrim + "_" + strTrim2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m182006b(@NonNull CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        switch (C19827a.f161916a[intlAffiliateDiscountEntryTab.ordinal()]) {
            case 1:
                return "swipe";
            case 2:
            case 3:
                return "see";
            case 4:
            case 5:
                return Visitor.TYPE;
            case 6:
            case 7:
                return "ilike";
            case 8:
                return "message";
            case 9:
                return "whisper";
            case 10:
                return "me_banner";
            default:
                rkq0.m179764a("Unhandled tab: ", intlAffiliateDiscountEntryTab);
                return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static String m182007c(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return "";
        }
        String str = iapAffiliatePromotion.promotionName;
        String strTrim = str != null ? str.trim() : "";
        return !strTrim.isEmpty() ? strTrim : m182005a(iapAffiliatePromotion);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static String m182008d(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return "";
        }
        iapAffiliatePromotion.nullCheck();
        String str = iapAffiliatePromotion.offerId;
        return str == null ? "" : str.trim();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static String m182009e(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        String str;
        String strTrim = (iapAffiliatePromotion == null || (str = iapAffiliatePromotion.promotionType) == null) ? "" : str.trim();
        if (strTrim.equalsIgnoreCase("freeTrial")) {
            return "free_trial";
        }
        if (strTrim.equalsIgnoreCase("discount")) {
            return "discount";
        }
        return strTrim.isEmpty() ? "" : strTrim.toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: f */
    public static void m182010f(@NonNull Act act, @Nullable IapAffiliatePromotion iapAffiliatePromotion, @NonNull String str) {
        o6j0.m162870n("e_intl_promo_external_entry", act.pageId(), o6j0.C18854a.m162878h("promo_type", m182009e(iapAffiliatePromotion)), o6j0.C18854a.m162878h("promo_id", m182007c(iapAffiliatePromotion)), o6j0.C18854a.m162878h("promo_entry", str));
    }
}
