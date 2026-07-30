package p153l;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class cgw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebView f81743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f81744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dgw0 f81745c;

    public cgw0(dgw0 dgw0Var, WebView webView, String str) {
        this.f81743a = webView;
        this.f81744b = str;
        this.f81745c = dgw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgw0.m115759i(this.f81743a, this.f81744b);
    }
}
