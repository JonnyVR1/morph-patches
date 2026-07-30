package com.cmic.sso.sdk.p021d;

import android.text.TextUtils;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p016c.p018b.AbstractC1348g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1359a extends AbstractC1348g {

    /* JADX INFO: renamed from: A */
    private String f5665A;

    /* JADX INFO: renamed from: B */
    private String f5666B;

    /* JADX INFO: renamed from: o */
    private JSONArray f5681o;

    /* JADX INFO: renamed from: y */
    private String f5691y;

    /* JADX INFO: renamed from: z */
    private String f5692z;

    /* JADX INFO: renamed from: b */
    private String f5668b = null;

    /* JADX INFO: renamed from: c */
    private String f5669c = null;

    /* JADX INFO: renamed from: d */
    private String f5670d = null;

    /* JADX INFO: renamed from: e */
    private String f5671e = null;

    /* JADX INFO: renamed from: f */
    private String f5672f = null;

    /* JADX INFO: renamed from: g */
    private String f5673g = null;

    /* JADX INFO: renamed from: h */
    private String f5674h = null;

    /* JADX INFO: renamed from: i */
    private String f5675i = null;

    /* JADX INFO: renamed from: j */
    private String f5676j = null;

    /* JADX INFO: renamed from: k */
    private String f5677k = "";

    /* JADX INFO: renamed from: l */
    private String f5678l = null;

    /* JADX INFO: renamed from: m */
    private String f5679m = null;

    /* JADX INFO: renamed from: n */
    private String f5680n = null;

    /* JADX INFO: renamed from: p */
    private String f5682p = null;

    /* JADX INFO: renamed from: q */
    private String f5683q = null;

    /* JADX INFO: renamed from: r */
    private String f5684r = null;

    /* JADX INFO: renamed from: s */
    private String f5685s = null;

    /* JADX INFO: renamed from: t */
    private String f5686t = null;

    /* JADX INFO: renamed from: u */
    private String f5687u = null;

    /* JADX INFO: renamed from: v */
    private String f5688v = null;

    /* JADX INFO: renamed from: w */
    private String f5689w = null;

    /* JADX INFO: renamed from: x */
    private String f5690x = null;

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<Throwable> f5667a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: A */
    public void m7189A(String str) {
        this.f5665A = str;
    }

    /* JADX INFO: renamed from: B */
    public void m7190B(String str) {
        this.f5666B = str;
    }

    /* JADX INFO: renamed from: a */
    public void m7191a(JSONArray jSONArray) {
        this.f5681o = jSONArray;
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
            jSONObject.put("appid", this.f5668b);
            jSONObject.put("traceId", this.f5669c);
            jSONObject.put("appName", this.f5670d);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.f5671e);
            jSONObject.put("sdkVersion", AuthnHelper.SDK_VERSION);
            jSONObject.put("clientType", "android");
            jSONObject.put("timeOut", this.f5672f);
            jSONObject.put("requestTime", this.f5673g);
            jSONObject.put("responseTime", this.f5674h);
            jSONObject.put("elapsedTime", this.f5675i);
            jSONObject.put("requestType", this.f5676j);
            jSONObject.put("interfaceType", this.f5677k);
            jSONObject.put("interfaceCode", this.f5678l);
            jSONObject.put("interfaceElasped", this.f5679m);
            jSONObject.put("loginType", this.f5680n);
            jSONObject.put("exceptionStackTrace", this.f5681o);
            jSONObject.put("operatorType", this.f5682p);
            jSONObject.put("networkOperator", this.f5683q);
            jSONObject.put("networkType", this.f5684r);
            jSONObject.put("brand", this.f5685s);
            jSONObject.put("reqDevice", this.f5686t);
            jSONObject.put("reqSystem", this.f5687u);
            jSONObject.put("simCardNum", this.f5688v);
            jSONObject.put("imsiState", this.f5689w);
            jSONObject.put("resultCode", this.f5690x);
            jSONObject.put("AID", this.f5691y);
            jSONObject.put("sysOperType", this.f5692z);
            jSONObject.put("scripType", this.f5665A);
            if (TextUtils.isEmpty(this.f5666B)) {
                return jSONObject;
            }
            jSONObject.put("networkTypeByAPI", this.f5666B);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7193c(String str) {
        this.f5689w = str;
    }

    /* JADX INFO: renamed from: d */
    public void m7194d(String str) {
        this.f5690x = str;
    }

    /* JADX INFO: renamed from: e */
    public void m7195e(String str) {
        this.f5685s = str;
    }

    /* JADX INFO: renamed from: f */
    public void m7196f(String str) {
        this.f5679m = str;
    }

    /* JADX INFO: renamed from: g */
    public void m7197g(String str) {
        this.f5678l = str;
    }

    /* JADX INFO: renamed from: h */
    public void m7198h(String str) {
        this.f5677k = str;
    }

    /* JADX INFO: renamed from: i */
    public void m7199i(String str) {
        this.f5670d = str;
    }

    /* JADX INFO: renamed from: j */
    public void m7200j(String str) {
        this.f5671e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m7201k(String str) {
        this.f5672f = str;
    }

    /* JADX INFO: renamed from: l */
    public void m7202l(String str) {
        this.f5675i = str;
    }

    /* JADX INFO: renamed from: m */
    public void m7203m(String str) {
        this.f5688v = str;
    }

    /* JADX INFO: renamed from: n */
    public void m7204n(String str) {
        this.f5682p = str;
    }

    /* JADX INFO: renamed from: o */
    public void m7205o(String str) {
        this.f5683q = str;
    }

    /* JADX INFO: renamed from: p */
    public void m7206p(String str) {
        this.f5686t = str;
    }

    /* JADX INFO: renamed from: q */
    public void m7207q(String str) {
        this.f5687u = str;
    }

    /* JADX INFO: renamed from: r */
    public void m7208r(String str) {
        this.f5680n = str;
    }

    /* JADX INFO: renamed from: s */
    public void m7209s(String str) {
        this.f5669c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m7210t(String str) {
        this.f5673g = str;
    }

    /* JADX INFO: renamed from: u */
    public void m7211u(String str) {
        this.f5674h = str;
    }

    /* JADX INFO: renamed from: w */
    public void m7212w(String str) {
        this.f5676j = str;
    }

    /* JADX INFO: renamed from: x */
    public void m7213x(String str) {
        this.f5684r = str;
    }

    /* JADX INFO: renamed from: y */
    public void m7214y(String str) {
        this.f5691y = str;
    }

    /* JADX INFO: renamed from: z */
    public void m7215z(String str) {
        this.f5692z = str;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m7192b(String str) {
        this.f5668b = str;
    }
}
