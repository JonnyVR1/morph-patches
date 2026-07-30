package p149l;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class x3f {

    /* JADX INFO: renamed from: a */
    private final qs9 f190887a;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f190888b;

    /* JADX INFO: renamed from: c */
    private final jc20 f190889c;

    public x3f(CleverTapInstanceConfig cleverTapInstanceConfig, qs9 qs9Var, jc20 jc20Var) {
        this.f190888b = cleverTapInstanceConfig;
        this.f190889c = jc20Var;
        this.f190887a = qs9Var;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m206908a(JSONObject jSONObject) {
        try {
            Object objRemove = jSONObject.getJSONObject(Constants.KEY_EVT_DATA).remove(Constants.KEY_ITEMS);
            Map<String, Object> mapM199286f = vpq.m199286f(jSONObject.getJSONObject(Constants.KEY_EVT_DATA));
            jSONObject.getJSONObject(Constants.KEY_EVT_DATA).put(Constants.KEY_ITEMS, objRemove);
            return mapM199286f;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: b */
    public List<Map<String, Object>> m206909b(JSONObject jSONObject) {
        try {
            return vpq.m199282b(jSONObject.getJSONObject(Constants.KEY_EVT_DATA).getJSONArray(Constants.KEY_ITEMS));
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m206910c(JSONObject jSONObject) {
        try {
            return jSONObject.getString(Constants.KEY_EVT_NAME);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m206911d(JSONObject jSONObject) {
        try {
            return jSONObject.has(Constants.KEY_EVT_NAME) && jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.APP_LAUNCHED_EVENT);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m206912e(JSONObject jSONObject) {
        try {
            return jSONObject.has(Constants.KEY_EVT_NAME) && jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.CHARGED_EVENT);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m206913f(JSONObject jSONObject) {
        return jSONObject.has(Constants.KEY_EVT_NAME);
    }

    /* JADX INFO: renamed from: g */
    public boolean m206914g(JSONObject jSONObject, int i) {
        if (i == 8 || this.f190888b.isCreatedPostAppLaunch()) {
            return false;
        }
        if (jSONObject.has(Constants.KEY_EVT_NAME)) {
            try {
                if (Arrays.asList(Constants.SYSTEM_EVENTS).contains(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        return i == 4 && !this.f190887a.m176225y();
    }

    /* JADX INFO: renamed from: h */
    public boolean m206915h(JSONObject jSONObject, int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        if (this.f190889c.m140860k()) {
            this.f190888b.getLogger().verbose(this.f190888b.getAccountId(), "CleverTap is muted, dropping event - " + jSONObject.toString());
            return true;
        }
        if (!this.f190887a.m176174A()) {
            return false;
        }
        if (!this.f190887a.m176215l()) {
            this.f190888b.getLogger().debug(this.f190888b.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
            return true;
        }
        if (i != 4 && i != 6) {
            this.f190888b.getLogger().debug(this.f190888b.getAccountId(), "This is not RAISED_EVENT or NV_EVENT, not dropping event: " + jSONObject);
            return false;
        }
        boolean zContains = crk0.f82226q.contains(jSONObject != null ? m206910c(jSONObject) : null);
        boolean z = !zContains;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f190888b;
        if (zContains) {
            cleverTapInstanceConfig.getLogger().debug(this.f190888b.getAccountId(), "This is a system event, not dropping event: " + jSONObject);
            return z;
        }
        cleverTapInstanceConfig.getLogger().debug(this.f190888b.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
        return z;
    }
}
