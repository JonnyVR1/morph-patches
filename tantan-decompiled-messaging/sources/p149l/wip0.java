package p149l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
public class wip0 implements WebResourceRequest {

    /* JADX INFO: renamed from: a */
    public WebResourceRequest f186561a;

    public wip0(WebResourceRequest webResourceRequest) {
        this.f186561a = webResourceRequest;
    }

    @Override // android.webkit.WebResourceRequest
    public String getMethod() {
        return this.f186561a.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public Map<String, String> getRequestHeaders() {
        return this.f186561a.getRequestHeaders();
    }

    @Override // android.webkit.WebResourceRequest
    public Uri getUrl() {
        return this.f186561a.getUrl();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.f186561a.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.f186561a.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        return this.f186561a.isRedirect();
    }
}
