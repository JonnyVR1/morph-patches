package p007l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.p003p1.mobile.android.app.App;
import com.p003p1.mobile.android.app.DialogAct;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class vzd {

    /* JADX INFO: renamed from: e */
    public static final vzd f4996e = new vzd();

    /* JADX INFO: renamed from: a */
    public Comparator<InterfaceC0747b> f4997a = new Comparator() { // from class: l.uzd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return vzd.m11298a((vzd.InterfaceC0747b) obj, (vzd.InterfaceC0747b) obj2);
        }
    };

    /* JADX INFO: renamed from: b */
    public e01<WeakReference<Context>, Queue<InterfaceC0747b>> f4998b = new e01<>();

    /* JADX INFO: renamed from: c */
    public e01<WeakReference<Context>, InterfaceC0747b> f4999c = new e01<>();

    /* JADX INFO: renamed from: d */
    public WeakReference<Context> f5000d;

    /* JADX INFO: renamed from: l.vzd$b */
    public interface InterfaceC0747b {
        /* JADX INFO: renamed from: c */
        long mo10764c();

        void dismiss();

        int getPriority();

        boolean isShowing();

        /* JADX INFO: renamed from: p */
        void mo10765p();
    }

    public vzd() {
        App.f1068e.registerActivityLifecycleCallbacks(new C0746a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m11298a(InterfaceC0747b interfaceC0747b, InterfaceC0747b interfaceC0747b2) {
        return interfaceC0747b2.getPriority() == interfaceC0747b.getPriority() ? Long.compare(interfaceC0747b.mo10764c(), interfaceC0747b2.mo10764c()) : interfaceC0747b2.getPriority() - interfaceC0747b.getPriority();
    }

    /* JADX INFO: renamed from: i */
    public static vzd m11301i() {
        return f4996e;
    }

    /* JADX INFO: renamed from: d */
    public void m11302d(Context context, InterfaceC0747b interfaceC0747b) {
        if (context == null) {
            context = this.f5000d.get();
        }
        WeakReference<Context> weakReferenceM11305g = m11305g(context);
        if (this.f4999c.get(weakReferenceM11305g) != null && !((InterfaceC0747b) this.f4999c.get(weakReferenceM11305g)).isShowing()) {
            this.f4999c.remove(weakReferenceM11305g);
        }
        m11306h(weakReferenceM11305g).offer(interfaceC0747b);
        m11309l(context, false);
    }

    /* JADX INFO: renamed from: f */
    public final WeakReference<Context> m11304f(Context context) {
        for (WeakReference<Context> weakReference : this.f4998b.keySet()) {
            if (context == weakReference.get()) {
                return weakReference;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final WeakReference<Context> m11305g(Context context) {
        WeakReference<Context> weakReferenceM11304f = m11304f(context);
        return weakReferenceM11304f == null ? new WeakReference<>(context) : weakReferenceM11304f;
    }

    /* JADX INFO: renamed from: h */
    public final Queue<InterfaceC0747b> m11306h(WeakReference<Context> weakReference) {
        m11303e(weakReference.get());
        if (this.f4998b.containsKey(weakReference)) {
            return (Queue) this.f4998b.get(weakReference);
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, this.f4997a);
        this.f4998b.put(weakReference, priorityQueue);
        return priorityQueue;
    }

    /* JADX INFO: renamed from: j */
    public void m11307j(Context context, InterfaceC0747b interfaceC0747b) {
        if (context == null) {
            context = this.f5000d.get();
        }
        m11306h(m11305g(context)).remove(interfaceC0747b);
    }

    /* JADX INFO: renamed from: k */
    public final void m11308k(Context context) {
        WeakReference<Context> weakReferenceM11304f = m11304f(context);
        if (weakReferenceM11304f != null) {
            this.f4998b.remove(weakReferenceM11304f);
            this.f4999c.remove(weakReferenceM11304f);
        }
        for (WeakReference weakReference : this.f4998b.keySet()) {
            if (weakReference.get() == null) {
                this.f4998b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11309l(Context context, boolean z) {
        if (context == null) {
            m11310m(this.f5000d.get(), z);
        } else {
            m11310m(context, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11310m(Context context, boolean z) {
        InterfaceC0747b interfaceC0747b;
        WeakReference<Context> weakReferenceM11305g = m11305g(context);
        if (z && this.f4999c.get(weakReferenceM11305g) != null && !((InterfaceC0747b) this.f4999c.get(weakReferenceM11305g)).isShowing()) {
            this.f4999c.remove(weakReferenceM11305g);
        }
        Queue<InterfaceC0747b> queueM11306h = m11306h(weakReferenceM11305g);
        InterfaceC0747b interfaceC0747bPeek = queueM11306h.peek();
        if (interfaceC0747bPeek == null) {
            return;
        }
        if (this.f4999c.get(weakReferenceM11305g) == null) {
            queueM11306h.poll();
            interfaceC0747bPeek.mo10765p();
            this.f4999c.put(weakReferenceM11305g, interfaceC0747bPeek);
        } else if (interfaceC0747bPeek.getPriority() == 2147482647 && (interfaceC0747b = (InterfaceC0747b) this.f4999c.get(weakReferenceM11305g)) != null && interfaceC0747b.isShowing()) {
            interfaceC0747b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.vzd$a */
    public class C0746a implements Application.ActivityLifecycleCallbacks {
        public C0746a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            vzd.this.m11308k(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof DialogAct) {
                return;
            }
            vzd.this.f5000d = new WeakReference(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
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

    /* JADX INFO: renamed from: e */
    public final void m11303e(Context context) {
    }
}
