package com.heytap.mcssdk;

import android.content.Context;
import com.heytap.mcssdk.callback.PushCallback;
import java.util.List;

/* JADX INFO: renamed from: com.heytap.mcssdk.b */
/* JADX INFO: loaded from: classes7.dex */
interface InterfaceC3619b extends InterfaceC3624c {
    @Deprecated
    void clearNotificationType();

    void clearNotifications();

    void getAliases();

    void getNotificationStatus();

    void getRegister();

    String getRegisterID();

    void getTags();

    @Deprecated
    void getUserAccounts();

    void openNotificationSettings();

    void pausePush();

    void register(Context context, String str, String str2, PushCallback pushCallback);

    void requestNotificationPermission();

    void resumePush();

    void setAliases(List<String> list);

    @Deprecated
    void setNotificationType(int i);

    void setPushTime(List<Integer> list, int i, int i2, int i3, int i4);

    void setRegisterID(String str);

    void setTags(List<String> list);

    @Deprecated
    void setUserAccount(String str);

    @Deprecated
    void setUserAccounts(List<String> list);

    void unRegister();

    void unsetAlias(String str);

    @Deprecated
    void unsetAliases(List<String> list);

    void unsetTags(List<String> list);

    @Deprecated
    void unsetUserAccounts(List<String> list);
}
