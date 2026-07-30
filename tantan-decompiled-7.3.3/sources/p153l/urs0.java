package p153l;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.consent_sdk.zzbr;

/* JADX INFO: loaded from: classes6.dex */
public final class urs0 extends WebViewClient {
    final /* synthetic */ zzbr zza;

    public /* synthetic */ urs0(zzbr zzbrVar, dts0 dts0Var) {
        this.zza = zzbrVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzbr.m13815f(this.zza, str)) {
            this.zza.f10276b.m218377d(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.zza.f10277c) {
            return;
        }
        this.zza.f10277c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zza.f10276b.m218378e(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (!zzbr.m13815f(this.zza, string)) {
            return false;
        }
        this.zza.f10276b.m218377d(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzbr.m13815f(this.zza, str)) {
            return false;
        }
        this.zza.f10276b.m218377d(str);
        return true;
    }
}
