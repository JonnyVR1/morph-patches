package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class zqe0<T, R> extends wbg0<T, R> {

    /* JADX INFO: renamed from: a */
    public final yqe0<T> f205608a;

    /* JADX INFO: renamed from: b */
    public final wbg0<T, R> f205609b;

    /* JADX INFO: renamed from: l.zqe0$a */
    public class C21864a implements C22421c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wbg0 f205610a;

        public C21864a(wbg0 wbg0Var) {
            this.f205610a = wbg0Var;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super R> gcg0Var) {
            this.f205610a.unsafeSubscribe(gcg0Var);
        }
    }

    public zqe0(wbg0<T, R> wbg0Var) {
        super(new C21864a(wbg0Var));
        this.f205609b = wbg0Var;
        this.f205608a = new yqe0<>(wbg0Var);
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f205608a.onCompleted();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f205608a.onError(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f205608a.onNext(t);
    }
}
