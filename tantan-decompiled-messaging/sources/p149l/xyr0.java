package p149l;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class xyr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ValueCallback f195130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pyr0 f195131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WebView f195132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f195133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zyr0 f195134e;

    public xyr0(zyr0 zyr0Var, final pyr0 pyr0Var, final WebView webView, final boolean z) {
        this.f195131b = pyr0Var;
        this.f195132c = webView;
        this.f195133d = z;
        this.f195134e = zyr0Var;
        this.f195130a = new ValueCallback() { // from class: l.wyr0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f188668a.f195134e.m220940d(pyr0Var, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f195132c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f195132c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f195130a);
            } catch (Throwable unused) {
                this.f195130a.onReceiveValue("");
            }
        }
    }
}
