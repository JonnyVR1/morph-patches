package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import p149l.mqq0;

/* JADX INFO: renamed from: com.xiaomi.push.ed */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14732ed {
    COMMAND_REGISTER("register"),
    COMMAND_UNREGISTER(MiPushClient.COMMAND_UNREGISTER),
    COMMAND_SET_ALIAS(MiPushClient.COMMAND_SET_ALIAS),
    COMMAND_UNSET_ALIAS(MiPushClient.COMMAND_UNSET_ALIAS),
    COMMAND_SET_ACCOUNT(MiPushClient.COMMAND_SET_ACCOUNT),
    COMMAND_UNSET_ACCOUNT(MiPushClient.COMMAND_UNSET_ACCOUNT),
    COMMAND_SUBSCRIBE_TOPIC(MiPushClient.COMMAND_SUBSCRIBE_TOPIC),
    COMMAND_UNSUBSCRIBE_TOPIC(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC),
    COMMAND_SET_ACCEPT_TIME(MiPushClient.COMMAND_SET_ACCEPT_TIME),
    COMMAND_CHK_VDEVID("check-vdeviceid");


    /* JADX INFO: renamed from: a */
    public final String f61667a;

    EnumC14732ed(String str) {
        this.f61667a = str;
    }

    /* JADX INFO: renamed from: a */
    public static int m85526a(String str) {
        int iM155979b = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (EnumC14732ed enumC14732ed : values()) {
            if (enumC14732ed.f61667a.equals(str)) {
                iM155979b = mqq0.m155979b(enumC14732ed);
            }
        }
        return iM155979b;
    }
}
