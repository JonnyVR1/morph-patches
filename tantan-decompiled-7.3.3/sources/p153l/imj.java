package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class imj extends p95 {

    /* JADX INFO: renamed from: b */
    private final ch2 f115780b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f115781c;

    /* JADX INFO: renamed from: d */
    private final Logger f115782d;

    public imj(CleverTapInstanceConfig cleverTapInstanceConfig, ch2 ch2Var) {
        this.f115781c = cleverTapInstanceConfig;
        this.f115782d = cleverTapInstanceConfig.getLogger();
        this.f115780b = ch2Var;
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        this.f115782d.verbose(this.f115781c.getAccountId(), "Processing GeoFences response...");
        if (this.f115781c.isAnalyticsOnly()) {
            this.f115782d.verbose(this.f115781c.getAccountId(), "CleverTap instance is configured to analytics only, not processing geofence response");
            return;
        }
        if (jSONObject == null) {
            this.f115782d.verbose(this.f115781c.getAccountId(), "Geofences : Can't parse Geofences Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has(Constants.GEOFENCES_JSON_RESPONSE_KEY)) {
            this.f115782d.verbose(this.f115781c.getAccountId(), "Geofences : JSON object doesn't contain the Geofences key");
            return;
        }
        try {
            this.f115780b.mo96517k();
            this.f115782d.debug(this.f115781c.getAccountId(), "Geofences : Geofence SDK has not been initialized to handle the response");
        } catch (Throwable th) {
            this.f115782d.verbose(this.f115781c.getAccountId(), "Geofences : Failed to handle Geofences response", th);
        }
    }
}
