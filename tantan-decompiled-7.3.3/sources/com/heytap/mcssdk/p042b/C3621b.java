package com.heytap.mcssdk.p042b;

import android.content.Context;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;

/* JADX INFO: renamed from: com.heytap.mcssdk.b.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3621b implements InterfaceC3622c {
    @Override // com.heytap.mcssdk.p042b.InterfaceC3622c
    /* JADX INFO: renamed from: a */
    public final void mo18540a(Context context, Message message, MessageCallback messageCallback) {
        if (message != null && message.getType() == 4105) {
            CommandMessage commandMessage = (CommandMessage) message;
            if (messageCallback != null) {
                messageCallback.processMessage(context, commandMessage);
            }
        }
    }
}
