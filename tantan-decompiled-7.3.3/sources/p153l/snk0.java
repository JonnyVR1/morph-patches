package p153l;

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
public final class snk0 {

    /* JADX INFO: renamed from: a */
    private static final C20116a f169709a = new C20116a();

    /* JADX INFO: renamed from: b */
    private static final ExecutorService f169710b = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: c */
    private static final Handler f169711c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static Application f169712d;

    /* JADX INFO: renamed from: l.snk0$b */
    public interface InterfaceC20117b {
        void onActivityDestroyed(Activity activity);
    }

    /* JADX INFO: renamed from: l.snk0$c */
    public interface InterfaceC20118c {
        /* JADX INFO: renamed from: a */
        void m186965a();

        /* JADX INFO: renamed from: b */
        void m186966b();
    }

    /* JADX INFO: renamed from: b */
    public static void m186954b(Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) m186955c().getSystemService("input_method");
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
    public static Application m186955c() {
        Application application = f169712d;
        if (application != null) {
            return application;
        }
        Application applicationM186956d = m186956d();
        m186958f(applicationM186956d);
        return applicationM186956d;
    }

    /* JADX INFO: renamed from: d */
    private static Application m186956d() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("u should init first");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            mnd0.m159157a("u should init first");
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            mnd0.m159157a("u should init first");
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            mnd0.m159157a("u should init first");
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            mnd0.m159157a("u should init first");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m186957e() {
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
    public static void m186958f(Application application) {
        if (f169712d == null) {
            if (application == null) {
                f169712d = m186956d();
            } else {
                f169712d = application;
            }
            f169712d.registerActivityLifecycleCallbacks(f169709a);
            return;
        }
        if (application == null || application.getClass() == f169712d.getClass()) {
            return;
        }
        Application application2 = f169712d;
        C20116a c20116a = f169709a;
        application2.unregisterActivityLifecycleCallbacks(c20116a);
        c20116a.f169713a.clear();
        f169712d = application;
        application.registerActivityLifecycleCallbacks(c20116a);
    }

    /* JADX INFO: renamed from: g */
    public static void m186959g(Runnable runnable, long j) {
        f169711c.postDelayed(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m186960h() {
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

    /* JADX INFO: renamed from: l.snk0$a */
    public static class C20116a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        final LinkedList<Activity> f169713a = new LinkedList<>();

        /* JADX INFO: renamed from: b */
        final Map<Object, InterfaceC20118c> f169714b = new HashMap();

        /* JADX INFO: renamed from: c */
        final Map<Activity, Set<InterfaceC20117b>> f169715c = new HashMap();

        /* JADX INFO: renamed from: d */
        private int f169716d = 0;

        /* JADX INFO: renamed from: e */
        private int f169717e = 0;

        /* JADX INFO: renamed from: f */
        private boolean f169718f = false;

        /* JADX INFO: renamed from: l.snk0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Activity f169719a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f169720b;

            public a(Activity activity, Object obj) {
                this.f169719a = activity;
                this.f169720b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f169719a.getWindow().setSoftInputMode(((Integer) this.f169720b).intValue());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m186961a(Activity activity) {
            Iterator<Map.Entry<Activity, Set<InterfaceC20117b>>> it = this.f169715c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Activity, Set<InterfaceC20117b>> next = it.next();
                if (next.getKey() == activity) {
                    Iterator<InterfaceC20117b> it2 = next.getValue().iterator();
                    while (it2.hasNext()) {
                        it2.next().onActivityDestroyed(activity);
                    }
                    it.remove();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m186962b(boolean z) {
            InterfaceC20118c next;
            if (this.f169714b.isEmpty()) {
                return;
            }
            Iterator<InterfaceC20118c> it = this.f169714b.values().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (z) {
                    next.m186966b();
                } else {
                    next.m186965a();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        private void m186963c(Activity activity, boolean z) {
            if (z) {
                activity.getWindow().getDecorView().setTag(-123, Integer.valueOf(activity.getWindow().getAttributes().softInputMode));
                activity.getWindow().setSoftInputMode(3);
            } else {
                Object tag = activity.getWindow().getDecorView().getTag(-123);
                if (tag instanceof Integer) {
                    snk0.m186959g(new a(activity, tag), 100L);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        private void m186964d(Activity activity) {
            if ("com.blankj.com.momo.live.core.util.utilcode.util.PermissionUtils$PermissionActivity".equals(activity.getClass().getName())) {
                return;
            }
            boolean zContains = this.f169713a.contains(activity);
            LinkedList<Activity> linkedList = this.f169713a;
            if (!zContains) {
                linkedList.addLast(activity);
            } else {
                if (linkedList.getLast().equals(activity)) {
                    return;
                }
                this.f169713a.remove(activity);
                this.f169713a.addLast(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            snk0.m186960h();
            m186964d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f169713a.remove(activity);
            m186961a(activity);
            snk0.m186954b(activity.getWindow());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            m186964d(activity);
            if (this.f169718f) {
                this.f169718f = false;
                m186962b(true);
            }
            m186963c(activity, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!this.f169718f) {
                m186964d(activity);
            }
            int i = this.f169717e;
            if (i < 0) {
                this.f169717e = i + 1;
            } else {
                this.f169716d++;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.isChangingConfigurations()) {
                this.f169717e--;
            } else {
                int i = this.f169716d - 1;
                this.f169716d = i;
                if (i <= 0) {
                    this.f169718f = true;
                    m186962b(false);
                }
            }
            m186963c(activity, true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
