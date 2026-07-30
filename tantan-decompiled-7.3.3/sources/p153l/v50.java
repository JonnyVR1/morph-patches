package p153l;

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
public final class v50 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f182454a;

    /* JADX INFO: renamed from: b */
    public static final Field f182455b;

    /* JADX INFO: renamed from: c */
    public static final Field f182456c;

    /* JADX INFO: renamed from: d */
    public static final Method f182457d;

    /* JADX INFO: renamed from: e */
    public static final Method f182458e;

    /* JADX INFO: renamed from: f */
    public static final Method f182459f;

    /* JADX INFO: renamed from: g */
    public static final Handler f182460g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.v50$a */
    public class RunnableC20759a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C20762d f182461a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f182462b;

        public RunnableC20759a(C20762d c20762d, Object obj) {
            this.f182461a = c20762d;
            this.f182462b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f182461a.f182467a = this.f182462b;
        }
    }

    /* JADX INFO: renamed from: l.v50$b */
    public class RunnableC20760b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Application f182463a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C20762d f182464b;

        public RunnableC20760b(Application application, C20762d c20762d) {
            this.f182463a = application;
            this.f182464b = c20762d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f182463a.unregisterActivityLifecycleCallbacks(this.f182464b);
        }
    }

    /* JADX INFO: renamed from: l.v50$c */
    public class RunnableC20761c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f182465a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f182466b;

        public RunnableC20761c(Object obj, Object obj2) {
            this.f182465a = obj;
            this.f182466b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = v50.f182457d;
                if (method != null) {
                    method.invoke(this.f182465a, this.f182466b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    v50.f182458e.invoke(this.f182465a, this.f182466b, Boolean.FALSE);
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
        Class<?> clsM199755a = m199755a();
        f182454a = clsM199755a;
        f182455b = m199756b();
        f182456c = m199760f();
        f182457d = m199758d(clsM199755a);
        f182458e = m199757c(clsM199755a);
        f182459f = m199759e(clsM199755a);
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m199755a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m199756b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m199757c(Class<?> cls) {
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
    public static Method m199758d(Class<?> cls) {
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
    public static Method m199759e(Class<?> cls) {
        if (m199761g() && cls != null) {
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
    public static Field m199760f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m199761g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m199762h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f182456c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f182460g.postAtFrontOfQueue(new RunnableC20761c(f182455b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m199763i(@NonNull Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m199761g() && f182459f == null) {
            return false;
        }
        if (f182458e == null && f182457d == null) {
            return false;
        }
        try {
            Object obj2 = f182456c.get(activity);
            if (obj2 == null || (obj = f182455b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C20762d c20762d = new C20762d(activity);
            application.registerActivityLifecycleCallbacks(c20762d);
            f182460g.post(new RunnableC20759a(c20762d, obj2));
            try {
                if (m199761g()) {
                    Method method = f182459f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f182460g.post(new RunnableC20760b(application, c20762d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.v50$d */
    public static final class C20762d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f182467a;

        /* JADX INFO: renamed from: b */
        public Activity f182468b;

        /* JADX INFO: renamed from: c */
        public final int f182469c;

        /* JADX INFO: renamed from: d */
        public boolean f182470d = false;

        /* JADX INFO: renamed from: e */
        public boolean f182471e = false;

        /* JADX INFO: renamed from: f */
        public boolean f182472f = false;

        public C20762d(@NonNull Activity activity) {
            this.f182468b = activity;
            this.f182469c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f182468b == activity) {
                this.f182468b = null;
                this.f182471e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f182471e || this.f182472f || this.f182470d || !v50.m199762h(this.f182467a, this.f182469c, activity)) {
                return;
            }
            this.f182472f = true;
            this.f182467a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f182468b == activity) {
                this.f182470d = true;
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
