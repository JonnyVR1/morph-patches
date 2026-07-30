package com.heytap.mcssdk.p035b;

import android.content.Context;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.mode.SptDataMessage;

/* JADX INFO: renamed from: com.heytap.mcssdk.b.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C3464d implements InterfaceC3463c {
    @Override // com.heytap.mcssdk.p035b.InterfaceC3463c
    /* JADX INFO: renamed from: a */
    public final void mo17463a(Context context, Message message, MessageCallback messageCallback) {
        if (message != null && message.getType() == 4103) {
            SptDataMessage sptDataMessage = (SptDataMessage) message;
            if (messageCallback != null) {
                messageCallback.processMessage(context, sptDataMessage);
            }
        }
    }
}
