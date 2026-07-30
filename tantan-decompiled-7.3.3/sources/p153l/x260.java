package p153l;

import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class x260<T, TClosing> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final pcj<? extends C22421c<? extends TClosing>> f192117a;

    /* JADX INFO: renamed from: b */
    public final int f192118b;

    /* JADX INFO: renamed from: l.x260$a */
    public class C21231a implements pcj<C22421c<? extends TClosing>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f192119a;

        public C21231a(C22421c c22421c) {
            this.f192119a = c22421c;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<? extends TClosing> call() {
            return this.f192119a;
        }
    }

    /* JADX INFO: renamed from: l.x260$b */
    public class C21232b extends gcg0<TClosing> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C21233c f192121e;

        public C21232b(C21233c c21233c) {
            this.f192121e = c21233c;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f192121e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f192121e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(TClosing tclosing) {
            this.f192121e.m209128g();
        }
    }

    /* JADX INFO: renamed from: l.x260$c */
    public final class C21233c extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f192123e;

        /* JADX INFO: renamed from: f */
        public List<T> f192124f;

        /* JADX INFO: renamed from: g */
        public boolean f192125g;

        public C21233c(gcg0<? super List<T>> gcg0Var) {
            this.f192123e = gcg0Var;
            this.f192124f = new ArrayList(x260.this.f192118b);
        }

        /* JADX INFO: renamed from: g */
        public void m209128g() {
            synchronized (this) {
                try {
                    if (this.f192125g) {
                        return;
                    }
                    List<T> list = this.f192124f;
                    this.f192124f = new ArrayList(x260.this.f192118b);
                    try {
                        this.f192123e.onNext(list);
                    } catch (Throwable th) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f192125g) {
                                    return;
                                }
                                this.f192125g = true;
                                j6f.m143664f(th, this.f192123e);
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

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f192125g) {
                            return;
                        }
                        this.f192125g = true;
                        List<T> list = this.f192124f;
                        this.f192124f = null;
                        this.f192123e.onNext(list);
                        this.f192123e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f192123e);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f192125g) {
                        return;
                    }
                    this.f192125g = true;
                    this.f192124f = null;
                    this.f192123e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f192125g) {
                        return;
                    }
                    this.f192124f.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public x260(C22421c<? extends TClosing> c22421c, int i) {
        this.f192117a = new C21231a(c22421c);
        this.f192118b = i;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        try {
            C22421c<? extends TClosing> c22421cCall = this.f192117a.call();
            C21233c c21233c = new C21233c(new are0(gcg0Var));
            C21232b c21232b = new C21232b(c21233c);
            gcg0Var.m129866b(c21232b);
            gcg0Var.m129866b(c21233c);
            c22421cCall.unsafeSubscribe(c21232b);
            return c21233c;
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
            return icg0.m139434a();
        }
    }

    public x260(pcj<? extends C22421c<? extends TClosing>> pcjVar, int i) {
        this.f192117a = pcjVar;
        this.f192118b = i;
    }
}
