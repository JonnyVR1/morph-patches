package p153l;

import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class s360<T, U, R> implements C22421c.c<C22421c<? extends R>, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends C22421c<? extends U>> f165975a;

    /* JADX INFO: renamed from: b */
    public final rcj<? super T, ? super U, ? extends R> f165976b;

    /* JADX INFO: renamed from: l.s360$a */
    public static class C19964a implements qcj<T, C22421c<U>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f165977a;

        public C19964a(qcj qcjVar) {
            this.f165977a = qcjVar;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<U> call(T t) {
            return C22421c.from((Iterable) this.f165977a.call(t));
        }
    }

    /* JADX INFO: renamed from: l.s360$b */
    public static final class C19965b<T, U, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<? extends R>> f165978e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends C22421c<? extends U>> f165979f;

        /* JADX INFO: renamed from: g */
        public final rcj<? super T, ? super U, ? extends R> f165980g;

        /* JADX INFO: renamed from: h */
        public boolean f165981h;

        public C19965b(gcg0<? super C22421c<? extends R>> gcg0Var, qcj<? super T, ? extends C22421c<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar) {
            this.f165978e = gcg0Var;
            this.f165979f = qcjVar;
            this.f165980g = rcjVar;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f165978e.mo95773f(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f165981h) {
                return;
            }
            this.f165978e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f165981h) {
                hrd0.m136792j(th);
            } else {
                this.f165981h = true;
                this.f165978e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f165978e.onNext(this.f165979f.call(t).map(new C19966c(t, this.f165980g)));
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    /* JADX INFO: renamed from: l.s360$c */
    public static final class C19966c<T, U, R> implements qcj<U, R> {

        /* JADX INFO: renamed from: a */
        public final T f165982a;

        /* JADX INFO: renamed from: b */
        public final rcj<? super T, ? super U, ? extends R> f165983b;

        public C19966c(T t, rcj<? super T, ? super U, ? extends R> rcjVar) {
            this.f165982a = t;
            this.f165983b = rcjVar;
        }

        @Override // p153l.qcj
        public R call(U u) {
            return this.f165983b.call(this.f165982a, u);
        }
    }

    public s360(qcj<? super T, ? extends C22421c<? extends U>> qcjVar, rcj<? super T, ? super U, ? extends R> rcjVar) {
        this.f165975a = qcjVar;
        this.f165976b = rcjVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T, U> qcj<T, C22421c<U>> m184228b(qcj<? super T, ? extends Iterable<? extends U>> qcjVar) {
        return new C19964a(qcjVar);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<? extends R>> gcg0Var) {
        C19965b c19965b = new C19965b(gcg0Var, this.f165975a, this.f165976b);
        gcg0Var.m129866b(c19965b);
        return c19965b;
    }
}
