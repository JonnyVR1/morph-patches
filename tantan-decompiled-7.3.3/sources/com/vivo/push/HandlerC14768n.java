package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.n */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC14768n extends Handler {
    public HandlerC14768n(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof AbstractRunnableC14764l) {
            AbstractRunnableC14764l abstractRunnableC14764l = (AbstractRunnableC14764l) obj;
            C14795p.m86190c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(abstractRunnableC14764l)));
            abstractRunnableC14764l.run();
        }
    }
}
