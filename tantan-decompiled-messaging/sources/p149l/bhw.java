package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.mmutil.log.Log4Android;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bhw extends xul {

    /* JADX INFO: renamed from: d */
    protected String f75675d;

    /* JADX INFO: renamed from: e */
    private String f75676e;

    /* JADX INFO: renamed from: f */
    private String f75677f;

    /* JADX INFO: renamed from: g */
    protected JSONObject f75678g;

    /* JADX INFO: renamed from: h */
    protected long f75679h = -1;

    /* JADX INFO: renamed from: i */
    protected long f75680i = -1;

    /* JADX INFO: renamed from: j */
    protected boolean f75681j = true;

    public bhw() {
        String strM158571b = na20.m158571b();
        m101943l(TextUtils.isEmpty(strM158571b) ? "none" : strM158571b);
        mxv.m156926a("TEST", "tang-----网络状况 " + this.f75677f);
    }

    @Override // p149l.xul
    /* JADX INFO: renamed from: a */
    public boolean mo101935a() {
        return (TextUtils.isEmpty(this.f75675d) || m101938g() || !this.f75681j) ? false : true;
    }

    @Override // p149l.xul
    /* JADX INFO: renamed from: e */
    public JSONObject mo101936e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "com.immomo.momo.momokit");
            jSONObject.put("type", "cli");
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, this.f194509c);
            jSONObject.put("url", this.f75676e);
            jSONObject.put("net", this.f75677f);
            jSONObject.put("bid", this.f75675d);
            mo101937f();
            jSONObject.put("data", this.f75678g);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m101938g() {
        return this.f75679h > 0 && this.f75680i < 0;
    }

    /* JADX INFO: renamed from: h */
    public void m101939h() {
        if (this.f75681j) {
            this.f75680i = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m101940i() {
        this.f75679h = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: j */
    public boolean m101941j(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (this.f75678g == null) {
                this.f75678g = new JSONObject();
            }
            try {
                this.f75678g.put(str, obj);
                return true;
            } catch (JSONException e) {
                Log4Android.m18417f().m18422e(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m101942k(String str) {
        this.f75675d = str;
    }

    /* JADX INFO: renamed from: l */
    public void m101943l(String str) {
        this.f75677f = str;
    }

    /* JADX INFO: renamed from: m */
    public void m101944m(String str) {
        this.f75676e = str;
    }

    /* JADX INFO: renamed from: f */
    public void mo101937f() {
    }
}
