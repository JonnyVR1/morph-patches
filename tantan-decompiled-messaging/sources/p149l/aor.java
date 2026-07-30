package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aor<T> {

    /* JADX INFO: renamed from: a */
    public final p95 f70902a;

    /* JADX INFO: renamed from: b */
    public final cvk f70903b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15679b<T> f70904c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<C15680c<T>> f70905d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Runnable> f70906e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f70907f;

    /* JADX INFO: renamed from: g */
    public final Object f70908g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("releasedLock")
    public boolean f70909h;

    /* JADX INFO: renamed from: i */
    public boolean f70910i;

    /* JADX INFO: renamed from: l.aor$a */
    public interface InterfaceC15678a<T> {
        void invoke(T t);
    }

    /* JADX INFO: renamed from: l.aor$b */
    public interface InterfaceC15679b<T> {
        /* JADX INFO: renamed from: a */
        void mo97946a(T t, dpi dpiVar);
    }

    /* JADX INFO: renamed from: l.aor$c */
    public static final class C15680c<T> {

        /* JADX INFO: renamed from: a */
        public final T f70911a;

        /* JADX INFO: renamed from: b */
        public dpi.C16424b f70912b = new dpi.C16424b();

        /* JADX INFO: renamed from: c */
        public boolean f70913c;

        /* JADX INFO: renamed from: d */
        public boolean f70914d;

        public C15680c(T t) {
            this.f70911a = t;
        }

        /* JADX INFO: renamed from: a */
        public void m97947a(int i, InterfaceC15678a<T> interfaceC15678a) {
            if (this.f70914d) {
                return;
            }
            if (i != -1) {
                this.f70912b.m112907a(i);
            }
            this.f70913c = true;
            interfaceC15678a.invoke(this.f70911a);
        }

        /* JADX INFO: renamed from: b */
        public void m97948b(InterfaceC15679b<T> interfaceC15679b) {
            if (this.f70914d || !this.f70913c) {
                return;
            }
            dpi dpiVarM112911e = this.f70912b.m112911e();
            this.f70912b = new dpi.C16424b();
            this.f70913c = false;
            interfaceC15679b.mo97946a(this.f70911a, dpiVarM112911e);
        }

        /* JADX INFO: renamed from: c */
        public void m97949c(InterfaceC15679b<T> interfaceC15679b) {
            this.f70914d = true;
            if (this.f70913c) {
                this.f70913c = false;
                interfaceC15679b.mo97946a(this.f70911a, this.f70912b.m112911e());
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C15680c.class != obj.getClass()) {
                return false;
            }
            return this.f70911a.equals(((C15680c) obj).f70911a);
        }

        public int hashCode() {
            return this.f70911a.hashCode();
        }
    }

    public aor(CopyOnWriteArraySet<C15680c<T>> copyOnWriteArraySet, Looper looper, p95 p95Var, InterfaceC15679b<T> interfaceC15679b, boolean z) {
        this.f70902a = p95Var;
        this.f70905d = copyOnWriteArraySet;
        this.f70904c = interfaceC15679b;
        this.f70908g = new Object();
        this.f70906e = new ArrayDeque<>();
        this.f70907f = new ArrayDeque<>();
        this.f70903b = p95Var.mo167857c(looper, new Handler.Callback() { // from class: l.ynr
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f199204a.m97940g(message);
            }
        });
        this.f70910i = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m97934a(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC15678a interfaceC15678a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C15680c) it.next()).m97947a(i, interfaceC15678a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m97936c(T t) {
        p11.m167011e(t);
        synchronized (this.f70908g) {
            try {
                if (this.f70909h) {
                    return;
                }
                this.f70905d.add(new C15680c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public aor<T> m97937d(Looper looper, p95 p95Var, InterfaceC15679b<T> interfaceC15679b) {
        return new aor<>(this.f70905d, looper, p95Var, interfaceC15679b, this.f70910i);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public aor<T> m97938e(Looper looper, InterfaceC15679b<T> interfaceC15679b) {
        return m97937d(looper, this.f70902a, interfaceC15679b);
    }

    /* JADX INFO: renamed from: f */
    public void m97939f() {
        m97945l();
        if (this.f70907f.isEmpty()) {
            return;
        }
        if (!this.f70903b.mo108867c(0)) {
            cvk cvkVar = this.f70903b;
            cvkVar.mo108873i(cvkVar.mo108866b(0));
        }
        boolean zIsEmpty = this.f70906e.isEmpty();
        this.f70906e.addAll(this.f70907f);
        this.f70907f.clear();
        if (zIsEmpty) {
            while (!this.f70906e.isEmpty()) {
                this.f70906e.peekFirst().run();
                this.f70906e.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m97940g(Message message) {
        Iterator<C15680c<T>> it = this.f70905d.iterator();
        while (it.hasNext()) {
            it.next().m97948b(this.f70904c);
            if (this.f70903b.mo108867c(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m97941h(final int i, final InterfaceC15678a<T> interfaceC15678a) {
        m97945l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f70905d);
        this.f70907f.add(new Runnable() { // from class: l.znr
            @Override // java.lang.Runnable
            public final void run() {
                aor.m97934a(copyOnWriteArraySet, i, interfaceC15678a);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m97942i() {
        m97945l();
        synchronized (this.f70908g) {
            this.f70909h = true;
        }
        Iterator<C15680c<T>> it = this.f70905d.iterator();
        while (it.hasNext()) {
            it.next().m97949c(this.f70904c);
        }
        this.f70905d.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m97943j(T t) {
        m97945l();
        for (C15680c<T> c15680c : this.f70905d) {
            if (c15680c.f70911a.equals(t)) {
                c15680c.m97949c(this.f70904c);
                this.f70905d.remove(c15680c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m97944k(int i, InterfaceC15678a<T> interfaceC15678a) {
        m97941h(i, interfaceC15678a);
        m97939f();
    }

    /* JADX INFO: renamed from: l */
    public final void m97945l() {
        if (this.f70910i) {
            p11.m167013g(Thread.currentThread() == this.f70903b.mo108872h().getThread());
        }
    }

    public aor(Looper looper, p95 p95Var, InterfaceC15679b<T> interfaceC15679b) {
        this(new CopyOnWriteArraySet(), looper, p95Var, interfaceC15679b, true);
    }
}
