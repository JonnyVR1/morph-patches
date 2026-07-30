package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class htx0 extends Handler {
    private final Looper zza;

    public htx0() {
        this.zza = Looper.getMainLooper();
    }

    public htx0(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public htx0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
