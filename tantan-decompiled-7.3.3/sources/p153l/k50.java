package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class k50 {

    /* JADX INFO: renamed from: e */
    private static k50 f123955e = new k50();

    /* JADX INFO: renamed from: b */
    Application f123957b;

    /* JADX INFO: renamed from: a */
    private final LinkedList<Activity> f123956a = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    private boolean f123958c = false;

    /* JADX INFO: renamed from: d */
    Application.ActivityLifecycleCallbacks f123959d = new C18096a();

    private k50() {
    }

    /* JADX INFO: renamed from: c */
    public static k50 m148313c() {
        return f123955e;
    }

    /* JADX INFO: renamed from: d */
    public void m148314d(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.f123957b = application;
        application.registerActivityLifecycleCallbacks(this.f123959d);
    }

    /* JADX INFO: renamed from: e */
    public void m148315e() {
        Application application = this.f123957b;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f123959d);
        }
        f123955e.f123956a.clear();
        f123955e = null;
    }

    /* JADX INFO: renamed from: l.k50$a */
    public class C18096a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        private int f123960a = 0;

        /* JADX INFO: renamed from: b */
        private boolean f123961b = false;

        public C18096a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            k50.this.f123956a.addFirst(activity);
            if (k50.this.f123956a.size() > 10) {
                k50.this.f123956a.removeLast();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            k50.this.f123956a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.f123960a + 1;
            this.f123960a = i;
            if (i != 1 || this.f123961b) {
                return;
            }
            k50.this.f123958c = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean zIsChangingConfigurations = activity.isChangingConfigurations();
            this.f123961b = zIsChangingConfigurations;
            int i = this.f123960a - 1;
            this.f123960a = i;
            if (i != 0 || zIsChangingConfigurations) {
                return;
            }
            k50.this.f123958c = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
