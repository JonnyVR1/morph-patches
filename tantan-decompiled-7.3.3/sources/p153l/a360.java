package p153l;

import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public class a360<T, R> implements C22421c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final Class<R> f68272a;

    /* JADX INFO: renamed from: l.a360$a */
    public static final class C15631a<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f68273e;

        /* JADX INFO: renamed from: f */
        public final Class<R> f68274f;

        /* JADX INFO: renamed from: g */
        public boolean f68275g;

        public C15631a(gcg0<? super R> gcg0Var, Class<R> cls) {
            this.f68273e = gcg0Var;
            this.f68274f = cls;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f68273e.mo95773f(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f68275g) {
                return;
            }
            this.f68273e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f68275g) {
                hrd0.m136792j(th);
            } else {
                this.f68275g = true;
                this.f68273e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f68273e.onNext(this.f68274f.cast(t));
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public a360(Class<R> cls) {
        this.f68272a = cls;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super R> gcg0Var) {
        C15631a c15631a = new C15631a(gcg0Var, this.f68272a);
        gcg0Var.m129866b(c15631a);
        return c15631a;
    }
}
