package p153l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.pushnotification.PushNotificationHandler;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class alb0 extends p95 {

    /* JADX INFO: renamed from: b */
    private final ch2 f72092b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f72093c;

    /* JADX INFO: renamed from: d */
    private final Context f72094d;

    /* JADX INFO: renamed from: e */
    private final Logger f72095e;

    /* JADX INFO: renamed from: f */
    private final w36 f72096f;

    /* JADX INFO: renamed from: g */
    private final bj2 f72097g;

    public alb0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, bj2 bj2Var, ch2 ch2Var, w36 w36Var) {
        this.f72094d = context;
        this.f72093c = cleverTapInstanceConfig;
        this.f72095e = cleverTapInstanceConfig.getLogger();
        this.f72097g = bj2Var;
        this.f72092b = ch2Var;
        this.f72096f = w36Var;
    }

    /* JADX INFO: renamed from: b */
    private void m98655b(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("wzrk_ttl")) {
                    bundle.putLong("wzrk_ttl", jSONObject.getLong("wzrk_ttl"));
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    bundle.putString(string, jSONObject.getString(string));
                }
                if (bundle.isEmpty() || this.f72097g.mo104583c(this.f72094d).m133309n(jSONObject.getString(Constants.WZRK_PUSH_ID))) {
                    this.f72095e.verbose(this.f72093c.getAccountId(), "Push Notification already shown, ignoring local notification :" + jSONObject.getString(Constants.WZRK_PUSH_ID));
                } else {
                    this.f72095e.verbose("Creating Push Notification locally");
                    if (this.f72092b.mo96521o() != null) {
                        this.f72092b.mo96521o().mo195085a(bundle);
                    } else {
                        PushNotificationHandler.m6977d().mo6979a(this.f72094d, bundle, gmb0.f104964a.toString());
                    }
                }
            } catch (JSONException unused) {
                this.f72095e.verbose(this.f72093c.getAccountId(), "Error parsing push notification JSON");
                return;
            }
        }
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        if (this.f72093c.isAnalyticsOnly()) {
            this.f72095e.verbose(this.f72093c.getAccountId(), "CleverTap instance is configured to analytics only, not processing push amp response");
            return;
        }
        try {
            if (jSONObject.has("pushamp_notifs")) {
                this.f72095e.verbose(this.f72093c.getAccountId(), "Processing pushamp messages...");
                JSONObject jSONObject2 = jSONObject.getJSONObject("pushamp_notifs");
                JSONArray jSONArray = jSONObject2.getJSONArray("list");
                if (jSONArray.length() > 0) {
                    this.f72095e.verbose(this.f72093c.getAccountId(), "Handling Push payload locally");
                    m98655b(jSONArray);
                }
                if (jSONObject2.has(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID)) {
                    try {
                        this.f72096f.m204747j().m111625Y(context, jSONObject2.getInt(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID));
                    } catch (Throwable th) {
                        this.f72095e.verbose("Error handling ping frequency in response : " + th.getMessage());
                    }
                }
                boolean zOptBoolean = jSONObject2.optBoolean("ack", false);
                Logger logger = this.f72095e;
                if (!zOptBoolean) {
                    logger.verbose("Received ACK - false");
                    return;
                }
                logger.verbose("Received ACK - true");
                JSONArray jSONArrayM156025f = lw3.m156025f(this.f72097g.mo104583c(context).m133312q());
                int length = jSONArrayM156025f.length();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = jSONArrayM156025f.getString(i);
                }
                this.f72095e.verbose("Updating RTL values...");
                this.f72097g.mo104583c(context).m133299R(strArr);
            }
        } catch (Throwable unused) {
        }
    }
}
