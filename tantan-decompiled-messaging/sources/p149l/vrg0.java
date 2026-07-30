package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class vrg0 {

    /* JADX INFO: renamed from: a */
    public final gqg0 f182721a;

    /* JADX INFO: renamed from: b */
    public final Handler f182722b;

    public vrg0() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f182722b = handler;
        this.f182721a = new gqg0(handler);
    }
}
