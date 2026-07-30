package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ia00 extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f113537b;

    /* JADX INFO: renamed from: c */
    private final uzd f113538c;

    /* JADX INFO: renamed from: d */
    private final Logger f113539d;

    /* JADX INFO: renamed from: e */
    private final uvl f113540e;

    public ia00(CleverTapInstanceConfig cleverTapInstanceConfig, uzd uzdVar, uvl uvlVar) {
        this.f113537b = cleverTapInstanceConfig;
        this.f113539d = cleverTapInstanceConfig.getLogger();
        this.f113538c = uzdVar;
        this.f113540e = uvlVar;
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("g")) {
                String string = jSONObject.getString("g");
                this.f113538c.m198790o(string);
                this.f113539d.verbose(this.f113537b.getAccountId(), "Got a new device ID: " + string);
            }
        } catch (Throwable th) {
            this.f113539d.verbose(this.f113537b.getAccountId(), "Failed to update device ID!", th);
        }
        try {
            if (jSONObject.has("_i")) {
                this.f113540e.m198300d(context, jSONObject.getLong("_i"));
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("_j")) {
                this.f113540e.m198301e(context, jSONObject.getLong("_j"));
            }
        } catch (Throwable unused2) {
        }
    }
}
