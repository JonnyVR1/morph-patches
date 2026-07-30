package p149l;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class h7w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WebView f106354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i7w0 f106355b;

    public h7w0(i7w0 i7w0Var) {
        this.f106355b = i7w0Var;
        this.f106354a = i7w0Var.f111955d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106354a.destroy();
    }
}
