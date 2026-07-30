package p153l;

import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class do50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f89875a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, Boolean> f89876b;

    /* JADX INFO: renamed from: l.do50$a */
    public static final class C16591a<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f89877e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, Boolean> f89878f;

        /* JADX INFO: renamed from: g */
        public boolean f89879g;

        public C16591a(gcg0<? super T> gcg0Var, qcj<? super T, Boolean> qcjVar) {
            this.f89877e = gcg0Var;
            this.f89878f = qcjVar;
            m129868e(0L);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            super.mo95773f(vk90Var);
            this.f89877e.mo95773f(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f89879g) {
                return;
            }
            this.f89877e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f89879g) {
                hrd0.m136792j(th);
            } else {
                this.f89879g = true;
                this.f89877e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                if (this.f89878f.call(t).booleanValue()) {
                    this.f89877e.onNext(t);
                } else {
                    m129868e(1L);
                }
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public do50(C22421c<T> c22421c, qcj<? super T, Boolean> qcjVar) {
        this.f89875a = c22421c;
        this.f89876b = qcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        C16591a c16591a = new C16591a(gcg0Var, this.f89876b);
        gcg0Var.m129866b(c16591a);
        this.f89875a.unsafeSubscribe(c16591a);
    }
}
