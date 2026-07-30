package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class rb20 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f158575a = new uqd0("virtual_ip", "");

    /* JADX INFO: renamed from: b */
    public static final List<String> f158576b = Arrays.asList("en", "zh", "ja", "ko", "th", "vi", "ru");

    /* JADX INFO: renamed from: c */
    public static final String f158577c = "putongTribe/" + qib0.f154730s + " Android/" + Build.VERSION.SDK_INT + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + URLEncoder.encode(Build.BRAND) + "/" + URLEncoder.encode(Build.MODEL);

    /* JADX INFO: renamed from: a */
    public static stc0.C20027a m178552a(stc0.C20027a c20027a) {
        if (c20027a == null) {
            c20027a = new stc0.C20027a();
        }
        stc0.C20027a c20027aM185889h = c20027a.m185889h("Accept", "*/*").m185889h("User-Agent", m178555d()).m185889h("Accept-Language", m178557f()).m185889h("X-Channel", "googleplay").m185889h("X-Putong-Client-Id", "100032").m185889h("X-Live-Region-Tag", TEnum.equals(qib0.f154719h0, "unknown_") ? "" : qib0.f154719h0.toString()).m185889h(RemoteConfigConstants.RequestFieldKey.APP_BUILD, pk8.m169978G());
        c20027aM185889h.m185889h("currency-type", qib0.f154686D0);
        return c20027aM185889h;
    }

    /* JADX INFO: renamed from: b */
    public static void m178553b(stc0.C20027a c20027a) {
        String strAccessToken = qib0.f154714c0.accessToken();
        if (TextUtils.isEmpty(strAccessToken) || strAccessToken.length() < 10) {
            return;
        }
        String string = TEnum.equals(qib0.f154719h0, "unknown_") ? "" : qib0.f154719h0.toString();
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(qib0.f154743y0)) {
            string = qib0.f154743y0;
        }
        try {
            String strM149477c = le2.m149477c(d3l.m109931a(string + qib0.f154741x0 + strAccessToken.substring(strAccessToken.length() - 10), "SHA-256"), 2);
            c20027a.m185882a("T-A", string);
            c20027a.m185882a("T-B", String.valueOf(qib0.f154741x0));
            c20027a.m185882a("SIGN", strM149477c);
        } catch (Exception e) {
            CrashHelper.m81297d(new RuntimeException("数据加密失败info:" + e.toString() + ",origin:" + qib0.f154741x0 + Constants.SEPARATOR_COMMA + strAccessToken + Constants.SEPARATOR_COMMA + string), 100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m178554c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m178555d() {
        return f158577c;
    }

    /* JADX INFO: renamed from: e */
    public static int m178556e() {
        return (App.f15369e.getApplicationInfo().flags & 2) != 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static String m178557f() {
        Locale locale = Locale.getDefault();
        String language = locale == null ? null : locale.getLanguage();
        if (locale == null || language == null) {
            return "en";
        }
        if ("zh".equals(language)) {
            String script = locale.getScript();
            if ("Hans".equals(script)) {
                return Network.LANGUAGE_ZH_HANS;
            }
            if ("Hant".equals(script)) {
                return Network.LANGUAGE_ZH_HANT;
            }
            String country = locale.getCountry();
            return ("".equals(country) || "CN".equals(country) || "SG".equals(country)) ? Network.LANGUAGE_ZH_HANS : Network.LANGUAGE_ZH_HANT;
        }
        if (("in".equals(language) || "id".equals(language)) && "ID".equals(locale.getCountry())) {
            return "id";
        }
        if ("th".equals(language)) {
            return "th";
        }
        if ("ja".equals(language)) {
            return "ja";
        }
        if ("ko".equals(language)) {
            return "ko";
        }
        if ("ru".equals(language)) {
            return "ru";
        }
        return !f158576b.contains(language.toLowerCase()) ? "en" : language;
    }
}
