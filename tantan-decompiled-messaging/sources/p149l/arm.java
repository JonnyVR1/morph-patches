package p149l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class arm extends o85 {

    /* JADX INFO: renamed from: b */
    private final Object f71296b;

    /* JADX INFO: renamed from: c */
    private final vg2 f71297c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f71298d;

    /* JADX INFO: renamed from: e */
    private final Logger f71299e;

    /* JADX INFO: renamed from: f */
    private final r26 f71300f;

    public arm(CleverTapInstanceConfig cleverTapInstanceConfig, ov3 ov3Var, vg2 vg2Var, r26 r26Var) {
        this.f71298d = cleverTapInstanceConfig;
        this.f71297c = vg2Var;
        this.f71299e = cleverTapInstanceConfig.getLogger();
        this.f71296b = ov3Var.m166152b();
        this.f71300f = r26Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    private void m98524b(JSONArray jSONArray) {
        synchronized (this.f71296b) {
            try {
                if (this.f71300f.m177570e() == null) {
                    this.f71300f.m177576k();
                }
                if (this.f71300f.m177570e() != null && this.f71300f.m177570e().m123268s(jSONArray)) {
                    this.f71297c.mo100728b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.n85
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        boolean zIsAnalyticsOnly = this.f71298d.isAnalyticsOnly();
        Logger logger = this.f71299e;
        if (zIsAnalyticsOnly) {
            logger.verbose(this.f71298d.getAccountId(), "CleverTap instance is configured to analytics only, not processing inbox messages");
            return;
        }
        logger.verbose(this.f71298d.getAccountId(), "Inbox: Processing response");
        if (!jSONObject.has(Constants.INBOX_JSON_RESPONSE_KEY)) {
            this.f71299e.verbose(this.f71298d.getAccountId(), "Inbox: Response JSON object doesn't contain the inbox key");
            return;
        }
        try {
            m98524b(jSONObject.getJSONArray(Constants.INBOX_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f71299e.verbose(this.f71298d.getAccountId(), "InboxResponse: Failed to parse response", th);
        }
    }
}
