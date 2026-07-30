package p153l;

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
public class b5f {

    /* JADX INFO: renamed from: a */
    private final bu9 f75055a;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f75056b;

    /* JADX INFO: renamed from: c */
    private final tk20 f75057c;

    public b5f(CleverTapInstanceConfig cleverTapInstanceConfig, bu9 bu9Var, tk20 tk20Var) {
        this.f75056b = cleverTapInstanceConfig;
        this.f75057c = tk20Var;
        this.f75055a = bu9Var;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m102571a(JSONObject jSONObject) {
        try {
            Object objRemove = jSONObject.getJSONObject(Constants.KEY_EVT_DATA).remove(Constants.KEY_ITEMS);
            Map<String, Object> mapM207619f = wrq.m207619f(jSONObject.getJSONObject(Constants.KEY_EVT_DATA));
            jSONObject.getJSONObject(Constants.KEY_EVT_DATA).put(Constants.KEY_ITEMS, objRemove);
            return mapM207619f;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: b */
    public List<Map<String, Object>> m102572b(JSONObject jSONObject) {
        try {
            return wrq.m207615b(jSONObject.getJSONObject(Constants.KEY_EVT_DATA).getJSONArray(Constants.KEY_ITEMS));
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m102573c(JSONObject jSONObject) {
        try {
            return jSONObject.getString(Constants.KEY_EVT_NAME);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m102574d(JSONObject jSONObject) {
        try {
            return jSONObject.has(Constants.KEY_EVT_NAME) && jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.APP_LAUNCHED_EVENT);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m102575e(JSONObject jSONObject) {
        try {
            return jSONObject.has(Constants.KEY_EVT_NAME) && jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.CHARGED_EVENT);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m102576f(JSONObject jSONObject) {
        return jSONObject.has(Constants.KEY_EVT_NAME);
    }

    /* JADX INFO: renamed from: g */
    public boolean m102577g(JSONObject jSONObject, int i) {
        if (i == 8 || this.f75056b.isCreatedPostAppLaunch()) {
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
        return i == 4 && !this.f75055a.m106492y();
    }

    /* JADX INFO: renamed from: h */
    public boolean m102578h(JSONObject jSONObject, int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        if (this.f75057c.m191496k()) {
            this.f75056b.getLogger().verbose(this.f75056b.getAccountId(), "CleverTap is muted, dropping event - " + jSONObject.toString());
            return true;
        }
        if (!this.f75055a.m106441A()) {
            return false;
        }
        if (!this.f75055a.m106482l()) {
            this.f75056b.getLogger().debug(this.f75056b.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
            return true;
        }
        if (i != 4 && i != 6) {
            this.f75056b.getLogger().debug(this.f75056b.getAccountId(), "This is not RAISED_EVENT or NV_EVENT, not dropping event: " + jSONObject);
            return false;
        }
        boolean zContains = i0l0.f112385q.contains(jSONObject != null ? m102573c(jSONObject) : null);
        boolean z = !zContains;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f75056b;
        if (zContains) {
            cleverTapInstanceConfig.getLogger().debug(this.f75056b.getAccountId(), "This is a system event, not dropping event: " + jSONObject);
            return z;
        }
        cleverTapInstanceConfig.getLogger().debug(this.f75056b.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
        return z;
    }
}
