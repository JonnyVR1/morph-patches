package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uie0<T, R> extends p3g0<T, R> {

    /* JADX INFO: renamed from: a */
    public final tie0<T> f7989a;

    /* JADX INFO: renamed from: b */
    public final p3g0<T, R> f7990b;

    /* JADX INFO: renamed from: l.uie0$a */
    public class C0576a implements C1099c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ p3g0 f7991a;

        public C0576a(p3g0 p3g0Var) {
            this.f7991a = p3g0Var;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            this.f7991a.unsafeSubscribe(z3g0Var);
        }
    }

    public uie0(p3g0<T, R> p3g0Var) {
        super(new C0576a(p3g0Var));
        this.f7990b = p3g0Var;
        this.f7989a = new tie0<>(p3g0Var);
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f7989a.onCompleted();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f7989a.onError(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f7989a.onNext(t);
    }
}
