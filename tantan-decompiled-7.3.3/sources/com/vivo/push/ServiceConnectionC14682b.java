package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import com.vivo.push.util.C14805z;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.vivo.push.b */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC14682b implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private static final Object f61740a = new Object();

    /* JADX INFO: renamed from: b */
    private static Map<String, ServiceConnectionC14682b> f61741b = new HashMap();

    /* JADX INFO: renamed from: c */
    private boolean f61742c;

    /* JADX INFO: renamed from: d */
    private String f61743d;

    /* JADX INFO: renamed from: e */
    private Context f61744e;

    /* JADX INFO: renamed from: g */
    private volatile IPCInvoke f61746g;

    /* JADX INFO: renamed from: i */
    private String f61748i;

    /* JADX INFO: renamed from: j */
    private Handler f61749j;

    /* JADX INFO: renamed from: h */
    private Object f61747h = new Object();

    /* JADX INFO: renamed from: f */
    private AtomicInteger f61745f = new AtomicInteger(1);

    private ServiceConnectionC14682b(Context context, String str) {
        this.f61743d = null;
        this.f61749j = null;
        this.f61744e = context;
        this.f61748i = str;
        this.f61749j = new Handler(Looper.getMainLooper(), new C14709c(this));
        String strM86204b = C14799t.m86204b(context);
        this.f61743d = strM86204b;
        if (!TextUtils.isEmpty(strM86204b) && !TextUtils.isEmpty(this.f61748i)) {
            this.f61742c = C14805z.m86225a(context, this.f61743d) >= 1260;
            m85905b();
            return;
        }
        C14795p.m86191c(this.f61744e, "init error : push pkgname is " + this.f61743d + " ; action is " + this.f61748i);
        this.f61742c = false;
    }

    /* JADX INFO: renamed from: b */
    private void m85905b() {
        int i = this.f61745f.get();
        C14795p.m86192d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i)));
        if (i == 4 || i == 2 || i == 3 || i == 5 || !this.f61742c) {
            return;
        }
        m85904a(2);
        if (m85908c()) {
            m85909d();
        } else {
            m85904a(1);
            C14795p.m86179a("AidlManager", "bind core service fail");
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m85908c() {
        Intent intent = new Intent(this.f61748i);
        intent.setPackage(this.f61743d);
        try {
            return this.f61744e.bindService(intent, this, 1);
        } catch (Exception e) {
            C14795p.m86180a("AidlManager", "bind core error", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m85909d() {
        this.f61749j.removeMessages(1);
        this.f61749j.sendEmptyMessageDelayed(1, 3000L);
    }

    /* JADX INFO: renamed from: e */
    private void m85910e() {
        this.f61749j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m85911f() {
        try {
            this.f61744e.unbindService(this);
        } catch (Exception e) {
            C14795p.m86179a("AidlManager", "On unBindServiceException:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85913a(Bundle bundle) {
        m85905b();
        if (this.f61745f.get() == 2) {
            synchronized (this.f61747h) {
                try {
                    this.f61747h.wait(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            int i = this.f61745f.get();
            if (i != 4) {
                C14795p.m86192d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i)));
                return false;
            }
            this.f61749j.removeMessages(2);
            this.f61749j.sendEmptyMessageDelayed(2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            this.f61746g.asyncCall(bundle, null);
            return true;
        } catch (Exception e2) {
            C14795p.m86180a("AidlManager", "invoke error ", e2);
            int i2 = this.f61745f.get();
            C14795p.m86192d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i2)));
            if (i2 == 2) {
                m85910e();
                m85904a(1);
                return false;
            }
            if (i2 == 3) {
                m85904a(1);
                return false;
            }
            if (i2 != 4) {
                return false;
            }
            m85904a(1);
            m85911f();
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C14795p.m86186b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m85910e();
        this.f61746g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f61746g == null) {
            C14795p.m86192d("AidlManager", "onServiceConnected error : aidl must not be null.");
            m85911f();
            this.f61745f.set(1);
            return;
        }
        if (this.f61745f.get() == 2) {
            m85904a(4);
        } else if (this.f61745f.get() != 4) {
            m85911f();
        }
        synchronized (this.f61747h) {
            this.f61747h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f61746g = null;
        m85904a(1);
    }

    /* JADX INFO: renamed from: a */
    public static ServiceConnectionC14682b m85902a(Context context, String str) {
        ServiceConnectionC14682b serviceConnectionC14682b;
        ServiceConnectionC14682b serviceConnectionC14682b2 = f61741b.get(str);
        if (serviceConnectionC14682b2 != null) {
            return serviceConnectionC14682b2;
        }
        synchronized (f61740a) {
            try {
                serviceConnectionC14682b = f61741b.get(str);
                if (serviceConnectionC14682b == null) {
                    serviceConnectionC14682b = new ServiceConnectionC14682b(context, str);
                    f61741b.put(str, serviceConnectionC14682b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC14682b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85912a() {
        String strM86204b = C14799t.m86204b(this.f61744e);
        this.f61743d = strM86204b;
        boolean zIsEmpty = TextUtils.isEmpty(strM86204b);
        Context context = this.f61744e;
        if (zIsEmpty) {
            C14795p.m86191c(context, "push pkgname is null");
            return false;
        }
        boolean z = C14805z.m86225a(context, this.f61743d) >= 1260;
        this.f61742c = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85904a(int i) {
        this.f61745f.set(i);
    }
}
