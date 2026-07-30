package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bj60 extends siq0 {

    /* JADX INFO: renamed from: h */
    public int f75885h;

    /* JADX INFO: renamed from: i */
    public long f75886i = -1;

    /* JADX INFO: renamed from: j */
    public long f75887j = -1;

    /* JADX INFO: renamed from: e */
    public static bj60 m102162e() {
        return new bj60();
    }

    @Override // p149l.siq0
    /* JADX INFO: renamed from: c */
    public JSONObject mo102163c() {
        try {
            JSONObject jSONObjectMo102163c = super.mo102163c();
            if (jSONObjectMo102163c == null) {
                return null;
            }
            jSONObjectMo102163c.put("code", this.f75885h);
            jSONObjectMo102163c.put("perfCounts", this.f75886i);
            jSONObjectMo102163c.put("perfLatencies", this.f75887j);
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
