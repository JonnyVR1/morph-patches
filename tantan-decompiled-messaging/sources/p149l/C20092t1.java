package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.t1 */
/* JADX INFO: loaded from: classes.dex */
public class C20092t1 extends o85 {

    /* JADX INFO: renamed from: b */
    private final CTProductConfigController f167221b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f167222c;

    /* JADX INFO: renamed from: d */
    private final Logger f167223d;

    /* JADX INFO: renamed from: e */
    private final crk0 f167224e;

    /* JADX INFO: renamed from: f */
    private final tz0 f167225f;

    public C20092t1(CleverTapInstanceConfig cleverTapInstanceConfig, crk0 crk0Var, r26 r26Var, tz0 tz0Var) {
        this.f167222c = cleverTapInstanceConfig;
        this.f167221b = r26Var.m177571f();
        this.f167223d = cleverTapInstanceConfig.getLogger();
        this.f167224e = crk0Var;
        this.f167225f = tz0Var;
    }

    /* JADX INFO: renamed from: b */
    private void m186886b(JSONObject jSONObject) {
        if (!jSONObject.has(Constants.DISCARDED_EVENT_JSON_KEY)) {
            this.f167223d.verbose(this.f167222c.getAccountId(), "ARP doesn't contain the Discarded Events key");
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.DISCARDED_EVENT_JSON_KEY);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            crk0 crk0Var = this.f167224e;
            if (crk0Var != null) {
                crk0Var.m108398s(hashSet);
            } else {
                this.f167223d.verbose(this.f167222c.getAccountId(), "ValidationConfig object is NULL");
            }
        } catch (JSONException e) {
            this.f167223d.verbose(this.f167222c.getAccountId(), "Error parsing discarded events list" + e.getLocalizedMessage());
        }
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("arp")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("arp");
                if (jSONObject2.length() > 0) {
                    CTProductConfigController cTProductConfigController = this.f167221b;
                    if (cTProductConfigController != null) {
                        cTProductConfigController.m6889v(jSONObject2);
                    }
                    try {
                        m186886b(jSONObject2);
                    } catch (Throwable th) {
                        this.f167223d.verbose("Error handling discarded events response: " + th.getLocalizedMessage());
                    }
                    this.f167225f.m191118d(context, jSONObject2);
                }
            }
        } catch (Throwable th2) {
            this.f167223d.verbose(this.f167222c.getAccountId(), "Failed to process ARP", th2);
        }
    }
}
