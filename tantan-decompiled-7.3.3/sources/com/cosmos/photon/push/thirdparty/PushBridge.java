package com.cosmos.photon.push.thirdparty;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class PushBridge implements IPushBridge {
    @Override // com.cosmos.photon.push.thirdparty.IPushBridge
    public Context getContext() {
        return ThirdPushManager.getInstance().getContext();
    }
}
