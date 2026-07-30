package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class l6p {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m153074a(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_is_expired", Boolean.valueOf(m153079f(iapAffiliatePromotion)));
        map.put("promo_type", m153080g(iapAffiliatePromotion));
        map.put("promo_id", m153078e(iapAffiliatePromotion));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m153075b(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_type", m153080g(iapAffiliatePromotion));
        map.put("promo_id", m153078e(iapAffiliatePromotion));
        map.put("promo_entry", "bot_msg");
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153076c(@Nullable String str) {
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
    public static Long m153077d(@Nullable String str) {
        if (!m153076c(str)) {
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
    public static String m153078e(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        return (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionName)) ? "" : iapAffiliatePromotion.promotionName.trim();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m153079f(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return true;
        }
        return !CoreModule.f18264c.f20438x0.m31195f4(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: g */
    public static String m153080g(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        String str;
        if (iapAffiliatePromotion == null || (str = iapAffiliatePromotion.promotionType) == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.equalsIgnoreCase("freeTrial")) {
            return "free_trial";
        }
        return strTrim.equalsIgnoreCase("discount") ? "discount" : strTrim.toLowerCase(Locale.US);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static IapAffiliatePromotion m153081h(@Nullable String str) {
        Long lM153077d = m153077d(str);
        if (lM153077d == null) {
            return null;
        }
        return CoreModule.f18264c.f20438x0.m31221w3(lM153077d.longValue());
    }

    /* JADX INFO: renamed from: i */
    public static void m153082i(@Nullable Act act, @Nullable String str) {
        if (act == null || !m153076c(str)) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionM153081h = m153081h(str);
        sfj0.m185597d("e_intl_bot_msg_card", OMSDialogPositon.p_chat_view, m153074a(iapAffiliatePromotionM153081h));
        sfj0.m185608o("e_intl_promo_external_entry", OMSDialogPositon.p_chat_view, m153075b(iapAffiliatePromotionM153081h));
    }

    /* JADX INFO: renamed from: j */
    public static void m153083j(@Nullable Act act, @Nullable String str) {
        if (act == null || !m153076c(str)) {
            return;
        }
        sfj0.m185603j("e_intl_bot_msg_card", OMSDialogPositon.p_chat_view, m153074a(m153081h(str)));
    }
}
