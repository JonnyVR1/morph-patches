package com.heytap.mcssdk.p042b;

import android.content.Context;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.mode.SptDataMessage;

/* JADX INFO: renamed from: com.heytap.mcssdk.b.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C3623d implements InterfaceC3622c {
    @Override // com.heytap.mcssdk.p042b.InterfaceC3622c
    /* JADX INFO: renamed from: a */
    public final void mo18540a(Context context, Message message, MessageCallback messageCallback) {
        if (message != null && message.getType() == 4103) {
            SptDataMessage sptDataMessage = (SptDataMessage) message;
            if (messageCallback != null) {
                messageCallback.processMessage(context, sptDataMessage);
            }
        }
    }
}
