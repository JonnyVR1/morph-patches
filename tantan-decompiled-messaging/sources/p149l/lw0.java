package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class lw0 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f130219b = true;

    /* JADX INFO: renamed from: a */
    public List<InterfaceC18329c> f130220a;

    /* JADX INFO: renamed from: l.lw0$b */
    public static class C18328b {
        private static lw0 INSTANCE = new lw0(zvf0.m220383e(), null);
    }

    /* JADX INFO: renamed from: l.lw0$c */
    public interface InterfaceC18329c {
        void onBack();

        void onFront();
    }

    public lw0(Context context) {
        this.f130220a = new ArrayList();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(new C18327a());
        }
    }

    /* JADX INFO: renamed from: c */
    public static lw0 m151927c() {
        return C18328b.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public void m151928b(InterfaceC18329c interfaceC18329c) {
        if (this.f130220a.contains(interfaceC18329c)) {
            return;
        }
        this.f130220a.add(interfaceC18329c);
    }

    public /* synthetic */ lw0(Context context, C18327a c18327a) {
        this(context);
    }

    /* JADX INFO: renamed from: l.lw0$a */
    public class C18327a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public int f130221a = 0;

        public C18327a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.f130221a + 1;
            this.f130221a = i;
            if (i == 1) {
                lw0.f130219b = false;
                Iterator it = lw0.this.f130220a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18329c) it.next()).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.f130221a - 1;
            this.f130221a = i;
            if (i == 0) {
                Iterator it = lw0.this.f130220a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18329c) it.next()).onBack();
                }
                lw0.f130219b = true;
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
}
