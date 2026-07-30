package p153l;

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
public class lw3 {
    /* JADX INFO: renamed from: a */
    public static JSONObject m156020a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String string = bundle.getString(Constants.DISPLAY_UNIT_PREVIEW_PUSH_PAYLOAD_KEY);
        Logger.m5928v("CTJsonConverter", "Received Display Unit via push payload: " + string);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY, jSONArray);
        jSONArray.put(new JSONObject(string));
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m156021b(uzd uzdVar, bu9 bu9Var, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Location locationM106485p = bu9Var.m106485p();
        jSONObject.put("Build", uzdVar.m198794w() + "");
        jSONObject.put(Constants.CLTAP_APP_VERSION, uzdVar.m198776X());
        jSONObject.put(Constants.CLTAP_OS_VERSION, uzdVar.m198773U());
        jSONObject.put(Constants.CLTAP_SDK_VERSION, uzdVar.m198774V());
        if (locationM106485p != null) {
            jSONObject.put(Constants.CLTAP_LATITUDE, locationM106485p.getLatitude());
            jSONObject.put(Constants.CLTAP_LONGITUDE, locationM106485p.getLongitude());
        }
        if (uzdVar.m198764K() != null) {
            jSONObject.put(z2 ? "mt_GoogleAdID" : "GoogleAdID", uzdVar.m198764K());
            jSONObject.put("GoogleAdIDLimit", uzdVar.m198781e0());
        }
        try {
            jSONObject.put(p7f.TAG_MAKE, uzdVar.m198769Q());
            jSONObject.put(p7f.TAG_MODEL, uzdVar.m198770R());
            jSONObject.put(Constants.CLTAP_CARRIER, uzdVar.m198795x());
            jSONObject.put("useIP", z);
            jSONObject.put("OS", uzdVar.m198772T());
            jSONObject.put("wdt", uzdVar.m198777Y());
            jSONObject.put("hgt", uzdVar.m198765L());
            jSONObject.put("dpi", uzdVar.m198761C());
            jSONObject.put("dt", uzd.m198733H(uzdVar.m198796z()));
            jSONObject.put("locale", uzdVar.m198768P());
            if (Build.VERSION.SDK_INT >= 28) {
                jSONObject.put("abckt", uzdVar.m198791s());
            }
            if (uzdVar.m198766M() != null) {
                jSONObject.put(ShareConstants.SO_PATH, uzdVar.m198766M());
            }
            String strM5946o = ManifestInfo.getInstance(uzdVar.m198796z()).m5946o();
            if (!TextUtils.isEmpty(strM5946o)) {
                jSONObject.put("proxyDomain", strM5946o);
            }
            String strM5947p = ManifestInfo.getInstance(uzdVar.m198796z()).m5947p();
            if (!TextUtils.isEmpty(strM5947p)) {
                jSONObject.put("spikyProxyDomain", strM5947p);
            }
            if (ManifestInfo.getInstance(uzdVar.m198796z()).m5952u()) {
                jSONObject.put("sslpin", true);
            }
            if (!TextUtils.isEmpty(ManifestInfo.getInstance(uzdVar.m198796z()).m5941j())) {
                jSONObject.put("fcmsid", true);
            }
            String strM198759A = uzdVar.m198759A();
            if (strM198759A != null && !strM198759A.equals("")) {
                jSONObject.put("cc", strM198759A);
            }
            if (z) {
                Boolean boolM198782f0 = uzdVar.m198782f0();
                if (boolM198782f0 != null) {
                    jSONObject.put("wifi", boolM198782f0);
                }
                Boolean boolM198779c0 = uzdVar.m198779c0();
                if (boolM198779c0 != null) {
                    jSONObject.put(Constants.CLTAP_BLUETOOTH_ENABLED, boolM198779c0);
                }
                String strM198793v = uzdVar.m198793v();
                if (strM198793v != null) {
                    jSONObject.put(Constants.CLTAP_BLUETOOTH_VERSION, strM198793v);
                }
                String strM198771S = uzdVar.m198771S();
                if (strM198771S != null) {
                    jSONObject.put(Constants.CLTAP_NETWORK_TYPE, strM198771S);
                }
            }
            jSONObject.put("LIAMC", uzdVar.m198767N());
            for (Map.Entry<String, Integer> entry : bu9Var.m106472f().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m156022c(s0l0 s0l0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", s0l0Var.m183967a());
            jSONObject.put(Constants.INAPP_DATA_TAG, s0l0Var.m183968b());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m156023d(CTInAppNotification cTInAppNotification) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM6229s = cTInAppNotification.m6229s();
        Iterator<String> itKeys = jSONObjectM6229s.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith(Constants.WZRK_PREFIX)) {
                jSONObject.put(next, jSONObjectM6229s.get(next));
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m156024e(CTInboxMessage cTInboxMessage) {
        return cTInboxMessage.m6741i();
    }

    /* JADX INFO: renamed from: f */
    public static JSONArray m156025f(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            Logger.m5928v("CTJsonConverter", "RTL IDs -" + str);
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    public static <T> Object[] m156026g(@NonNull JSONArray jSONArray) {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                objArr[i] = jSONArray.get(i);
            } catch (JSONException e) {
                Logger.m5929v("CTJsonConverter", "Error converting JSONArray to array", e);
                return objArr;
            }
        }
        return objArr;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static JSONObject m156027h(String str, axl axlVar, String str2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                axlVar.verbose(str2, "Error reading guid cache: ", th);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return jSONObject != null ? jSONObject : new JSONObject();
    }
}
