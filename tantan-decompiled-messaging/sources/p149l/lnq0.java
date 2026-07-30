package p149l;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lnq0 {

    /* JADX INFO: renamed from: a */
    private int f129012a;

    /* JADX INFO: renamed from: b */
    private long f129013b;

    /* JADX INFO: renamed from: c */
    private long f129014c;

    /* JADX INFO: renamed from: d */
    private String f129015d;

    /* JADX INFO: renamed from: e */
    private long f129016e;

    public lnq0(int i, long j, long j2, Exception exc) {
        this.f129012a = i;
        this.f129013b = j;
        this.f129016e = j2;
        this.f129014c = System.currentTimeMillis();
        if (exc != null) {
            this.f129015d = exc.getClass().getSimpleName();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m150707a() {
        return this.f129012a;
    }

    /* JADX INFO: renamed from: b */
    public lnq0 m150708b(JSONObject jSONObject) {
        this.f129013b = jSONObject.getLong("cost");
        this.f129016e = jSONObject.getLong("size");
        this.f129014c = jSONObject.getLong(Constants.f57189TS);
        this.f129012a = jSONObject.getInt("wt");
        this.f129015d = jSONObject.optString("expt");
        return this;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m150709c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f129013b);
        jSONObject.put("size", this.f129016e);
        jSONObject.put(Constants.f57189TS, this.f129014c);
        jSONObject.put("wt", this.f129012a);
        jSONObject.put("expt", this.f129015d);
        return jSONObject;
    }

    public lnq0() {
        this(0, 0L, 0L, null);
    }
}
