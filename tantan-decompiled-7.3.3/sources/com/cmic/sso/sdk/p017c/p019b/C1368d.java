package com.cmic.sso.sdk.p017c.p019b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C1368d extends AbstractC1371g {

    /* JADX INFO: renamed from: a */
    private final String f5650a;

    /* JADX INFO: renamed from: b */
    private final String f5651b;

    /* JADX INFO: renamed from: c */
    private final String f5652c;

    /* JADX INFO: renamed from: d */
    private String f5653d = "authz";

    /* JADX INFO: renamed from: e */
    private String f5654e;

    public C1368d(String str, String str2, String str3) {
        this.f5650a = str;
        this.f5651b = str2;
        this.f5652c = str3;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a */
    public String mo7156a() {
        return this.f5650a;
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
        try {
            jSONObject.put("ver", this.f5651b);
            jSONObject.put("data", this.f5652c);
            jSONObject.put("userCapaid", this.f5654e);
            jSONObject.put("funcType", this.f5653d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7188c(String str) {
        this.f5654e = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7187b(String str) {
        this.f5653d = str;
    }
}
