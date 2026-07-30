package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h4e extends o85 {

    /* JADX INFO: renamed from: b */
    private final Object f105827b = new Object();

    /* JADX INFO: renamed from: c */
    private final vg2 f105828c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f105829d;

    /* JADX INFO: renamed from: e */
    private final r26 f105830e;

    /* JADX INFO: renamed from: f */
    private final Logger f105831f;

    public h4e(CleverTapInstanceConfig cleverTapInstanceConfig, vg2 vg2Var, r26 r26Var) {
        this.f105829d = cleverTapInstanceConfig;
        this.f105831f = cleverTapInstanceConfig.getLogger();
        this.f105828c = vg2Var;
        this.f105830e = r26Var;
    }

    /* JADX INFO: renamed from: b */
    private void m129234b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            this.f105831f.verbose(this.f105829d.getAccountId(), "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
            return;
        }
        synchronized (this.f105827b) {
            try {
                if (this.f105830e.m177568c() == null) {
                    this.f105830e.m177580o(new pt3());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f105828c.mo100746t(this.f105830e.m177568c().m171279b(jSONArray));
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        this.f105831f.verbose(this.f105829d.getAccountId(), "Processing Display Unit items...");
        if (this.f105829d.isAnalyticsOnly()) {
            this.f105831f.verbose(this.f105829d.getAccountId(), "CleverTap instance is configured to analytics only, not processing Display Unit response");
            return;
        }
        if (jSONObject == null) {
            this.f105831f.verbose(this.f105829d.getAccountId(), "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        boolean zHas = jSONObject.has(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY);
        Logger logger = this.f105831f;
        if (!zHas) {
            logger.verbose(this.f105829d.getAccountId(), "DisplayUnit : JSON object doesn't contain the Display Units key");
            return;
        }
        try {
            logger.verbose(this.f105829d.getAccountId(), "DisplayUnit : Processing Display Unit response");
            m129234b(jSONObject.getJSONArray(Constants.DISPLAY_UNIT_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f105831f.verbose(this.f105829d.getAccountId(), "DisplayUnit : Failed to parse response", th);
        }
    }
}
