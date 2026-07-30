package p153l;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class ngw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WebView f141865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ogw0 f141866b;

    public ngw0(ogw0 ogw0Var) {
        this.f141866b = ogw0Var;
        this.f141865a = ogw0Var.f147320d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f141865a.destroy();
    }
}
