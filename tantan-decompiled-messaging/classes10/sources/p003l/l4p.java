package p003l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Discount;
import com.p000p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class l4p {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m7666a(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_is_expired", Boolean.valueOf(m7671f(iapAffiliatePromotion)));
        map.put("promo_type", m7672g(iapAffiliatePromotion));
        map.put("promo_id", m7670e(iapAffiliatePromotion));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m7667b(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_type", m7672g(iapAffiliatePromotion));
        map.put("promo_id", m7670e(iapAffiliatePromotion));
        map.put("promo_entry", "bot_msg");
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7668c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str.trim());
            String scheme = uri.getScheme();
            if (scheme != null && (scheme.equalsIgnoreCase("tantan") || scheme.equalsIgnoreCase("tantanapp"))) {
                return "tribe-promotion".equalsIgnoreCase(uri.getHost());
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static Long m7669d(@Nullable String str) {
        if (!m7668c(str)) {
            return null;
        }
        String queryParameter = Uri.parse(str.trim()).getQueryParameter("hitId");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(queryParameter.trim()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m7670e(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        return (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionName)) ? "" : iapAffiliatePromotion.promotionName.trim();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7671f(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return true;
        }
        return !CoreModule.c.x0.f4(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: g */
    public static String m7672g(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        String str;
        if (iapAffiliatePromotion == null || (str = iapAffiliatePromotion.promotionType) == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.equalsIgnoreCase("freeTrial")) {
            return "free_trial";
        }
        return strTrim.equalsIgnoreCase(Discount.TYPE) ? Discount.TYPE : strTrim.toLowerCase(Locale.US);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static IapAffiliatePromotion m7673h(@Nullable String str) {
        Long lM7669d = m7669d(str);
        if (lM7669d == null) {
            return null;
        }
        return CoreModule.c.x0.w3(lM7669d.longValue());
    }

    /* JADX INFO: renamed from: i */
    public static void m7674i(@Nullable Act act, @Nullable String str) {
        if (act == null || !m7668c(str)) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionM7673h = m7673h(str);
        o6j0.m8404d("e_intl_bot_msg_card", "p_chat_view", m7666a(iapAffiliatePromotionM7673h));
        o6j0.m8415o("e_intl_promo_external_entry", "p_chat_view", m7667b(iapAffiliatePromotionM7673h));
    }

    /* JADX INFO: renamed from: j */
    public static void m7675j(@Nullable Act act, @Nullable String str) {
        if (act == null || !m7668c(str)) {
            return;
        }
        o6j0.m8410j("e_intl_bot_msg_card", "p_chat_view", m7666a(m7673h(str)));
    }
}
