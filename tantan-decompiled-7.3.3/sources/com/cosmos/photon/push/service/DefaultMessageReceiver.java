package com.cosmos.photon.push.service;

import com.cosmos.photon.push.PushMessageReceiver;

/* JADX INFO: loaded from: classes.dex */
public class DefaultMessageReceiver extends PushMessageReceiver {
    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isFcmOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isHonorPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isHuaweiPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isMeizuPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isMiPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isOppoPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public boolean isVivoPushOpen() {
        return false;
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public void onCommand(int i, int i2, String str) {
    }

    @Override // com.cosmos.photon.push.PushMessageReceiver
    public void onToken(int i, String str, String str2) {
    }
}
