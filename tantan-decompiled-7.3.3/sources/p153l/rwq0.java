package p153l;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class rwq0 {

    /* JADX INFO: renamed from: a */
    private int f165224a;

    /* JADX INFO: renamed from: b */
    private long f165225b;

    /* JADX INFO: renamed from: c */
    private long f165226c;

    /* JADX INFO: renamed from: d */
    private String f165227d;

    /* JADX INFO: renamed from: e */
    private long f165228e;

    public rwq0(int i, long j, long j2, Exception exc) {
        this.f165224a = i;
        this.f165225b = j;
        this.f165228e = j2;
        this.f165226c = System.currentTimeMillis();
        if (exc != null) {
            this.f165227d = exc.getClass().getSimpleName();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m183456a() {
        return this.f165224a;
    }

    /* JADX INFO: renamed from: b */
    public rwq0 m183457b(JSONObject jSONObject) {
        this.f165225b = jSONObject.getLong("cost");
        this.f165228e = jSONObject.getLong("size");
        this.f165226c = jSONObject.getLong(Constants.f58037TS);
        this.f165224a = jSONObject.getInt("wt");
        this.f165227d = jSONObject.optString("expt");
        return this;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m183458c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f165225b);
        jSONObject.put("size", this.f165228e);
        jSONObject.put(Constants.f58037TS, this.f165226c);
        jSONObject.put("wt", this.f165224a);
        jSONObject.put("expt", this.f165227d);
        return jSONObject;
    }

    public rwq0() {
        this(0, 0L, 0L, null);
    }
}
