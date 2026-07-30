package p153l;

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
public final class c050 {

    /* JADX INFO: renamed from: d */
    @GuardedBy("sEnabledNotificationListenersLock")
    public static String f79208d;

    /* JADX INFO: renamed from: g */
    @GuardedBy("sLock")
    public static ServiceConnectionC16152d f79211g;

    /* JADX INFO: renamed from: a */
    public final Context f79212a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f79213b;

    /* JADX INFO: renamed from: c */
    public static final Object f79207c = new Object();

    /* JADX INFO: renamed from: e */
    @GuardedBy("sEnabledNotificationListenersLock")
    public static Set<String> f79209e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f79210f = new Object();

    /* JADX INFO: renamed from: l.c050$a */
    @RequiresApi(24)
    public static class C16149a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m107329a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    /* JADX INFO: renamed from: l.c050$b */
    public static class C16150b implements InterfaceC16153e {

        /* JADX INFO: renamed from: a */
        public final String f79214a;

        /* JADX INFO: renamed from: b */
        public final int f79215b;

        /* JADX INFO: renamed from: c */
        public final String f79216c;

        /* JADX INFO: renamed from: d */
        public final Notification f79217d;

        public C16150b(String str, int i, String str2, Notification notification) {
            this.f79214a = str;
            this.f79215b = i;
            this.f79216c = str2;
            this.f79217d = notification;
        }

        @Override // p153l.c050.InterfaceC16153e
        /* JADX INFO: renamed from: a */
        public void mo107330a(c1m c1mVar) throws RemoteException {
            c1mVar.mo107619j4(this.f79214a, this.f79215b, this.f79216c, this.f79217d);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:" + this.f79214a + ", id:" + this.f79215b + ", tag:" + this.f79216c + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: l.c050$c */
    public static class C16151c {

        /* JADX INFO: renamed from: a */
        public final ComponentName f79218a;

        /* JADX INFO: renamed from: b */
        public final IBinder f79219b;

        public C16151c(ComponentName componentName, IBinder iBinder) {
            this.f79218a = componentName;
            this.f79219b = iBinder;
        }
    }

    /* JADX INFO: renamed from: l.c050$d */
    public static class ServiceConnectionC16152d implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final Context f79220a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f79221b;

        /* JADX INFO: renamed from: c */
        public final Handler f79222c;

        /* JADX INFO: renamed from: d */
        public final Map<ComponentName, a> f79223d = new HashMap();

        /* JADX INFO: renamed from: e */
        public Set<String> f79224e = new HashSet();

        /* JADX INFO: renamed from: l.c050$d$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ComponentName f79225a;

            /* JADX INFO: renamed from: c */
            public c1m f79227c;

            /* JADX INFO: renamed from: b */
            public boolean f79226b = false;

            /* JADX INFO: renamed from: d */
            public ArrayDeque<InterfaceC16153e> f79228d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e */
            public int f79229e = 0;

            public a(ComponentName componentName) {
                this.f79225a = componentName;
            }
        }

        public ServiceConnectionC16152d(Context context) {
            this.f79220a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f79221b = handlerThread;
            handlerThread.start();
            this.f79222c = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m107331a(a aVar) {
            if (aVar.f79226b) {
                return true;
            }
            boolean zBindService = this.f79220a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f79225a), this, 33);
            aVar.f79226b = zBindService;
            if (zBindService) {
                aVar.f79229e = 0;
            } else {
                Objects.toString(aVar.f79225a);
                this.f79220a.unbindService(this);
            }
            return aVar.f79226b;
        }

        /* JADX INFO: renamed from: b */
        public final void m107332b(a aVar) {
            if (aVar.f79226b) {
                this.f79220a.unbindService(this);
                aVar.f79226b = false;
            }
            aVar.f79227c = null;
        }

        /* JADX INFO: renamed from: c */
        public final void m107333c(InterfaceC16153e interfaceC16153e) {
            m107340j();
            for (a aVar : this.f79223d.values()) {
                aVar.f79228d.add(interfaceC16153e);
                m107337g(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m107334d(ComponentName componentName) {
            a aVar = this.f79223d.get(componentName);
            if (aVar != null) {
                m107337g(aVar);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m107335e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f79223d.get(componentName);
            if (aVar != null) {
                aVar.f79227c = c1m.AbstractBinderC16163a.m107621O(iBinder);
                aVar.f79229e = 0;
                m107337g(aVar);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m107336f(ComponentName componentName) {
            a aVar = this.f79223d.get(componentName);
            if (aVar != null) {
                m107332b(aVar);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m107337g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f79225a);
                aVar.f79228d.size();
            }
            if (aVar.f79228d.isEmpty()) {
                return;
            }
            if (!m107331a(aVar) || aVar.f79227c == null) {
                m107339i(aVar);
                return;
            }
            while (true) {
                InterfaceC16153e interfaceC16153ePeek = aVar.f79228d.peek();
                if (interfaceC16153ePeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        interfaceC16153ePeek.toString();
                    }
                    interfaceC16153ePeek.mo107330a(aVar.f79227c);
                    aVar.f79228d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(aVar.f79225a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f79225a);
                }
            }
            if (aVar.f79228d.isEmpty()) {
                return;
            }
            m107339i(aVar);
        }

        /* JADX INFO: renamed from: h */
        public void m107338h(InterfaceC16153e interfaceC16153e) {
            this.f79222c.obtainMessage(0, interfaceC16153e).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m107333c((InterfaceC16153e) message.obj);
                return true;
            }
            if (i == 1) {
                C16151c c16151c = (C16151c) message.obj;
                m107335e(c16151c.f79218a, c16151c.f79219b);
                return true;
            }
            if (i == 2) {
                m107336f((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            m107334d((ComponentName) message.obj);
            return true;
        }

        /* JADX INFO: renamed from: i */
        public final void m107339i(a aVar) {
            if (this.f79222c.hasMessages(3, aVar.f79225a)) {
                return;
            }
            int i = aVar.f79229e;
            int i2 = i + 1;
            aVar.f79229e = i2;
            if (i2 > 6) {
                aVar.f79228d.size();
                Objects.toString(aVar.f79225a);
                aVar.f79228d.clear();
            } else {
                Log.isLoggable("NotifManCompat", 3);
                this.f79222c.sendMessageDelayed(this.f79222c.obtainMessage(3, aVar.f79225a), (1 << i) * 1000);
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m107340j() {
            Set<String> setM107320f = c050.m107320f(this.f79220a);
            if (setM107320f.equals(this.f79224e)) {
                return;
            }
            this.f79224e = setM107320f;
            List<ResolveInfo> listQueryIntentServices = this.f79220a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM107320f.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f79223d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f79223d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f79223d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(next.getKey());
                    }
                    m107332b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f79222c.obtainMessage(1, new C16151c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f79222c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: l.c050$e */
    public interface InterfaceC16153e {
        /* JADX INFO: renamed from: a */
        void mo107330a(c1m c1mVar) throws RemoteException;
    }

    public c050(Context context) {
        this.f79212a = context;
        this.f79213b = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static c050 m107319e(@NonNull Context context) {
        return new c050(context);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Set<String> m107320f(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f79207c) {
            if (string != null) {
                try {
                    if (!string.equals(f79208d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f79209e = hashSet;
                        f79208d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f79209e;
        }
        return set;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m107321j(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean("android.support.useSideChannel");
    }

    /* JADX INFO: renamed from: a */
    public boolean m107322a() {
        return C16149a.m107329a(this.f79213b);
    }

    /* JADX INFO: renamed from: b */
    public void m107323b(int i) {
        m107324c(null, i);
    }

    /* JADX INFO: renamed from: c */
    public void m107324c(@Nullable String str, int i) {
        this.f79213b.cancel(str, i);
    }

    /* JADX INFO: renamed from: d */
    public void m107325d() {
        this.f79213b.cancelAll();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: g */
    public void m107326g(int i, @NonNull Notification notification) {
        m107327h(null, i, notification);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: h */
    public void m107327h(@Nullable String str, int i, @NonNull Notification notification) {
        if (!m107321j(notification)) {
            jj5.m145014h(this.f79213b, str, i, notification);
        } else {
            m107328i(new C16150b(this.f79212a.getPackageName(), i, str, notification));
            this.f79213b.cancel(str, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m107328i(InterfaceC16153e interfaceC16153e) {
        synchronized (f79210f) {
            try {
                if (f79211g == null) {
                    f79211g = new ServiceConnectionC16152d(this.f79212a.getApplicationContext());
                }
                f79211g.m107338h(interfaceC16153e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
