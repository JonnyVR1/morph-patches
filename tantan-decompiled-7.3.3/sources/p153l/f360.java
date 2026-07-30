package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class f360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f96956a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f96957b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f96958c;

    /* JADX INFO: renamed from: l.f360$a */
    public class C16881a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final C16882b<T> f96959e;

        /* JADX INFO: renamed from: f */
        public final gcg0<?> f96960f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ wqe0 f96961g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ f2e0.AbstractC16877a f96962h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ are0 f96963i;

        /* JADX INFO: renamed from: l.f360$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f96965a;

            public a(int i) {
                this.f96965a = i;
            }

            @Override // p153l.x20
            public void call() {
                C16881a c16881a = C16881a.this;
                c16881a.f96959e.m123717b(this.f96965a, c16881a.f96963i, c16881a.f96960f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16881a(gcg0 gcg0Var, wqe0 wqe0Var, f2e0.AbstractC16877a abstractC16877a, are0 are0Var) {
            super(gcg0Var);
            this.f96961g = wqe0Var;
            this.f96962h = abstractC16877a;
            this.f96963i = are0Var;
            this.f96959e = new C16882b<>();
            this.f96960f = this;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f96959e.m123718c(this.f96963i, this);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f96963i.onError(th);
            unsubscribe();
            this.f96959e.m123716a();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int iM123719d = this.f96959e.m123719d(t);
            wqe0 wqe0Var = this.f96961g;
            f2e0.AbstractC16877a abstractC16877a = this.f96962h;
            a aVar = new a(iM123719d);
            f360 f360Var = f360.this;
            wqe0Var.m207511b(abstractC16877a.mo102837c(aVar, f360Var.f96956a, f360Var.f96957b));
        }
    }

    /* JADX INFO: renamed from: l.f360$b */
    public static final class C16882b<T> {

        /* JADX INFO: renamed from: a */
        public int f96967a;

        /* JADX INFO: renamed from: b */
        public T f96968b;

        /* JADX INFO: renamed from: c */
        public boolean f96969c;

        /* JADX INFO: renamed from: d */
        public boolean f96970d;

        /* JADX INFO: renamed from: e */
        public boolean f96971e;

        /* JADX INFO: renamed from: a */
        public synchronized void m123716a() {
            this.f96967a++;
            this.f96968b = null;
            this.f96969c = false;
        }

        /* JADX INFO: renamed from: b */
        public void m123717b(int i, gcg0<T> gcg0Var, gcg0<?> gcg0Var2) {
            synchronized (this) {
                if (!this.f96971e && this.f96969c && i == this.f96967a) {
                    T t = this.f96968b;
                    this.f96968b = null;
                    this.f96969c = false;
                    this.f96971e = true;
                    try {
                        gcg0Var.onNext(t);
                        synchronized (this) {
                            try {
                                if (this.f96970d) {
                                    gcg0Var.onCompleted();
                                } else {
                                    this.f96971e = false;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        j6f.m143665g(th2, gcg0Var2, t);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m123718c(gcg0<T> gcg0Var, gcg0<?> gcg0Var2) {
            synchronized (this) {
                try {
                    if (this.f96971e) {
                        this.f96970d = true;
                        return;
                    }
                    T t = this.f96968b;
                    boolean z = this.f96969c;
                    this.f96968b = null;
                    this.f96969c = false;
                    this.f96971e = true;
                    if (z) {
                        try {
                            gcg0Var.onNext(t);
                        } catch (Throwable th) {
                            j6f.m143665g(th, gcg0Var2, t);
                            return;
                        }
                    }
                    gcg0Var.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized int m123719d(T t) {
            int i;
            this.f96968b = t;
            this.f96969c = true;
            i = this.f96967a + 1;
            this.f96967a = i;
            return i;
        }
    }

    public f360(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f96956a = j;
        this.f96957b = timeUnit;
        this.f96958c = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f96958c.createWorker();
        are0 are0Var = new are0(gcg0Var);
        wqe0 wqe0Var = new wqe0();
        are0Var.m129866b(abstractC16877aCreateWorker);
        are0Var.m129866b(wqe0Var);
        return new C16881a(gcg0Var, wqe0Var, abstractC16877aCreateWorker, are0Var);
    }
}
