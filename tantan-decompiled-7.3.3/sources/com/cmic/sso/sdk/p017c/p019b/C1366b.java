package com.cmic.sso.sdk.p017c.p019b;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C1366b extends AbstractC1371g {

    /* JADX INFO: renamed from: a */
    private String f5642a;

    /* JADX INFO: renamed from: b */
    private String f5643b;

    /* JADX INFO: renamed from: c */
    private String f5644c;

    /* JADX INFO: renamed from: d */
    private String f5645d;

    /* JADX INFO: renamed from: e */
    private String f5646e;

    /* JADX INFO: renamed from: f */
    private String f5647f;

    /* JADX INFO: renamed from: g */
    private String f5648g;

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a */
    public String mo7156a() {
        return this.f5647f;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a_ */
    public String mo7178a_(String str) {
        return this.f5642a + this.f5646e + this.f5647f + "iYm0HAnkxQtpvN44";
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7179b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.f5642a);
            jSONObject.put("apptype", this.f5643b);
            jSONObject.put("phone_ID", this.f5644c);
            jSONObject.put("certflag", this.f5645d);
            jSONObject.put("sdkversion", this.f5646e);
            jSONObject.put("appid", this.f5647f);
            jSONObject.put("expandparams", "");
            jSONObject.put("sign", this.f5648g);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7181c(String str) {
        this.f5643b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m7182d(String str) {
        this.f5644c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m7183e(String str) {
        this.f5645d = str;
    }

    /* JADX INFO: renamed from: f */
    public void m7184f(String str) {
        this.f5646e = str;
    }

    /* JADX INFO: renamed from: g */
    public void m7185g(String str) {
        this.f5647f = str;
    }

    /* JADX INFO: renamed from: h */
    public void m7186h(String str) {
        this.f5648g = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7180b(String str) {
        this.f5642a = str;
    }
}
