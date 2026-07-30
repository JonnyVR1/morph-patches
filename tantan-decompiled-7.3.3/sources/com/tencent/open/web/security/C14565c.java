package com.tencent.open.web.security;

import android.webkit.WebView;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.C14521b;
import com.tencent.open.log.SLog;
import com.tencent.open.p111c.C14534d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.web.security.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14565c extends C14521b.a {

    /* JADX INFO: renamed from: d */
    private String f61214d;

    public C14565c(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.f61214d = str2;
    }

    /* JADX INFO: renamed from: b */
    private void m85707b(String str) {
        WebView webView = this.f61041a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            stringBuffer.append(this.f61214d);
            stringBuffer.append("){");
            stringBuffer.append(this.f61214d);
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String string = stringBuffer.toString();
            SLog.m85496v("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string);
            webView.loadUrl(string);
        }
    }

    @Override // com.tencent.open.C14521b.a
    /* JADX INFO: renamed from: a */
    public void mo85428a(String str) {
        SLog.m85496v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LovePlanetStage.result, !C14534d.f61086a ? -4 : 0);
            jSONObject.put("sn", this.f61042b);
            jSONObject.put("data", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m85707b(jSONObject.toString());
    }

    @Override // com.tencent.open.C14521b.a
    /* JADX INFO: renamed from: a */
    public void mo85426a() {
        SLog.m85488d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.C14521b.a
    /* JADX INFO: renamed from: a */
    public void mo85427a(Object obj) {
        SLog.m85496v("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }
}
