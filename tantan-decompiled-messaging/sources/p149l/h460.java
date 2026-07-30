package p149l;

import android.text.TextUtils;
import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h460 {

    /* JADX INFO: renamed from: a */
    private String f105804a;

    /* JADX INFO: renamed from: b */
    private long f105805b;

    /* JADX INFO: renamed from: c */
    private long f105806c;

    /* JADX INFO: renamed from: d */
    private int f105807d;

    /* JADX INFO: renamed from: e */
    private String f105808e;

    /* JADX INFO: renamed from: f */
    private String f105809f = "";

    /* JADX INFO: renamed from: g */
    private String f105810g;

    /* JADX INFO: renamed from: h */
    private String f105811h;

    /* JADX INFO: renamed from: a */
    public static h460 m129220a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        h460 h460Var = new h460();
        h460Var.f105804a = jSONObject.getString("id");
        h460Var.m129230k(jSONObject.getLong(WBConstants.AUTH_PARAMS_VERSION));
        h460Var.f105807d = jSONObject.getInt("frequency");
        h460Var.m129229j(jSONObject.getLong("expired"));
        h460Var.m129231l(jSONObject.optString("versionStr", ""));
        h460Var.f105808e = jSONObject.optString("url");
        h460Var.f105811h = jSONObject.optString("multi");
        h460Var.f105809f = jSONObject.optString("offlineType", "");
        return h460Var;
    }

    /* JADX INFO: renamed from: b */
    public long m129221b() {
        return this.f105807d;
    }

    /* JADX INFO: renamed from: c */
    public long m129222c() {
        return this.f105806c;
    }

    /* JADX INFO: renamed from: d */
    public String m129223d() {
        return this.f105811h;
    }

    /* JADX INFO: renamed from: e */
    public String m129224e() {
        return this.f105809f;
    }

    /* JADX INFO: renamed from: f */
    public String m129225f() {
        return this.f105808e;
    }

    /* JADX INFO: renamed from: g */
    public long m129226g() {
        return this.f105805b;
    }

    /* JADX INFO: renamed from: h */
    public String m129227h() {
        return this.f105810g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m129228i() {
        return TextUtils.equals("sandbox", this.f105809f);
    }

    /* JADX INFO: renamed from: j */
    public void m129229j(long j) {
        this.f105806c = j;
    }

    /* JADX INFO: renamed from: k */
    public void m129230k(long j) {
        this.f105805b = j;
    }

    /* JADX INFO: renamed from: l */
    public void m129231l(String str) {
        this.f105810g = str;
    }

    public String toString() {
        return "bid=" + this.f105804a + " frequency=" + this.f105807d;
    }
}
