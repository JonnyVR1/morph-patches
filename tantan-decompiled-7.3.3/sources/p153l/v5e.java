package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v5e extends p95 {

    /* JADX INFO: renamed from: b */
    private final Object f182530b = new Object();

    /* JADX INFO: renamed from: c */
    private final ch2 f182531c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f182532d;

    /* JADX INFO: renamed from: e */
    private final w36 f182533e;

    /* JADX INFO: renamed from: f */
    private final Logger f182534f;

    public v5e(CleverTapInstanceConfig cleverTapInstanceConfig, ch2 ch2Var, w36 w36Var) {
        this.f182532d = cleverTapInstanceConfig;
        this.f182534f = cleverTapInstanceConfig.getLogger();
        this.f182531c = ch2Var;
        this.f182533e = w36Var;
    }

    /* JADX INFO: renamed from: b */
    private void m199835b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            this.f182534f.verbose(this.f182532d.getAccountId(), "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
            return;
        }
        synchronized (this.f182530b) {
            try {
                if (this.f182533e.m204740c() == null) {
                    this.f182533e.m204752o(new ou3());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f182531c.mo96526t(this.f182533e.m204740c().m169219b(jSONArray));
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        this.f182534f.verbose(this.f182532d.getAccountId(), "Processing Display Unit items...");
        if (this.f182532d.isAnalyticsOnly()) {
            this.f182534f.verbose(this.f182532d.getAccountId(), "CleverTap instance is configured to analytics only, not processing Display Unit response");
            return;
        }
        if (jSONObject == null) {
            this.f182534f.verbose(this.f182532d.getAccountId(), "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        boolean zHas = jSONObject.has(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY);
        Logger logger = this.f182534f;
        if (!zHas) {
            logger.verbose(this.f182532d.getAccountId(), "DisplayUnit : JSON object doesn't contain the Display Units key");
            return;
        }
        try {
            logger.verbose(this.f182532d.getAccountId(), "DisplayUnit : Processing Display Unit response");
            m199835b(jSONObject.getJSONArray(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f182534f.verbose(this.f182532d.getAccountId(), "DisplayUnit : Failed to parse response", th);
        }
    }
}
