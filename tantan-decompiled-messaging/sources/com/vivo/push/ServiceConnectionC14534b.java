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
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.C14657z;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.vivo.push.b */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC14534b implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private static final Object f60893a = new Object();

    /* JADX INFO: renamed from: b */
    private static Map<String, ServiceConnectionC14534b> f60894b = new HashMap();

    /* JADX INFO: renamed from: c */
    private boolean f60895c;

    /* JADX INFO: renamed from: d */
    private String f60896d;

    /* JADX INFO: renamed from: e */
    private Context f60897e;

    /* JADX INFO: renamed from: g */
    private volatile IPCInvoke f60899g;

    /* JADX INFO: renamed from: i */
    private String f60901i;

    /* JADX INFO: renamed from: j */
    private Handler f60902j;

    /* JADX INFO: renamed from: h */
    private Object f60900h = new Object();

    /* JADX INFO: renamed from: f */
    private AtomicInteger f60898f = new AtomicInteger(1);

    private ServiceConnectionC14534b(Context context, String str) {
        this.f60896d = null;
        this.f60902j = null;
        this.f60897e = context;
        this.f60901i = str;
        this.f60902j = new Handler(Looper.getMainLooper(), new C14561c(this));
        String strM85033b = C14651t.m85033b(context);
        this.f60896d = strM85033b;
        if (!TextUtils.isEmpty(strM85033b) && !TextUtils.isEmpty(this.f60901i)) {
            this.f60895c = C14657z.m85054a(context, this.f60896d) >= 1260;
            m84734b();
            return;
        }
        C14647p.m85020c(this.f60897e, "init error : push pkgname is " + this.f60896d + " ; action is " + this.f60901i);
        this.f60895c = false;
    }

    /* JADX INFO: renamed from: b */
    private void m84734b() {
        int i = this.f60898f.get();
        C14647p.m85021d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i)));
        if (i == 4 || i == 2 || i == 3 || i == 5 || !this.f60895c) {
            return;
        }
        m84733a(2);
        if (m84737c()) {
            m84738d();
        } else {
            m84733a(1);
            C14647p.m85008a("AidlManager", "bind core service fail");
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m84737c() {
        Intent intent = new Intent(this.f60901i);
        intent.setPackage(this.f60896d);
        try {
            return this.f60897e.bindService(intent, this, 1);
        } catch (Exception e) {
            C14647p.m85009a("AidlManager", "bind core error", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m84738d() {
        this.f60902j.removeMessages(1);
        this.f60902j.sendEmptyMessageDelayed(1, 3000L);
    }

    /* JADX INFO: renamed from: e */
    private void m84739e() {
        this.f60902j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m84740f() {
        try {
            this.f60897e.unbindService(this);
        } catch (Exception e) {
            C14647p.m85008a("AidlManager", "On unBindServiceException:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84742a(Bundle bundle) {
        m84734b();
        if (this.f60898f.get() == 2) {
            synchronized (this.f60900h) {
                try {
                    this.f60900h.wait(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            int i = this.f60898f.get();
            if (i != 4) {
                C14647p.m85021d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i)));
                return false;
            }
            this.f60902j.removeMessages(2);
            this.f60902j.sendEmptyMessageDelayed(2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
            this.f60899g.asyncCall(bundle, null);
            return true;
        } catch (Exception e2) {
            C14647p.m85009a("AidlManager", "invoke error ", e2);
            int i2 = this.f60898f.get();
            C14647p.m85021d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i2)));
            if (i2 == 2) {
                m84739e();
                m84733a(1);
                return false;
            }
            if (i2 == 3) {
                m84733a(1);
                return false;
            }
            if (i2 != 4) {
                return false;
            }
            m84733a(1);
            m84740f();
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C14647p.m85015b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m84739e();
        this.f60899g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f60899g == null) {
            C14647p.m85021d("AidlManager", "onServiceConnected error : aidl must not be null.");
            m84740f();
            this.f60898f.set(1);
            return;
        }
        if (this.f60898f.get() == 2) {
            m84733a(4);
        } else if (this.f60898f.get() != 4) {
            m84740f();
        }
        synchronized (this.f60900h) {
            this.f60900h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f60899g = null;
        m84733a(1);
    }

    /* JADX INFO: renamed from: a */
    public static ServiceConnectionC14534b m84731a(Context context, String str) {
        ServiceConnectionC14534b serviceConnectionC14534b;
        ServiceConnectionC14534b serviceConnectionC14534b2 = f60894b.get(str);
        if (serviceConnectionC14534b2 != null) {
            return serviceConnectionC14534b2;
        }
        synchronized (f60893a) {
            try {
                serviceConnectionC14534b = f60894b.get(str);
                if (serviceConnectionC14534b == null) {
                    serviceConnectionC14534b = new ServiceConnectionC14534b(context, str);
                    f60894b.put(str, serviceConnectionC14534b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC14534b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84741a() {
        String strM85033b = C14651t.m85033b(this.f60897e);
        this.f60896d = strM85033b;
        boolean zIsEmpty = TextUtils.isEmpty(strM85033b);
        Context context = this.f60897e;
        if (zIsEmpty) {
            C14647p.m85020c(context, "push pkgname is null");
            return false;
        }
        boolean z = C14657z.m85054a(context, this.f60896d) >= 1260;
        this.f60895c = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84733a(int i) {
        this.f60898f.set(i);
    }
}
