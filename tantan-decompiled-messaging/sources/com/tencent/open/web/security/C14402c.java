package com.tencent.open.web.security;

import android.webkit.WebView;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.C14358b;
import com.tencent.open.log.SLog;
import com.tencent.open.p106c.C14371d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.web.security.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14402c extends C14358b.a {

    /* JADX INFO: renamed from: d */
    private String f60366d;

    public C14402c(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.f60366d = str2;
    }

    /* JADX INFO: renamed from: b */
    private void m84524b(String str) {
        WebView webView = this.f60193a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            stringBuffer.append(this.f60366d);
            stringBuffer.append("){");
            stringBuffer.append(this.f60366d);
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String string = stringBuffer.toString();
            SLog.m84313v("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string);
            webView.loadUrl(string);
        }
    }

    @Override // com.tencent.open.C14358b.a
    /* JADX INFO: renamed from: a */
    public void mo84245a(String str) {
        SLog.m84313v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LovePlanetStage.result, !C14371d.f60238a ? -4 : 0);
            jSONObject.put("sn", this.f60194b);
            jSONObject.put("data", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m84524b(jSONObject.toString());
    }

    @Override // com.tencent.open.C14358b.a
    /* JADX INFO: renamed from: a */
    public void mo84243a() {
        SLog.m84305d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.C14358b.a
    /* JADX INFO: renamed from: a */
    public void mo84244a(Object obj) {
        SLog.m84313v("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }
}
