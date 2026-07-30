package com.tencent.open.p106c;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.open.log.SLog;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.open.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14369b extends WebView {
    public C14369b(Context context) {
        super(context);
        m84290a();
    }

    /* JADX INFO: renamed from: a */
    public void m84290a() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        SLog.m84309i("openSDK_LOG.OpenWebView", "removeJSInterface");
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            getSettings().setBuiltInZoomControls(true);
            getSettings().setDisplayZoomControls(false);
            setVisibility(8);
            SLog.m84309i("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls");
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls", e);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebSettings settings = getSettings();
        if (settings == null) {
            return;
        }
        settings.setSavePassword(false);
        try {
            Method method = settings.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this, "searchBoxJavaBridge_");
                method.invoke(this, "accessibility");
                method.invoke(this, "accessibilityTraversal");
                SLog.m84309i("openSDK_LOG.OpenWebView", "remove js interface");
            }
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.OpenWebView", "remove js interface.e:" + e.toString());
        }
    }
}
