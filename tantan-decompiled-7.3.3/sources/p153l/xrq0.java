package p153l;

import com.vivo.push.PushClientConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xrq0 {

    /* JADX INFO: renamed from: a */
    public int f195947a;

    /* JADX INFO: renamed from: b */
    public String f195948b;

    /* JADX INFO: renamed from: c */
    public int f195949c;

    /* JADX INFO: renamed from: d */
    private String f195950d = lvq0.m156000a();

    /* JADX INFO: renamed from: e */
    private String f195951e = l4r0.m152819d();

    /* JADX INFO: renamed from: f */
    private String f195952f;

    /* JADX INFO: renamed from: g */
    private String f195953g;

    /* JADX INFO: renamed from: a */
    public void m212849a(String str) {
        this.f195952f = str;
    }

    /* JADX INFO: renamed from: b */
    public void m212850b(String str) {
        this.f195953g = str;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject mo131533c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.f195947a);
            jSONObject.put("reportType", this.f195949c);
            jSONObject.put("clientInterfaceId", this.f195948b);
            jSONObject.put("os", this.f195950d);
            jSONObject.put("miuiVersion", this.f195951e);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.f195952f);
            jSONObject.put("sdkVersion", this.f195953g);
            return jSONObject;
        } catch (JSONException e) {
            ouq0.m169397q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String mo131534d() {
        JSONObject jSONObjectMo131533c = mo131533c();
        return jSONObjectMo131533c == null ? "" : jSONObjectMo131533c.toString();
    }
}
