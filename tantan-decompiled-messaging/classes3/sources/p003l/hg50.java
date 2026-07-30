package p003l;

import java.util.NoSuchElementException;
import p014rx.C1099c;
import p014rx.C1100d;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hg50<T> implements C1100d.b<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f4183a;

    /* JADX INFO: renamed from: l.hg50$a */
    public class C0335a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f4184e;

        /* JADX INFO: renamed from: f */
        public boolean f4185f;

        /* JADX INFO: renamed from: g */
        public T f4186g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ fif0 f4187h;

        public C0335a(fif0 fif0Var) {
            this.f4187h = fif0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(2L);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f4184e) {
                return;
            }
            boolean z = this.f4185f;
            fif0 fif0Var = this.f4187h;
            if (z) {
                fif0Var.mo4377c(this.f4186g);
            } else {
                fif0Var.mo4376b(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4187h.mo4376b(th);
            unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (!this.f4185f) {
                this.f4185f = true;
                this.f4186g = t;
            } else {
                this.f4184e = true;
                this.f4187h.mo4376b(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }
    }

    public hg50(C1099c<T> c1099c) {
        this.f4183a = c1099c;
    }

    /* JADX INFO: renamed from: b */
    public static <T> hg50<T> m4961b(C1099c<T> c1099c) {
        return new hg50<>(c1099c);
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(fif0<? super T> fif0Var) {
        C0335a c0335a = new C0335a(fif0Var);
        fif0Var.m4375a(c0335a);
        this.f4183a.unsafeSubscribe(c0335a);
    }
}
