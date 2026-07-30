package p149l;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public final class yat0 extends xat0 {
    public yat0(q9t0 q9t0Var, z2s0 z2s0Var, boolean z, @Nullable k2v0 k2v0Var) {
        super(q9t0Var, z2s0Var, z, k2v0Var);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzO(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
