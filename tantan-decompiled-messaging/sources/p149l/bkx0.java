package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class bkx0 extends Handler {
    private final Looper zza;

    public bkx0() {
        this.zza = Looper.getMainLooper();
    }

    public bkx0(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public bkx0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
