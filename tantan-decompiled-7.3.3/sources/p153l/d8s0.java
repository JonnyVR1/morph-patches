package p153l;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class d8s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ValueCallback f85681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v7s0 f85682b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WebView f85683c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f85684d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ f8s0 f85685e;

    public d8s0(f8s0 f8s0Var, final v7s0 v7s0Var, final WebView webView, final boolean z) {
        this.f85682b = v7s0Var;
        this.f85683c = webView;
        this.f85684d = z;
        this.f85685e = f8s0Var;
        this.f85681a = new ValueCallback() { // from class: l.c8s0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f80238a.f85685e.m124557d(v7s0Var, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f85683c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f85683c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f85681a);
            } catch (Throwable unused) {
                this.f85681a.onReceiveValue("");
            }
        }
    }
}
