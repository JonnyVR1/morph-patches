package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class v9r0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f183030a;

    public v9r0() {
        this.f183030a = Looper.getMainLooper();
    }

    public v9r0(Looper looper) {
        super(looper);
        this.f183030a = Looper.getMainLooper();
    }
}
