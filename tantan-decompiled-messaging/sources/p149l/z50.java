package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class z50 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f201727a;

    /* JADX INFO: renamed from: b */
    public static final Field f201728b;

    /* JADX INFO: renamed from: c */
    public static final Field f201729c;

    /* JADX INFO: renamed from: d */
    public static final Method f201730d;

    /* JADX INFO: renamed from: e */
    public static final Method f201731e;

    /* JADX INFO: renamed from: f */
    public static final Method f201732f;

    /* JADX INFO: renamed from: g */
    public static final Handler f201733g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.z50$a */
    public class RunnableC21633a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C21636d f201734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f201735b;

        public RunnableC21633a(C21636d c21636d, Object obj) {
            this.f201734a = c21636d;
            this.f201735b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f201734a.f201740a = this.f201735b;
        }
    }

    /* JADX INFO: renamed from: l.z50$b */
    public class RunnableC21634b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Application f201736a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C21636d f201737b;

        public RunnableC21634b(Application application, C21636d c21636d) {
            this.f201736a = application;
            this.f201737b = c21636d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f201736a.unregisterActivityLifecycleCallbacks(this.f201737b);
        }
    }

    /* JADX INFO: renamed from: l.z50$c */
    public class RunnableC21635c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f201738a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f201739b;

        public RunnableC21635c(Object obj, Object obj2) {
            this.f201738a = obj;
            this.f201739b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = z50.f201730d;
                if (method != null) {
                    method.invoke(this.f201738a, this.f201739b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    z50.f201731e.invoke(this.f201738a, this.f201739b, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> clsM217260a = m217260a();
        f201727a = clsM217260a;
        f201728b = m217261b();
        f201729c = m217265f();
        f201730d = m217263d(clsM217260a);
        f201731e = m217262c(clsM217260a);
        f201732f = m217264e(clsM217260a);
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m217260a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m217261b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m217262c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m217263d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Method m217264e(Class<?> cls) {
        if (m217266g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Field m217265f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217266g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m217267h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f201729c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f201733g.postAtFrontOfQueue(new RunnableC21635c(f201728b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m217268i(@NonNull Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m217266g() && f201732f == null) {
            return false;
        }
        if (f201731e == null && f201730d == null) {
            return false;
        }
        try {
            Object obj2 = f201729c.get(activity);
            if (obj2 == null || (obj = f201728b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C21636d c21636d = new C21636d(activity);
            application.registerActivityLifecycleCallbacks(c21636d);
            f201733g.post(new RunnableC21633a(c21636d, obj2));
            try {
                if (m217266g()) {
                    Method method = f201732f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f201733g.post(new RunnableC21634b(application, c21636d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.z50$d */
    public static final class C21636d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f201740a;

        /* JADX INFO: renamed from: b */
        public Activity f201741b;

        /* JADX INFO: renamed from: c */
        public final int f201742c;

        /* JADX INFO: renamed from: d */
        public boolean f201743d = false;

        /* JADX INFO: renamed from: e */
        public boolean f201744e = false;

        /* JADX INFO: renamed from: f */
        public boolean f201745f = false;

        public C21636d(@NonNull Activity activity) {
            this.f201741b = activity;
            this.f201742c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f201741b == activity) {
                this.f201741b = null;
                this.f201744e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f201744e || this.f201745f || this.f201743d || !z50.m217267h(this.f201740a, this.f201742c, activity)) {
                return;
            }
            this.f201745f = true;
            this.f201740a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f201741b == activity) {
                this.f201743d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
