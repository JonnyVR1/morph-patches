package p153l;

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
public class C20206t1 extends p95 {

    /* JADX INFO: renamed from: b */
    private final CTProductConfigController f171576b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f171577c;

    /* JADX INFO: renamed from: d */
    private final Logger f171578d;

    /* JADX INFO: renamed from: e */
    private final i0l0 f171579e;

    /* JADX INFO: renamed from: f */
    private final a01 f171580f;

    public C20206t1(CleverTapInstanceConfig cleverTapInstanceConfig, i0l0 i0l0Var, w36 w36Var, a01 a01Var) {
        this.f171577c = cleverTapInstanceConfig;
        this.f171576b = w36Var.m204743f();
        this.f171578d = cleverTapInstanceConfig.getLogger();
        this.f171579e = i0l0Var;
        this.f171580f = a01Var;
    }

    /* JADX INFO: renamed from: b */
    private void m188827b(JSONObject jSONObject) {
        if (!jSONObject.has(Constants.DISCARDED_EVENT_JSON_KEY)) {
            this.f171578d.verbose(this.f171577c.getAccountId(), "ARP doesn't contain the Discarded Events key");
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.DISCARDED_EVENT_JSON_KEY);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            i0l0 i0l0Var = this.f171579e;
            if (i0l0Var != null) {
                i0l0Var.m137996s(hashSet);
            } else {
                this.f171578d.verbose(this.f171577c.getAccountId(), "ValidationConfig object is NULL");
            }
        } catch (JSONException e) {
            this.f171578d.verbose(this.f171577c.getAccountId(), "Error parsing discarded events list" + e.getLocalizedMessage());
        }
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("arp")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("arp");
                if (jSONObject2.length() > 0) {
                    CTProductConfigController cTProductConfigController = this.f171576b;
                    if (cTProductConfigController != null) {
                        cTProductConfigController.m6943v(jSONObject2);
                    }
                    try {
                        m188827b(jSONObject2);
                    } catch (Throwable th) {
                        this.f171578d.verbose("Error handling discarded events response: " + th.getLocalizedMessage());
                    }
                    this.f171580f.m95292d(context, jSONObject2);
                }
            }
        } catch (Throwable th2) {
            this.f171578d.verbose(this.f171577c.getAccountId(), "Failed to process ARP", th2);
        }
    }
}
