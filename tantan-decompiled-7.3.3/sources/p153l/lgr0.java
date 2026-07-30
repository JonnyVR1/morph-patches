package p153l;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class lgr0 extends vxv0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vnd0 f132002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgr0(vnd0 vnd0Var, Looper looper) {
        super(looper);
        this.f132002b = vnd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        vnd0.m201983g(this.f132002b, message);
    }
}
