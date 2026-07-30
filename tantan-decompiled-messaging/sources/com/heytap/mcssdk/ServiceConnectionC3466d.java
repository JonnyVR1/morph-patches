package com.heytap.mcssdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.heytap.mcssdk.utils.LogUtil;
import p149l.cwl;

/* JADX INFO: renamed from: com.heytap.mcssdk.d */
/* JADX INFO: loaded from: classes7.dex */
final class ServiceConnectionC3466d implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f11822a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ PushManager f11823b;

    public ServiceConnectionC3466d(PushManager pushManager, Intent intent) {
        this.f11823b = pushManager;
        this.f11822a = intent;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putAll(this.f11822a.getExtras());
        try {
            cwl.m109050O(iBinder).mo104159i3(bundle);
        } catch (Exception e) {
            LogUtil.m17465d("bindMcsService exception:" + e);
        }
        this.f11823b.mContext.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
