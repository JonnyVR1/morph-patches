package com.heytap.mcssdk;

import android.content.Context;
import com.heytap.mcssdk.callback.PushCallback;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.heytap.mcssdk.c */
/* JADX INFO: loaded from: classes7.dex */
interface InterfaceC3465c {
    @Deprecated
    void clearNotificationType(JSONObject jSONObject);

    void clearNotifications(JSONObject jSONObject);

    void getAliases(JSONObject jSONObject);

    void getNotificationStatus(JSONObject jSONObject);

    void getRegister(JSONObject jSONObject);

    void getTags(JSONObject jSONObject);

    void getUserAccounts(JSONObject jSONObject);

    void openNotificationSettings(JSONObject jSONObject);

    void pausePush(JSONObject jSONObject);

    void register(Context context, String str, String str2, JSONObject jSONObject, PushCallback pushCallback);

    void resumePush(JSONObject jSONObject);

    void setAliases(List<String> list, JSONObject jSONObject);

    @Deprecated
    void setNotificationType(int i, JSONObject jSONObject);

    void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject);

    void setTags(List<String> list, JSONObject jSONObject);

    @Deprecated
    void setUserAccount(String str, JSONObject jSONObject);

    @Deprecated
    void setUserAccounts(List<String> list, JSONObject jSONObject);

    void unRegister(JSONObject jSONObject);

    void unsetAlias(String str, JSONObject jSONObject);

    @Deprecated
    void unsetAliases(List<String> list, JSONObject jSONObject);

    void unsetTags(List<String> list, JSONObject jSONObject);

    @Deprecated
    void unsetUserAccounts(List<String> list, JSONObject jSONObject);
}
