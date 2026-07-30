package p153l;

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

/* JADX INFO: loaded from: classes10.dex */
public class cop0 {

    /* JADX INFO: renamed from: c */
    public static cop0 f82904c;

    /* JADX INFO: renamed from: a */
    public ValueCallback<Uri> f82905a;

    /* JADX INFO: renamed from: b */
    public ValueCallback<Uri[]> f82906b;

    /* JADX INFO: renamed from: a */
    public static synchronized cop0 m111675a() {
        try {
            if (f82904c == null) {
                f82904c = new cop0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f82904c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m111676b(WebView webView, WebChromeClient.FileChooserParams fileChooserParams, String str) {
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
                CrashHelper.m82479c(e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m111677c(int i, int i2, Intent intent) {
        if (i != 17) {
            return false;
        }
        if (this.f82905a == null && this.f82906b == null) {
            return true;
        }
        Uri data = (intent == null || i2 != -1) ? null : intent.getData();
        Uri[] uriArr = data == null ? null : new Uri[]{data};
        ValueCallback<Uri[]> valueCallback = this.f82906b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            m111681g(null);
        } else {
            this.f82905a.onReceiveValue(data);
            m111682h(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m111678d(Activity activity) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            activity.startActivityForResult(intent, 17);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: e */
    public boolean m111679e(WebView webView, ValueCallback<Uri[]> valueCallback, Activity activity, WebChromeClient.FileChooserParams fileChooserParams) {
        webView.getUrl();
        if (!m111676b(webView, fileChooserParams, null)) {
            return false;
        }
        m111681g(valueCallback);
        m111678d(activity);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m111680f(WebView webView, Context context) {
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
    public void m111681g(ValueCallback<Uri[]> valueCallback) {
        this.f82906b = valueCallback;
    }

    /* JADX INFO: renamed from: h */
    public void m111682h(ValueCallback<Uri> valueCallback) {
        this.f82905a = valueCallback;
    }
}
