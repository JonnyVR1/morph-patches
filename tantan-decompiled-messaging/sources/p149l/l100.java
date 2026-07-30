package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l100 extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f125606b;

    /* JADX INFO: renamed from: c */
    private final hyd f125607c;

    /* JADX INFO: renamed from: d */
    private final Logger f125608d;

    /* JADX INFO: renamed from: e */
    private final gtl f125609e;

    public l100(CleverTapInstanceConfig cleverTapInstanceConfig, hyd hydVar, gtl gtlVar) {
        this.f125606b = cleverTapInstanceConfig;
        this.f125608d = cleverTapInstanceConfig.getLogger();
        this.f125607c = hydVar;
        this.f125609e = gtlVar;
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        try {
            if (jSONObject.has("g")) {
                String string = jSONObject.getString("g");
                this.f125607c.m133567o(string);
                this.f125608d.verbose(this.f125606b.getAccountId(), "Got a new device ID: " + string);
            }
        } catch (Throwable th) {
            this.f125608d.verbose(this.f125606b.getAccountId(), "Failed to update device ID!", th);
        }
        try {
            if (jSONObject.has("_i")) {
                this.f125609e.m127991d(context, jSONObject.getLong("_i"));
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("_j")) {
                this.f125609e.m127992e(context, jSONObject.getLong("_j"));
            }
        } catch (Throwable unused2) {
        }
    }
}
