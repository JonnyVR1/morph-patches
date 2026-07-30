package p149l;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class w6w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebView f185000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f185001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x6w0 f185002c;

    public w6w0(x6w0 x6w0Var, WebView webView, String str) {
        this.f185000a = webView;
        this.f185001b = str;
        this.f185002c = x6w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x6w0.m207212i(this.f185000a, this.f185001b);
    }
}
