package com.cmic.sso.sdk.p016c.p018b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C1345d extends AbstractC1348g {

    /* JADX INFO: renamed from: a */
    private final String f5613a;

    /* JADX INFO: renamed from: b */
    private final String f5614b;

    /* JADX INFO: renamed from: c */
    private final String f5615c;

    /* JADX INFO: renamed from: d */
    private String f5616d = "authz";

    /* JADX INFO: renamed from: e */
    private String f5617e;

    public C1345d(String str, String str2, String str3) {
        this.f5613a = str;
        this.f5614b = str2;
        this.f5615c = str3;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return this.f5613a;
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
        try {
            jSONObject.put("ver", this.f5614b);
            jSONObject.put("data", this.f5615c);
            jSONObject.put("userCapaid", this.f5617e);
            jSONObject.put("funcType", this.f5616d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7134c(String str) {
        this.f5617e = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7133b(String str) {
        this.f5616d = str;
    }
}
