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
public class ServiceConnectionC3494g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Messenger f11874a;

    /* JADX INFO: renamed from: b */
    public Bundle f11875b;

    /* JADX INFO: renamed from: c */
    public Context f11876c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11874a = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.setData(this.f11875b);
        try {
            this.f11874a.send(messageObtain);
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            this.f11876c.unbindService(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f11874a = null;
        this.f11875b = null;
        this.f11876c = null;
    }
}
