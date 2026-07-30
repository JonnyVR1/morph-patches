package com.heytap.mcssdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.heytap.mcssdk.utils.LogUtil;
import p153l.uyl;

/* JADX INFO: renamed from: com.heytap.mcssdk.d */
/* JADX INFO: loaded from: classes7.dex */
final class ServiceConnectionC3625d implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f12563a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ PushManager f12564b;

    public ServiceConnectionC3625d(PushManager pushManager, Intent intent) {
        this.f12564b = pushManager;
        this.f12563a = intent;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putAll(this.f12563a.getExtras());
        try {
            uyl.m198666O(iBinder).mo193597i3(bundle);
        } catch (Exception e) {
            LogUtil.m18542d("bindMcsService exception:" + e);
        }
        this.f12564b.mContext.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
