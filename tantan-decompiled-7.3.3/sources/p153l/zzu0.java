package p153l;

import androidx.core.app.NotificationCompat;
import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zzu0 {

    /* JADX INFO: renamed from: a */
    public final String f206744a;

    /* JADX INFO: renamed from: b */
    public final String f206745b;

    /* JADX INFO: renamed from: c */
    public final String f206746c;

    /* JADX INFO: renamed from: d */
    public final int f206747d;

    /* JADX INFO: renamed from: e */
    public final String f206748e;

    /* JADX INFO: renamed from: f */
    public final int f206749f;

    /* JADX INFO: renamed from: g */
    public final boolean f206750g;

    public zzu0(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f206744a = str;
        this.f206745b = str2;
        this.f206746c = str3;
        this.f206747d = i;
        this.f206748e = str4;
        this.f206749f = i2;
        this.f206750g = z;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m222289a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f206744a);
        jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.f206746c);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168354j9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f206745b);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f206747d);
        jSONObject.put("description", this.f206748e);
        jSONObject.put("initializationLatencyMillis", this.f206749f);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168367k9)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f206750g);
        }
        return jSONObject;
    }
}
