package p151v;

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
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
public class VWebView extends WebView {
    public VWebView(Context context) {
        super(context);
        mo30694a();
    }

    /* JADX INFO: renamed from: a */
    public void mo30694a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m224559b(List<String> list) {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("setSafeBrowsingWhitelist", List.class, ValueCallback.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, list, null);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    @SuppressLint({"WebViewApiAvailability"})
    /* JADX INFO: renamed from: c */
    public final void m224560c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            getSettings().setSafeBrowsingEnabled(false);
            return;
        }
        if (i >= 27) {
            ArrayList arrayListM147507f0 = jyb.m147507f0("static.tancdn.com");
            try {
                WebView.setSafeBrowsingWhitelist(arrayListM147507f0, null);
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
                m224559b(arrayListM147507f0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m224561d() {
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
        m224560c();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        m224562e();
        super.destroy();
    }

    /* JADX INFO: renamed from: e */
    public void m224562e() {
    }

    public VWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo30694a();
    }

    public VWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo30694a();
    }
}
