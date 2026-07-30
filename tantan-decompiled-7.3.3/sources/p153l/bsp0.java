package p153l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
public class bsp0 implements WebResourceRequest {

    /* JADX INFO: renamed from: a */
    public WebResourceRequest f78184a;

    public bsp0(WebResourceRequest webResourceRequest) {
        this.f78184a = webResourceRequest;
    }

    @Override // android.webkit.WebResourceRequest
    public String getMethod() {
        return this.f78184a.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public Map<String, String> getRequestHeaders() {
        return this.f78184a.getRequestHeaders();
    }

    @Override // android.webkit.WebResourceRequest
    public Uri getUrl() {
        return this.f78184a.getUrl();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.f78184a.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.f78184a.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        return this.f78184a.isRedirect();
    }
}
