package p149l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class lv50<T, R> implements C22306c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends R> f130126a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super Throwable, ? extends R> f130127b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends R> f130128c;

    /* JADX INFO: renamed from: l.lv50$a */
    public class C18323a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18324b f130129a;

        public C18323a(C18324b c18324b) {
            this.f130129a = c18324b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f130129a.m151837h(j);
        }
    }

    /* JADX INFO: renamed from: l.lv50$b */
    public static final class C18324b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f130131e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends R> f130132f;

        /* JADX INFO: renamed from: g */
        public final w9j<? super Throwable, ? extends R> f130133g;

        /* JADX INFO: renamed from: h */
        public final v9j<? extends R> f130134h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f130135i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f130136j = new AtomicLong();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<rc90> f130137k = new AtomicReference<>();

        /* JADX INFO: renamed from: l */
        public long f130138l;

        /* JADX INFO: renamed from: m */
        public R f130139m;

        public C18324b(z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
            this.f130131e = z3g0Var;
            this.f130132f = w9jVar;
            this.f130133g = w9jVar2;
            this.f130134h = v9jVar;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            if (!f31.m119248a(this.f130137k, null, rc90Var)) {
                qkq0.m175383a("Producer already set!");
                return;
            }
            long andSet = this.f130136j.getAndSet(0L);
            if (andSet != 0) {
                rc90Var.request(andSet);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m151836g() {
            long j = this.f130138l;
            if (j == 0 || this.f130137k.get() == null) {
                return;
            }
            kc2.m145343i(this.f130135i, j);
        }

        /* JADX INFO: renamed from: h */
        public void m151837h(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            while (true) {
                long j2 = this.f130135i.get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    long j3 = Long.MAX_VALUE & j2;
                    if (this.f130135i.compareAndSet(j2, Long.MIN_VALUE | kc2.m145335a(j3, j))) {
                        if (j3 == 0) {
                            if (!this.f130131e.isUnsubscribed()) {
                                this.f130131e.onNext(this.f130139m);
                            }
                            if (this.f130131e.isUnsubscribed()) {
                                return;
                            }
                            this.f130131e.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.f130135i.compareAndSet(j2, kc2.m145335a(j2, j))) {
                        AtomicReference<rc90> atomicReference = this.f130137k;
                        rc90 rc90Var = atomicReference.get();
                        if (rc90Var != null) {
                            rc90Var.request(j);
                            return;
                        }
                        kc2.m145336b(this.f130136j, j);
                        rc90 rc90Var2 = atomicReference.get();
                        if (rc90Var2 != null) {
                            long andSet = this.f130136j.getAndSet(0L);
                            if (andSet != 0) {
                                rc90Var2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m151838i() {
            long j;
            do {
                j = this.f130135i.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f130135i.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f130137k.get() == null) {
                if (!this.f130131e.isUnsubscribed()) {
                    this.f130131e.onNext(this.f130139m);
                }
                if (this.f130131e.isUnsubscribed()) {
                    return;
                }
                this.f130131e.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            m151836g();
            try {
                this.f130139m = this.f130134h.call();
            } catch (Throwable th) {
                f5f.m119492f(th, this.f130131e);
            }
            m151838i();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            m151836g();
            try {
                this.f130139m = this.f130133g.call(th);
            } catch (Throwable th2) {
                f5f.m119493g(th2, this.f130131e, th);
            }
            m151838i();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f130138l++;
                this.f130131e.onNext(this.f130132f.call(t));
            } catch (Throwable th) {
                f5f.m119493g(th, this.f130131e, t);
            }
        }
    }

    public lv50(w9j<? super T, ? extends R> w9jVar, w9j<? super Throwable, ? extends R> w9jVar2, v9j<? extends R> v9jVar) {
        this.f130126a = w9jVar;
        this.f130127b = w9jVar2;
        this.f130128c = v9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C18324b c18324b = new C18324b(z3g0Var, this.f130126a, this.f130127b, this.f130128c);
        z3g0Var.m217046b(c18324b);
        z3g0Var.mo106696f(new C18323a(c18324b));
        return c18324b;
    }
}
