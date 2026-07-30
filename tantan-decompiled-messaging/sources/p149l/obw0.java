package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes6.dex */
public class obw0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f142986a;

    public obw0() {
        this.f142986a = Looper.getMainLooper();
    }

    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo142760a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        mo142760a(message);
    }

    public obw0(Looper looper) {
        super(looper);
        this.f142986a = Looper.getMainLooper();
    }
}
