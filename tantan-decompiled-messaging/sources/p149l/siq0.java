package p149l;

import com.vivo.push.PushClientConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class siq0 {

    /* JADX INFO: renamed from: a */
    public int f164730a;

    /* JADX INFO: renamed from: b */
    public String f164731b;

    /* JADX INFO: renamed from: c */
    public int f164732c;

    /* JADX INFO: renamed from: d */
    private String f164733d = fmq0.m122191a();

    /* JADX INFO: renamed from: e */
    private String f164734e = fvq0.m123350d();

    /* JADX INFO: renamed from: f */
    private String f164735f;

    /* JADX INFO: renamed from: g */
    private String f164736g;

    /* JADX INFO: renamed from: a */
    public void m184352a(String str) {
        this.f164735f = str;
    }

    /* JADX INFO: renamed from: b */
    public void m184353b(String str) {
        this.f164736g = str;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject mo102163c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.f164730a);
            jSONObject.put("reportType", this.f164732c);
            jSONObject.put("clientInterfaceId", this.f164731b);
            jSONObject.put("os", this.f164733d);
            jSONObject.put("miuiVersion", this.f164734e);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.f164735f);
            jSONObject.put("sdkVersion", this.f164736g);
            return jSONObject;
        } catch (JSONException e) {
            ilq0.m137044q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String mo102164d() {
        JSONObject jSONObjectMo102163c = mo102163c();
        return jSONObjectMo102163c == null ? "" : jSONObjectMo102163c.toString();
    }
}
