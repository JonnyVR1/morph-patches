package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class l4p {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m148451a(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_is_expired", Boolean.valueOf(m148456f(iapAffiliatePromotion)));
        map.put("promo_type", m148457g(iapAffiliatePromotion));
        map.put("promo_id", m148455e(iapAffiliatePromotion));
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m148452b(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        HashMap map = new HashMap();
        map.put("promo_type", m148457g(iapAffiliatePromotion));
        map.put("promo_id", m148455e(iapAffiliatePromotion));
        map.put("promo_entry", "bot_msg");
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m148453c(@Nullable String str) {
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
    public static Long m148454d(@Nullable String str) {
        if (!m148453c(str)) {
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
    public static String m148455e(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        return (iapAffiliatePromotion == null || TextUtils.isEmpty(iapAffiliatePromotion.promotionName)) ? "" : iapAffiliatePromotion.promotionName.trim();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m148456f(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
        if (iapAffiliatePromotion == null) {
            return true;
        }
        return !CoreModule.f17545c.f19696x0.m30197f4(iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: g */
    public static String m148457g(@Nullable IapAffiliatePromotion iapAffiliatePromotion) {
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
    public static IapAffiliatePromotion m148458h(@Nullable String str) {
        Long lM148454d = m148454d(str);
        if (lM148454d == null) {
            return null;
        }
        return CoreModule.f17545c.f19696x0.m30223w3(lM148454d.longValue());
    }

    /* JADX INFO: renamed from: i */
    public static void m148459i(@Nullable Act act, @Nullable String str) {
        if (act == null || !m148453c(str)) {
            return;
        }
        IapAffiliatePromotion iapAffiliatePromotionM148458h = m148458h(str);
        o6j0.m162860d("e_intl_bot_msg_card", OMSDialogPositon.p_chat_view, m148451a(iapAffiliatePromotionM148458h));
        o6j0.m162871o("e_intl_promo_external_entry", OMSDialogPositon.p_chat_view, m148452b(iapAffiliatePromotionM148458h));
    }

    /* JADX INFO: renamed from: j */
    public static void m148460j(@Nullable Act act, @Nullable String str) {
        if (act == null || !m148453c(str)) {
            return;
        }
        o6j0.m162866j("e_intl_bot_msg_card", OMSDialogPositon.p_chat_view, m148451a(m148458h(str)));
    }
}
