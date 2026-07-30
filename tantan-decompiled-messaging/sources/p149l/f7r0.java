package p149l;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class f7r0 extends pov0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sfd0 f96280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7r0(sfd0 sfd0Var, Looper looper) {
        super(looper);
        this.f96280b = sfd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sfd0.m183911g(this.f96280b, message);
    }
}
