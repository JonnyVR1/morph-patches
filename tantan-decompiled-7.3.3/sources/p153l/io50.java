package p153l;

import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class io50<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f116121a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends R> f116122b;

    /* JADX INFO: renamed from: l.io50$a */
    public static final class C17758a<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f116123e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends R> f116124f;

        /* JADX INFO: renamed from: g */
        public boolean f116125g;

        public C17758a(gcg0<? super R> gcg0Var, qcj<? super T, ? extends R> qcjVar) {
            this.f116123e = gcg0Var;
            this.f116124f = qcjVar;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f116123e.mo95773f(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f116125g) {
                return;
            }
            this.f116123e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f116125g) {
                hrd0.m136792j(th);
            } else {
                this.f116125g = true;
                this.f116123e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f116123e.onNext(this.f116124f.call(t));
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public io50(C22421c<T> c22421c, qcj<? super T, ? extends R> qcjVar) {
        this.f116121a = c22421c;
        this.f116122b = qcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        C17758a c17758a = new C17758a(gcg0Var, this.f116122b);
        gcg0Var.m129866b(c17758a);
        this.f116121a.unsafeSubscribe(c17758a);
    }
}
