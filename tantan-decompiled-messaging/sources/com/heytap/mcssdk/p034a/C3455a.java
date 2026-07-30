package com.heytap.mcssdk.p034a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C3455a extends AbstractC3457c {
    @Override // com.heytap.mcssdk.p034a.AbstractC3457c
    /* JADX INFO: renamed from: a */
    public final Message mo17461a(Intent intent) {
        try {
            AppMessage appMessage = new AppMessage();
            appMessage.setMessageID(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(Message.MESSAGE_ID))));
            appMessage.setTaskID(CryptoUtil.desDecrypt(intent.getStringExtra(Message.TASK_ID)));
            appMessage.setAppPackage(CryptoUtil.desDecrypt(intent.getStringExtra(Message.APP_PACKAGE)));
            appMessage.setContent(CryptoUtil.desDecrypt(intent.getStringExtra("content")));
            appMessage.setBalanceTime(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(Message.BALANCE_TIME))));
            appMessage.setStartDate(Long.parseLong(CryptoUtil.desDecrypt(intent.getStringExtra(Message.START_DATE))));
            appMessage.setEndDate(Long.parseLong(CryptoUtil.desDecrypt(intent.getStringExtra(Message.END_DATE))));
            appMessage.setTimeRanges(CryptoUtil.desDecrypt(intent.getStringExtra(Message.TIME_RANGES)));
            appMessage.setTitle(CryptoUtil.desDecrypt(intent.getStringExtra("title")));
            appMessage.setRule(CryptoUtil.desDecrypt(intent.getStringExtra(Message.RULE)));
            appMessage.setForcedDelivery(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(Message.FORCED_DELIVERY))));
            appMessage.setDistinctBycontent(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(Message.DISTINCT_CONTENT))));
            LogUtil.m17465d("OnHandleIntent-message:" + appMessage.toString());
            return appMessage;
        } catch (Exception e) {
            LogUtil.m17465d("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.p034a.InterfaceC3458d
    /* JADX INFO: renamed from: a */
    public final Message mo17460a(Context context, int i, Intent intent) {
        if (4098 != i) {
            return null;
        }
        Message messageMo17461a = mo17461a(intent);
        PushManager.statisticMessage(context, (AppMessage) messageMo17461a, PushManager.EVENT_ID_PUSH_TRANSMIT);
        return messageMo17461a;
    }
}
