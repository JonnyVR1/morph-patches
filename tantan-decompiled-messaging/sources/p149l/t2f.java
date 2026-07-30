package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t2f extends siq0 {

    /* JADX INFO: renamed from: h */
    public String f167465h;

    /* JADX INFO: renamed from: i */
    public int f167466i;

    /* JADX INFO: renamed from: j */
    public long f167467j;

    /* JADX INFO: renamed from: k */
    public String f167468k;

    @Override // p149l.siq0
    /* JADX INFO: renamed from: c */
    public JSONObject mo102163c() {
        try {
            JSONObject jSONObjectMo102163c = super.mo102163c();
            if (jSONObjectMo102163c == null) {
                return null;
            }
            jSONObjectMo102163c.put("eventId", this.f167465h);
            jSONObjectMo102163c.put("eventType", this.f167466i);
            jSONObjectMo102163c.put("eventTime", this.f167467j);
            String str = this.f167468k;
            if (str == null) {
                str = "";
            }
            jSONObjectMo102163c.put("eventContent", str);
            return jSONObjectMo102163c;
        } catch (JSONException e) {
            ilq0.m137044q(e);
            return null;
        }
    }

    @Override // p149l.siq0
    /* JADX INFO: renamed from: d */
    public String mo102164d() {
        return super.mo102164d();
    }
}
