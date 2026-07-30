package p003l;

import p014rx.C1099c;
import p014rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ev50<T, U> implements C1099c.c<T, T>, x9j<U, U, Boolean> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends U> f3395a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super U, ? super U, Boolean> f3396b;

    /* JADX INFO: renamed from: l.ev50$a */
    public class C0281a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public U f3397e;

        /* JADX INFO: renamed from: f */
        public boolean f3398f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f3399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0281a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f3399g = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3399g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3399g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                U uCall = ev50.this.f3395a.call(t);
                U u = this.f3397e;
                this.f3397e = uCall;
                if (!this.f3398f) {
                    this.f3398f = true;
                    this.f3399g.onNext(t);
                    return;
                }
                try {
                    if (ev50.this.f3396b.call(u, uCall).booleanValue()) {
                        m9242e(1L);
                    } else {
                        this.f3399g.onNext(t);
                    }
                } catch (Throwable th) {
                    f5f.m3966g(th, this.f3399g, uCall);
                }
            } catch (Throwable th2) {
                f5f.m3966g(th2, this.f3399g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.ev50$b */
    public static final class C0282b {
        static final ev50<?, ?> INSTANCE = new ev50<>(UtilityFunctions.m9944b());
    }

    public ev50(x9j<? super U, ? super U, Boolean> x9jVar) {
        this.f3395a = UtilityFunctions.m9944b();
        this.f3396b = x9jVar;
    }

    /* JADX INFO: renamed from: c */
    public static <T> ev50<T, T> m3944c() {
        return (ev50<T, T>) C0282b.INSTANCE;
    }

    @Override // p003l.x9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0281a(z3g0Var, z3g0Var);
    }

    public ev50(w9j<? super T, ? extends U> w9jVar) {
        this.f3395a = w9jVar;
        this.f3396b = this;
    }
}
