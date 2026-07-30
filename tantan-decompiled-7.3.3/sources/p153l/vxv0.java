package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class vxv0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f186304a;

    public vxv0() {
        this.f186304a = Looper.getMainLooper();
    }

    public vxv0(Looper looper) {
        super(looper);
        this.f186304a = Looper.getMainLooper();
    }

    public vxv0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f186304a = Looper.getMainLooper();
    }
}
