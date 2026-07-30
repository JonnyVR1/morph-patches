package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zl90 extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f204889b;

    /* JADX INFO: renamed from: c */
    private final bu9 f204890c;

    /* JADX INFO: renamed from: d */
    private final Logger f204891d;

    /* JADX INFO: renamed from: e */
    private final w36 f204892e;

    public zl90(CleverTapInstanceConfig cleverTapInstanceConfig, bu9 bu9Var, w36 w36Var) {
        this.f204889b = cleverTapInstanceConfig;
        this.f204891d = cleverTapInstanceConfig.getLogger();
        this.f204890c = bu9Var;
        this.f204892e = w36Var;
    }

    /* JADX INFO: renamed from: b */
    private void m220173b() {
        if (this.f204890c.m106448H()) {
            if (this.f204892e.m204743f() != null) {
                this.f204892e.m204743f().m6940o();
            }
            this.f204890c.m106475g0(false);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m220174c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray(Constants.KEY_KV) == null || this.f204892e.m204743f() == null) {
            m220173b();
        } else {
            this.f204892e.m204743f().m6941p(jSONObject);
        }
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        this.f204891d.verbose(this.f204889b.getAccountId(), "Processing Product Config response...");
        if (this.f204889b.isAnalyticsOnly()) {
            this.f204891d.verbose(this.f204889b.getAccountId(), "CleverTap instance is configured to analytics only, not processing Product Config response");
            return;
        }
        if (jSONObject == null) {
            this.f204891d.verbose(this.f204889b.getAccountId(), "Product Config : Can't parse Product Config Response, JSON response object is null");
            m220173b();
            return;
        }
        boolean zHas = jSONObject.has(Constants.REMOTE_CONFIG_FLAG_JSON_RESPONSE_KEY);
        Logger logger = this.f204891d;
        if (!zHas) {
            logger.verbose(this.f204889b.getAccountId(), "Product Config : JSON object doesn't contain the Product Config key");
            m220173b();
            return;
        }
        try {
            logger.verbose(this.f204889b.getAccountId(), "Product Config : Processing Product Config response");
            m220174c(jSONObject.getJSONObject(Constants.REMOTE_CONFIG_FLAG_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            m220173b();
            this.f204891d.verbose(this.f204889b.getAccountId(), "Product Config : Failed to parse Product Config response", th);
        }
    }
}
