package com.tencent.open.p111c;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.open.log.SLog;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.open.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14532b extends WebView {
    public C14532b(Context context) {
        super(context);
        m85473a();
    }

    /* JADX INFO: renamed from: a */
    public void m85473a() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        SLog.m85492i("openSDK_LOG.OpenWebView", "removeJSInterface");
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            getSettings().setBuiltInZoomControls(true);
            getSettings().setDisplayZoomControls(false);
            setVisibility(8);
            SLog.m85492i("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls");
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls", e);
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
                SLog.m85492i("openSDK_LOG.OpenWebView", "remove js interface");
            }
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.OpenWebView", "remove js interface.e:" + e.toString());
        }
    }
}
