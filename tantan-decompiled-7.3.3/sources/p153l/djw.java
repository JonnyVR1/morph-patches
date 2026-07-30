package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class djw extends pxl {

    /* JADX INFO: renamed from: c */
    protected String f88945c;

    /* JADX INFO: renamed from: d */
    private String f88946d;

    /* JADX INFO: renamed from: e */
    private String f88947e;

    /* JADX INFO: renamed from: f */
    protected JSONObject f88948f;

    /* JADX INFO: renamed from: g */
    protected long f88949g = -1;

    /* JADX INFO: renamed from: h */
    protected long f88950h = -1;

    /* JADX INFO: renamed from: i */
    protected boolean f88951i = true;

    public djw() {
        String strM206538b = wi20.m206538b();
        m116160j(TextUtils.isEmpty(strM206538b) ? "none" : strM206538b);
        jzv.m147728a("TEST", "tang-----网络状况 " + this.f88947e);
    }

    @Override // p153l.pxl
    /* JADX INFO: renamed from: a */
    public boolean mo116154a() {
        return (TextUtils.isEmpty(this.f88945c) || m116156f() || !this.f88951i) ? false : true;
    }

    @Override // p153l.pxl
    /* JADX INFO: renamed from: d */
    public JSONObject mo116155d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "com.immomo.momo.momokit");
            jSONObject.put("type", "cli");
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, this.f154580b);
            jSONObject.put("url", this.f88946d);
            jSONObject.put("net", this.f88947e);
            jSONObject.put("bid", this.f88945c);
            mo105271e();
            jSONObject.put("data", this.f88948f);
            return jSONObject;
        } catch (Exception e) {
            Log.e("MKBaseLog", "", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m116156f() {
        return this.f88949g > 0 && this.f88950h < 0;
    }

    /* JADX INFO: renamed from: g */
    public void m116157g() {
        if (this.f88951i) {
            this.f88950h = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m116158h(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (this.f88948f == null) {
                this.f88948f = new JSONObject();
            }
            try {
                this.f88948f.put(str, obj);
                return true;
            } catch (JSONException e) {
                Log.e("MKBaseLog", "", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m116159i(String str) {
        this.f88945c = str;
    }

    /* JADX INFO: renamed from: j */
    public void m116160j(String str) {
        this.f88947e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m116161k(String str) {
        this.f88946d = str;
    }

    /* JADX INFO: renamed from: e */
    public void mo105271e() {
    }
}
