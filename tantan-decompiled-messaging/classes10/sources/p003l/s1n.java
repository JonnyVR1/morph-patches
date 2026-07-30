package p003l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.Discount;
import com.p000p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import java.util.Locale;
import l.rkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class s1n {

    /* JADX INFO: renamed from: l.s1n$a */
    public static /* synthetic */ class C3415a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7266a;

        static {
            int[] iArr = new int[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.values().length];
            f7266a = iArr;
            try {
                iArr[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.HOME_SWIPE_CARD_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_VISITORS_NEW_VISITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_VISITORS_OLD_VISITOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_ILIKE_NEW_LIKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_ILIKE_OLD_LIKE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.WHISPER_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7266a[CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m9205a(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
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
    public static String m9206b(@NonNull CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTab) {
        switch (C3415a.f7266a[intlAffiliateDiscountEntryTab.ordinal()]) {
            case 1:
                return "swipe";
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                return "see";
            case 4:
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                return "visitor";
            case 6:
            case 7:
                return "ilike";
            case 8:
                return "message";
            case 9:
                return "whisper";
            case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                return "me_banner";
            default:
                rkq0.a("Unhandled tab: ", intlAffiliateDiscountEntryTab);
                return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static String m9207c(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return "";
        }
        String str = iapAffiliatePromotion.promotionName;
        String strTrim = str != null ? str.trim() : "";
        return !strTrim.isEmpty() ? strTrim : m9205a(iapAffiliatePromotion);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static String m9208d(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return "";
        }
        iapAffiliatePromotion.nullCheck();
        String str = iapAffiliatePromotion.offerId;
        return str == null ? "" : str.trim();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static String m9209e(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        String str;
        String strTrim = (iapAffiliatePromotion == null || (str = iapAffiliatePromotion.promotionType) == null) ? "" : str.trim();
        if (strTrim.equalsIgnoreCase("freeTrial")) {
            return "free_trial";
        }
        if (strTrim.equalsIgnoreCase(Discount.TYPE)) {
            return Discount.TYPE;
        }
        return strTrim.isEmpty() ? "" : strTrim.toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: f */
    public static void m9210f(@NonNull Act act, @Nullable IapAffiliatePromotion iapAffiliatePromotion, @NonNull String str) {
        o6j0.m8414n("e_intl_promo_external_entry", act.pageId(), o6j0.C3390a.m8422h("promo_type", m9209e(iapAffiliatePromotion)), o6j0.C3390a.m8422h("promo_id", m9207c(iapAffiliatePromotion)), o6j0.C3390a.m8422h("promo_entry", str));
    }
}
