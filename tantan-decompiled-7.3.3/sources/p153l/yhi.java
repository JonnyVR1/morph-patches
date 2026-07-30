package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class yhi extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f199967b;

    /* JADX INFO: renamed from: c */
    private final w36 f199968c;

    /* JADX INFO: renamed from: d */
    private final ch2 f199969d;

    public yhi(CleverTapInstanceConfig cleverTapInstanceConfig, w36 w36Var, ch2 ch2Var) {
        this.f199967b = cleverTapInstanceConfig;
        this.f199968c = w36Var;
        this.f199969d = ch2Var;
    }

    /* JADX INFO: renamed from: b */
    private void m215962b(JSONObject jSONObject) {
        if (!jSONObject.has(Constants.REQUEST_VARIANTS_JSON_RESPONSE_KEY)) {
            m215965e("JSON object doesn't contain the abVariantInfo key");
            return;
        }
        try {
            m215965e("Processing Variants response");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.REQUEST_VARIANTS_JSON_RESPONSE_KEY);
            if (jSONArrayOptJSONArray == null) {
                m215965e("Not handling AB variants cache as response is null");
                return;
            }
            ex3 ex3VarM204744g = this.f199968c.m204744g();
            if (ex3VarM204744g != null) {
                ex3VarM204744g.m123006g(jSONArrayOptJSONArray);
            } else {
                m215965e("Can't parse Variant Response, CTVariables is null");
            }
        } catch (Throwable th) {
            m215966f("Failed to parse variants response", th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m215963c(JSONObject jSONObject) {
        if (!jSONObject.has("vars")) {
            m215965e("JSON object doesn't contain the vars key");
            return;
        }
        try {
            m215965e("Processing Request Variables response");
            JSONObject jSONObject2 = jSONObject.getJSONObject("vars");
            if (this.f199968c.m204744g() == null) {
                m215965e("Can't parse Variable Response, CTVariables is null");
                return;
            }
            this.f199969d.mo96516j();
            this.f199968c.m204744g().m123007h(jSONObject2, null);
            this.f199969d.mo96530x(null);
        } catch (Throwable th) {
            m215966f("Failed to parse response", th);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m215964d(String str) {
        Logger.m5920d("variables", str);
    }

    /* JADX INFO: renamed from: e */
    private void m215965e(String str) {
        Logger.m5920d("variables", str);
    }

    /* JADX INFO: renamed from: f */
    private void m215966f(String str, Throwable th) {
        Logger.m5925i("variables", str, th);
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        m215965e("Processing Variable response...");
        m215964d("processResponse() called with: response = [" + jSONObject + "], stringBody = [" + str + "], context = [" + context + Constants.AES_SUFFIX);
        if (this.f199967b.isAnalyticsOnly()) {
            m215965e("CleverTap instance is configured to analytics only, not processing Variable response");
        } else if (jSONObject == null) {
            m215965e("Can't parse Variable Response, JSON response object is null");
        } else {
            m215962b(jSONObject);
            m215963c(jSONObject);
        }
    }
}
