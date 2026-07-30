package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vd90 extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f181066b;

    /* JADX INFO: renamed from: c */
    private final qs9 f181067c;

    /* JADX INFO: renamed from: d */
    private final Logger f181068d;

    /* JADX INFO: renamed from: e */
    private final r26 f181069e;

    public vd90(CleverTapInstanceConfig cleverTapInstanceConfig, qs9 qs9Var, r26 r26Var) {
        this.f181066b = cleverTapInstanceConfig;
        this.f181068d = cleverTapInstanceConfig.getLogger();
        this.f181067c = qs9Var;
        this.f181069e = r26Var;
    }

    /* JADX INFO: renamed from: b */
    private void m197985b() {
        if (this.f181067c.m176181H()) {
            if (this.f181069e.m177571f() != null) {
                this.f181069e.m177571f().m6886o();
            }
            this.f181067c.m176208g0(false);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m197986c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getJSONArray(Constants.KEY_KV) == null || this.f181069e.m177571f() == null) {
            m197985b();
        } else {
            this.f181069e.m177571f().m6887p(jSONObject);
        }
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        this.f181068d.verbose(this.f181066b.getAccountId(), "Processing Product Config response...");
        if (this.f181066b.isAnalyticsOnly()) {
            this.f181068d.verbose(this.f181066b.getAccountId(), "CleverTap instance is configured to analytics only, not processing Product Config response");
            return;
        }
        if (jSONObject == null) {
            this.f181068d.verbose(this.f181066b.getAccountId(), "Product Config : Can't parse Product Config Response, JSON response object is null");
            m197985b();
            return;
        }
        boolean zHas = jSONObject.has(Constants.REMOTE_CONFIG_FLAG_JSON_RESPONSE_KEY);
        Logger logger = this.f181068d;
        if (!zHas) {
            logger.verbose(this.f181066b.getAccountId(), "Product Config : JSON object doesn't contain the Product Config key");
            m197985b();
            return;
        }
        try {
            logger.verbose(this.f181066b.getAccountId(), "Product Config : Processing Product Config response");
            m197986c(jSONObject.getJSONObject(Constants.REMOTE_CONFIG_FLAG_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            m197985b();
            this.f181068d.verbose(this.f181066b.getAccountId(), "Product Config : Failed to parse Product Config response", th);
        }
    }
}
