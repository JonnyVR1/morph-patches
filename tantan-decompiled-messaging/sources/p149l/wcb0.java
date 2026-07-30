package p149l;

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
public class wcb0 extends o85 {

    /* JADX INFO: renamed from: b */
    private final vg2 f185668b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f185669c;

    /* JADX INFO: renamed from: d */
    private final Context f185670d;

    /* JADX INFO: renamed from: e */
    private final Logger f185671e;

    /* JADX INFO: renamed from: f */
    private final r26 f185672f;

    /* JADX INFO: renamed from: g */
    private final ui2 f185673g;

    public wcb0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ui2 ui2Var, vg2 vg2Var, r26 r26Var) {
        this.f185670d = context;
        this.f185669c = cleverTapInstanceConfig;
        this.f185671e = cleverTapInstanceConfig.getLogger();
        this.f185673g = ui2Var;
        this.f185668b = vg2Var;
        this.f185672f = r26Var;
    }

    /* JADX INFO: renamed from: b */
    private void m202654b(JSONArray jSONArray) {
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
                if (bundle.isEmpty() || this.f185673g.mo94410c(this.f185670d).m191177n(jSONObject.getString(Constants.WZRK_PUSH_ID))) {
                    this.f185671e.verbose(this.f185669c.getAccountId(), "Push Notification already shown, ignoring local notification :" + jSONObject.getString(Constants.WZRK_PUSH_ID));
                } else {
                    this.f185671e.verbose("Creating Push Notification locally");
                    if (this.f185668b.mo100741o() != null) {
                        this.f185668b.mo100741o().mo187519a(bundle);
                    } else {
                        PushNotificationHandler.m6923d().mo6925a(this.f185670d, bundle, ceb0.f80450a.toString());
                    }
                }
            } catch (JSONException unused) {
                this.f185671e.verbose(this.f185669c.getAccountId(), "Error parsing push notification JSON");
                return;
            }
        }
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        if (this.f185669c.isAnalyticsOnly()) {
            this.f185671e.verbose(this.f185669c.getAccountId(), "CleverTap instance is configured to analytics only, not processing push amp response");
            return;
        }
        try {
            if (jSONObject.has("pushamp_notifs")) {
                this.f185671e.verbose(this.f185669c.getAccountId(), "Processing pushamp messages...");
                JSONObject jSONObject2 = jSONObject.getJSONObject("pushamp_notifs");
                JSONArray jSONArray = jSONObject2.getJSONArray("list");
                if (jSONArray.length() > 0) {
                    this.f185671e.verbose(this.f185669c.getAccountId(), "Handling Push payload locally");
                    m202654b(jSONArray);
                }
                if (jSONObject2.has(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID)) {
                    try {
                        this.f185672f.m177575j().m214536Y(context, jSONObject2.getInt(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID));
                    } catch (Throwable th) {
                        this.f185671e.verbose("Error handling ping frequency in response : " + th.getMessage());
                    }
                }
                boolean zOptBoolean = jSONObject2.optBoolean("ack", false);
                Logger logger = this.f185671e;
                if (!zOptBoolean) {
                    logger.verbose("Received ACK - false");
                    return;
                }
                logger.verbose("Received ACK - true");
                JSONArray jSONArrayM156467f = mv3.m156467f(this.f185673g.mo94410c(context).m191180q());
                int length = jSONArrayM156467f.length();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = jSONArrayM156467f.getString(i);
                }
                this.f185671e.verbose("Updating RTL values...");
                this.f185673g.mo94410c(context).m191167R(strArr);
            }
        } catch (Throwable unused) {
        }
    }
}
