package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class uie0<T, R> extends p3g0<T, R> {

    /* JADX INFO: renamed from: a */
    public final tie0<T> f176647a;

    /* JADX INFO: renamed from: b */
    public final p3g0<T, R> f176648b;

    /* JADX INFO: renamed from: l.uie0$a */
    public class C20438a implements C22306c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ p3g0 f176649a;

        public C20438a(p3g0 p3g0Var) {
            this.f176649a = p3g0Var;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            this.f176649a.unsafeSubscribe(z3g0Var);
        }
    }

    public uie0(p3g0<T, R> p3g0Var) {
        super(new C20438a(p3g0Var));
        this.f176648b = p3g0Var;
        this.f176647a = new tie0<>(p3g0Var);
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f176647a.onCompleted();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f176647a.onError(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f176647a.onNext(t);
    }
}
