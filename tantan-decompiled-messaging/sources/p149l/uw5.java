package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class uw5 extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f178619b;

    /* JADX INFO: renamed from: c */
    private final Logger f178620c;

    public uw5(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f178619b = cleverTapInstanceConfig;
        this.f178620c = cleverTapInstanceConfig.getLogger();
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        int i;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        this.f178620c.debug(this.f178619b.getAccountId(), jSONArray.get(i2).toString());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (!jSONObject.has("dbg_lvl") || (i = jSONObject.getInt("dbg_lvl")) < 0) {
                return;
            }
            CleverTapAPI.m5787w0(i);
            this.f178620c.verbose(this.f178619b.getAccountId(), "Set debug level to " + i + " for this session (set by upstream)");
        } catch (Throwable unused2) {
        }
    }
}
