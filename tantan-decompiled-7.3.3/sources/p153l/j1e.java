package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.DialogAct;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class j1e {

    /* JADX INFO: renamed from: e */
    public static final j1e f117952e = new j1e();

    /* JADX INFO: renamed from: a */
    public Comparator<InterfaceC17849b> f117953a = new Comparator() { // from class: l.i1e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return j1e.m143115a((j1e.InterfaceC17849b) obj, (j1e.InterfaceC17849b) obj2);
        }
    };

    /* JADX INFO: renamed from: b */
    public l01<WeakReference<Context>, Queue<InterfaceC17849b>> f117954b = new l01<>();

    /* JADX INFO: renamed from: c */
    public l01<WeakReference<Context>, InterfaceC17849b> f117955c = new l01<>();

    /* JADX INFO: renamed from: d */
    public WeakReference<Context> f117956d;

    /* JADX INFO: renamed from: l.j1e$b */
    public interface InterfaceC17849b {
        /* JADX INFO: renamed from: c */
        long mo128496c();

        void dismiss();

        int getPriority();

        boolean isShowing();

        /* JADX INFO: renamed from: p */
        void mo128497p();
    }

    public j1e() {
        App.f16088e.registerActivityLifecycleCallbacks(new C17848a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m143115a(InterfaceC17849b interfaceC17849b, InterfaceC17849b interfaceC17849b2) {
        return interfaceC17849b2.getPriority() == interfaceC17849b.getPriority() ? Long.compare(interfaceC17849b.mo128496c(), interfaceC17849b2.mo128496c()) : interfaceC17849b2.getPriority() - interfaceC17849b.getPriority();
    }

    /* JADX INFO: renamed from: i */
    public static j1e m143118i() {
        return f117952e;
    }

    /* JADX INFO: renamed from: d */
    public void m143119d(Context context, InterfaceC17849b interfaceC17849b) {
        if (context == null) {
            context = this.f117956d.get();
        }
        WeakReference<Context> weakReferenceM143122g = m143122g(context);
        if (this.f117955c.get(weakReferenceM143122g) != null && !this.f117955c.get(weakReferenceM143122g).isShowing()) {
            this.f117955c.remove(weakReferenceM143122g);
        }
        m143123h(weakReferenceM143122g).offer(interfaceC17849b);
        m143126l(context, false);
    }

    /* JADX INFO: renamed from: f */
    public final WeakReference<Context> m143121f(Context context) {
        for (WeakReference<Context> weakReference : this.f117954b.keySet()) {
            if (context == weakReference.get()) {
                return weakReference;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final WeakReference<Context> m143122g(Context context) {
        WeakReference<Context> weakReferenceM143121f = m143121f(context);
        return weakReferenceM143121f == null ? new WeakReference<>(context) : weakReferenceM143121f;
    }

    /* JADX INFO: renamed from: h */
    public final Queue<InterfaceC17849b> m143123h(WeakReference<Context> weakReference) {
        m143120e(weakReference.get());
        if (this.f117954b.containsKey(weakReference)) {
            return this.f117954b.get(weakReference);
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, this.f117953a);
        this.f117954b.put(weakReference, priorityQueue);
        return priorityQueue;
    }

    /* JADX INFO: renamed from: j */
    public void m143124j(Context context, InterfaceC17849b interfaceC17849b) {
        if (context == null) {
            context = this.f117956d.get();
        }
        m143123h(m143122g(context)).remove(interfaceC17849b);
    }

    /* JADX INFO: renamed from: k */
    public final void m143125k(Context context) {
        WeakReference<Context> weakReferenceM143121f = m143121f(context);
        if (weakReferenceM143121f != null) {
            this.f117954b.remove(weakReferenceM143121f);
            this.f117955c.remove(weakReferenceM143121f);
        }
        for (WeakReference<Context> weakReference : this.f117954b.keySet()) {
            if (weakReference.get() == null) {
                this.f117954b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m143126l(Context context, boolean z) {
        if (context == null) {
            m143127m(this.f117956d.get(), z);
        } else {
            m143127m(context, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m143127m(Context context, boolean z) {
        InterfaceC17849b interfaceC17849b;
        WeakReference<Context> weakReferenceM143122g = m143122g(context);
        if (z && this.f117955c.get(weakReferenceM143122g) != null && !this.f117955c.get(weakReferenceM143122g).isShowing()) {
            this.f117955c.remove(weakReferenceM143122g);
        }
        Queue<InterfaceC17849b> queueM143123h = m143123h(weakReferenceM143122g);
        InterfaceC17849b interfaceC17849bPeek = queueM143123h.peek();
        if (interfaceC17849bPeek == null) {
            return;
        }
        if (this.f117955c.get(weakReferenceM143122g) == null) {
            queueM143123h.poll();
            interfaceC17849bPeek.mo128497p();
            this.f117955c.put(weakReferenceM143122g, interfaceC17849bPeek);
        } else if (interfaceC17849bPeek.getPriority() == 2147482647 && (interfaceC17849b = this.f117955c.get(weakReferenceM143122g)) != null && interfaceC17849b.isShowing()) {
            interfaceC17849b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.j1e$a */
    public class C17848a implements Application.ActivityLifecycleCallbacks {
        public C17848a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            j1e.this.m143125k(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof DialogAct) {
                return;
            }
            j1e.this.f117956d = new WeakReference(activity);
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
    public final void m143120e(Context context) {
    }
}
