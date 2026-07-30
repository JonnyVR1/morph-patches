package androidx.lifecycle;

import androidx.annotation.MainThread;
import p153l.cb50;
import p153l.ez0;
import p153l.ker;
import p153l.kwd0;
import p153l.wg3;
import p153l.wmw;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k */
    public static final Object f2269k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f2270a;

    /* JADX INFO: renamed from: b */
    public kwd0<cb50<? super T>, LiveData<T>.AbstractC0464c> f2271b;

    /* JADX INFO: renamed from: c */
    public int f2272c;

    /* JADX INFO: renamed from: d */
    public boolean f2273d;

    /* JADX INFO: renamed from: e */
    public volatile Object f2274e;

    /* JADX INFO: renamed from: f */
    public volatile Object f2275f;

    /* JADX INFO: renamed from: g */
    public int f2276g;

    /* JADX INFO: renamed from: h */
    public boolean f2277h;

    /* JADX INFO: renamed from: i */
    public boolean f2278i;

    /* JADX INFO: renamed from: j */
    public final Runnable f2279j;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0464c implements LifecycleEventObserver {
        final ker mOwner;

        public LifecycleBoundObserver(ker kerVar, cb50<? super T> cb50Var) {
            super(cb50Var);
            this.mOwner = kerVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0464c
        public void detachObserver() {
            this.mOwner.getLifecycle().mo2970d(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0464c
        public boolean isAttachedTo(ker kerVar) {
            return this.mOwner == kerVar;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(ker kerVar, Lifecycle.Event event) {
            Lifecycle.State stateMo2968b = this.mOwner.getLifecycle().mo2968b();
            if (stateMo2968b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo2989n(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateMo2968b) {
                activeStateChanged(shouldBeActive());
                state = stateMo2968b;
                stateMo2968b = this.mOwner.getLifecycle().mo2968b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0464c
        public boolean shouldBeActive() {
            return this.mOwner.getLifecycle().mo2968b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public class RunnableC0462a implements Runnable {
        public RunnableC0462a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2270a) {
                obj = LiveData.this.f2275f;
                LiveData.this.f2275f = LiveData.f2269k;
            }
            LiveData.this.mo2990o(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    public class C0463b extends LiveData<T>.AbstractC0464c {
        public C0463b(cb50<? super T> cb50Var) {
            super(cb50Var);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0464c
        public boolean shouldBeActive() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$c */
    public abstract class AbstractC0464c {
        boolean mActive;
        int mLastVersion = -1;
        final cb50<? super T> mObserver;

        public AbstractC0464c(cb50<? super T> cb50Var) {
            this.mObserver = cb50Var;
        }

        public void activeStateChanged(boolean z) {
            if (z == this.mActive) {
                return;
            }
            this.mActive = z;
            LiveData.this.m2978c(z ? 1 : -1);
            if (this.mActive) {
                LiveData.this.m2980e(this);
            }
        }

        public void detachObserver() {
        }

        public boolean isAttachedTo(ker kerVar) {
            return false;
        }

        public abstract boolean shouldBeActive();
    }

    public LiveData() {
        this.f2270a = new Object();
        this.f2271b = new kwd0<>();
        this.f2272c = 0;
        Object obj = f2269k;
        this.f2275f = obj;
        this.f2279j = new RunnableC0462a();
        this.f2274e = obj;
        this.f2276g = -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m2977b(String str) {
        if (ez0.m123336g().mo99084b()) {
            return;
        }
        wmw.m207134a("Cannot invoke ", str, " on a background thread");
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m2978c(int i) {
        int i2 = this.f2272c;
        this.f2272c = i + i2;
        if (this.f2273d) {
            return;
        }
        this.f2273d = true;
        while (true) {
            try {
                int i3 = this.f2272c;
                if (i2 == i3) {
                    this.f2273d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo2986k();
                } else if (z2) {
                    mo2987l();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f2273d = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2979d(LiveData<T>.AbstractC0464c abstractC0464c) {
        if (abstractC0464c.mActive) {
            if (!abstractC0464c.shouldBeActive()) {
                abstractC0464c.activeStateChanged(false);
                return;
            }
            int i = abstractC0464c.mLastVersion;
            int i2 = this.f2276g;
            if (i >= i2) {
                return;
            }
            abstractC0464c.mLastVersion = i2;
            abstractC0464c.mObserver.onChanged((Object) this.f2274e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2980e(LiveData<T>.AbstractC0464c abstractC0464c) {
        if (this.f2277h) {
            this.f2278i = true;
            return;
        }
        this.f2277h = true;
        do {
            this.f2278i = false;
            if (abstractC0464c != null) {
                m2979d(abstractC0464c);
                abstractC0464c = null;
            } else {
                kwd0<cb50<? super T>, LiveData<T>.AbstractC0464c>.C18285d c18285dM151691f = this.f2271b.m151691f();
                while (c18285dM151691f.hasNext()) {
                    m2979d((AbstractC0464c) c18285dM151691f.next().getValue());
                    if (this.f2278i) {
                        break;
                    }
                }
            }
        } while (this.f2278i);
        this.f2277h = false;
    }

    /* JADX INFO: renamed from: f */
    public T m2981f() {
        T t = (T) this.f2274e;
        if (t != f2269k) {
            return t;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m2982g() {
        return this.f2276g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2983h() {
        return this.f2272c > 0;
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public void m2984i(ker kerVar, cb50<? super T> cb50Var) {
        m2977b("observe");
        if (kerVar.getLifecycle().mo2968b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kerVar, cb50Var);
        LiveData<T>.AbstractC0464c abstractC0464cMo110334i = this.f2271b.mo110334i(cb50Var, lifecycleBoundObserver);
        if (abstractC0464cMo110334i != null && !abstractC0464cMo110334i.isAttachedTo(kerVar)) {
            wg3.m206174a("Cannot add the same observer with different lifecycles");
        } else {
            if (abstractC0464cMo110334i != null) {
                return;
            }
            kerVar.getLifecycle().mo2967a(lifecycleBoundObserver);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public void m2985j(cb50<? super T> cb50Var) {
        m2977b("observeForever");
        C0463b c0463b = new C0463b(cb50Var);
        LiveData<T>.AbstractC0464c abstractC0464cMo110334i = this.f2271b.mo110334i(cb50Var, c0463b);
        if (abstractC0464cMo110334i instanceof LifecycleBoundObserver) {
            wg3.m206174a("Cannot add the same observer with different lifecycles");
        } else {
            if (abstractC0464cMo110334i != null) {
                return;
            }
            c0463b.activeStateChanged(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo2986k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo2987l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo2988m(T t) {
        boolean z;
        synchronized (this.f2270a) {
            z = this.f2275f == f2269k;
            this.f2275f = t;
        }
        if (z) {
            ez0.m123336g().mo99085c(this.f2279j);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public void mo2989n(cb50<? super T> cb50Var) {
        m2977b("removeObserver");
        LiveData<T>.AbstractC0464c abstractC0464cMo110335j = this.f2271b.mo110335j(cb50Var);
        if (abstractC0464cMo110335j == null) {
            return;
        }
        abstractC0464cMo110335j.detachObserver();
        abstractC0464cMo110335j.activeStateChanged(false);
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public void mo2990o(T t) {
        m2977b("setValue");
        this.f2276g++;
        this.f2274e = t;
        m2980e(null);
    }

    public LiveData(T t) {
        this.f2270a = new Object();
        this.f2271b = new kwd0<>();
        this.f2272c = 0;
        this.f2275f = f2269k;
        this.f2279j = new RunnableC0462a();
        this.f2274e = t;
        this.f2276g = 0;
    }
}
