package p149l;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nr40 {

    /* JADX INFO: renamed from: d */
    @GuardedBy("sEnabledNotificationListenersLock")
    public static String f140135d;

    /* JADX INFO: renamed from: g */
    @GuardedBy("sLock")
    public static ServiceConnectionC18755d f140138g;

    /* JADX INFO: renamed from: a */
    public final Context f140139a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f140140b;

    /* JADX INFO: renamed from: c */
    public static final Object f140134c = new Object();

    /* JADX INFO: renamed from: e */
    @GuardedBy("sEnabledNotificationListenersLock")
    public static Set<String> f140136e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f140137f = new Object();

    /* JADX INFO: renamed from: l.nr40$a */
    @RequiresApi(24)
    public static class C18752a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m160719a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    /* JADX INFO: renamed from: l.nr40$b */
    public static class C18753b implements InterfaceC18756e {

        /* JADX INFO: renamed from: a */
        public final String f140141a;

        /* JADX INFO: renamed from: b */
        public final int f140142b;

        /* JADX INFO: renamed from: c */
        public final String f140143c;

        /* JADX INFO: renamed from: d */
        public final Notification f140144d;

        public C18753b(String str, int i, String str2, Notification notification) {
            this.f140141a = str;
            this.f140142b = i;
            this.f140143c = str2;
            this.f140144d = notification;
        }

        @Override // p149l.nr40.InterfaceC18756e
        /* JADX INFO: renamed from: a */
        public void mo160720a(jyl jylVar) throws RemoteException {
            jylVar.mo143871j4(this.f140141a, this.f140142b, this.f140143c, this.f140144d);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:" + this.f140141a + ", id:" + this.f140142b + ", tag:" + this.f140143c + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: l.nr40$c */
    public static class C18754c {

        /* JADX INFO: renamed from: a */
        public final ComponentName f140145a;

        /* JADX INFO: renamed from: b */
        public final IBinder f140146b;

        public C18754c(ComponentName componentName, IBinder iBinder) {
            this.f140145a = componentName;
            this.f140146b = iBinder;
        }
    }

    /* JADX INFO: renamed from: l.nr40$d */
    public static class ServiceConnectionC18755d implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final Context f140147a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f140148b;

        /* JADX INFO: renamed from: c */
        public final Handler f140149c;

        /* JADX INFO: renamed from: d */
        public final Map<ComponentName, a> f140150d = new HashMap();

        /* JADX INFO: renamed from: e */
        public Set<String> f140151e = new HashSet();

        /* JADX INFO: renamed from: l.nr40$d$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ComponentName f140152a;

            /* JADX INFO: renamed from: c */
            public jyl f140154c;

            /* JADX INFO: renamed from: b */
            public boolean f140153b = false;

            /* JADX INFO: renamed from: d */
            public ArrayDeque<InterfaceC18756e> f140155d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e */
            public int f140156e = 0;

            public a(ComponentName componentName) {
                this.f140152a = componentName;
            }
        }

        public ServiceConnectionC18755d(Context context) {
            this.f140147a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f140148b = handlerThread;
            handlerThread.start();
            this.f140149c = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m160721a(a aVar) {
            if (aVar.f140153b) {
                return true;
            }
            boolean zBindService = this.f140147a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f140152a), this, 33);
            aVar.f140153b = zBindService;
            if (zBindService) {
                aVar.f140156e = 0;
            } else {
                Objects.toString(aVar.f140152a);
                this.f140147a.unbindService(this);
            }
            return aVar.f140153b;
        }

        /* JADX INFO: renamed from: b */
        public final void m160722b(a aVar) {
            if (aVar.f140153b) {
                this.f140147a.unbindService(this);
                aVar.f140153b = false;
            }
            aVar.f140154c = null;
        }

        /* JADX INFO: renamed from: c */
        public final void m160723c(InterfaceC18756e interfaceC18756e) {
            m160730j();
            for (a aVar : this.f140150d.values()) {
                aVar.f140155d.add(interfaceC18756e);
                m160727g(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m160724d(ComponentName componentName) {
            a aVar = this.f140150d.get(componentName);
            if (aVar != null) {
                m160727g(aVar);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m160725e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f140150d.get(componentName);
            if (aVar != null) {
                aVar.f140154c = jyl.AbstractBinderC17893a.m143873O(iBinder);
                aVar.f140156e = 0;
                m160727g(aVar);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m160726f(ComponentName componentName) {
            a aVar = this.f140150d.get(componentName);
            if (aVar != null) {
                m160722b(aVar);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m160727g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f140152a);
                aVar.f140155d.size();
            }
            if (aVar.f140155d.isEmpty()) {
                return;
            }
            if (!m160721a(aVar) || aVar.f140154c == null) {
                m160729i(aVar);
                return;
            }
            while (true) {
                InterfaceC18756e interfaceC18756ePeek = aVar.f140155d.peek();
                if (interfaceC18756ePeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        interfaceC18756ePeek.toString();
                    }
                    interfaceC18756ePeek.mo160720a(aVar.f140154c);
                    aVar.f140155d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(aVar.f140152a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f140152a);
                }
            }
            if (aVar.f140155d.isEmpty()) {
                return;
            }
            m160729i(aVar);
        }

        /* JADX INFO: renamed from: h */
        public void m160728h(InterfaceC18756e interfaceC18756e) {
            this.f140149c.obtainMessage(0, interfaceC18756e).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m160723c((InterfaceC18756e) message.obj);
                return true;
            }
            if (i == 1) {
                C18754c c18754c = (C18754c) message.obj;
                m160725e(c18754c.f140145a, c18754c.f140146b);
                return true;
            }
            if (i == 2) {
                m160726f((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            m160724d((ComponentName) message.obj);
            return true;
        }

        /* JADX INFO: renamed from: i */
        public final void m160729i(a aVar) {
            if (this.f140149c.hasMessages(3, aVar.f140152a)) {
                return;
            }
            int i = aVar.f140156e;
            int i2 = i + 1;
            aVar.f140156e = i2;
            if (i2 > 6) {
                aVar.f140155d.size();
                Objects.toString(aVar.f140152a);
                aVar.f140155d.clear();
            } else {
                Log.isLoggable("NotifManCompat", 3);
                this.f140149c.sendMessageDelayed(this.f140149c.obtainMessage(3, aVar.f140152a), (1 << i) * 1000);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m160730j() {
            Set<String> setM160710f = nr40.m160710f(this.f140147a);
            if (setM160710f.equals(this.f140151e)) {
                return;
            }
            this.f140151e = setM160710f;
            List<ResolveInfo> listQueryIntentServices = this.f140147a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM160710f.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f140150d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f140150d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f140150d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(next.getKey());
                    }
                    m160722b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f140149c.obtainMessage(1, new C18754c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f140149c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: l.nr40$e */
    public interface InterfaceC18756e {
        /* JADX INFO: renamed from: a */
        void mo160720a(jyl jylVar) throws RemoteException;
    }

    public nr40(Context context) {
        this.f140139a = context;
        this.f140140b = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static nr40 m160709e(@NonNull Context context) {
        return new nr40(context);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Set<String> m160710f(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f140134c) {
            if (string != null) {
                try {
                    if (!string.equals(f140135d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f140136e = hashSet;
                        f140135d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f140136e;
        }
        return set;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m160711j(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean("android.support.useSideChannel");
    }

    /* JADX INFO: renamed from: a */
    public boolean m160712a() {
        return C18752a.m160719a(this.f140140b);
    }

    /* JADX INFO: renamed from: b */
    public void m160713b(int i) {
        m160714c(null, i);
    }

    /* JADX INFO: renamed from: c */
    public void m160714c(@Nullable String str, int i) {
        this.f140140b.cancel(str, i);
    }

    /* JADX INFO: renamed from: d */
    public void m160715d() {
        this.f140140b.cancelAll();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: g */
    public void m160716g(int i, @NonNull Notification notification) {
        m160717h(null, i, notification);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: h */
    public void m160717h(@Nullable String str, int i, @NonNull Notification notification) {
        if (!m160711j(notification)) {
            ii5.m136338h(this.f140140b, str, i, notification);
        } else {
            m160718i(new C18753b(this.f140139a.getPackageName(), i, str, notification));
            this.f140140b.cancel(str, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m160718i(InterfaceC18756e interfaceC18756e) {
        synchronized (f140137f) {
            try {
                if (f140138g == null) {
                    f140138g = new ServiceConnectionC18755d(this.f140139a.getApplicationContext());
                }
                f140138g.m160728h(interfaceC18756e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
