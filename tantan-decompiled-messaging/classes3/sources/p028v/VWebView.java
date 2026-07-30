package p028v;

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
import l.aih0;
import l.bih0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VWebView extends WebView {
    public VWebView(Context context) {
        super(context);
        m11804a();
    }

    /* JADX INFO: renamed from: a */
    public void m11804a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m11805b(List<String> list) {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("setSafeBrowsingWhitelist", List.class, ValueCallback.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, list, null);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    @SuppressLint({"WebViewApiAvailability"})
    /* JADX INFO: renamed from: c */
    public final void m11806c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            aih0.a(getSettings(), false);
            return;
        }
        if (i >= 27) {
            ArrayList arrayListF0 = vwb.f0(new String[]{"static.tancdn.com"});
            try {
                bih0.a(arrayListF0, (ValueCallback) null);
            } catch (Throwable th) {
                CrashHelper.c(th);
                m11805b(arrayListF0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11807d() {
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
        m11806c();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        m11808e();
        super.destroy();
    }

    /* JADX INFO: renamed from: e */
    public void m11808e() {
    }

    public VWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11804a();
    }

    public VWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11804a();
    }
}
