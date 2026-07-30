package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class gr60 extends xrq0 {

    /* JADX INFO: renamed from: h */
    public int f106008h;

    /* JADX INFO: renamed from: i */
    public long f106009i = -1;

    /* JADX INFO: renamed from: j */
    public long f106010j = -1;

    /* JADX INFO: renamed from: e */
    public static gr60 m131532e() {
        return new gr60();
    }

    @Override // p153l.xrq0
    /* JADX INFO: renamed from: c */
    public JSONObject mo131533c() {
        try {
            JSONObject jSONObjectMo131533c = super.mo131533c();
            if (jSONObjectMo131533c == null) {
                return null;
            }
            jSONObjectMo131533c.put("code", this.f106008h);
            jSONObjectMo131533c.put("perfCounts", this.f106009i);
            jSONObjectMo131533c.put("perfLatencies", this.f106010j);
            return jSONObjectMo131533c;
        } catch (JSONException e) {
            ouq0.m169397q(e);
            return null;
        }
    }

    @Override // p153l.xrq0
    /* JADX INFO: renamed from: d */
    public String mo131534d() {
        return super.mo131534d();
    }
}
