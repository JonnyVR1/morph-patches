package p003l;

import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final e30<? super T> f6704a;

    /* JADX INFO: renamed from: l.qv50$a */
    public class C0492a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f6705a;

        public C0492a(AtomicLong atomicLong) {
            this.f6705a = atomicLong;
        }

        @Override // p003l.rc90
        public void request(long j) {
            kc2.m5640b(this.f6705a, j);
        }
    }

    /* JADX INFO: renamed from: l.qv50$b */
    public class C0493b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f6707e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicLong f6708f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0493b(z3g0 z3g0Var, z3g0 z3g0Var2, AtomicLong atomicLong) {
            super(z3g0Var);
            this.f6707e = z3g0Var2;
            this.f6708f = atomicLong;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f6707e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f6707e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f6708f.get() > 0) {
                this.f6707e.onNext(t);
                this.f6708f.decrementAndGet();
                return;
            }
            e30<? super T> e30Var = qv50.this.f6704a;
            if (e30Var != null) {
                try {
                    e30Var.call(t);
                } catch (Throwable th) {
                    f5f.m3966g(th, this.f6707e, t);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.qv50$c */
    public static final class C0494c {
        static final qv50<Object> INSTANCE = new qv50<>();
    }

    public qv50(e30<? super T> e30Var) {
        this.f6704a = e30Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> qv50<T> m7042b() {
        return (qv50<T>) C0494c.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        AtomicLong atomicLong = new AtomicLong();
        z3g0Var.mo3257f(new C0492a(atomicLong));
        return new C0493b(z3g0Var, z3g0Var, atomicLong);
    }

    public qv50() {
        this(null);
    }
}
