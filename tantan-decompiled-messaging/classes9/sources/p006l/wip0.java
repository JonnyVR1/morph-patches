package p006l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@SuppressLint({"NewApi"})
public class wip0 implements WebResourceRequest {

    /* JADX INFO: renamed from: a */
    public WebResourceRequest f25173a;

    public wip0(WebResourceRequest webResourceRequest) {
        this.f25173a = webResourceRequest;
    }

    @Override // android.webkit.WebResourceRequest
    public String getMethod() {
        return this.f25173a.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public Map<String, String> getRequestHeaders() {
        return this.f25173a.getRequestHeaders();
    }

    @Override // android.webkit.WebResourceRequest
    public Uri getUrl() {
        return this.f25173a.getUrl();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.f25173a.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.f25173a.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        return this.f25173a.isRedirect();
    }
}
