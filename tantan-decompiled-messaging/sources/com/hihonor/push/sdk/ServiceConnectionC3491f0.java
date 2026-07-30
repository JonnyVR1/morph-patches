package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.f0 */
/* JADX INFO: loaded from: classes7.dex */
public class ServiceConnectionC3491f0 implements ServiceConnection {

    /* JADX INFO: renamed from: e */
    public static final Object f11862e = new Object();

    /* JADX INFO: renamed from: a */
    public final RemoteServiceBean f11863a;

    /* JADX INFO: renamed from: b */
    public a f11864b;

    /* JADX INFO: renamed from: c */
    public Handler f11865c = null;

    /* JADX INFO: renamed from: d */
    public boolean f11866d = false;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.f0$a */
    public interface a {
    }

    public ServiceConnectionC3491f0(RemoteServiceBean remoteServiceBean) {
        this.f11863a = remoteServiceBean;
    }

    /* JADX INFO: renamed from: a */
    public final void m17512a(int i) {
        a aVar = this.f11864b;
        if (aVar != null) {
            C3481c0 c3481c0 = (C3481c0) aVar;
            c3481c0.f11849a.f11852a.set(i == HonorPushErrorEnum.ERROR_SERVICE_TIME_OUT.statusCode ? 2 : 1);
            c3481c0.f11849a.m17509a(i);
            c3481c0.f11849a.f11853b = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17513b() {
        try {
            toString();
            C3505l.f11890e.m17520a().unbindService(this);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        if (this.f11866d) {
            this.f11866d = false;
            return;
        }
        m17513b();
        m17511a();
        a aVar = this.f11864b;
        if (aVar != null) {
            C3481c0 c3481c0 = (C3481c0) aVar;
            c3481c0.f11849a.f11852a.set(1);
            c3481c0.f11849a.m17509a(8002005);
            c3481c0.f11849a.f11853b = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m17511a();
        a aVar = this.f11864b;
        if (aVar != null) {
            C3481c0 c3481c0 = (C3481c0) aVar;
            c3481c0.f11849a.f11853b = IPushInvoke.Stub.asInterface(iBinder);
            IPushInvoke iPushInvoke = c3481c0.f11849a.f11853b;
            C3485d0 c3485d0 = c3481c0.f11849a;
            if (iPushInvoke == null) {
                c3485d0.f11855d.m17513b();
                c3481c0.f11849a.f11852a.set(1);
                c3481c0.f11849a.m17509a(8002001);
                return;
            }
            c3485d0.f11852a.set(3);
            InterfaceC3478b0.a aVar2 = c3481c0.f11849a.f11854c;
            if (aVar2 != null) {
                C3533z.a aVar3 = (C3533z.a) aVar2;
                if (Looper.myLooper() == C3533z.this.f11949a.getLooper()) {
                    aVar3.m17534b();
                } else {
                    C3533z.this.f11949a.post(new RunnableC3529x(aVar3));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.f11864b;
        if (aVar != null) {
            C3481c0 c3481c0 = (C3481c0) aVar;
            c3481c0.f11849a.f11852a.set(1);
            c3481c0.f11849a.m17509a(8002002);
            c3481c0.f11849a.f11853b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17511a() {
        synchronized (f11862e) {
            try {
                Handler handler = this.f11865c;
                if (handler != null) {
                    handler.removeMessages(1001);
                    this.f11865c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
