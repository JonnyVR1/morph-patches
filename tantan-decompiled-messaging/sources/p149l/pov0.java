package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class pov0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f150563a;

    public pov0() {
        this.f150563a = Looper.getMainLooper();
    }

    public pov0(Looper looper) {
        super(looper);
        this.f150563a = Looper.getMainLooper();
    }

    public pov0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f150563a = Looper.getMainLooper();
    }
}
