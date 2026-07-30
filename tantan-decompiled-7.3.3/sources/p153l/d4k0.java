package p153l;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.net.URLDecoder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d4k0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m114206a(String str, boolean z) {
        if (str == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(str);
            for (String str2 : urlQuerySanitizer.getParameterSet()) {
                String strM114210e = m114210e(str2, urlQuerySanitizer, false);
                if (strM114210e != null) {
                    if (z || str2.equals(Constants.KEY_C2A)) {
                        bundle.putString(str2, strM114210e);
                    } else {
                        bundle.putString(str2, URLDecoder.decode(strM114210e, "UTF-8"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m114207b(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String strM114208c = m114208c("source", urlQuerySanitizer);
            String strM114208c2 = m114208c("medium", urlQuerySanitizer);
            String strM114208c3 = m114208c("campaign", urlQuerySanitizer);
            jSONObject.put("us", strM114208c);
            jSONObject.put("um", strM114208c2);
            jSONObject.put("uc", strM114208c3);
            String strM114211f = m114211f("medium", urlQuerySanitizer);
            if (strM114211f != null && strM114211f.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", strM114211f);
            }
            Logger.m5919d("Referrer data: " + jSONObject.toString(4));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private static String m114208c(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String strM114209d = m114209d(str, urlQuerySanitizer);
        if (strM114209d != null) {
            return strM114209d;
        }
        String strM114211f = m114211f(str, urlQuerySanitizer);
        if (strM114211f != null) {
            return strM114211f;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m114209d(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return m114210e("utm_" + str, urlQuerySanitizer, true);
    }

    /* JADX INFO: renamed from: e */
    private static String m114210e(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z) {
        if (str != null && urlQuerySanitizer != null) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value == null) {
                    return null;
                }
                return (!z || value.length() <= 120) ? value : value.substring(0, 120);
            } catch (Throwable th) {
                Logger.m5930v("Couldn't parse the URI", th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static String m114211f(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return m114210e(Constants.WZRK_PREFIX + str, urlQuerySanitizer, true);
    }
}
