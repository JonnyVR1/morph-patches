package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class lvy0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nvy0 f133765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvy0(nvy0 nvy0Var, Looper looper) {
        super(looper);
        this.f133765a = nvy0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nvy0.m164933d(this.f133765a, message);
    }
}
