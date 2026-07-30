package com.heytap.mcssdk.p041a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.mode.SptDataMessage;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3618e extends AbstractC3616c {
    @Override // com.heytap.mcssdk.p041a.AbstractC3616c
    /* JADX INFO: renamed from: a */
    public final Message mo18538a(Intent intent) {
        try {
            SptDataMessage sptDataMessage = new SptDataMessage();
            sptDataMessage.setMessageID(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(Message.MESSAGE_ID))));
            sptDataMessage.setTaskID(CryptoUtil.desDecrypt(intent.getStringExtra(Message.TASK_ID)));
            sptDataMessage.setAppPackage(CryptoUtil.desDecrypt(intent.getStringExtra(Message.APP_PACKAGE)));
            sptDataMessage.setContent(CryptoUtil.desDecrypt(intent.getStringExtra("content")));
            sptDataMessage.setDescription(CryptoUtil.desDecrypt(intent.getStringExtra("description")));
            sptDataMessage.setAppID(CryptoUtil.desDecrypt(intent.getStringExtra(Message.APP_ID)));
            sptDataMessage.setGlobalID(CryptoUtil.desDecrypt(intent.getStringExtra(Message.GLOBAL_ID)));
            return sptDataMessage;
        } catch (Exception e) {
            LogUtil.m18542d("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.p041a.InterfaceC3617d
    /* JADX INFO: renamed from: a */
    public final Message mo18537a(Context context, int i, Intent intent) {
        if (4103 != i) {
            return null;
        }
        Message messageMo18538a = mo18538a(intent);
        PushManager.statisticMessage(context, (SptDataMessage) messageMo18538a, PushManager.EVENT_ID_PUSH_TRANSMIT);
        return messageMo18538a;
    }
}
