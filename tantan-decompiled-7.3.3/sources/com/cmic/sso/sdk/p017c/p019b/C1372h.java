package com.cmic.sso.sdk.p017c.p019b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C1372h extends AbstractC1365a {

    /* JADX INFO: renamed from: y */
    protected String f5669y = "";

    /* JADX INFO: renamed from: z */
    protected String f5670z = "";

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1365a
    /* JADX INFO: renamed from: a */
    public void mo7157a(String str) {
        this.f5639v = m7176t(str);
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a_ */
    public String mo7178a_(String str) {
        return this.f5619b + this.f5620c + this.f5621d + this.f5622e + this.f5623f + this.f5624g + this.f5625h + this.f5626i + this.f5627j + this.f5630m + this.f5631n + str + this.f5632o + this.f5634q + this.f5635r + this.f5636s + this.f5637t + this.f5638u + this.f5639v + this.f5669y + this.f5670z + this.f5640w + this.f5641x;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: b */
    public JSONObject mo7179b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", this.f5618a);
            jSONObject.put("sdkver", this.f5619b);
            jSONObject.put("appid", this.f5620c);
            jSONObject.put("imsi", this.f5621d);
            jSONObject.put("operatortype", this.f5622e);
            jSONObject.put("networktype", this.f5623f);
            jSONObject.put("mobilebrand", this.f5624g);
            jSONObject.put("mobilemodel", this.f5625h);
            jSONObject.put("mobilesystem", this.f5626i);
            jSONObject.put("clienttype", this.f5627j);
            jSONObject.put("interfacever", this.f5628k);
            jSONObject.put("expandparams", this.f5629l);
            jSONObject.put("msgid", this.f5630m);
            jSONObject.put("timestamp", this.f5631n);
            jSONObject.put("subimsi", this.f5632o);
            jSONObject.put("sign", this.f5633p);
            jSONObject.put("apppackage", this.f5634q);
            jSONObject.put("appsign", this.f5635r);
            jSONObject.put("ipv4_list", this.f5636s);
            jSONObject.put("ipv6_list", this.f5637t);
            jSONObject.put("sdkType", this.f5638u);
            jSONObject.put("tempPDR", this.f5639v);
            jSONObject.put("scrip", this.f5669y);
            jSONObject.put("userCapaid", this.f5670z);
            jSONObject.put("funcType", this.f5640w);
            jSONObject.put("socketip", this.f5641x);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.f5618a + "&" + this.f5619b + "&" + this.f5620c + "&" + this.f5621d + "&" + this.f5622e + "&" + this.f5623f + "&" + this.f5624g + "&" + this.f5625h + "&" + this.f5626i + "&" + this.f5627j + "&" + this.f5628k + "&" + this.f5629l + "&" + this.f5630m + "&" + this.f5631n + "&" + this.f5632o + "&" + this.f5633p + "&" + this.f5634q + "&" + this.f5635r + "&&" + this.f5636s + "&" + this.f5637t + "&" + this.f5638u + "&" + this.f5639v + "&" + this.f5669y + "&" + this.f5670z + "&" + this.f5640w + "&" + this.f5641x;
    }

    /* JADX INFO: renamed from: w */
    public void m7211w(String str) {
        this.f5669y = m7176t(str);
    }

    /* JADX INFO: renamed from: x */
    public void m7212x(String str) {
        this.f5670z = m7176t(str);
    }
}
