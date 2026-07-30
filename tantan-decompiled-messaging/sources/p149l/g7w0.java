package p149l;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public final class g7w0 extends WebViewClient {
    final String zza = "OMID NativeBridge WebViewClient";
    final /* synthetic */ i7w0 zzb;

    public g7w0(i7w0 i7w0Var) {
        this.zzb = i7w0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        if (this.zzb.m115216a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        this.zzb.m115225j(null);
        webView.destroy();
        return true;
    }
}
