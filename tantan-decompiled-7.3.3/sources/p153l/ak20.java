package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes9.dex */
public class ak20 {

    /* JADX INFO: renamed from: a */
    public static final wyd0 f71953a = new wyd0("virtual_ip", "");

    /* JADX INFO: renamed from: b */
    public static final List<String> f71954b = Arrays.asList("en", "zh", "ja", "ko", "th", "vi", "ru");

    /* JADX INFO: renamed from: c */
    public static final String f71955c = "putongTribe/" + uqb0.f180413s + " Android/" + Build.VERSION.SDK_INT + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + URLEncoder.encode(Build.BRAND) + "/" + URLEncoder.encode(Build.MODEL);

    /* JADX INFO: renamed from: a */
    public static x1d0.C21228a m98541a(x1d0.C21228a c21228a) {
        if (c21228a == null) {
            c21228a = new x1d0.C21228a();
        }
        x1d0.C21228a c21228aM209034h = c21228a.m209034h(HttpHeaders.ACCEPT, "*/*").m209034h("User-Agent", m98544d()).m209034h(HttpHeaders.ACCEPT_LANGUAGE, m98546f()).m209034h("X-Channel", "googleplay").m209034h("X-Putong-Client-Id", "100032").m209034h("X-Live-Region-Tag", TEnum.equals(uqb0.f180402h0, "unknown_") ? "" : uqb0.f180402h0.toString()).m209034h(RemoteConfigConstants.RequestFieldKey.APP_BUILD, tl8.m191614G());
        c21228aM209034h.m209034h("currency-type", uqb0.f180369D0);
        return c21228aM209034h;
    }

    /* JADX INFO: renamed from: b */
    public static void m98542b(x1d0.C21228a c21228a) {
        String strAccessToken = uqb0.f180397c0.accessToken();
        if (TextUtils.isEmpty(strAccessToken) || strAccessToken.length() < 10) {
            return;
        }
        String string = TEnum.equals(uqb0.f180402h0, "unknown_") ? "" : uqb0.f180402h0.toString();
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(uqb0.f180426y0)) {
            string = uqb0.f180426y0;
        }
        try {
            String strM190678c = te2.m190678c(t5l.m189403a(string + uqb0.f180424x0 + strAccessToken.substring(strAccessToken.length() - 10), "SHA-256"), 2);
            c21228a.m209027a("T-A", string);
            c21228a.m209027a("T-B", String.valueOf(uqb0.f180424x0));
            c21228a.m209027a("SIGN", strM190678c);
        } catch (Exception e) {
            CrashHelper.m82480d(new RuntimeException("数据加密失败info:" + e.toString() + ",origin:" + uqb0.f180424x0 + Constants.SEPARATOR_COMMA + strAccessToken + Constants.SEPARATOR_COMMA + string), 100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m98543c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m98544d() {
        return f71955c;
    }

    /* JADX INFO: renamed from: e */
    public static int m98545e() {
        return (App.f16088e.getApplicationInfo().flags & 2) != 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static String m98546f() {
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
        return !f71954b.contains(language.toLowerCase()) ? "en" : language;
    }
}
