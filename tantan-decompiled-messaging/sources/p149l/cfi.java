package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class cfi extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f80624b;

    /* JADX INFO: renamed from: c */
    private final r26 f80625c;

    /* JADX INFO: renamed from: d */
    private final vg2 f80626d;

    public cfi(CleverTapInstanceConfig cleverTapInstanceConfig, r26 r26Var, vg2 vg2Var) {
        this.f80624b = cleverTapInstanceConfig;
        this.f80625c = r26Var;
        this.f80626d = vg2Var;
    }

    /* JADX INFO: renamed from: b */
    private void m106552b(JSONObject jSONObject) {
        if (!jSONObject.has(Constants.REQUEST_VARIANTS_JSON_RESPONSE_KEY)) {
            m106555e("JSON object doesn't contain the abVariantInfo key");
            return;
        }
        try {
            m106555e("Processing Variants response");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.REQUEST_VARIANTS_JSON_RESPONSE_KEY);
            if (jSONArrayOptJSONArray == null) {
                m106555e("Not handling AB variants cache as response is null");
                return;
            }
            fw3 fw3VarM177572g = this.f80625c.m177572g();
            if (fw3VarM177572g != null) {
                fw3VarM177572g.m123505g(jSONArrayOptJSONArray);
            } else {
                m106555e("Can't parse Variant Response, CTVariables is null");
            }
        } catch (Throwable th) {
            m106556f("Failed to parse variants response", th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m106553c(JSONObject jSONObject) {
        if (!jSONObject.has("vars")) {
            m106555e("JSON object doesn't contain the vars key");
            return;
        }
        try {
            m106555e("Processing Request Variables response");
            JSONObject jSONObject2 = jSONObject.getJSONObject("vars");
            if (this.f80625c.m177572g() == null) {
                m106555e("Can't parse Variable Response, CTVariables is null");
                return;
            }
            this.f80626d.mo100736j();
            this.f80625c.m177572g().m123506h(jSONObject2, null);
            this.f80626d.mo100750x(null);
        } catch (Throwable th) {
            m106556f("Failed to parse response", th);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m106554d(String str) {
        Logger.m5866d("variables", str);
    }

    /* JADX INFO: renamed from: e */
    private void m106555e(String str) {
        Logger.m5866d("variables", str);
    }

    /* JADX INFO: renamed from: f */
    private void m106556f(String str, Throwable th) {
        Logger.m5871i("variables", str, th);
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        m106555e("Processing Variable response...");
        m106554d("processResponse() called with: response = [" + jSONObject + "], stringBody = [" + str + "], context = [" + context + Constants.AES_SUFFIX);
        if (this.f80624b.isAnalyticsOnly()) {
            m106555e("CleverTap instance is configured to analytics only, not processing Variable response");
        } else if (jSONObject == null) {
            m106555e("Can't parse Variable Response, JSON response object is null");
        } else {
            m106552b(jSONObject);
            m106553c(jSONObject);
        }
    }
}
