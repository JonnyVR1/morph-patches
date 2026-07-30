package p133rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.subjects.UnicastSubject;
import p149l.c4g0;
import p149l.d30;
import p149l.grf0;
import p149l.h4g0;
import p149l.kc2;
import p149l.p3g0;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorWindowWithSize<T> implements C22306c.c<C22306c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final int f207328a;

    /* JADX INFO: renamed from: b */
    public final int f207329b;

    public static final class WindowOverlap<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f207330e;

        /* JADX INFO: renamed from: f */
        public final int f207331f;

        /* JADX INFO: renamed from: g */
        public final int f207332g;

        /* JADX INFO: renamed from: i */
        public final c4g0 f207334i;

        /* JADX INFO: renamed from: m */
        public final Queue<p3g0<T, T>> f207338m;

        /* JADX INFO: renamed from: n */
        public Throwable f207339n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f207340o;

        /* JADX INFO: renamed from: p */
        public int f207341p;

        /* JADX INFO: renamed from: q */
        public int f207342q;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f207333h = new AtomicInteger(1);

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<p3g0<T, T>> f207335j = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final AtomicInteger f207337l = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicLong f207336k = new AtomicLong();

        public final class WindowOverlapProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowOverlapProducer() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m212802a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.m217048e(kc2.m145337c(windowOverlap.f207332g, j));
                    } else {
                        windowOverlap.m217048e(kc2.m145335a(kc2.m145337c(windowOverlap.f207332g, j - 1), windowOverlap.f207331f));
                    }
                    kc2.m145336b(windowOverlap.f207336k, j);
                    windowOverlap.m221440k();
                }
            }
        }

        public WindowOverlap(z3g0<? super C22306c<T>> z3g0Var, int i, int i2) {
            this.f207330e = z3g0Var;
            this.f207331f = i;
            this.f207332g = i2;
            c4g0 c4g0VarM129240a = h4g0.m129240a(this);
            this.f207334i = c4g0VarM129240a;
            m217046b(c4g0VarM129240a);
            m217048e(0L);
            this.f207338m = new grf0((i + (i2 - 1)) / i2);
        }

        @Override // p149l.d30
        public void call() {
            if (this.f207333h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public boolean m221438i(boolean z, boolean z2, z3g0<? super p3g0<T, T>> z3g0Var, Queue<p3g0<T, T>> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f207339n;
            if (th != null) {
                queue.clear();
                z3g0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public rc90 m221439j() {
            return new WindowOverlapProducer();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public void m221440k() {
            AtomicInteger atomicInteger = this.f207337l;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super C22306c<T>> z3g0Var = this.f207330e;
            Queue<p3g0<T, T>> queue = this.f207338m;
            int iAddAndGet = 1;
            do {
                long j = this.f207336k.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f207340o;
                    p3g0<T, T> p3g0VarPoll = queue.poll();
                    boolean z2 = p3g0VarPoll == null;
                    if (m221438i(z, z2, z3g0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(p3g0VarPoll);
                    j2++;
                }
                if (j2 == j && m221438i(this.f207340o, queue.isEmpty(), z3g0Var, queue)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f207336k.addAndGet(-j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p149l.m250
        public void onCompleted() {
            Iterator<p3g0<T, T>> it = this.f207335j.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f207335j.clear();
            this.f207340o = true;
            m221440k();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            Iterator<p3g0<T, T>> it = this.f207335j.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f207335j.clear();
            this.f207339n = th;
            this.f207340o = true;
            m221440k();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int i = this.f207341p;
            ArrayDeque<p3g0<T, T>> arrayDeque = this.f207335j;
            if (i == 0 && !this.f207330e.isUnsubscribed()) {
                this.f207333h.getAndIncrement();
                UnicastSubject unicastSubjectM221511d = UnicastSubject.m221511d(16, this);
                arrayDeque.offer(unicastSubjectM221511d);
                this.f207338m.offer(unicastSubjectM221511d);
                m221440k();
            }
            Iterator<p3g0<T, T>> it = this.f207335j.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.f207342q + 1;
            if (i2 == this.f207331f) {
                this.f207342q = i2 - this.f207332g;
                p3g0<T, T> p3g0VarPoll = arrayDeque.poll();
                if (p3g0VarPoll != null) {
                    p3g0VarPoll.onCompleted();
                }
            } else {
                this.f207342q = i2;
            }
            int i3 = i + 1;
            if (i3 == this.f207332g) {
                this.f207341p = 0;
            } else {
                this.f207341p = i3;
            }
        }
    }

    public static final class WindowSkip<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f207343e;

        /* JADX INFO: renamed from: f */
        public final int f207344f;

        /* JADX INFO: renamed from: g */
        public final int f207345g;

        /* JADX INFO: renamed from: h */
        public final AtomicInteger f207346h = new AtomicInteger(1);

        /* JADX INFO: renamed from: i */
        public final c4g0 f207347i;

        /* JADX INFO: renamed from: j */
        public int f207348j;

        /* JADX INFO: renamed from: k */
        public p3g0<T, T> f207349k;

        public final class WindowSkipProducer extends AtomicBoolean implements rc90 {
            private static final long serialVersionUID = 4625807964358024108L;

            public WindowSkipProducer() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m212802a("n >= 0 required but it was ", j);
                    return;
                }
                if (j != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.m217048e(kc2.m145337c(j, windowSkip.f207345g));
                    } else {
                        windowSkip.m217048e(kc2.m145335a(kc2.m145337c(j, windowSkip.f207344f), kc2.m145337c(windowSkip.f207345g - windowSkip.f207344f, j - 1)));
                    }
                }
            }
        }

        public WindowSkip(z3g0<? super C22306c<T>> z3g0Var, int i, int i2) {
            this.f207343e = z3g0Var;
            this.f207344f = i;
            this.f207345g = i2;
            c4g0 c4g0VarM129240a = h4g0.m129240a(this);
            this.f207347i = c4g0VarM129240a;
            m217046b(c4g0VarM129240a);
            m217048e(0L);
        }

        @Override // p149l.d30
        public void call() {
            if (this.f207346h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: i */
        public rc90 m221443i() {
            return new WindowSkipProducer();
        }

        @Override // p149l.m250
        public void onCompleted() {
            p3g0<T, T> p3g0Var = this.f207349k;
            if (p3g0Var != null) {
                this.f207349k = null;
                p3g0Var.onCompleted();
            }
            this.f207343e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            p3g0<T, T> p3g0Var = this.f207349k;
            if (p3g0Var != null) {
                this.f207349k = null;
                p3g0Var.onError(th);
            }
            this.f207343e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int i = this.f207348j;
            UnicastSubject unicastSubjectM221511d = this.f207349k;
            if (i == 0) {
                this.f207346h.getAndIncrement();
                unicastSubjectM221511d = UnicastSubject.m221511d(this.f207344f, this);
                this.f207349k = unicastSubjectM221511d;
                this.f207343e.onNext(unicastSubjectM221511d);
            }
            int i2 = i + 1;
            if (unicastSubjectM221511d != null) {
                unicastSubjectM221511d.onNext(t);
            }
            if (i2 == this.f207344f) {
                this.f207348j = i2;
                this.f207349k = null;
                unicastSubjectM221511d.onCompleted();
            } else if (i2 == this.f207345g) {
                this.f207348j = 0;
            } else {
                this.f207348j = i2;
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a */
    public static final class C22348a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f207350e;

        /* JADX INFO: renamed from: f */
        public final int f207351f;

        /* JADX INFO: renamed from: g */
        public final AtomicInteger f207352g = new AtomicInteger(1);

        /* JADX INFO: renamed from: h */
        public final c4g0 f207353h;

        /* JADX INFO: renamed from: i */
        public int f207354i;

        /* JADX INFO: renamed from: j */
        public p3g0<T, T> f207355j;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a$a */
        public class a implements rc90 {
            public a() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j < 0) {
                    y3g0.m212802a("n >= 0 required but it was ", j);
                } else if (j != 0) {
                    C22348a.this.m217048e(kc2.m145337c(C22348a.this.f207351f, j));
                }
            }
        }

        public C22348a(z3g0<? super C22306c<T>> z3g0Var, int i) {
            this.f207350e = z3g0Var;
            this.f207351f = i;
            c4g0 c4g0VarM129240a = h4g0.m129240a(this);
            this.f207353h = c4g0VarM129240a;
            m217046b(c4g0VarM129240a);
            m217048e(0L);
        }

        @Override // p149l.d30
        public void call() {
            if (this.f207352g.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public rc90 m221445h() {
            return new a();
        }

        @Override // p149l.m250
        public void onCompleted() {
            p3g0<T, T> p3g0Var = this.f207355j;
            if (p3g0Var != null) {
                this.f207355j = null;
                p3g0Var.onCompleted();
            }
            this.f207350e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            p3g0<T, T> p3g0Var = this.f207355j;
            if (p3g0Var != null) {
                this.f207355j = null;
                p3g0Var.onError(th);
            }
            this.f207350e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int i = this.f207354i;
            UnicastSubject unicastSubjectM221511d = this.f207355j;
            if (i == 0) {
                this.f207352g.getAndIncrement();
                unicastSubjectM221511d = UnicastSubject.m221511d(this.f207351f, this);
                this.f207355j = unicastSubjectM221511d;
                this.f207350e.onNext(unicastSubjectM221511d);
            }
            int i2 = i + 1;
            unicastSubjectM221511d.onNext(t);
            if (i2 != this.f207351f) {
                this.f207354i = i2;
                return;
            }
            this.f207354i = 0;
            this.f207355j = null;
            unicastSubjectM221511d.onCompleted();
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.f207328a = i;
        this.f207329b = i2;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<T>> z3g0Var) {
        int i = this.f207329b;
        int i2 = this.f207328a;
        if (i == i2) {
            C22348a c22348a = new C22348a(z3g0Var, i2);
            z3g0Var.m217046b(c22348a.f207353h);
            z3g0Var.mo106696f(c22348a.m221445h());
            return c22348a;
        }
        if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(z3g0Var, i2, i);
            z3g0Var.m217046b(windowSkip.f207347i);
            z3g0Var.mo106696f(windowSkip.m221443i());
            return windowSkip;
        }
        WindowOverlap windowOverlap = new WindowOverlap(z3g0Var, i2, i);
        z3g0Var.m217046b(windowOverlap.f207334i);
        z3g0Var.mo106696f(windowOverlap.m221439j());
        return windowOverlap;
    }
}
