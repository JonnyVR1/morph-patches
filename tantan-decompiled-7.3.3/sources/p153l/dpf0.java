package p153l;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public class dpf0 extends ilw {

    /* JADX INFO: renamed from: b */
    protected static final String f90048b = "dpf0";

    /* JADX INFO: renamed from: a */
    private nxl f90049a;

    public dpf0(nxl nxlVar) {
        this.f90049a = nxlVar;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: a */
    public boolean mo17977a(ConsoleMessage consoleMessage) {
        return false;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: b */
    public boolean mo18180b(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: c */
    public boolean mo18181c(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: d */
    public boolean mo18182d(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: e */
    public void mo17978e(WebView webView, int i, String str, String str2) {
        jzv.m147728a(f90048b, "tang------页面加载错误 " + str2 + "   " + i);
        nxl nxlVar = this.f90049a;
        if (nxlVar != null) {
            nxlVar.mo17962c(webView, i, str, str2);
        }
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: f */
    public void mo17979f(WebView webView, String str) {
        nxl nxlVar = this.f90049a;
        if (nxlVar != null) {
            nxlVar.mo17961b(webView, str);
        }
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: g */
    public void mo17980g(WebView webView, String str, Bitmap bitmap) {
        nxl nxlVar = this.f90049a;
        if (nxlVar != null) {
            nxlVar.mo17960a(webView, str, bitmap);
        }
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: k */
    public void mo17981k(WebView webView, String str) {
        jzv.m147728a(f90048b, "tang-----onReceiveTitle " + str + "  " + webView.getUrl());
        nxl nxlVar = this.f90049a;
        if (nxlVar != null) {
            nxlVar.mo17969n(webView, str);
        }
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: n */
    public WebResourceResponse mo18132n(WebView webView, String str) {
        return null;
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: h */
    public void mo18130h(WebView webView, int i) {
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: i */
    public void mo18183i(WebView webView, Bitmap bitmap) {
    }
}
