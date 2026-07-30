package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class d0h0 {

    /* JADX INFO: renamed from: a */
    public final oyg0 f84561a;

    /* JADX INFO: renamed from: b */
    public final Handler f84562b;

    public d0h0() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f84562b = handler;
        this.f84561a = new oyg0(handler);
    }
}
