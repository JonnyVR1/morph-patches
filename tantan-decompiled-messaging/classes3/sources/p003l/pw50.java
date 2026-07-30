package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class pw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f6533a;

    /* JADX INFO: renamed from: b */
    public final bud0 f6534b;

    /* JADX INFO: renamed from: l.pw50$a */
    public class C0485a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public long f6535e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f6536f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0485a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f6536f = z3g0Var2;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f6536f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f6536f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long jNow = pw50.this.f6534b.now();
            long j = this.f6535e;
            if (j == 0 || jNow - j >= pw50.this.f6533a) {
                this.f6535e = jNow;
                this.f6536f.onNext(t);
            }
        }
    }

    public pw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f6533a = timeUnit.toMillis(j);
        this.f6534b = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0485a(z3g0Var, z3g0Var);
    }
}
