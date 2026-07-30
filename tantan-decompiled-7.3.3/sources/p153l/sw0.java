package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class sw0 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f170906b = true;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC20166c> f170907a;

    /* JADX INFO: renamed from: l.sw0$b */
    public static class C20165b {
        private static sw0 INSTANCE = new sw0(i4g0.m138507e(), null);
    }

    /* JADX INFO: renamed from: l.sw0$c */
    public interface InterfaceC20166c {
        void onBack();

        void onFront();
    }

    public sw0(Context context) {
        this.f170907a = new ArrayList();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(new C20164a());
        }
    }

    /* JADX INFO: renamed from: c */
    public static sw0 m188232c() {
        return C20165b.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public void m188233b(InterfaceC20166c interfaceC20166c) {
        if (this.f170907a.contains(interfaceC20166c)) {
            return;
        }
        this.f170907a.add(interfaceC20166c);
    }

    /* JADX INFO: renamed from: l.sw0$a */
    public class C20164a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public int f170908a = 0;

        public C20164a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.f170908a + 1;
            this.f170908a = i;
            if (i == 1) {
                sw0.f170906b = false;
                Iterator it = sw0.this.f170907a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC20166c) it.next()).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.f170908a - 1;
            this.f170908a = i;
            if (i == 0) {
                Iterator it = sw0.this.f170907a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC20166c) it.next()).onBack();
                }
                sw0.f170906b = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    public /* synthetic */ sw0(Context context, C20164a c20164a) {
        this(context);
    }
}
