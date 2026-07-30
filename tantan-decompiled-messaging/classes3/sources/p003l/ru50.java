package p003l;

import java.util.ArrayList;
import java.util.List;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ru50<T, TClosing> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C1099c<? extends TClosing>> f7072a;

    /* JADX INFO: renamed from: b */
    public final int f7073b;

    /* JADX INFO: renamed from: l.ru50$a */
    public class C0512a implements v9j<C1099c<? extends TClosing>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f7074a;

        public C0512a(C1099c c1099c) {
            this.f7074a = c1099c;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<? extends TClosing> call() {
            return this.f7074a;
        }
    }

    /* JADX INFO: renamed from: l.ru50$b */
    public class C0513b extends z3g0<TClosing> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0514c f7076e;

        public C0513b(C0514c c0514c) {
            this.f7076e = c0514c;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f7076e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7076e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(TClosing tclosing) {
            this.f7076e.m7376g();
        }
    }

    /* JADX INFO: renamed from: l.ru50$c */
    public final class C0514c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f7078e;

        /* JADX INFO: renamed from: f */
        public List<T> f7079f;

        /* JADX INFO: renamed from: g */
        public boolean f7080g;

        public C0514c(z3g0<? super List<T>> z3g0Var) {
            this.f7078e = z3g0Var;
            this.f7079f = new ArrayList(ru50.this.f7073b);
        }

        /* JADX INFO: renamed from: g */
        public void m7376g() {
            synchronized (this) {
                try {
                    if (this.f7080g) {
                        return;
                    }
                    List<T> list = this.f7079f;
                    this.f7079f = new ArrayList(ru50.this.f7073b);
                    try {
                        this.f7078e.onNext(list);
                    } catch (Throwable th) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f7080g) {
                                    return;
                                }
                                this.f7080g = true;
                                f5f.m3965f(th, this.f7078e);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f7080g) {
                            return;
                        }
                        this.f7080g = true;
                        List<T> list = this.f7079f;
                        this.f7079f = null;
                        this.f7078e.onNext(list);
                        this.f7078e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f7078e);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f7080g) {
                        return;
                    }
                    this.f7080g = true;
                    this.f7079f = null;
                    this.f7078e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f7080g) {
                        return;
                    }
                    this.f7079f.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ru50(C1099c<? extends TClosing> c1099c, int i) {
        this.f7072a = new C0512a(c1099c);
        this.f7073b = i;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        try {
            C1099c<? extends TClosing> c1099cCall = this.f7072a.call();
            C0514c c0514c = new C0514c(new vie0(z3g0Var));
            C0513b c0513b = new C0513b(c0514c);
            z3g0Var.m9240b(c0513b);
            z3g0Var.m9240b(c0514c);
            c1099cCall.unsafeSubscribe(c0513b);
            return c0514c;
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
            return a4g0.m2741a();
        }
    }

    public ru50(v9j<? extends C1099c<? extends TClosing>> v9jVar, int i) {
        this.f7072a = v9jVar;
        this.f7073b = i;
    }
}
