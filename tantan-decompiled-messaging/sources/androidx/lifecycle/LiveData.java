package androidx.lifecycle;

import androidx.annotation.MainThread;
import p149l.ig3;
import p149l.iod0;
import p149l.jcr;
import p149l.n250;
import p149l.xjw;
import p149l.xy0;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k */
    public static final Object f2269k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f2270a;

    /* JADX INFO: renamed from: b */
    public iod0<n250<? super T>, LiveData<T>.AbstractC0463c> f2271b;

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

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0463c implements LifecycleEventObserver {
        final jcr mOwner;

        public LifecycleBoundObserver(jcr jcrVar, n250<? super T> n250Var) {
            super(n250Var);
            this.mOwner = jcrVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0463c
        public void detachObserver() {
            this.mOwner.getLifecycle().mo2969d(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0463c
        public boolean isAttachedTo(jcr jcrVar) {
            return this.mOwner == jcrVar;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
            Lifecycle.State stateMo2967b = this.mOwner.getLifecycle().mo2967b();
            if (stateMo2967b == Lifecycle.State.DESTROYED) {
                LiveData.this.mo2988n(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateMo2967b) {
                activeStateChanged(shouldBeActive());
                state = stateMo2967b;
                stateMo2967b = this.mOwner.getLifecycle().mo2967b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0463c
        public boolean shouldBeActive() {
            return this.mOwner.getLifecycle().mo2967b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public class RunnableC0461a implements Runnable {
        public RunnableC0461a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2270a) {
                obj = LiveData.this.f2275f;
                LiveData.this.f2275f = LiveData.f2269k;
            }
            LiveData.this.mo2989o(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    public class C0462b extends LiveData<T>.AbstractC0463c {
        public C0462b(n250<? super T> n250Var) {
            super(n250Var);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0463c
        public boolean shouldBeActive() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$c */
    public abstract class AbstractC0463c {
        boolean mActive;
        int mLastVersion = -1;
        final n250<? super T> mObserver;

        public AbstractC0463c(n250<? super T> n250Var) {
            this.mObserver = n250Var;
        }

        public void activeStateChanged(boolean z) {
            if (z == this.mActive) {
                return;
            }
            this.mActive = z;
            LiveData.this.m2977c(z ? 1 : -1);
            if (this.mActive) {
                LiveData.this.m2979e(this);
            }
        }

        public void detachObserver() {
        }

        public boolean isAttachedTo(jcr jcrVar) {
            return false;
        }

        public abstract boolean shouldBeActive();
    }

    public LiveData() {
        this.f2270a = new Object();
        this.f2271b = new iod0<>();
        this.f2272c = 0;
        Object obj = f2269k;
        this.f2275f = obj;
        this.f2279j = new RunnableC0461a();
        this.f2274e = obj;
        this.f2276g = -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m2976b(String str) {
        if (xy0.m211654g().mo96227b()) {
            return;
        }
        xjw.m209754a("Cannot invoke ", str, " on a background thread");
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m2977c(int i) {
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
                    mo2985k();
                } else if (z2) {
                    mo2986l();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f2273d = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2978d(LiveData<T>.AbstractC0463c abstractC0463c) {
        if (abstractC0463c.mActive) {
            if (!abstractC0463c.shouldBeActive()) {
                abstractC0463c.activeStateChanged(false);
                return;
            }
            int i = abstractC0463c.mLastVersion;
            int i2 = this.f2276g;
            if (i >= i2) {
                return;
            }
            abstractC0463c.mLastVersion = i2;
            abstractC0463c.mObserver.onChanged((Object) this.f2274e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2979e(LiveData<T>.AbstractC0463c abstractC0463c) {
        if (this.f2277h) {
            this.f2278i = true;
            return;
        }
        this.f2277h = true;
        do {
            this.f2278i = false;
            if (abstractC0463c != null) {
                m2978d(abstractC0463c);
                abstractC0463c = null;
            } else {
                iod0<n250<? super T>, LiveData<T>.AbstractC0463c>.C17586d c17586dM137321f = this.f2271b.m137321f();
                while (c17586dM137321f.hasNext()) {
                    m2978d((AbstractC0463c) c17586dM137321f.next().getValue());
                    if (this.f2278i) {
                        break;
                    }
                }
            }
        } while (this.f2278i);
        this.f2277h = false;
    }

    /* JADX INFO: renamed from: f */
    public T m2980f() {
        T t = (T) this.f2274e;
        if (t != f2269k) {
            return t;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int m2981g() {
        return this.f2276g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2982h() {
        return this.f2272c > 0;
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public void m2983i(jcr jcrVar, n250<? super T> n250Var) {
        m2976b("observe");
        if (jcrVar.getLifecycle().mo2967b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jcrVar, n250Var);
        LiveData<T>.AbstractC0463c abstractC0463cMo137324i = this.f2271b.mo137324i(n250Var, lifecycleBoundObserver);
        if (abstractC0463cMo137324i != null && !abstractC0463cMo137324i.isAttachedTo(jcrVar)) {
            ig3.m135964a("Cannot add the same observer with different lifecycles");
        } else {
            if (abstractC0463cMo137324i != null) {
                return;
            }
            jcrVar.getLifecycle().mo2966a(lifecycleBoundObserver);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public void m2984j(n250<? super T> n250Var) {
        m2976b("observeForever");
        C0462b c0462b = new C0462b(n250Var);
        LiveData<T>.AbstractC0463c abstractC0463cMo137324i = this.f2271b.mo137324i(n250Var, c0462b);
        if (abstractC0463cMo137324i instanceof LifecycleBoundObserver) {
            ig3.m135964a("Cannot add the same observer with different lifecycles");
        } else {
            if (abstractC0463cMo137324i != null) {
                return;
            }
            c0462b.activeStateChanged(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo2985k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo2986l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo2987m(T t) {
        boolean z;
        synchronized (this.f2270a) {
            z = this.f2275f == f2269k;
            this.f2275f = t;
        }
        if (z) {
            xy0.m211654g().mo96228c(this.f2279j);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public void mo2988n(n250<? super T> n250Var) {
        m2976b("removeObserver");
        LiveData<T>.AbstractC0463c abstractC0463cMo137325j = this.f2271b.mo137325j(n250Var);
        if (abstractC0463cMo137325j == null) {
            return;
        }
        abstractC0463cMo137325j.detachObserver();
        abstractC0463cMo137325j.activeStateChanged(false);
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public void mo2989o(T t) {
        m2976b("setValue");
        this.f2276g++;
        this.f2274e = t;
        m2979e(null);
    }

    public LiveData(T t) {
        this.f2270a = new Object();
        this.f2271b = new iod0<>();
        this.f2272c = 0;
        this.f2275f = f2269k;
        this.f2279j = new RunnableC0461a();
        this.f2274e = t;
        this.f2276g = 0;
    }
}
