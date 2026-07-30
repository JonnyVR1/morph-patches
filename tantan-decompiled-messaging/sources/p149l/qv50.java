package p149l;

import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class qv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final e30<? super T> f156580a;

    /* JADX INFO: renamed from: l.qv50$a */
    public class C19591a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f156581a;

        public C19591a(AtomicLong atomicLong) {
            this.f156581a = atomicLong;
        }

        @Override // p149l.rc90
        public void request(long j) {
            kc2.m145336b(this.f156581a, j);
        }
    }

    /* JADX INFO: renamed from: l.qv50$b */
    public class C19592b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f156583e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicLong f156584f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19592b(z3g0 z3g0Var, z3g0 z3g0Var2, AtomicLong atomicLong) {
            super(z3g0Var);
            this.f156583e = z3g0Var2;
            this.f156584f = atomicLong;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f156583e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f156583e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f156584f.get() > 0) {
                this.f156583e.onNext(t);
                this.f156584f.decrementAndGet();
                return;
            }
            e30<? super T> e30Var = qv50.this.f156580a;
            if (e30Var != null) {
                try {
                    e30Var.call(t);
                } catch (Throwable th) {
                    f5f.m119493g(th, this.f156583e, t);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.qv50$c */
    public static final class C19593c {
        static final qv50<Object> INSTANCE = new qv50<>();
    }

    public qv50(e30<? super T> e30Var) {
        this.f156580a = e30Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> qv50<T> m176694b() {
        return (qv50<T>) C19593c.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        AtomicLong atomicLong = new AtomicLong();
        z3g0Var.mo106696f(new C19591a(atomicLong));
        return new C19592b(z3g0Var, z3g0Var, atomicLong);
    }

    public qv50() {
        this(null);
    }
}
