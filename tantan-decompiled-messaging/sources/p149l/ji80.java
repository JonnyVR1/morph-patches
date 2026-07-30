package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ji80 {

    /* JADX INFO: renamed from: a */
    private JSONObject f118062a;

    /* JADX INFO: renamed from: b */
    private long f118063b = -1;

    /* JADX INFO: renamed from: c */
    private long f118064c = -1;

    public ji80(String str) {
        m141635b(str);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m141634a() {
        return this.f118062a;
    }

    /* JADX INFO: renamed from: b */
    public void m141635b(String str) {
        try {
            m141636c(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m141636c(JSONObject jSONObject) {
        this.f118062a = jSONObject;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("prefetch");
        if (jSONObjectOptJSONObject != null) {
            this.f118063b = jSONObjectOptJSONObject.optLong("requestTime", -1L);
            this.f118064c = jSONObjectOptJSONObject.optLong("waitTime", -1L);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m141637d(long j) {
        this.f118063b = j;
    }

    /* JADX INFO: renamed from: e */
    public void m141638e(long j) {
        this.f118064c = j;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m141639f() {
        try {
            JSONObject jSONObject = this.f118062a;
            jSONObject.putOpt("prefetch", new JSONObject().putOpt("requestTime", Long.valueOf(this.f118063b)).putOpt("waitTime", Long.valueOf(this.f118064c)));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        JSONObject jSONObjectM141639f = m141639f();
        if (jSONObjectM141639f != null) {
            return jSONObjectM141639f.toString();
        }
        return null;
    }

    public ji80() {
    }

    public ji80(JSONObject jSONObject) {
        m141636c(jSONObject);
    }
}
