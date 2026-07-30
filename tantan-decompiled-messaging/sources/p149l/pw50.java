package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class pw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f151541a;

    /* JADX INFO: renamed from: b */
    public final bud0 f151542b;

    /* JADX INFO: renamed from: l.pw50$a */
    public class C19351a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public long f151543e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f151544f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19351a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f151544f = z3g0Var2;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f151544f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f151544f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long jNow = pw50.this.f151542b.now();
            long j = this.f151543e;
            if (j == 0 || jNow - j >= pw50.this.f151541a) {
                this.f151543e = jNow;
                this.f151544f.onNext(t);
            }
        }
    }

    public pw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f151541a = timeUnit.toMillis(j);
        this.f151542b = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C19351a(z3g0Var, z3g0Var);
    }
}
