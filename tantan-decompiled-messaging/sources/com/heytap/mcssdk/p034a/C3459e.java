package com.heytap.mcssdk.p034a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.mode.SptDataMessage;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3459e extends AbstractC3457c {
    @Override // com.heytap.mcssdk.p034a.AbstractC3457c
    /* JADX INFO: renamed from: a */
    public final Message mo17461a(Intent intent) {
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
            LogUtil.m17465d("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.p034a.InterfaceC3458d
    /* JADX INFO: renamed from: a */
    public final Message mo17460a(Context context, int i, Intent intent) {
        if (4103 != i) {
            return null;
        }
        Message messageMo17461a = mo17461a(intent);
        PushManager.statisticMessage(context, (SptDataMessage) messageMo17461a, PushManager.EVENT_ID_PUSH_TRANSMIT);
        return messageMo17461a;
    }
}
