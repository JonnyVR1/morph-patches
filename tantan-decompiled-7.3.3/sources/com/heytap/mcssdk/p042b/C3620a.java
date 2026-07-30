package com.heytap.mcssdk.p042b;

import android.content.Context;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.Message;

/* JADX INFO: renamed from: com.heytap.mcssdk.b.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C3620a implements InterfaceC3622c {
    @Override // com.heytap.mcssdk.p042b.InterfaceC3622c
    /* JADX INFO: renamed from: a */
    public final void mo18540a(Context context, Message message, MessageCallback messageCallback) {
        if (message != null && message.getType() == 4098) {
            AppMessage appMessage = (AppMessage) message;
            if (messageCallback != null) {
                messageCallback.processMessage(context, appMessage);
            }
        }
    }
}
