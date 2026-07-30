package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class fmy0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hmy0 f98390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmy0(hmy0 hmy0Var, Looper looper) {
        super(looper);
        this.f98390a = hmy0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        hmy0.m131802d(this.f98390a, message);
    }
}
