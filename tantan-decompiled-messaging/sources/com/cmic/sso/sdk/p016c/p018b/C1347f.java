package com.cmic.sso.sdk.p016c.p018b;

import com.sina.weibo.sdk.constant.WBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C1347f extends AbstractC1348g {

    /* JADX INFO: renamed from: a */
    private b f5624a;

    /* JADX INFO: renamed from: b */
    private a f5625b;

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return this.f5624a.f5630d;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a_ */
    public String mo7124a_(String str) {
        return null;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7125b() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("sign", this.f5624a.m7150d());
            jSONObject2.put("msgid", this.f5624a.m7152e());
            jSONObject2.put("systemtime", this.f5624a.m7154f());
            jSONObject2.put("appid", this.f5624a.mo7102a());
            jSONObject2.put(WBConstants.AUTH_PARAMS_VERSION, this.f5624a.m7148c());
            jSONObject.put("header", jSONObject2);
            jSONObject3.put("log", this.f5625b.m7144a());
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
        private JSONObject f5626a;

        /* JADX INFO: renamed from: a */
        public JSONObject m7144a() {
            return this.f5626a;
        }

        /* JADX INFO: renamed from: a */
        public void m7145a(JSONObject jSONObject) {
            this.f5626a = jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.f$b */
    public static class b extends AbstractC1348g {

        /* JADX INFO: renamed from: a */
        private String f5627a;

        /* JADX INFO: renamed from: b */
        private String f5628b;

        /* JADX INFO: renamed from: c */
        private String f5629c;

        /* JADX INFO: renamed from: d */
        private String f5630d;

        /* JADX INFO: renamed from: e */
        private String f5631e;

        @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
        /* JADX INFO: renamed from: a_ */
        public String mo7124a_(String str) {
            return this.f5631e + this.f5630d + this.f5629c + this.f5628b + "@Fdiwmxy7CBDDQNUI";
        }

        /* JADX INFO: renamed from: b */
        public void m7147b(String str) {
            this.f5631e = str;
        }

        /* JADX INFO: renamed from: c */
        public String m7148c() {
            return this.f5631e;
        }

        /* JADX INFO: renamed from: d */
        public String m7150d() {
            return this.f5627a;
        }

        /* JADX INFO: renamed from: e */
        public String m7152e() {
            return this.f5628b;
        }

        /* JADX INFO: renamed from: f */
        public String m7154f() {
            return this.f5629c;
        }

        @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
        /* JADX INFO: renamed from: a */
        public String mo7102a() {
            return this.f5630d;
        }

        @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
        /* JADX INFO: renamed from: b */
        public JSONObject mo7125b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public void m7149c(String str) {
            this.f5630d = str;
        }

        /* JADX INFO: renamed from: d */
        public void m7151d(String str) {
            this.f5627a = str;
        }

        /* JADX INFO: renamed from: e */
        public void m7153e(String str) {
            this.f5628b = str;
        }

        /* JADX INFO: renamed from: f */
        public void m7155f(String str) {
            this.f5629c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7142a(a aVar) {
        this.f5625b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m7143a(b bVar) {
        this.f5624a = bVar;
    }
}
