package p153l;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hkw0 implements orv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Message f110460a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public elw0 f110461b;

    public /* synthetic */ hkw0(hjw0 hjw0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final hkw0 m135650a(Message message, elw0 elw0Var) {
        this.f110460a = message;
        this.f110461b = elw0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m135651b(Handler handler) {
        Message message = this.f110460a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m135652c();
        return zSendMessageAtFrontOfQueue;
    }

    /* JADX INFO: renamed from: c */
    public final void m135652c() {
        this.f110460a = null;
        this.f110461b = null;
        elw0.m121296a(this);
    }

    @Override // p153l.orv0
    public final void zza() {
        Message message = this.f110460a;
        message.getClass();
        message.sendToTarget();
        m135652c();
    }

    public hkw0() {
    }
}
