package com.cmic.sso.sdk.p017c.p019b;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C1370f extends AbstractC1371g {

    /* JADX INFO: renamed from: a */
    private b f5661a;

    /* JADX INFO: renamed from: b */
    private a f5662b;

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a */
    public String mo7156a() {
        return this.f5661a.f5667d;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a_ */
    public String mo7178a_(String str) {
        return null;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7179b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("sign", this.f5661a.m7204d());
            jSONObject2.put("msgid", this.f5661a.m7206e());
            jSONObject2.put("systemtime", this.f5661a.m7208f());
            jSONObject2.put("appid", this.f5661a.mo7156a());
            jSONObject2.put(WBConstants.AUTH_PARAMS_VERSION, this.f5661a.m7202c());
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", this.f5662b.m7198a());
            jSONObject.put("body", jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private JSONObject f5663a;

        /* JADX INFO: renamed from: a */
        public JSONObject m7198a() {
            return this.f5663a;
        }

        /* JADX INFO: renamed from: a */
        public void m7199a(JSONObject jSONObject) {
            this.f5663a = jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.f$b */
    public static class b extends AbstractC1371g {

        /* JADX INFO: renamed from: a */
        private String f5664a;

        /* JADX INFO: renamed from: b */
        private String f5665b;

        /* JADX INFO: renamed from: c */
        private String f5666c;

        /* JADX INFO: renamed from: d */
        private String f5667d;

        /* JADX INFO: renamed from: e */
        private String f5668e;

        @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
        /* JADX INFO: renamed from: a_ */
        public String mo7178a_(String str) {
            return this.f5668e + this.f5667d + this.f5666c + this.f5665b + "@Fdiwmxy7CBDDQNUI";
        }

        /* JADX INFO: renamed from: b */
        public void m7201b(String str) {
            this.f5668e = str;
        }

        /* JADX INFO: renamed from: c */
        public String m7202c() {
            return this.f5668e;
        }

        /* JADX INFO: renamed from: d */
        public String m7204d() {
            return this.f5664a;
        }

        /* JADX INFO: renamed from: e */
        public String m7206e() {
            return this.f5665b;
        }

        /* JADX INFO: renamed from: f */
        public String m7208f() {
            return this.f5666c;
        }

        @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
        /* JADX INFO: renamed from: a */
        public String mo7156a() {
            return this.f5667d;
        }

        @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
        /* JADX INFO: renamed from: b */
        public JSONObject mo7179b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public void m7203c(String str) {
            this.f5667d = str;
        }

        /* JADX INFO: renamed from: d */
        public void m7205d(String str) {
            this.f5664a = str;
        }

        /* JADX INFO: renamed from: e */
        public void m7207e(String str) {
            this.f5665b = str;
        }

        /* JADX INFO: renamed from: f */
        public void m7209f(String str) {
            this.f5666c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7196a(a aVar) {
        this.f5662b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m7197a(b bVar) {
        this.f5661a = bVar;
    }
}
