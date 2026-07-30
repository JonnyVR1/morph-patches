package p153l;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public final class ekt0 extends dkt0 {
    public ekt0(wit0 wit0Var, fcs0 fcs0Var, boolean z, @Nullable qbv0 qbv0Var) {
        super(wit0Var, fcs0Var, z, qbv0Var);
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
