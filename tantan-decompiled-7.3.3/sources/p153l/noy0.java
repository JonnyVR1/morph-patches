package p153l;

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
public final class noy0 implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    public bry0 f143056c;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ f0z0 f143059f;

    /* JADX INFO: renamed from: a */
    public int f143054a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f143055b = new Messenger(new vxv0(Looper.getMainLooper(), new Handler.Callback() { // from class: l.ydy0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            noy0 noy0Var = this.f198636a;
            synchronized (noy0Var) {
                try {
                    quy0 quy0Var = (quy0) noy0Var.f143058e.get(i);
                    if (quy0Var == null) {
                        return true;
                    }
                    noy0Var.f143058e.remove(i);
                    noy0Var.m164212f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        quy0Var.m178225c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    quy0Var.mo106414a(data);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d */
    public final Queue f143057d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final SparseArray f143058e = new SparseArray();

    public /* synthetic */ noy0(f0z0 f0z0Var, bly0 bly0Var) {
        this.f143059f = f0z0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m164207a(int i, @Nullable String str) {
        m164208b(i, str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m164208b(int i, @Nullable String str, @Nullable Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.f143054a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f143054a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f143054a = 4;
            ConnectionTracker.getInstance().unbindService(this.f143059f.f96748a, this);
            zzt zztVar = new zzt(i, str, th);
            Iterator it = this.f143057d.iterator();
            while (it.hasNext()) {
                ((quy0) it.next()).m178225c(zztVar);
            }
            this.f143057d.clear();
            int i3 = 0;
            while (true) {
                int size = this.f143058e.size();
                SparseArray sparseArray = this.f143058e;
                if (i3 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((quy0) sparseArray.valueAt(i3)).m178225c(zztVar);
                    i3++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m164209c() {
        this.f143059f.f96749b.execute(new Runnable() { // from class: l.pyx0
            @Override // java.lang.Runnable
            public final void run() {
                final quy0 quy0Var;
                while (true) {
                    final noy0 noy0Var = this.f154697a;
                    synchronized (noy0Var) {
                        try {
                            if (noy0Var.f143054a != 2) {
                                return;
                            }
                            if (noy0Var.f143057d.isEmpty()) {
                                noy0Var.m164212f();
                                return;
                            } else {
                                quy0Var = (quy0) noy0Var.f143057d.poll();
                                noy0Var.f143058e.put(quy0Var.f159655a, quy0Var);
                                noy0Var.f143059f.f96749b.schedule(new Runnable() { // from class: l.khy0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        noy0Var.m164211e(quy0Var.f159655a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(quy0Var));
                    }
                    f0z0 f0z0Var = noy0Var.f143059f;
                    Messenger messenger = noy0Var.f143055b;
                    int i = quy0Var.f159657c;
                    Context context = f0z0Var.f96748a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = quy0Var.f159655a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", quy0Var.mo106415b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", quy0Var.f159658d);
                    messageObtain.setData(bundle);
                    try {
                        noy0Var.f143056c.m106192a(messageObtain);
                    } catch (RemoteException e) {
                        noy0Var.m164207a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m164210d() {
        if (this.f143054a == 1) {
            m164207a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m164211e(int i) {
        quy0 quy0Var = (quy0) this.f143058e.get(i);
        if (quy0Var != null) {
            this.f143058e.remove(i);
            quy0Var.m178225c(new zzt(3, "Timed out waiting for response", null));
            m164212f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m164212f() {
        if (this.f143054a == 2 && this.f143057d.isEmpty() && this.f143058e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f143054a = 3;
            ConnectionTracker.getInstance().unbindService(this.f143059f.f96748a, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m164213g(quy0 quy0Var) {
        int i = this.f143054a;
        if (i != 0) {
            if (i == 1) {
                this.f143057d.add(quy0Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f143057d.add(quy0Var);
            m164209c();
            return true;
        }
        this.f143057d.add(quy0Var);
        Preconditions.checkState(this.f143054a == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f143054a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f143059f.f96748a, intent, this, 1)) {
                this.f143059f.f96749b.schedule(new Runnable() { // from class: l.v3y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182314a.m164210d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m164207a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            m164208b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f143059f.f96749b.execute(new Runnable() { // from class: l.stx0
            @Override // java.lang.Runnable
            public final void run() {
                noy0 noy0Var = this.f170628a;
                IBinder iBinder2 = iBinder;
                synchronized (noy0Var) {
                    if (iBinder2 == null) {
                        noy0Var.m164207a(0, "Null service connection");
                        return;
                    }
                    try {
                        noy0Var.f143056c = new bry0(iBinder2);
                        noy0Var.f143054a = 2;
                        noy0Var.m164209c();
                    } catch (RemoteException e) {
                        noy0Var.m164207a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f143059f.f96749b.execute(new Runnable() { // from class: l.y8y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198055a.m164207a(2, "Service disconnected");
            }
        });
    }
}
