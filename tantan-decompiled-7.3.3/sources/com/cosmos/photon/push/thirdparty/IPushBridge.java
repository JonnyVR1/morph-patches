package com.cosmos.photon.push.thirdparty;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface IPushBridge {
    Context getContext();

    String getRegisteredToken();

    void onGetTokenResult(boolean z, String str);

    void onPushRegisterResult(int i, int i2, String str);

    void onReceiveAssistThirdNotification(int i, NotificationWrapper notificationWrapper);

    void onReceiveAssistThirdToken(int i, String str);

    void onReceivePassThroughMessage(int i, String str);

    void onUnRegisterResult(int i, int i2);
}
