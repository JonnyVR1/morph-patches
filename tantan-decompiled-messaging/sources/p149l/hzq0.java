package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class hzq0 extends Handler {
    private final Looper zaa;

    public hzq0() {
        this.zaa = Looper.getMainLooper();
    }

    public hzq0(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public hzq0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
