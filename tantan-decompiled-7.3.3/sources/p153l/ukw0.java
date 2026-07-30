package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes6.dex */
public class ukw0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f179462a;

    public ukw0() {
        this.f179462a = Looper.getMainLooper();
    }

    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo174324a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        mo174324a(message);
    }

    public ukw0(Looper looper) {
        super(looper);
        this.f179462a = Looper.getMainLooper();
    }
}
