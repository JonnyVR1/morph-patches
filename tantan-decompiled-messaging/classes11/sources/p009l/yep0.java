package p009l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yep0 {

    /* JADX INFO: renamed from: c */
    public static yep0 f23022c;

    /* JADX INFO: renamed from: a */
    public ValueCallback<Uri> f23023a;

    /* JADX INFO: renamed from: b */
    public ValueCallback<Uri[]> f23024b;

    /* JADX INFO: renamed from: a */
    public static synchronized yep0 m25326a() {
        try {
            if (f23022c == null) {
                f23022c = new yep0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23022c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m25327b(WebView webView, WebChromeClient.FileChooserParams fileChooserParams, String str) {
        if ("video/kyc".equals(str)) {
            return true;
        }
        if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null && fileChooserParams.getAcceptTypes().length > 0 && "video/kyc".equals(fileChooserParams.getAcceptTypes()[0])) {
            return true;
        }
        if (webView != null && !TextUtils.isEmpty(webView.getUrl())) {
            try {
                String str2 = webView.getUrl().split("//")[1].split("\\.")[0];
                return str2.contains("kyc") || str2.contains("ida");
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m25328c(int i, int i2, Intent intent) {
        if (i != 17) {
            return false;
        }
        if (this.f23023a == null && this.f23024b == null) {
            return true;
        }
        Uri data = (intent == null || i2 != -1) ? null : intent.getData();
        Uri[] uriArr = data == null ? null : new Uri[]{data};
        ValueCallback<Uri[]> valueCallback = this.f23024b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            m25332g(null);
        } else {
            this.f23023a.onReceiveValue(data);
            m25333h(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m25329d(Activity activity) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            activity.startActivityForResult(intent, 17);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: e */
    public boolean m25330e(WebView webView, ValueCallback<Uri[]> valueCallback, Activity activity, WebChromeClient.FileChooserParams fileChooserParams) {
        webView.getUrl();
        if (!m25327b(webView, fileChooserParams, null)) {
            return false;
        }
        m25332g(valueCallback);
        m25329d(activity);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m25331f(WebView webView, Context context) {
        if (webView == null) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabasePath(context.getDir("databases", 0).getPath());
        settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        settings.setUserAgentString(settings.getUserAgentString() + ";kyc/h5face;kyc/2.0");
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* JADX INFO: renamed from: g */
    public void m25332g(ValueCallback<Uri[]> valueCallback) {
        this.f23024b = valueCallback;
    }

    /* JADX INFO: renamed from: h */
    public void m25333h(ValueCallback<Uri> valueCallback) {
        this.f23023a = valueCallback;
    }
}
