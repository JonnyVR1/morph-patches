package com.hellogroup.p036mk.business.base.p037ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BaseWebView extends WebView {
    public BaseWebView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j */
    public boolean m17808j(String str) {
        if (str == null || !str.startsWith("file://")) {
            return true;
        }
        MKCoreLogManager.m18427e().m18450m(str, Boolean.valueOf(str.startsWith("file:///android_asset/")));
        return true;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (m17808j(str)) {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (m17808j(str)) {
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
        if (m17808j(str)) {
            super.loadUrl(str, map);
        }
    }
}
