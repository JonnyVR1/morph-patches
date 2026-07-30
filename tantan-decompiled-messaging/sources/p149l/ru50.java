package p149l;

import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ru50<T, TClosing> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C22306c<? extends TClosing>> f161025a;

    /* JADX INFO: renamed from: b */
    public final int f161026b;

    /* JADX INFO: renamed from: l.ru50$a */
    public class C19783a implements v9j<C22306c<? extends TClosing>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f161027a;

        public C19783a(C22306c c22306c) {
            this.f161027a = c22306c;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<? extends TClosing> call() {
            return this.f161027a;
        }
    }

    /* JADX INFO: renamed from: l.ru50$b */
    public class C19784b extends z3g0<TClosing> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C19785c f161029e;

        public C19784b(C19785c c19785c) {
            this.f161029e = c19785c;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f161029e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f161029e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(TClosing tclosing) {
            this.f161029e.m180860g();
        }
    }

    /* JADX INFO: renamed from: l.ru50$c */
    public final class C19785c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f161031e;

        /* JADX INFO: renamed from: f */
        public List<T> f161032f;

        /* JADX INFO: renamed from: g */
        public boolean f161033g;

        public C19785c(z3g0<? super List<T>> z3g0Var) {
            this.f161031e = z3g0Var;
            this.f161032f = new ArrayList(ru50.this.f161026b);
        }

        /* JADX INFO: renamed from: g */
        public void m180860g() {
            synchronized (this) {
                try {
                    if (this.f161033g) {
                        return;
                    }
                    List<T> list = this.f161032f;
                    this.f161032f = new ArrayList(ru50.this.f161026b);
                    try {
                        this.f161031e.onNext(list);
                    } catch (Throwable th) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f161033g) {
                                    return;
                                }
                                this.f161033g = true;
                                f5f.m119492f(th, this.f161031e);
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

        @Override // p149l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f161033g) {
                            return;
                        }
                        this.f161033g = true;
                        List<T> list = this.f161032f;
                        this.f161032f = null;
                        this.f161031e.onNext(list);
                        this.f161031e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f161031e);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f161033g) {
                        return;
                    }
                    this.f161033g = true;
                    this.f161032f = null;
                    this.f161031e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f161033g) {
                        return;
                    }
                    this.f161032f.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ru50(C22306c<? extends TClosing> c22306c, int i) {
        this.f161025a = new C19783a(c22306c);
        this.f161026b = i;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        try {
            C22306c<? extends TClosing> c22306cCall = this.f161025a.call();
            C19785c c19785c = new C19785c(new vie0(z3g0Var));
            C19784b c19784b = new C19784b(c19785c);
            z3g0Var.m217046b(c19784b);
            z3g0Var.m217046b(c19785c);
            c22306cCall.unsafeSubscribe(c19784b);
            return c19785c;
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
            return a4g0.m94917a();
        }
    }

    public ru50(v9j<? extends C22306c<? extends TClosing>> v9jVar, int i) {
        this.f161025a = v9jVar;
        this.f161026b = i;
    }
}
