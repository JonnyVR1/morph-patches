package p149l;

import androidx.core.app.NotificationCompat;
import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tqu0 {

    /* JADX INFO: renamed from: a */
    public final String f171629a;

    /* JADX INFO: renamed from: b */
    public final String f171630b;

    /* JADX INFO: renamed from: c */
    public final String f171631c;

    /* JADX INFO: renamed from: d */
    public final int f171632d;

    /* JADX INFO: renamed from: e */
    public final String f171633e;

    /* JADX INFO: renamed from: f */
    public final int f171634f;

    /* JADX INFO: renamed from: g */
    public final boolean f171635g;

    public tqu0(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f171629a = str;
        this.f171630b = str2;
        this.f171631c = str3;
        this.f171632d = i;
        this.f171633e = str4;
        this.f171634f = i2;
        this.f171635g = z;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m190162a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f171629a);
        jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.f171631c);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132283j9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f171630b);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f171632d);
        jSONObject.put("description", this.f171633e);
        jSONObject.put("initializationLatencyMillis", this.f171634f);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132296k9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f171635g);
        }
        return jSONObject;
    }
}
