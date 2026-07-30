package com.cmic.sso.sdk.p017c.p019b;

import android.util.Base64;
import com.cmic.sso.sdk.p023e.C1384a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C1369e extends AbstractC1371g {

    /* JADX INFO: renamed from: a */
    private AbstractC1365a f5655a;

    /* JADX INFO: renamed from: b */
    private byte[] f5656b;

    /* JADX INFO: renamed from: c */
    private String f5657c;

    /* JADX INFO: renamed from: d */
    private byte[] f5658d;

    /* JADX INFO: renamed from: e */
    private String f5659e;

    /* JADX INFO: renamed from: f */
    private boolean f5660f = false;

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a */
    public String mo7156a() {
        return this.f5655a.mo7156a();
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
        if (this.f5660f) {
            try {
                jSONObject.put("encrypted", this.f5657c);
                jSONObject.put("encryptedIV", Base64.encodeToString(this.f5658d, 0));
                jSONObject.put("reqdata", C1384a.m7275a(this.f5656b, this.f5655a.toString(), this.f5658d));
                jSONObject.put("securityreinforce", this.f5659e);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public void m7195c(String str) {
        this.f5657c = str;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1365a m7194c() {
        return this.f5655a;
    }

    /* JADX INFO: renamed from: a */
    public void m7191a(byte[] bArr) {
        this.f5656b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m7189a(AbstractC1365a abstractC1365a) {
        this.f5655a = abstractC1365a;
    }

    /* JADX INFO: renamed from: a */
    public void m7190a(boolean z) {
        this.f5660f = z;
    }

    /* JADX INFO: renamed from: b */
    public void m7193b(byte[] bArr) {
        this.f5658d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public void m7192b(String str) {
        this.f5659e = str;
    }
}
