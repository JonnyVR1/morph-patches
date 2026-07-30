package p153l;

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
public final class bqr<T> {

    /* JADX INFO: renamed from: a */
    public final qa5 f77911a;

    /* JADX INFO: renamed from: b */
    public final sxk f77912b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16084b<T> f77913c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<C16085c<T>> f77914d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Runnable> f77915e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f77916f;

    /* JADX INFO: renamed from: g */
    public final Object f77917g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("releasedLock")
    public boolean f77918h;

    /* JADX INFO: renamed from: i */
    public boolean f77919i;

    /* JADX INFO: renamed from: l.bqr$a */
    public interface InterfaceC16083a<T> {
        void invoke(T t);
    }

    /* JADX INFO: renamed from: l.bqr$b */
    public interface InterfaceC16084b<T> {
        /* JADX INFO: renamed from: a */
        void mo105967a(T t, zri zriVar);
    }

    /* JADX INFO: renamed from: l.bqr$c */
    public static final class C16085c<T> {

        /* JADX INFO: renamed from: a */
        public final T f77920a;

        /* JADX INFO: renamed from: b */
        public zri.C21871b f77921b = new zri.C21871b();

        /* JADX INFO: renamed from: c */
        public boolean f77922c;

        /* JADX INFO: renamed from: d */
        public boolean f77923d;

        public C16085c(T t) {
            this.f77920a = t;
        }

        /* JADX INFO: renamed from: a */
        public void m105968a(int i, InterfaceC16083a<T> interfaceC16083a) {
            if (this.f77923d) {
                return;
            }
            if (i != -1) {
                this.f77921b.m221160a(i);
            }
            this.f77922c = true;
            interfaceC16083a.invoke(this.f77920a);
        }

        /* JADX INFO: renamed from: b */
        public void m105969b(InterfaceC16084b<T> interfaceC16084b) {
            if (this.f77923d || !this.f77922c) {
                return;
            }
            zri zriVarM221164e = this.f77921b.m221164e();
            this.f77921b = new zri.C21871b();
            this.f77922c = false;
            interfaceC16084b.mo105967a(this.f77920a, zriVarM221164e);
        }

        /* JADX INFO: renamed from: c */
        public void m105970c(InterfaceC16084b<T> interfaceC16084b) {
            this.f77923d = true;
            if (this.f77922c) {
                this.f77922c = false;
                interfaceC16084b.mo105967a(this.f77920a, this.f77921b.m221164e());
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16085c.class != obj.getClass()) {
                return false;
            }
            return this.f77920a.equals(((C16085c) obj).f77920a);
        }

        public int hashCode() {
            return this.f77920a.hashCode();
        }
    }

    public bqr(CopyOnWriteArraySet<C16085c<T>> copyOnWriteArraySet, Looper looper, qa5 qa5Var, InterfaceC16084b<T> interfaceC16084b, boolean z) {
        this.f77911a = qa5Var;
        this.f77914d = copyOnWriteArraySet;
        this.f77913c = interfaceC16084b;
        this.f77917g = new Object();
        this.f77915e = new ArrayDeque<>();
        this.f77916f = new ArrayDeque<>();
        this.f77912b = qa5Var.mo111761c(looper, new Handler.Callback() { // from class: l.zpr
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f205522a.m105961g(message);
            }
        });
        this.f77919i = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m105955a(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC16083a interfaceC16083a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C16085c) it.next()).m105968a(i, interfaceC16083a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m105957c(T t) {
        w11.m204369e(t);
        synchronized (this.f77917g) {
            try {
                if (this.f77918h) {
                    return;
                }
                this.f77914d.add(new C16085c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public bqr<T> m105958d(Looper looper, qa5 qa5Var, InterfaceC16084b<T> interfaceC16084b) {
        return new bqr<>(this.f77914d, looper, qa5Var, interfaceC16084b, this.f77919i);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public bqr<T> m105959e(Looper looper, InterfaceC16084b<T> interfaceC16084b) {
        return m105958d(looper, this.f77911a, interfaceC16084b);
    }

    /* JADX INFO: renamed from: f */
    public void m105960f() {
        m105966l();
        if (this.f77916f.isEmpty()) {
            return;
        }
        if (!this.f77912b.mo131264b(0)) {
            sxk sxkVar = this.f77912b;
            sxkVar.mo131270h(sxkVar.mo131263a(0));
        }
        boolean zIsEmpty = this.f77915e.isEmpty();
        this.f77915e.addAll(this.f77916f);
        this.f77916f.clear();
        if (zIsEmpty) {
            while (!this.f77915e.isEmpty()) {
                this.f77915e.peekFirst().run();
                this.f77915e.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m105961g(Message message) {
        Iterator<C16085c<T>> it = this.f77914d.iterator();
        while (it.hasNext()) {
            it.next().m105969b(this.f77913c);
            if (this.f77912b.mo131264b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m105962h(final int i, final InterfaceC16083a<T> interfaceC16083a) {
        m105966l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f77914d);
        this.f77916f.add(new Runnable() { // from class: l.aqr
            @Override // java.lang.Runnable
            public final void run() {
                bqr.m105955a(copyOnWriteArraySet, i, interfaceC16083a);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m105963i() {
        m105966l();
        synchronized (this.f77917g) {
            this.f77918h = true;
        }
        Iterator<C16085c<T>> it = this.f77914d.iterator();
        while (it.hasNext()) {
            it.next().m105970c(this.f77913c);
        }
        this.f77914d.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m105964j(T t) {
        m105966l();
        for (C16085c<T> c16085c : this.f77914d) {
            if (c16085c.f77920a.equals(t)) {
                c16085c.m105970c(this.f77913c);
                this.f77914d.remove(c16085c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m105965k(int i, InterfaceC16083a<T> interfaceC16083a) {
        m105962h(i, interfaceC16083a);
        m105960f();
    }

    /* JADX INFO: renamed from: l */
    public final void m105966l() {
        if (this.f77919i) {
            w11.m204371g(Thread.currentThread() == this.f77912b.mo131269g().getThread());
        }
    }

    public bqr(Looper looper, qa5 qa5Var, InterfaceC16084b<T> interfaceC16084b) {
        this(new CopyOnWriteArraySet(), looper, qa5Var, interfaceC16084b, true);
    }
}
