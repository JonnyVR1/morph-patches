package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zx5 extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f206437b;

    /* JADX INFO: renamed from: c */
    private final Logger f206438c;

    public zx5(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f206437b = cleverTapInstanceConfig;
        this.f206438c = cleverTapInstanceConfig.getLogger();
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        int i;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        this.f206438c.debug(this.f206437b.getAccountId(), jSONArray.get(i2).toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (!jSONObject.has("dbg_lvl") || (i = jSONObject.getInt("dbg_lvl")) < 0) {
                return;
            }
            CleverTapAPI.m5841w0(i);
            this.f206438c.verbose(this.f206437b.getAccountId(), "Set debug level to " + i + " for this session (set by upstream)");
        } catch (Throwable unused2) {
        }
    }
}
