package p149l;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class bbw0 implements iiv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Message f74885a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public ybw0 f74886b;

    public /* synthetic */ bbw0(baw0 baw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final bbw0 m101035a(Message message, ybw0 ybw0Var) {
        this.f74885a = message;
        this.f74886b = ybw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m101036b(Handler handler) {
        Message message = this.f74885a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m101037c();
        return zSendMessageAtFrontOfQueue;
    }

    /* JADX INFO: renamed from: c */
    public final void m101037c() {
        this.f74885a = null;
        this.f74886b = null;
        ybw0.m213980a(this);
    }

    @Override // p149l.iiv0
    public final void zza() {
        Message message = this.f74885a;
        message.getClass();
        message.sendToTarget();
        m101037c();
    }

    public bbw0() {
    }
}
