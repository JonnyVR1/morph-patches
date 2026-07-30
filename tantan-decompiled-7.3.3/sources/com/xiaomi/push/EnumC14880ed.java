package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import p153l.szq0;

/* JADX INFO: renamed from: com.xiaomi.push.ed */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14880ed {
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
    public final String f62514a;

    EnumC14880ed(String str) {
        this.f62514a = str;
    }

    /* JADX INFO: renamed from: a */
    public static int m86697a(String str) {
        int iM188665b = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (EnumC14880ed enumC14880ed : values()) {
            if (enumC14880ed.f62514a.equals(str)) {
                iM188665b = szq0.m188665b(enumC14880ed);
            }
        }
        return iM188665b;
    }
}
