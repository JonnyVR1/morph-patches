package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class pjj extends o85 {

    /* JADX INFO: renamed from: b */
    private final vg2 f149805b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f149806c;

    /* JADX INFO: renamed from: d */
    private final Logger f149807d;

    public pjj(CleverTapInstanceConfig cleverTapInstanceConfig, vg2 vg2Var) {
        this.f149806c = cleverTapInstanceConfig;
        this.f149807d = cleverTapInstanceConfig.getLogger();
        this.f149805b = vg2Var;
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        this.f149807d.verbose(this.f149806c.getAccountId(), "Processing GeoFences response...");
        if (this.f149806c.isAnalyticsOnly()) {
            this.f149807d.verbose(this.f149806c.getAccountId(), "CleverTap instance is configured to analytics only, not processing geofence response");
            return;
        }
        if (jSONObject == null) {
            this.f149807d.verbose(this.f149806c.getAccountId(), "Geofences : Can't parse Geofences Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has(Constants.GEOFENCES_JSON_RESPONSE_KEY)) {
            this.f149807d.verbose(this.f149806c.getAccountId(), "Geofences : JSON object doesn't contain the Geofences key");
            return;
        }
        try {
            this.f149805b.mo100737k();
            this.f149807d.debug(this.f149806c.getAccountId(), "Geofences : Geofence SDK has not been initialized to handle the response");
        } catch (Throwable th) {
            this.f149807d.verbose(this.f149806c.getAccountId(), "Geofences : Failed to handle Geofences response", th);
        }
    }
}
