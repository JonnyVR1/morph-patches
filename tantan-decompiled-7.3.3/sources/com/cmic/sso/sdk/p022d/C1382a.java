package com.cmic.sso.sdk.p022d;

import android.text.TextUtils;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p017c.p019b.AbstractC1371g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1382a extends AbstractC1371g {

    /* JADX INFO: renamed from: A */
    private String f5702A;

    /* JADX INFO: renamed from: B */
    private String f5703B;

    /* JADX INFO: renamed from: o */
    private JSONArray f5718o;

    /* JADX INFO: renamed from: y */
    private String f5728y;

    /* JADX INFO: renamed from: z */
    private String f5729z;

    /* JADX INFO: renamed from: b */
    private String f5705b = null;

    /* JADX INFO: renamed from: c */
    private String f5706c = null;

    /* JADX INFO: renamed from: d */
    private String f5707d = null;

    /* JADX INFO: renamed from: e */
    private String f5708e = null;

    /* JADX INFO: renamed from: f */
    private String f5709f = null;

    /* JADX INFO: renamed from: g */
    private String f5710g = null;

    /* JADX INFO: renamed from: h */
    private String f5711h = null;

    /* JADX INFO: renamed from: i */
    private String f5712i = null;

    /* JADX INFO: renamed from: j */
    private String f5713j = null;

    /* JADX INFO: renamed from: k */
    private String f5714k = "";

    /* JADX INFO: renamed from: l */
    private String f5715l = null;

    /* JADX INFO: renamed from: m */
    private String f5716m = null;

    /* JADX INFO: renamed from: n */
    private String f5717n = null;

    /* JADX INFO: renamed from: p */
    private String f5719p = null;

    /* JADX INFO: renamed from: q */
    private String f5720q = null;

    /* JADX INFO: renamed from: r */
    private String f5721r = null;

    /* JADX INFO: renamed from: s */
    private String f5722s = null;

    /* JADX INFO: renamed from: t */
    private String f5723t = null;

    /* JADX INFO: renamed from: u */
    private String f5724u = null;

    /* JADX INFO: renamed from: v */
    private String f5725v = null;

    /* JADX INFO: renamed from: w */
    private String f5726w = null;

    /* JADX INFO: renamed from: x */
    private String f5727x = null;

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<Throwable> f5704a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: A */
    public void m7243A(String str) {
        this.f5702A = str;
    }

    /* JADX INFO: renamed from: B */
    public void m7244B(String str) {
        this.f5703B = str;
    }

    /* JADX INFO: renamed from: a */
    public void m7245a(JSONArray jSONArray) {
        this.f5718o = jSONArray;
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
            jSONObject.put("appid", this.f5705b);
            jSONObject.put("traceId", this.f5706c);
            jSONObject.put("appName", this.f5707d);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, this.f5708e);
            jSONObject.put("sdkVersion", AuthnHelper.SDK_VERSION);
            jSONObject.put("clientType", "android");
            jSONObject.put("timeOut", this.f5709f);
            jSONObject.put("requestTime", this.f5710g);
            jSONObject.put("responseTime", this.f5711h);
            jSONObject.put("elapsedTime", this.f5712i);
            jSONObject.put("requestType", this.f5713j);
            jSONObject.put("interfaceType", this.f5714k);
            jSONObject.put("interfaceCode", this.f5715l);
            jSONObject.put("interfaceElasped", this.f5716m);
            jSONObject.put("loginType", this.f5717n);
            jSONObject.put("exceptionStackTrace", this.f5718o);
            jSONObject.put("operatorType", this.f5719p);
            jSONObject.put("networkOperator", this.f5720q);
            jSONObject.put("networkType", this.f5721r);
            jSONObject.put("brand", this.f5722s);
            jSONObject.put("reqDevice", this.f5723t);
            jSONObject.put("reqSystem", this.f5724u);
            jSONObject.put("simCardNum", this.f5725v);
            jSONObject.put("imsiState", this.f5726w);
            jSONObject.put("resultCode", this.f5727x);
            jSONObject.put("AID", this.f5728y);
            jSONObject.put("sysOperType", this.f5729z);
            jSONObject.put("scripType", this.f5702A);
            if (TextUtils.isEmpty(this.f5703B)) {
                return jSONObject;
            }
            jSONObject.put("networkTypeByAPI", this.f5703B);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7247c(String str) {
        this.f5726w = str;
    }

    /* JADX INFO: renamed from: d */
    public void m7248d(String str) {
        this.f5727x = str;
    }

    /* JADX INFO: renamed from: e */
    public void m7249e(String str) {
        this.f5722s = str;
    }

    /* JADX INFO: renamed from: f */
    public void m7250f(String str) {
        this.f5716m = str;
    }

    /* JADX INFO: renamed from: g */
    public void m7251g(String str) {
        this.f5715l = str;
    }

    /* JADX INFO: renamed from: h */
    public void m7252h(String str) {
        this.f5714k = str;
    }

    /* JADX INFO: renamed from: i */
    public void m7253i(String str) {
        this.f5707d = str;
    }

    /* JADX INFO: renamed from: j */
    public void m7254j(String str) {
        this.f5708e = str;
    }

    /* JADX INFO: renamed from: k */
    public void m7255k(String str) {
        this.f5709f = str;
    }

    /* JADX INFO: renamed from: l */
    public void m7256l(String str) {
        this.f5712i = str;
    }

    /* JADX INFO: renamed from: m */
    public void m7257m(String str) {
        this.f5725v = str;
    }

    /* JADX INFO: renamed from: n */
    public void m7258n(String str) {
        this.f5719p = str;
    }

    /* JADX INFO: renamed from: o */
    public void m7259o(String str) {
        this.f5720q = str;
    }

    /* JADX INFO: renamed from: p */
    public void m7260p(String str) {
        this.f5723t = str;
    }

    /* JADX INFO: renamed from: q */
    public void m7261q(String str) {
        this.f5724u = str;
    }

    /* JADX INFO: renamed from: r */
    public void m7262r(String str) {
        this.f5717n = str;
    }

    /* JADX INFO: renamed from: s */
    public void m7263s(String str) {
        this.f5706c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m7264t(String str) {
        this.f5710g = str;
    }

    /* JADX INFO: renamed from: u */
    public void m7265u(String str) {
        this.f5711h = str;
    }

    /* JADX INFO: renamed from: w */
    public void m7266w(String str) {
        this.f5713j = str;
    }

    /* JADX INFO: renamed from: x */
    public void m7267x(String str) {
        this.f5721r = str;
    }

    /* JADX INFO: renamed from: y */
    public void m7268y(String str) {
        this.f5728y = str;
    }

    /* JADX INFO: renamed from: z */
    public void m7269z(String str) {
        this.f5729z = str;
    }

    @Override // com.cmic.sso.sdk.p017c.p019b.AbstractC1371g
    /* JADX INFO: renamed from: a */
    public String mo7156a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m7246b(String str) {
        this.f5705b = str;
    }
}
