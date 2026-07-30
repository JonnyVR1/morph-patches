package p149l;

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
public final class avj0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m99193a(String str, boolean z) {
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
                String strM99197e = m99197e(str2, urlQuerySanitizer, false);
                if (strM99197e != null) {
                    if (z || str2.equals(Constants.KEY_C2A)) {
                        bundle.putString(str2, strM99197e);
                    } else {
                        bundle.putString(str2, URLDecoder.decode(strM99197e, "UTF-8"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m99194b(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String strM99195c = m99195c("source", urlQuerySanitizer);
            String strM99195c2 = m99195c("medium", urlQuerySanitizer);
            String strM99195c3 = m99195c("campaign", urlQuerySanitizer);
            jSONObject.put("us", strM99195c);
            jSONObject.put("um", strM99195c2);
            jSONObject.put("uc", strM99195c3);
            String strM99198f = m99198f("medium", urlQuerySanitizer);
            if (strM99198f != null && strM99198f.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", strM99198f);
            }
            Logger.m5865d("Referrer data: " + jSONObject.toString(4));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private static String m99195c(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String strM99196d = m99196d(str, urlQuerySanitizer);
        if (strM99196d != null) {
            return strM99196d;
        }
        String strM99198f = m99198f(str, urlQuerySanitizer);
        if (strM99198f != null) {
            return strM99198f;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m99196d(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return m99197e("utm_" + str, urlQuerySanitizer, true);
    }

    /* JADX INFO: renamed from: e */
    private static String m99197e(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z) {
        if (str != null && urlQuerySanitizer != null) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value == null) {
                    return null;
                }
                return (!z || value.length() <= 120) ? value : value.substring(0, 120);
            } catch (Throwable th) {
                Logger.m5876v("Couldn't parse the URI", th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static String m99198f(String str, UrlQuerySanitizer urlQuerySanitizer) {
        return m99197e(Constants.WZRK_PREFIX + str, urlQuerySanitizer, true);
    }
}
