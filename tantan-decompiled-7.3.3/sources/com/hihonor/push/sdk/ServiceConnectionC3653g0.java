package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* JADX INFO: renamed from: com.hihonor.push.sdk.g0 */
/* JADX INFO: loaded from: classes7.dex */
public class ServiceConnectionC3653g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Messenger f12615a;

    /* JADX INFO: renamed from: b */
    public Bundle f12616b;

    /* JADX INFO: renamed from: c */
    public Context f12617c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12615a = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.setData(this.f12616b);
        try {
            this.f12615a.send(messageObtain);
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            this.f12617c.unbindService(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f12615a = null;
        this.f12616b = null;
        this.f12617c = null;
    }
}
