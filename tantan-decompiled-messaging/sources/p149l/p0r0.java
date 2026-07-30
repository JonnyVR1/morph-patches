package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class p0r0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f146617a;

    public p0r0() {
        this.f146617a = Looper.getMainLooper();
    }

    public p0r0(Looper looper) {
        super(looper);
        this.f146617a = Looper.getMainLooper();
    }
}
