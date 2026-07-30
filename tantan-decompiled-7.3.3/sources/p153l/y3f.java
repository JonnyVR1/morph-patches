package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y3f extends xrq0 {

    /* JADX INFO: renamed from: h */
    public String f197356h;

    /* JADX INFO: renamed from: i */
    public int f197357i;

    /* JADX INFO: renamed from: j */
    public long f197358j;

    /* JADX INFO: renamed from: k */
    public String f197359k;

    @Override // p153l.xrq0
    /* JADX INFO: renamed from: c */
    public JSONObject mo131533c() {
        try {
            JSONObject jSONObjectMo131533c = super.mo131533c();
            if (jSONObjectMo131533c == null) {
                return null;
            }
            jSONObjectMo131533c.put("eventId", this.f197356h);
            jSONObjectMo131533c.put("eventType", this.f197357i);
            jSONObjectMo131533c.put("eventTime", this.f197358j);
            String str = this.f197359k;
            if (str == null) {
                str = "";
            }
            jSONObjectMo131533c.put("eventContent", str);
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
