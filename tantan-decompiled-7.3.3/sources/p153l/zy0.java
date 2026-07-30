package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public class zy0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d */
    public static zy0 f206538d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f206539e = false;

    /* JADX INFO: renamed from: b */
    public final LinkedList<InterfaceC21927a> f206541b;

    /* JADX INFO: renamed from: a */
    public boolean f206540a = false;

    /* JADX INFO: renamed from: c */
    public String f206542c = "default";

    /* JADX INFO: renamed from: l.zy0$a */
    public interface InterfaceC21927a {
        /* JADX INFO: renamed from: a */
        void mo82235a(Activity activity);

        /* JADX INFO: renamed from: b */
        void mo82236b(boolean z);

        /* JADX INFO: renamed from: c */
        void mo82237c(Activity activity);

        /* JADX INFO: renamed from: d */
        void mo82238d(Activity activity);

        void onActivityDestroyed(Activity activity);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    public zy0(@NonNull Application application) {
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
        this.f206541b = new LinkedList<>();
    }

    /* JADX INFO: renamed from: c */
    public static zy0 m222096c() {
        return f206538d;
    }

    /* JADX INFO: renamed from: d */
    public static String m222097d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap.size() < 1) {
                f610.m124263a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    String name = ((Activity) declaredField3.get(obj)).getClass().getName();
                    f610.m124263a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    return name;
                }
            }
            f610.m124263a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                f610.m124263a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m222098f(Application application) {
        if (f206539e) {
            f610.m124264b("ApplicationLifeObserver has inited!", new Object[0]);
            return;
        }
        if (f206538d == null) {
            f206538d = new zy0(application);
        }
        f206539e = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m222099a(String str) {
        if (this.f206540a && f206539e) {
            f610.m124266d("[onBackground] visibleScene[%s]", str);
            try {
                Iterator<InterfaceC21927a> it = this.f206541b.iterator();
                while (it.hasNext()) {
                    it.next().mo82236b(false);
                }
                this.f206540a = false;
            } catch (Throwable th) {
                this.f206540a = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m222100b(String str) {
        if (this.f206540a || !f206539e) {
            return;
        }
        f610.m124266d("[onForeground] visibleScene[%s]", str);
        try {
            Iterator<InterfaceC21927a> it = this.f206541b.iterator();
            while (it.hasNext()) {
                it.next().mo82236b(true);
            }
            this.f206540a = true;
        } catch (Throwable th) {
            this.f206540a = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m222101e() {
        return this.f206542c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m222102g() {
        return this.f206540a;
    }

    /* JADX INFO: renamed from: h */
    public void m222103h(InterfaceC21927a interfaceC21927a) {
        LinkedList<InterfaceC21927a> linkedList = this.f206541b;
        if (linkedList != null) {
            linkedList.add(interfaceC21927a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m222104i(InterfaceC21927a interfaceC21927a) {
        LinkedList<InterfaceC21927a> linkedList = this.f206541b;
        if (linkedList != null) {
            linkedList.remove(interfaceC21927a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m222105j(Activity activity) {
        this.f206542c = activity.getClass().getName();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().mo82237c(activity);
        }
        m222105j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().mo82238d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().mo82235a(activity);
        }
        if (this.f206540a) {
            return;
        }
        m222105j(activity);
        m222100b(m222101e());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
        m222105j(activity);
        if (this.f206540a) {
            return;
        }
        m222100b(m222101e());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator<InterfaceC21927a> it = this.f206541b.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
        if (m222097d() == null) {
            m222099a(m222101e());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
