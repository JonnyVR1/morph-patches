package p153l;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ctm extends p95 {

    /* JADX INFO: renamed from: b */
    private final Object f83711b;

    /* JADX INFO: renamed from: c */
    private final ch2 f83712c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f83713d;

    /* JADX INFO: renamed from: e */
    private final Logger f83714e;

    /* JADX INFO: renamed from: f */
    private final w36 f83715f;

    public ctm(CleverTapInstanceConfig cleverTapInstanceConfig, nw3 nw3Var, ch2 ch2Var, w36 w36Var) {
        this.f83713d = cleverTapInstanceConfig;
        this.f83712c = ch2Var;
        this.f83714e = cleverTapInstanceConfig.getLogger();
        this.f83711b = nw3Var.m164938b();
        this.f83715f = w36Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    private void m112516b(JSONArray jSONArray) {
        synchronized (this.f83711b) {
            try {
                if (this.f83715f.m204742e() == null) {
                    this.f83715f.m204748k();
                }
                if (this.f83715f.m204742e() != null && this.f83715f.m204742e().m122881s(jSONArray)) {
                    this.f83712c.mo96508b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.o95
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        boolean zIsAnalyticsOnly = this.f83713d.isAnalyticsOnly();
        Logger logger = this.f83714e;
        if (zIsAnalyticsOnly) {
            logger.verbose(this.f83713d.getAccountId(), "CleverTap instance is configured to analytics only, not processing inbox messages");
            return;
        }
        logger.verbose(this.f83713d.getAccountId(), "Inbox: Processing response");
        if (!jSONObject.has(Constants.INBOX_JSON_RESPONSE_KEY)) {
            this.f83714e.verbose(this.f83713d.getAccountId(), "Inbox: Response JSON object doesn't contain the inbox key");
            return;
        }
        try {
            m112516b(jSONObject.getJSONArray(Constants.INBOX_JSON_RESPONSE_KEY));
        } catch (Throwable th) {
            this.f83714e.verbose(this.f83713d.getAccountId(), "InboxResponse: Failed to parse response", th);
        }
    }
}
