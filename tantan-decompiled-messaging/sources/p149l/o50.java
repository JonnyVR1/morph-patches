package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class o50 {

    /* JADX INFO: renamed from: e */
    private static o50 f141841e = new o50();

    /* JADX INFO: renamed from: b */
    Application f141843b;

    /* JADX INFO: renamed from: a */
    private final LinkedList<Activity> f141842a = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    private boolean f141844c = false;

    /* JADX INFO: renamed from: d */
    Application.ActivityLifecycleCallbacks f141845d = new C18844a();

    private o50() {
    }

    /* JADX INFO: renamed from: c */
    public static o50 m162747c() {
        return f141841e;
    }

    /* JADX INFO: renamed from: d */
    public void m162748d(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.f141843b = application;
        application.registerActivityLifecycleCallbacks(this.f141845d);
    }

    /* JADX INFO: renamed from: e */
    public void m162749e() {
        Application application = this.f141843b;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f141845d);
        }
        f141841e.f141842a.clear();
        f141841e = null;
    }

    /* JADX INFO: renamed from: l.o50$a */
    public class C18844a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        private int f141846a = 0;

        /* JADX INFO: renamed from: b */
        private boolean f141847b = false;

        public C18844a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            o50.this.f141842a.addFirst(activity);
            if (o50.this.f141842a.size() > 10) {
                o50.this.f141842a.removeLast();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            o50.this.f141842a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.f141846a + 1;
            this.f141846a = i;
            if (i != 1 || this.f141847b) {
                return;
            }
            o50.this.f141844c = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            boolean zIsChangingConfigurations = activity.isChangingConfigurations();
            this.f141847b = zIsChangingConfigurations;
            int i = this.f141846a - 1;
            this.f141846a = i;
            if (i != 0 || zIsChangingConfigurations) {
                return;
            }
            o50.this.f141844c = false;
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
