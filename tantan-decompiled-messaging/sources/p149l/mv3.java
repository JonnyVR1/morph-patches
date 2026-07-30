package p149l;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class mv3 {
    /* JADX INFO: renamed from: a */
    public static JSONObject m156462a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String string = bundle.getString(Constants.DISPLAY_UNIT_PREVIEW_PUSH_PAYLOAD_KEY);
        Logger.m5874v("CTJsonConverter", "Received Display Unit via push payload: " + string);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY, jSONArray);
        jSONArray.put(new JSONObject(string));
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m156463b(hyd hydVar, qs9 qs9Var, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Location locationM176218p = qs9Var.m176218p();
        jSONObject.put("Build", hydVar.m133571w() + "");
        jSONObject.put(Constants.CLTAP_APP_VERSION, hydVar.m133553X());
        jSONObject.put(Constants.CLTAP_OS_VERSION, hydVar.m133550U());
        jSONObject.put(Constants.CLTAP_SDK_VERSION, hydVar.m133551V());
        if (locationM176218p != null) {
            jSONObject.put(Constants.CLTAP_LATITUDE, locationM176218p.getLatitude());
            jSONObject.put(Constants.CLTAP_LONGITUDE, locationM176218p.getLongitude());
        }
        if (hydVar.m133541K() != null) {
            jSONObject.put(z2 ? "mt_GoogleAdID" : "GoogleAdID", hydVar.m133541K());
            jSONObject.put("GoogleAdIDLimit", hydVar.m133558e0());
        }
        try {
            jSONObject.put(j6f.TAG_MAKE, hydVar.m133546Q());
            jSONObject.put(j6f.TAG_MODEL, hydVar.m133547R());
            jSONObject.put(Constants.CLTAP_CARRIER, hydVar.m133572x());
            jSONObject.put("useIP", z);
            jSONObject.put("OS", hydVar.m133549T());
            jSONObject.put("wdt", hydVar.m133554Y());
            jSONObject.put("hgt", hydVar.m133542L());
            jSONObject.put("dpi", hydVar.m133538C());
            jSONObject.put("dt", hyd.m133510H(hydVar.m133573z()));
            jSONObject.put("locale", hydVar.m133545P());
            if (Build.VERSION.SDK_INT >= 28) {
                jSONObject.put("abckt", hydVar.m133568s());
            }
            if (hydVar.m133543M() != null) {
                jSONObject.put(ShareConstants.SO_PATH, hydVar.m133543M());
            }
            String strM5892o = ManifestInfo.getInstance(hydVar.m133573z()).m5892o();
            if (!TextUtils.isEmpty(strM5892o)) {
                jSONObject.put("proxyDomain", strM5892o);
            }
            String strM5893p = ManifestInfo.getInstance(hydVar.m133573z()).m5893p();
            if (!TextUtils.isEmpty(strM5893p)) {
                jSONObject.put("spikyProxyDomain", strM5893p);
            }
            if (ManifestInfo.getInstance(hydVar.m133573z()).m5898u()) {
                jSONObject.put("sslpin", true);
            }
            if (!TextUtils.isEmpty(ManifestInfo.getInstance(hydVar.m133573z()).m5887j())) {
                jSONObject.put("fcmsid", true);
            }
            String strM133536A = hydVar.m133536A();
            if (strM133536A != null && !strM133536A.equals("")) {
                jSONObject.put("cc", strM133536A);
            }
            if (z) {
                Boolean boolM133559f0 = hydVar.m133559f0();
                if (boolM133559f0 != null) {
                    jSONObject.put("wifi", boolM133559f0);
                }
                Boolean boolM133556c0 = hydVar.m133556c0();
                if (boolM133556c0 != null) {
                    jSONObject.put(Constants.CLTAP_BLUETOOTH_ENABLED, boolM133556c0);
                }
                String strM133570v = hydVar.m133570v();
                if (strM133570v != null) {
                    jSONObject.put(Constants.CLTAP_BLUETOOTH_VERSION, strM133570v);
                }
                String strM133548S = hydVar.m133548S();
                if (strM133548S != null) {
                    jSONObject.put(Constants.CLTAP_NETWORK_TYPE, strM133548S);
                }
            }
            jSONObject.put("LIAMC", hydVar.m133544N());
            for (Map.Entry<String, Integer> entry : qs9Var.m176205f().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m156464c(mrk0 mrk0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", mrk0Var.m156034a());
            jSONObject.put(Constants.INAPP_DATA_TAG, mrk0Var.m156035b());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m156465d(CTInAppNotification cTInAppNotification) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM6175s = cTInAppNotification.m6175s();
        Iterator<String> itKeys = jSONObjectM6175s.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(Constants.WZRK_PREFIX)) {
                jSONObject.put(next, jSONObjectM6175s.get(next));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m156466e(CTInboxMessage cTInboxMessage) {
        return cTInboxMessage.m6687i();
    }

    /* JADX INFO: renamed from: f */
    public static JSONArray m156467f(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            Logger.m5874v("CTJsonConverter", "RTL IDs -" + str);
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    public static <T> Object[] m156468g(@NonNull JSONArray jSONArray) {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                objArr[i] = jSONArray.get(i);
            } catch (JSONException e) {
                Logger.m5875v("CTJsonConverter", "Error converting JSONArray to array", e);
                return objArr;
            }
        }
        return objArr;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static JSONObject m156469h(String str, nul nulVar, String str2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                nulVar.verbose(str2, "Error reading guid cache: ", th);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return jSONObject != null ? jSONObject : new JSONObject();
    }
}
