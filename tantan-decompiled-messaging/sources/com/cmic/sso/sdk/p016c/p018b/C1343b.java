package com.cmic.sso.sdk.p016c.p018b;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1343b extends AbstractC1348g {

    /* JADX INFO: renamed from: a */
    private String f5605a;

    /* JADX INFO: renamed from: b */
    private String f5606b;

    /* JADX INFO: renamed from: c */
    private String f5607c;

    /* JADX INFO: renamed from: d */
    private String f5608d;

    /* JADX INFO: renamed from: e */
    private String f5609e;

    /* JADX INFO: renamed from: f */
    private String f5610f;

    /* JADX INFO: renamed from: g */
    private String f5611g;

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return this.f5610f;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a_ */
    public String mo7124a_(String str) {
        return this.f5605a + this.f5609e + this.f5610f + "iYm0HAnkxQtpvN44";
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7125b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.f5605a);
            jSONObject.put("apptype", this.f5606b);
            jSONObject.put("phone_ID", this.f5607c);
            jSONObject.put("certflag", this.f5608d);
            jSONObject.put("sdkversion", this.f5609e);
            jSONObject.put("appid", this.f5610f);
            jSONObject.put("expandparams", "");
            jSONObject.put("sign", this.f5611g);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7127c(String str) {
        this.f5606b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m7128d(String str) {
        this.f5607c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m7129e(String str) {
        this.f5608d = str;
    }

    /* JADX INFO: renamed from: f */
    public void m7130f(String str) {
        this.f5609e = str;
    }

    /* JADX INFO: renamed from: g */
    public void m7131g(String str) {
        this.f5610f = str;
    }

    /* JADX INFO: renamed from: h */
    public void m7132h(String str) {
        this.f5611g = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7126b(String str) {
        this.f5605a = str;
    }
}
