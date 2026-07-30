package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.n */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC14620n extends Handler {
    public HandlerC14620n(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof AbstractRunnableC14616l) {
            AbstractRunnableC14616l abstractRunnableC14616l = (AbstractRunnableC14616l) obj;
            C14647p.m85019c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(abstractRunnableC14616l)));
            abstractRunnableC14616l.run();
        }
    }
}
