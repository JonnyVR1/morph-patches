package com.cmic.sso.sdk.p016c.p018b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C1349h extends AbstractC1342a {

    /* JADX INFO: renamed from: y */
    protected String f5632y = "";

    /* JADX INFO: renamed from: z */
    protected String f5633z = "";

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1342a
    /* JADX INFO: renamed from: a */
    public void mo7103a(String str) {
        this.f5602v = m7122t(str);
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a_ */
    public String mo7124a_(String str) {
        return this.f5582b + this.f5583c + this.f5584d + this.f5585e + this.f5586f + this.f5587g + this.f5588h + this.f5589i + this.f5590j + this.f5593m + this.f5594n + str + this.f5595o + this.f5597q + this.f5598r + this.f5599s + this.f5600t + this.f5601u + this.f5602v + this.f5632y + this.f5633z + this.f5603w + this.f5604x;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7125b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", this.f5581a);
            jSONObject.put("sdkver", this.f5582b);
            jSONObject.put("appid", this.f5583c);
            jSONObject.put("imsi", this.f5584d);
            jSONObject.put("operatortype", this.f5585e);
            jSONObject.put("networktype", this.f5586f);
            jSONObject.put("mobilebrand", this.f5587g);
            jSONObject.put("mobilemodel", this.f5588h);
            jSONObject.put("mobilesystem", this.f5589i);
            jSONObject.put("clienttype", this.f5590j);
            jSONObject.put("interfacever", this.f5591k);
            jSONObject.put("expandparams", this.f5592l);
            jSONObject.put("msgid", this.f5593m);
            jSONObject.put("timestamp", this.f5594n);
            jSONObject.put("subimsi", this.f5595o);
            jSONObject.put("sign", this.f5596p);
            jSONObject.put("apppackage", this.f5597q);
            jSONObject.put("appsign", this.f5598r);
            jSONObject.put("ipv4_list", this.f5599s);
            jSONObject.put("ipv6_list", this.f5600t);
            jSONObject.put("sdkType", this.f5601u);
            jSONObject.put("tempPDR", this.f5602v);
            jSONObject.put("scrip", this.f5632y);
            jSONObject.put("userCapaid", this.f5633z);
            jSONObject.put("funcType", this.f5603w);
            jSONObject.put("socketip", this.f5604x);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.f5581a + "&" + this.f5582b + "&" + this.f5583c + "&" + this.f5584d + "&" + this.f5585e + "&" + this.f5586f + "&" + this.f5587g + "&" + this.f5588h + "&" + this.f5589i + "&" + this.f5590j + "&" + this.f5591k + "&" + this.f5592l + "&" + this.f5593m + "&" + this.f5594n + "&" + this.f5595o + "&" + this.f5596p + "&" + this.f5597q + "&" + this.f5598r + "&&" + this.f5599s + "&" + this.f5600t + "&" + this.f5601u + "&" + this.f5602v + "&" + this.f5632y + "&" + this.f5633z + "&" + this.f5603w + "&" + this.f5604x;
    }

    /* JADX INFO: renamed from: w */
    public void m7157w(String str) {
        this.f5632y = m7122t(str);
    }

    /* JADX INFO: renamed from: x */
    public void m7158x(String str) {
        this.f5633z = m7122t(str);
    }
}
