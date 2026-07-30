package com.heytap.mcssdk.p034a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3457c implements InterfaceC3458d {
    /* JADX INFO: renamed from: a */
    public static List<Message> m17462a(Context context, Intent intent) {
        int i;
        Message messageMo17460a;
        if (intent == null) {
            return null;
        }
        try {
            i = Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra("type")));
        } catch (Exception e) {
            LogUtil.m17468e("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
            i = 4096;
        }
        LogUtil.m17465d("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3458d interfaceC3458d : PushManager.getInstance().getParsers()) {
            if (interfaceC3458d != null && (messageMo17460a = interfaceC3458d.mo17460a(context, i, intent)) != null) {
                arrayList.add(messageMo17460a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public abstract Message mo17461a(Intent intent);
}
