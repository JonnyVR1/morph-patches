package p149l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public final class mek0 {

    /* JADX INFO: renamed from: a */
    private static final C18444a f133436a = new C18444a();

    /* JADX INFO: renamed from: b */
    private static final ExecutorService f133437b = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: c */
    private static final Handler f133438c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static Application f133439d;

    /* JADX INFO: renamed from: l.mek0$b */
    public interface InterfaceC18445b {
        void onActivityDestroyed(Activity activity);
    }

    /* JADX INFO: renamed from: l.mek0$c */
    public interface InterfaceC18446c {
        /* JADX INFO: renamed from: a */
        void m154251a();

        /* JADX INFO: renamed from: b */
        void m154252b();
    }

    /* JADX INFO: renamed from: b */
    public static void m154240b(Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) m154241c().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 4; i++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                if (declaredField != null) {
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                        declaredField.set(inputMethodManager, null);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Application m154241c() {
        Application application = f133439d;
        if (application != null) {
            return application;
        }
        Application applicationM154242d = m154242d();
        m154244f(applicationM154242d);
        return applicationM154242d;
    }

    /* JADX INFO: renamed from: d */
    private static Application m154242d() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("u should init first");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            jfd0.m141176a("u should init first");
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            jfd0.m141176a("u should init first");
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            jfd0.m141176a("u should init first");
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            jfd0.m141176a("u should init first");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m154243e() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append("\nStack info, thread:" + Thread.currentThread().getName() + SignParameters.NEW_LINE);
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.getClassName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m154244f(Application application) {
        if (f133439d == null) {
            if (application == null) {
                f133439d = m154242d();
            } else {
                f133439d = application;
            }
            f133439d.registerActivityLifecycleCallbacks(f133436a);
            return;
        }
        if (application == null || application.getClass() == f133439d.getClass()) {
            return;
        }
        Application application2 = f133439d;
        C18444a c18444a = f133436a;
        application2.unregisterActivityLifecycleCallbacks(c18444a);
        c18444a.f133440a.clear();
        f133439d = application;
        application.registerActivityLifecycleCallbacks(c18444a);
    }

    /* JADX INFO: renamed from: g */
    public static void m154245g(Runnable runnable, long j) {
        f133438c.postDelayed(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m154246h() {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.mek0$a */
    public static class C18444a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        final LinkedList<Activity> f133440a = new LinkedList<>();

        /* JADX INFO: renamed from: b */
        final Map<Object, InterfaceC18446c> f133441b = new HashMap();

        /* JADX INFO: renamed from: c */
        final Map<Activity, Set<InterfaceC18445b>> f133442c = new HashMap();

        /* JADX INFO: renamed from: d */
        private int f133443d = 0;

        /* JADX INFO: renamed from: e */
        private int f133444e = 0;

        /* JADX INFO: renamed from: f */
        private boolean f133445f = false;

        /* JADX INFO: renamed from: l.mek0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Activity f133446a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f133447b;

            public a(Activity activity, Object obj) {
                this.f133446a = activity;
                this.f133447b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f133446a.getWindow().setSoftInputMode(((Integer) this.f133447b).intValue());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m154247a(Activity activity) {
            Iterator<Map.Entry<Activity, Set<InterfaceC18445b>>> it = this.f133442c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Activity, Set<InterfaceC18445b>> next = it.next();
                if (next.getKey() == activity) {
                    Iterator<InterfaceC18445b> it2 = next.getValue().iterator();
                    while (it2.hasNext()) {
                        it2.next().onActivityDestroyed(activity);
                    }
                    it.remove();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m154248b(boolean z) {
            InterfaceC18446c next;
            if (this.f133441b.isEmpty()) {
                return;
            }
            Iterator<InterfaceC18446c> it = this.f133441b.values().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (z) {
                    next.m154252b();
                } else {
                    next.m154251a();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        private void m154249c(Activity activity, boolean z) {
            if (z) {
                activity.getWindow().getDecorView().setTag(-123, Integer.valueOf(activity.getWindow().getAttributes().softInputMode));
                activity.getWindow().setSoftInputMode(3);
            } else {
                Object tag = activity.getWindow().getDecorView().getTag(-123);
                if (tag instanceof Integer) {
                    mek0.m154245g(new a(activity, tag), 100L);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m154250d(Activity activity) {
            if ("com.blankj.com.momo.live.core.util.utilcode.util.PermissionUtils$PermissionActivity".equals(activity.getClass().getName())) {
                return;
            }
            boolean zContains = this.f133440a.contains(activity);
            LinkedList<Activity> linkedList = this.f133440a;
            if (!zContains) {
                linkedList.addLast(activity);
            } else {
                if (linkedList.getLast().equals(activity)) {
                    return;
                }
                this.f133440a.remove(activity);
                this.f133440a.addLast(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            mek0.m154246h();
            m154250d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f133440a.remove(activity);
            m154247a(activity);
            mek0.m154240b(activity.getWindow());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            m154250d(activity);
            if (this.f133445f) {
                this.f133445f = false;
                m154248b(true);
            }
            m154249c(activity, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!this.f133445f) {
                m154250d(activity);
            }
            int i = this.f133444e;
            if (i < 0) {
                this.f133444e = i + 1;
            } else {
                this.f133443d++;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.isChangingConfigurations()) {
                this.f133444e--;
            } else {
                int i = this.f133443d - 1;
                this.f133443d = i;
                if (i <= 0) {
                    this.f133445f = true;
                    m154248b(false);
                }
            }
            m154249c(activity, true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
