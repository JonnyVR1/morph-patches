package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public class sy0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d */
    public static sy0 f166846d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f166847e = false;

    /* JADX INFO: renamed from: b */
    public final LinkedList<InterfaceC20069a> f166849b;

    /* JADX INFO: renamed from: a */
    public boolean f166848a = false;

    /* JADX INFO: renamed from: c */
    public String f166850c = "default";

    /* JADX INFO: renamed from: l.sy0$a */
    public interface InterfaceC20069a {
        /* JADX INFO: renamed from: a */
        void mo81052a(Activity activity);

        /* JADX INFO: renamed from: b */
        void mo81053b(boolean z);

        /* JADX INFO: renamed from: c */
        void mo81054c(Activity activity);

        /* JADX INFO: renamed from: d */
        void mo81055d(Activity activity);

        void onActivityDestroyed(Activity activity);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    public sy0(@NonNull Application application) {
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
        this.f166849b = new LinkedList<>();
    }

    /* JADX INFO: renamed from: c */
    public static sy0 m186556c() {
        return f166846d;
    }

    /* JADX INFO: renamed from: d */
    public static String m186557d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap.size() < 1) {
                vx00.m200471a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
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
                    vx00.m200471a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    return name;
                }
            }
            vx00.m200471a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                vx00.m200471a("[getTopActivityName] Cost:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m186558f(Application application) {
        if (f166847e) {
            vx00.m200472b("ApplicationLifeObserver has inited!", new Object[0]);
            return;
        }
        if (f166846d == null) {
            f166846d = new sy0(application);
        }
        f166847e = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m186559a(String str) {
        if (this.f166848a && f166847e) {
            vx00.m200474d("[onBackground] visibleScene[%s]", str);
            try {
                Iterator<InterfaceC20069a> it = this.f166849b.iterator();
                while (it.hasNext()) {
                    it.next().mo81053b(false);
                }
                this.f166848a = false;
            } catch (Throwable th) {
                this.f166848a = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m186560b(String str) {
        if (this.f166848a || !f166847e) {
            return;
        }
        vx00.m200474d("[onForeground] visibleScene[%s]", str);
        try {
            Iterator<InterfaceC20069a> it = this.f166849b.iterator();
            while (it.hasNext()) {
                it.next().mo81053b(true);
            }
            this.f166848a = true;
        } catch (Throwable th) {
            this.f166848a = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m186561e() {
        return this.f166850c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m186562g() {
        return this.f166848a;
    }

    /* JADX INFO: renamed from: h */
    public void m186563h(InterfaceC20069a interfaceC20069a) {
        LinkedList<InterfaceC20069a> linkedList = this.f166849b;
        if (linkedList != null) {
            linkedList.add(interfaceC20069a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m186564i(InterfaceC20069a interfaceC20069a) {
        LinkedList<InterfaceC20069a> linkedList = this.f166849b;
        if (linkedList != null) {
            linkedList.remove(interfaceC20069a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m186565j(Activity activity) {
        this.f166850c = activity.getClass().getName();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().mo81054c(activity);
        }
        m186565j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().mo81055d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().mo81052a(activity);
        }
        if (this.f166848a) {
            return;
        }
        m186565j(activity);
        m186560b(m186561e());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
        m186565j(activity);
        if (this.f166848a) {
            return;
        }
        m186560b(m186561e());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator<InterfaceC20069a> it = this.f166849b.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
        if (m186557d() == null) {
            m186559a(m186561e());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
