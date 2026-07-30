package p153l;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public final class mgw0 extends WebViewClient {
    final String zza = "OMID NativeBridge WebViewClient";
    final /* synthetic */ ogw0 zzb;

    public mgw0(ogw0 ogw0Var) {
        this.zzb = ogw0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        if (this.zzb.m149764a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        this.zzb.m149773j(null);
        webView.destroy();
        return true;
    }
}
