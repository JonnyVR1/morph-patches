package p147v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class VWebView extends WebView {
    public VWebView(Context context) {
        super(context);
        mo29696a();
    }

    /* JADX INFO: renamed from: a */
    public void mo29696a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m223313b(List<String> list) {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("setSafeBrowsingWhitelist", List.class, ValueCallback.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, list, null);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    @SuppressLint({"WebViewApiAvailability"})
    /* JADX INFO: renamed from: c */
    public final void m223314c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            getSettings().setSafeBrowsingEnabled(false);
            return;
        }
        if (i >= 27) {
            ArrayList arrayListM200324f0 = vwb.m200324f0("static.tancdn.com");
            try {
                WebView.setSafeBrowsingWhitelist(arrayListM200324f0, null);
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
                m223313b(arrayListM200324f0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m223315d() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setLoadWithOverviewMode(false);
        settings.setAllowFileAccess(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        setHorizontalScrollBarEnabled(false);
        settings.setUserAgentString("tantan-android");
        settings.setMixedContentMode(0);
        setLayerType(2, null);
        m223314c();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        m223316e();
        super.destroy();
    }

    /* JADX INFO: renamed from: e */
    public void m223316e() {
    }

    public VWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29696a();
    }

    public VWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29696a();
    }
}
