package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class hfy0 implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    public vhy0 f107534c;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zqy0 f107537f;

    /* JADX INFO: renamed from: a */
    public int f107532a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f107533b = new Messenger(new pov0(Looper.getMainLooper(), new Handler.Callback() { // from class: l.s4y0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            hfy0 hfy0Var = this.f162472a;
            synchronized (hfy0Var) {
                try {
                    kly0 kly0Var = (kly0) hfy0Var.f107536e.get(i);
                    if (kly0Var == null) {
                        return true;
                    }
                    hfy0Var.f107536e.remove(i);
                    hfy0Var.m130799f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        kly0Var.m146438c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    kly0Var.mo127502a(data);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d */
    public final Queue f107535d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final SparseArray f107536e = new SparseArray();

    public /* synthetic */ hfy0(zqy0 zqy0Var, vby0 vby0Var) {
        this.f107537f = zqy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m130794a(int i, @Nullable String str) {
        m130795b(i, str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m130795b(int i, @Nullable String str, @Nullable Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.f107532a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f107532a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f107532a = 4;
            ConnectionTracker.getInstance().unbindService(this.f107537f.f204445a, this);
            zzt zztVar = new zzt(i, str, th);
            Iterator it = this.f107535d.iterator();
            while (it.hasNext()) {
                ((kly0) it.next()).m146438c(zztVar);
            }
            this.f107535d.clear();
            int i3 = 0;
            while (true) {
                int size = this.f107536e.size();
                SparseArray sparseArray = this.f107536e;
                if (i3 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((kly0) sparseArray.valueAt(i3)).m146438c(zztVar);
                    i3++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m130796c() {
        this.f107537f.f204446b.execute(new Runnable() { // from class: l.jpx0
            @Override // java.lang.Runnable
            public final void run() {
                final kly0 kly0Var;
                while (true) {
                    final hfy0 hfy0Var = this.f119241a;
                    synchronized (hfy0Var) {
                        try {
                            if (hfy0Var.f107532a != 2) {
                                return;
                            }
                            if (hfy0Var.f107535d.isEmpty()) {
                                hfy0Var.m130799f();
                                return;
                            } else {
                                kly0Var = (kly0) hfy0Var.f107535d.poll();
                                hfy0Var.f107536e.put(kly0Var.f123723a, kly0Var);
                                hfy0Var.f107537f.f204446b.schedule(new Runnable() { // from class: l.e8y0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hfy0Var.m130798e(kly0Var.f123723a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(kly0Var));
                    }
                    zqy0 zqy0Var = hfy0Var.f107537f;
                    Messenger messenger = hfy0Var.f107533b;
                    int i = kly0Var.f123725c;
                    Context context = zqy0Var.f204445a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = kly0Var.f123723a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kly0Var.mo127503b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kly0Var.f123726d);
                    messageObtain.setData(bundle);
                    try {
                        hfy0Var.f107534c.m198486a(messageObtain);
                    } catch (RemoteException e) {
                        hfy0Var.m130794a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m130797d() {
        if (this.f107532a == 1) {
            m130794a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m130798e(int i) {
        kly0 kly0Var = (kly0) this.f107536e.get(i);
        if (kly0Var != null) {
            this.f107536e.remove(i);
            kly0Var.m146438c(new zzt(3, "Timed out waiting for response", null));
            m130799f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m130799f() {
        if (this.f107532a == 2 && this.f107535d.isEmpty() && this.f107536e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f107532a = 3;
            ConnectionTracker.getInstance().unbindService(this.f107537f.f204445a, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m130800g(kly0 kly0Var) {
        try {
            int i = this.f107532a;
            if (i != 0) {
                if (i == 1) {
                    this.f107535d.add(kly0Var);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.f107535d.add(kly0Var);
                m130796c();
                return true;
            }
            this.f107535d.add(kly0Var);
            Preconditions.checkState(this.f107532a == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f107532a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.getInstance().bindService(this.f107537f.f204445a, intent, this, 1)) {
                    this.f107537f.f204446b.schedule(new Runnable() { // from class: l.pux0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f151370a.m130797d();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    m130794a(0, "Unable to bind to service");
                }
            } catch (SecurityException e) {
                m130795b(0, "Unable to bind to service", e);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f107537f.f204446b.execute(new Runnable() { // from class: l.mkx0
            @Override // java.lang.Runnable
            public final void run() {
                hfy0 hfy0Var = this.f134395a;
                IBinder iBinder2 = iBinder;
                synchronized (hfy0Var) {
                    if (iBinder2 == null) {
                        hfy0Var.m130794a(0, "Null service connection");
                        return;
                    }
                    try {
                        hfy0Var.f107534c = new vhy0(iBinder2);
                        hfy0Var.f107532a = 2;
                        hfy0Var.m130796c();
                    } catch (RemoteException e) {
                        hfy0Var.m130794a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f107537f.f204446b.execute(new Runnable() { // from class: l.szx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167086a.m130794a(2, "Service disconnected");
            }
        });
    }
}
