package com.cmic.sso.sdk.p016c.p018b;

import android.util.Base64;
import com.cmic.sso.sdk.p022e.C1361a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C1346e extends AbstractC1348g {

    /* JADX INFO: renamed from: a */
    private AbstractC1342a f5618a;

    /* JADX INFO: renamed from: b */
    private byte[] f5619b;

    /* JADX INFO: renamed from: c */
    private String f5620c;

    /* JADX INFO: renamed from: d */
    private byte[] f5621d;

    /* JADX INFO: renamed from: e */
    private String f5622e;

    /* JADX INFO: renamed from: f */
    private boolean f5623f = false;

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return this.f5618a.mo7102a();
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
        if (this.f5623f) {
            try {
                jSONObject.put("encrypted", this.f5620c);
                jSONObject.put("encryptedIV", Base64.encodeToString(this.f5621d, 0));
                jSONObject.put("reqdata", C1361a.m7221a(this.f5619b, this.f5618a.toString(), this.f5621d));
                jSONObject.put("securityreinforce", this.f5622e);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public void m7141c(String str) {
        this.f5620c = str;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1342a m7140c() {
        return this.f5618a;
    }

    /* JADX INFO: renamed from: a */
    public void m7137a(byte[] bArr) {
        this.f5619b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m7135a(AbstractC1342a abstractC1342a) {
        this.f5618a = abstractC1342a;
    }

    /* JADX INFO: renamed from: a */
    public void m7136a(boolean z) {
        this.f5623f = z;
    }

    /* JADX INFO: renamed from: b */
    public void m7139b(byte[] bArr) {
        this.f5621d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public void m7138b(String str) {
        this.f5622e = str;
    }
}
