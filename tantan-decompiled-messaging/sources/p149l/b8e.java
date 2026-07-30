package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b8e {

    /* JADX INFO: renamed from: a */
    public String f74097a;

    /* JADX INFO: renamed from: b */
    public int f74098b;

    /* JADX INFO: renamed from: c */
    public long f74099c;

    /* JADX INFO: renamed from: d */
    public long f74100d;

    /* JADX INFO: renamed from: e */
    public long f74101e;

    /* JADX INFO: renamed from: f */
    public boolean f74102f;

    /* JADX INFO: renamed from: g */
    public String f74103g;

    /* JADX INFO: renamed from: h */
    public String f74104h;

    /* JADX INFO: renamed from: i */
    public String f74105i;

    /* JADX INFO: renamed from: a */
    public void m100769a(JSONObject jSONObject) throws JSONException {
        this.f74097a = jSONObject.optString("url");
        this.f74098b = jSONObject.optInt(FirebaseAnalytics.Param.INDEX);
        this.f74099c = jSONObject.optLong("from");
        this.f74100d = jSONObject.optLong("now");
        this.f74101e = jSONObject.optLong("to");
        this.f74102f = jSONObject.optInt("needCoo") == 1;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m100770b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f74097a);
            jSONObject.put(FirebaseAnalytics.Param.INDEX, this.f74098b);
            jSONObject.put("from", this.f74099c);
            jSONObject.put("now", this.f74100d);
            jSONObject.put("to", this.f74101e);
            jSONObject.put("needCoo", this.f74102f ? 1 : 0);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
