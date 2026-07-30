package com.heytap.mcssdk.callback;

import com.heytap.mcssdk.mode.SubscribeResult;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface PushCallback {
    void onGetAliases(int i, List<SubscribeResult> list);

    void onGetNotificationStatus(int i, int i2);

    void onGetPushStatus(int i, int i2);

    void onGetTags(int i, List<SubscribeResult> list);

    void onGetUserAccounts(int i, List<SubscribeResult> list);

    void onRegister(int i, String str);

    void onSetAliases(int i, List<SubscribeResult> list);

    void onSetPushTime(int i, String str);

    void onSetTags(int i, List<SubscribeResult> list);

    void onSetUserAccounts(int i, List<SubscribeResult> list);

    void onUnRegister(int i);

    void onUnsetAliases(int i, List<SubscribeResult> list);

    void onUnsetTags(int i, List<SubscribeResult> list);

    void onUnsetUserAccounts(int i, List<SubscribeResult> list);
}
