package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.DialogAct;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class vzd {

    /* JADX INFO: renamed from: e */
    public static final vzd f183613e = new vzd();

    /* JADX INFO: renamed from: a */
    public Comparator<InterfaceC20772b> f183614a = new Comparator() { // from class: l.uzd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return vzd.m200739a((vzd.InterfaceC20772b) obj, (vzd.InterfaceC20772b) obj2);
        }
    };

    /* JADX INFO: renamed from: b */
    public e01<WeakReference<Context>, Queue<InterfaceC20772b>> f183615b = new e01<>();

    /* JADX INFO: renamed from: c */
    public e01<WeakReference<Context>, InterfaceC20772b> f183616c = new e01<>();

    /* JADX INFO: renamed from: d */
    public WeakReference<Context> f183617d;

    /* JADX INFO: renamed from: l.vzd$b */
    public interface InterfaceC20772b {
        /* JADX INFO: renamed from: c */
        long mo186754c();

        void dismiss();

        int getPriority();

        boolean isShowing();

        /* JADX INFO: renamed from: p */
        void mo186755p();
    }

    public vzd() {
        App.f15369e.registerActivityLifecycleCallbacks(new C20771a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m200739a(InterfaceC20772b interfaceC20772b, InterfaceC20772b interfaceC20772b2) {
        return interfaceC20772b2.getPriority() == interfaceC20772b.getPriority() ? Long.compare(interfaceC20772b.mo186754c(), interfaceC20772b2.mo186754c()) : interfaceC20772b2.getPriority() - interfaceC20772b.getPriority();
    }

    /* JADX INFO: renamed from: i */
    public static vzd m200742i() {
        return f183613e;
    }

    /* JADX INFO: renamed from: d */
    public void m200743d(Context context, InterfaceC20772b interfaceC20772b) {
        if (context == null) {
            context = this.f183617d.get();
        }
        WeakReference<Context> weakReferenceM200746g = m200746g(context);
        if (this.f183616c.get(weakReferenceM200746g) != null && !this.f183616c.get(weakReferenceM200746g).isShowing()) {
            this.f183616c.remove(weakReferenceM200746g);
        }
        m200747h(weakReferenceM200746g).offer(interfaceC20772b);
        m200750l(context, false);
    }

    /* JADX INFO: renamed from: f */
    public final WeakReference<Context> m200745f(Context context) {
        for (WeakReference<Context> weakReference : this.f183615b.keySet()) {
            if (context == weakReference.get()) {
                return weakReference;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final WeakReference<Context> m200746g(Context context) {
        WeakReference<Context> weakReferenceM200745f = m200745f(context);
        return weakReferenceM200745f == null ? new WeakReference<>(context) : weakReferenceM200745f;
    }

    /* JADX INFO: renamed from: h */
    public final Queue<InterfaceC20772b> m200747h(WeakReference<Context> weakReference) {
        m200744e(weakReference.get());
        if (this.f183615b.containsKey(weakReference)) {
            return this.f183615b.get(weakReference);
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, this.f183614a);
        this.f183615b.put(weakReference, priorityQueue);
        return priorityQueue;
    }

    /* JADX INFO: renamed from: j */
    public void m200748j(Context context, InterfaceC20772b interfaceC20772b) {
        if (context == null) {
            context = this.f183617d.get();
        }
        m200747h(m200746g(context)).remove(interfaceC20772b);
    }

    /* JADX INFO: renamed from: k */
    public final void m200749k(Context context) {
        WeakReference<Context> weakReferenceM200745f = m200745f(context);
        if (weakReferenceM200745f != null) {
            this.f183615b.remove(weakReferenceM200745f);
            this.f183616c.remove(weakReferenceM200745f);
        }
        for (WeakReference<Context> weakReference : this.f183615b.keySet()) {
            if (weakReference.get() == null) {
                this.f183615b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m200750l(Context context, boolean z) {
        if (context == null) {
            m200751m(this.f183617d.get(), z);
        } else {
            m200751m(context, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m200751m(Context context, boolean z) {
        InterfaceC20772b interfaceC20772b;
        WeakReference<Context> weakReferenceM200746g = m200746g(context);
        if (z && this.f183616c.get(weakReferenceM200746g) != null && !this.f183616c.get(weakReferenceM200746g).isShowing()) {
            this.f183616c.remove(weakReferenceM200746g);
        }
        Queue<InterfaceC20772b> queueM200747h = m200747h(weakReferenceM200746g);
        InterfaceC20772b interfaceC20772bPeek = queueM200747h.peek();
        if (interfaceC20772bPeek == null) {
            return;
        }
        if (this.f183616c.get(weakReferenceM200746g) == null) {
            queueM200747h.poll();
            interfaceC20772bPeek.mo186755p();
            this.f183616c.put(weakReferenceM200746g, interfaceC20772bPeek);
        } else if (interfaceC20772bPeek.getPriority() == 2147482647 && (interfaceC20772b = this.f183616c.get(weakReferenceM200746g)) != null && interfaceC20772b.isShowing()) {
            interfaceC20772b.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.vzd$a */
    public class C20771a implements Application.ActivityLifecycleCallbacks {
        public C20771a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            vzd.this.m200749k(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof DialogAct) {
                return;
            }
            vzd.this.f183617d = new WeakReference(activity);
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
    public final void m200744e(Context context) {
    }
}
