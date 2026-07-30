package immomo.com.mklibrary.core.base.p115ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.util.Map;
import p149l.onw;
import p149l.qnw;

/* JADX INFO: loaded from: classes2.dex */
public class BaseWebView extends WebView {
    public BaseWebView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86993a(String str) {
        if (str == null || !str.startsWith("file://")) {
            return true;
        }
        qnw.m175704a("momo-web").m128649e("loadFile").m128650f(str).m128645a(new onw("from_asset", Boolean.valueOf(str.startsWith("file:///android_asset/")))).m128647c();
        return true;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (m86993a(str)) {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (m86993a(str)) {
            super.postUrl(str, bArr);
        }
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (m86993a(str)) {
            super.loadUrl(str, map);
        }
    }
}
