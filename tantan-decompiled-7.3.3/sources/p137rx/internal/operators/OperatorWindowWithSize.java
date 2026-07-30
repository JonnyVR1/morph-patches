package p137rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.subjects.UnicastSubject;
import p153l.fcg0;
import p153l.gcg0;
import p153l.kcg0;
import p153l.pcg0;
import p153l.pzf0;
import p153l.rc2;
import p153l.vk90;
import p153l.wbg0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorWindowWithSize<T> implements C22421c.c<C22421c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f208250a;

    /* JADX INFO: renamed from: b */
    public final int f208251b;

    public static final class WindowOverlap<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f208252e;

        /* JADX INFO: renamed from: f */
        public final int f208253f;

        /* JADX INFO: renamed from: g */
        public final int f208254g;

        /* JADX INFO: renamed from: i */
        public final kcg0 f208256i;

        /* JADX INFO: renamed from: m */
        public final Queue<wbg0<T, T>> f208260m;

        /* JADX INFO: renamed from: n */
        public Throwable f208261n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f208262o;

        /* JADX INFO: renamed from: p */
        public int f208263p;

        /* JADX INFO: renamed from: q */
        public int f208264q;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f208255h = new AtomicInteger(1);

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<wbg0<T, T>> f208257j = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f208259l = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicLong f208258k = new AtomicLong();

        public final class WindowOverlapProducer extends AtomicBoolean implements vk90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowOverlapProducer() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j < 0) {
                    fcg0.m125008a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.m129868e(rc2.m180771c(windowOverlap.f208254g, j));
                    } else {
                        windowOverlap.m129868e(rc2.m180769a(rc2.m180771c(windowOverlap.f208254g, j - 1), windowOverlap.f208253f));
                    }
                    rc2.m180770b(windowOverlap.f208258k, j);
                    windowOverlap.m222686k();
                }
            }
        }

        public WindowOverlap(gcg0<? super C22421c<T>> gcg0Var, int i, int i2) {
            this.f208252e = gcg0Var;
            this.f208253f = i;
            this.f208254g = i2;
            kcg0 kcg0VarM171648a = pcg0.m171648a(this);
            this.f208256i = kcg0VarM171648a;
            m129866b(kcg0VarM171648a);
            m129868e(0L);
            this.f208260m = new pzf0((i + (i2 - 1)) / i2);
        }

        @Override // p153l.x20
        public void call() {
            if (this.f208255h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m222684i(boolean z, boolean z2, gcg0<? super wbg0<T, T>> gcg0Var, Queue<wbg0<T, T>> queue) {
            if (gcg0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f208261n;
            if (th != null) {
                queue.clear();
                gcg0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public vk90 m222685j() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public void m222686k() {
            AtomicInteger atomicInteger = this.f208259l;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super C22421c<T>> gcg0Var = this.f208252e;
            Queue<wbg0<T, T>> queue = this.f208260m;
            int iAddAndGet = 1;
            do {
                long j = this.f208258k.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f208262o;
                    wbg0<T, T> wbg0VarPoll = queue.poll();
                    boolean z2 = wbg0VarPoll == null;
                    if (m222684i(z, z2, gcg0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(wbg0VarPoll);
                    j2++;
                }
                if (j2 == j && m222684i(this.f208262o, queue.isEmpty(), gcg0Var, queue)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f208258k.addAndGet(-j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            Iterator<wbg0<T, T>> it = this.f208257j.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f208257j.clear();
            this.f208262o = true;
            m222686k();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            Iterator<wbg0<T, T>> it = this.f208257j.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f208257j.clear();
            this.f208261n = th;
            this.f208262o = true;
            m222686k();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int i = this.f208263p;
            ArrayDeque<wbg0<T, T>> arrayDeque = this.f208257j;
            if (i == 0 && !this.f208252e.isUnsubscribed()) {
                this.f208255h.getAndIncrement();
                UnicastSubject unicastSubjectM222757d = UnicastSubject.m222757d(16, this);
                arrayDeque.offer(unicastSubjectM222757d);
                this.f208260m.offer(unicastSubjectM222757d);
                m222686k();
            }
            Iterator<wbg0<T, T>> it = this.f208257j.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.f208264q + 1;
            if (i2 == this.f208253f) {
                this.f208264q = i2 - this.f208254g;
                wbg0<T, T> wbg0VarPoll = arrayDeque.poll();
                if (wbg0VarPoll != null) {
                    wbg0VarPoll.onCompleted();
                }
            } else {
                this.f208264q = i2;
            }
            int i3 = i + 1;
            if (i3 == this.f208254g) {
                this.f208263p = 0;
            } else {
                this.f208263p = i3;
            }
        }
    }

    public static final class WindowSkip<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f208265e;

        /* JADX INFO: renamed from: f */
        public final int f208266f;

        /* JADX INFO: renamed from: g */
        public final int f208267g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f208268h = new AtomicInteger(1);

        /* JADX INFO: renamed from: i */
        public final kcg0 f208269i;

        /* JADX INFO: renamed from: j */
        public int f208270j;

        /* JADX INFO: renamed from: k */
        public wbg0<T, T> f208271k;

        public final class WindowSkipProducer extends AtomicBoolean implements vk90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowSkipProducer() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j < 0) {
                    fcg0.m125008a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.m129868e(rc2.m180771c(j, windowSkip.f208267g));
                    } else {
                        windowSkip.m129868e(rc2.m180769a(rc2.m180771c(j, windowSkip.f208266f), rc2.m180771c(windowSkip.f208267g - windowSkip.f208266f, j - 1)));
                    }
                }
            }
        }

        public WindowSkip(gcg0<? super C22421c<T>> gcg0Var, int i, int i2) {
            this.f208265e = gcg0Var;
            this.f208266f = i;
            this.f208267g = i2;
            kcg0 kcg0VarM171648a = pcg0.m171648a(this);
            this.f208269i = kcg0VarM171648a;
            m129866b(kcg0VarM171648a);
            m129868e(0L);
        }

        @Override // p153l.x20
        public void call() {
            if (this.f208268h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public vk90 m222689i() {
            return new WindowSkipProducer();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            wbg0<T, T> wbg0Var = this.f208271k;
            if (wbg0Var != null) {
                this.f208271k = null;
                wbg0Var.onCompleted();
            }
            this.f208265e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            wbg0<T, T> wbg0Var = this.f208271k;
            if (wbg0Var != null) {
                this.f208271k = null;
                wbg0Var.onError(th);
            }
            this.f208265e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int i = this.f208270j;
            UnicastSubject unicastSubjectM222757d = this.f208271k;
            if (i == 0) {
                this.f208268h.getAndIncrement();
                unicastSubjectM222757d = UnicastSubject.m222757d(this.f208266f, this);
                this.f208271k = unicastSubjectM222757d;
                this.f208265e.onNext(unicastSubjectM222757d);
            }
            int i2 = i + 1;
            if (unicastSubjectM222757d != null) {
                unicastSubjectM222757d.onNext(t);
            }
            if (i2 == this.f208266f) {
                this.f208270j = i2;
                this.f208271k = null;
                unicastSubjectM222757d.onCompleted();
            } else if (i2 == this.f208267g) {
                this.f208270j = 0;
            } else {
                this.f208270j = i2;
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a */
    public static final class C22463a<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f208272e;

        /* JADX INFO: renamed from: f */
        public final int f208273f;

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f208274g = new AtomicInteger(1);

        /* JADX INFO: renamed from: h */
        public final kcg0 f208275h;

        /* JADX INFO: renamed from: i */
        public int f208276i;

        /* JADX INFO: renamed from: j */
        public wbg0<T, T> f208277j;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a$a */
        public class a implements vk90 {
            public a() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j < 0) {
                    fcg0.m125008a("n >= 0 required but it was ", j);
                } else if (j != 0) {
                    C22463a.this.m129868e(rc2.m180771c(C22463a.this.f208273f, j));
                }
            }
        }

        public C22463a(gcg0<? super C22421c<T>> gcg0Var, int i) {
            this.f208272e = gcg0Var;
            this.f208273f = i;
            kcg0 kcg0VarM171648a = pcg0.m171648a(this);
            this.f208275h = kcg0VarM171648a;
            m129866b(kcg0VarM171648a);
            m129868e(0L);
        }

        @Override // p153l.x20
        public void call() {
            if (this.f208274g.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public vk90 m222691h() {
            return new a();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            wbg0<T, T> wbg0Var = this.f208277j;
            if (wbg0Var != null) {
                this.f208277j = null;
                wbg0Var.onCompleted();
            }
            this.f208272e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            wbg0<T, T> wbg0Var = this.f208277j;
            if (wbg0Var != null) {
                this.f208277j = null;
                wbg0Var.onError(th);
            }
            this.f208272e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int i = this.f208276i;
            UnicastSubject unicastSubjectM222757d = this.f208277j;
            if (i == 0) {
                this.f208274g.getAndIncrement();
                unicastSubjectM222757d = UnicastSubject.m222757d(this.f208273f, this);
                this.f208277j = unicastSubjectM222757d;
                this.f208272e.onNext(unicastSubjectM222757d);
            }
            int i2 = i + 1;
            unicastSubjectM222757d.onNext(t);
            if (i2 != this.f208273f) {
                this.f208276i = i2;
                return;
            }
            this.f208276i = 0;
            this.f208277j = null;
            unicastSubjectM222757d.onCompleted();
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.f208250a = i;
        this.f208251b = i2;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<T>> gcg0Var) {
        int i = this.f208251b;
        int i2 = this.f208250a;
        if (i == i2) {
            C22463a c22463a = new C22463a(gcg0Var, i2);
            gcg0Var.m129866b(c22463a.f208275h);
            gcg0Var.mo95773f(c22463a.m222691h());
            return c22463a;
        }
        if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(gcg0Var, i2, i);
            gcg0Var.m129866b(windowSkip.f208269i);
            gcg0Var.mo95773f(windowSkip.m222689i());
            return windowSkip;
        }
        WindowOverlap windowOverlap = new WindowOverlap(gcg0Var, i2, i);
        gcg0Var.m129866b(windowOverlap.f208256i);
        gcg0Var.mo95773f(windowOverlap.m222685j());
        return windowOverlap;
    }
}
