package p006l;

import android.os.Build;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import l.d3l;
import l.le2;
import l.stc0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rb20 {

    /* JADX INFO: renamed from: a */
    public static final uqd0 f20469a = new uqd0("virtual_ip", "");

    /* JADX INFO: renamed from: b */
    public static final List<String> f20470b = Arrays.asList("en", "zh", "ja", "ko", "th", "vi", "ru");

    /* JADX INFO: renamed from: c */
    public static final String f20471c = "putongTribe/" + qib0.f19821s + " Android/" + Build.VERSION.SDK_INT + " " + URLEncoder.encode(Build.BRAND) + "/" + URLEncoder.encode(Build.MODEL);

    /* JADX INFO: renamed from: a */
    public static stc0.a m22786a(stc0.a aVar) {
        if (aVar == null) {
            aVar = new stc0.a();
        }
        stc0.a aVarH = aVar.h("Accept", "*/*").h("User-Agent", m22789d()).h("Accept-Language", m22791f()).h("X-Channel", "googleplay").h("X-Putong-Client-Id", "100032").h("X-Live-Region-Tag", TEnum.equals(qib0.f19810h0, "unknown_") ? "" : qib0.f19810h0.toString()).h("appBuild", pk8.m21560G());
        aVarH.h("currency-type", qib0.f19777D0);
        return aVarH;
    }

    /* JADX INFO: renamed from: b */
    public static void m22787b(stc0.a aVar) {
        String strAccessToken = qib0.f19805c0.accessToken();
        if (TextUtils.isEmpty(strAccessToken) || strAccessToken.length() < 10) {
            return;
        }
        String string = TEnum.equals(qib0.f19810h0, "unknown_") ? "" : qib0.f19810h0.toString();
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(qib0.f19834y0)) {
            string = qib0.f19834y0;
        }
        try {
            String strC = le2.c(d3l.a(string + qib0.f19832x0 + strAccessToken.substring(strAccessToken.length() - 10), "SHA-256"), 2);
            aVar.a("T-A", string);
            aVar.a("T-B", String.valueOf(qib0.f19832x0));
            aVar.a("SIGN", strC);
        } catch (Exception e) {
            CrashHelper.d(new RuntimeException("数据加密失败info:" + e.toString() + ",origin:" + qib0.f19832x0 + "," + strAccessToken + "," + string), 100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m22788c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m22789d() {
        return f20471c;
    }

    /* JADX INFO: renamed from: e */
    public static int m22790e() {
        return (App.e.getApplicationInfo().flags & 2) != 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static String m22791f() {
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
        return !f20470b.contains(language.toLowerCase()) ? "en" : language;
    }
}
