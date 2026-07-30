package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class xlg extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f194964b;

    /* JADX INFO: renamed from: c */
    private final Logger f194965c;

    /* JADX INFO: renamed from: d */
    private final w36 f194966d;

    public xlg(CleverTapInstanceConfig cleverTapInstanceConfig, w36 w36Var) {
        this.f194964b = cleverTapInstanceConfig;
        this.f194965c = cleverTapInstanceConfig.getLogger();
        this.f194966d = w36Var;
    }

    /* JADX INFO: renamed from: b */
    private void m211624b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray(Constants.KEY_KV) == null || this.f194966d.m204741d() == null) {
            this.f194964b.getLogger().verbose(this.f194964b.getAccountId(), "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
        } else {
            this.f194966d.m204741d().m192723q(jSONObject);
        }
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        this.f194965c.verbose(this.f194964b.getAccountId(), "Processing Feature Flags response...");
        if (this.f194964b.isAnalyticsOnly()) {
            this.f194965c.verbose(this.f194964b.getAccountId(), "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            return;
        }
        if (jSONObject == null) {
            this.f194965c.verbose(this.f194964b.getAccountId(), "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
            return;
        }
        boolean zHas = jSONObject.has(Constants.FEATURE_FLAG_JSON_RESPONSE_KEY);
        Logger logger = this.f194965c;
        if (!zHas) {
            logger.verbose(this.f194964b.getAccountId(), "Feature Flag : JSON object doesn't contain the Feature Flags key");
            return;
        }
        try {
            logger.verbose(this.f194964b.getAccountId(), "Feature Flag : Processing Feature Flags response");
            m211624b(jSONObject.getJSONObject(Constants.FEATURE_FLAG_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f194965c.verbose(this.f194964b.getAccountId(), "Feature Flag : Failed to parse response", th);
        }
    }
}
