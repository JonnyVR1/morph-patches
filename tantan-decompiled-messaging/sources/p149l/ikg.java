package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ikg extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f113670b;

    /* JADX INFO: renamed from: c */
    private final Logger f113671c;

    /* JADX INFO: renamed from: d */
    private final r26 f113672d;

    public ikg(CleverTapInstanceConfig cleverTapInstanceConfig, r26 r26Var) {
        this.f113670b = cleverTapInstanceConfig;
        this.f113671c = cleverTapInstanceConfig.getLogger();
        this.f113672d = r26Var;
    }

    /* JADX INFO: renamed from: b */
    private void m136798b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray(Constants.KEY_KV) == null || this.f113672d.m177569d() == null) {
            this.f113670b.getLogger().verbose(this.f113670b.getAccountId(), "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
        } else {
            this.f113672d.m177569d().m195294q(jSONObject);
        }
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        this.f113671c.verbose(this.f113670b.getAccountId(), "Processing Feature Flags response...");
        if (this.f113670b.isAnalyticsOnly()) {
            this.f113671c.verbose(this.f113670b.getAccountId(), "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            return;
        }
        if (jSONObject == null) {
            this.f113671c.verbose(this.f113670b.getAccountId(), "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
            return;
        }
        boolean zHas = jSONObject.has(Constants.FEATURE_FLAG_JSON_RESPONSE_KEY);
        Logger logger = this.f113671c;
        if (!zHas) {
            logger.verbose(this.f113670b.getAccountId(), "Feature Flag : JSON object doesn't contain the Feature Flags key");
            return;
        }
        try {
            logger.verbose(this.f113670b.getAccountId(), "Feature Flag : Processing Feature Flags response");
            m136798b(jSONObject.getJSONObject(Constants.FEATURE_FLAG_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f113671c.verbose(this.f113670b.getAccountId(), "Feature Flag : Failed to parse response", th);
        }
    }
}
