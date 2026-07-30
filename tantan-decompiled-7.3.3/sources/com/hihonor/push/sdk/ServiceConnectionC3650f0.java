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
public class ServiceConnectionC3650f0 implements ServiceConnection {

    /* JADX INFO: renamed from: e */
    public static final Object f12603e = new Object();

    /* JADX INFO: renamed from: a */
    public final RemoteServiceBean f12604a;

    /* JADX INFO: renamed from: b */
    public a f12605b;

    /* JADX INFO: renamed from: c */
    public Handler f12606c = null;

    /* JADX INFO: renamed from: d */
    public boolean f12607d = false;

    /* JADX INFO: renamed from: com.hihonor.push.sdk.f0$a */
    public interface a {
    }

    public ServiceConnectionC3650f0(RemoteServiceBean remoteServiceBean) {
        this.f12604a = remoteServiceBean;
    }

    /* JADX INFO: renamed from: a */
    public final void m18589a(int i) {
        a aVar = this.f12605b;
        if (aVar != null) {
            C3640c0 c3640c0 = (C3640c0) aVar;
            c3640c0.f12590a.f12593a.set(i == HonorPushErrorEnum.ERROR_SERVICE_TIME_OUT.statusCode ? 2 : 1);
            c3640c0.f12590a.m18586a(i);
            c3640c0.f12590a.f12594b = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18590b() {
        try {
            toString();
            C3664l.f12631e.m18597a().unbindService(this);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        if (this.f12607d) {
            this.f12607d = false;
            return;
        }
        m18590b();
        m18588a();
        a aVar = this.f12605b;
        if (aVar != null) {
            C3640c0 c3640c0 = (C3640c0) aVar;
            c3640c0.f12590a.f12593a.set(1);
            c3640c0.f12590a.m18586a(8002005);
            c3640c0.f12590a.f12594b = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m18588a();
        a aVar = this.f12605b;
        if (aVar != null) {
            C3640c0 c3640c0 = (C3640c0) aVar;
            c3640c0.f12590a.f12594b = IPushInvoke.Stub.asInterface(iBinder);
            IPushInvoke iPushInvoke = c3640c0.f12590a.f12594b;
            C3644d0 c3644d0 = c3640c0.f12590a;
            if (iPushInvoke == null) {
                c3644d0.f12596d.m18590b();
                c3640c0.f12590a.f12593a.set(1);
                c3640c0.f12590a.m18586a(8002001);
                return;
            }
            c3644d0.f12593a.set(3);
            InterfaceC3637b0.a aVar2 = c3640c0.f12590a.f12595c;
            if (aVar2 != null) {
                C3692z.a aVar3 = (C3692z.a) aVar2;
                if (Looper.myLooper() == C3692z.this.f12690a.getLooper()) {
                    aVar3.m18611b();
                } else {
                    C3692z.this.f12690a.post(new RunnableC3688x(aVar3));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.f12605b;
        if (aVar != null) {
            C3640c0 c3640c0 = (C3640c0) aVar;
            c3640c0.f12590a.f12593a.set(1);
            c3640c0.f12590a.m18586a(8002002);
            c3640c0.f12590a.f12594b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18588a() {
        synchronized (f12603e) {
            try {
                Handler handler = this.f12606c;
                if (handler != null) {
                    handler.removeMessages(1001);
                    this.f12606c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
