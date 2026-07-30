package p149l;

import p133rx.C22306c;
import p133rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class ev50<T, U> implements C22306c.c<T, T>, x9j<U, U, Boolean> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends U> f93311a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super U, ? super U, Boolean> f93312b;

    /* JADX INFO: renamed from: l.ev50$a */
    public class C16687a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public U f93313e;

        /* JADX INFO: renamed from: f */
        public boolean f93314f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f93315g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16687a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f93315g = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f93315g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f93315g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                U uCall = ev50.this.f93311a.call(t);
                U u = this.f93313e;
                this.f93313e = uCall;
                if (!this.f93314f) {
                    this.f93314f = true;
                    this.f93315g.onNext(t);
                    return;
                }
                try {
                    if (ev50.this.f93312b.call(u, uCall).booleanValue()) {
                        m217048e(1L);
                    } else {
                        this.f93315g.onNext(t);
                    }
                } catch (Throwable th) {
                    f5f.m119493g(th, this.f93315g, uCall);
                }
            } catch (Throwable th2) {
                f5f.m119493g(th2, this.f93315g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.ev50$b */
    public static final class C16688b {
        static final ev50<?, ?> INSTANCE = new ev50<>(UtilityFunctions.m221487b());
    }

    public ev50(x9j<? super U, ? super U, Boolean> x9jVar) {
        this.f93311a = UtilityFunctions.m221487b();
        this.f93312b = x9jVar;
    }

    /* JADX INFO: renamed from: c */
    public static <T> ev50<T, T> m118242c() {
        return (ev50<T, T>) C16688b.INSTANCE;
    }

    @Override // p149l.x9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C16687a(z3g0Var, z3g0Var);
    }

    public ev50(w9j<? super T, ? extends U> w9jVar) {
        this.f93311a = w9jVar;
        this.f93312b = this;
    }
}
