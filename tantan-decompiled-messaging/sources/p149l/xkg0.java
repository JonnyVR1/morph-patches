package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class xkg0 extends Handler {
    public xkg0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
