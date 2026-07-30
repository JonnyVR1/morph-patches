package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ew50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, Integer, Boolean> f93455a;

    /* JADX INFO: renamed from: l.ew50$a */
    public class C16697a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f93456e;

        /* JADX INFO: renamed from: f */
        public int f93457f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f93458g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16697a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f93458g = z3g0Var2;
            this.f93456e = true;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f93458g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f93458g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (!this.f93456e) {
                this.f93458g.onNext(t);
                return;
            }
            try {
                x9j<? super T, Integer, Boolean> x9jVar = ew50.this.f93455a;
                int i = this.f93457f;
                this.f93457f = i + 1;
                if (x9jVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    m217048e(1L);
                } else {
                    this.f93456e = false;
                    this.f93458g.onNext(t);
                }
            } catch (Throwable th) {
                f5f.m119493g(th, this.f93458g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.ew50$b */
    public static class C16698b implements x9j<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f93460a;

        public C16698b(w9j w9jVar) {
            this.f93460a = w9jVar;
        }

        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f93460a.call(t);
        }
    }

    public ew50(x9j<? super T, Integer, Boolean> x9jVar) {
        this.f93455a = x9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> x9j<T, Integer, Boolean> m118458b(w9j<? super T, Boolean> w9jVar) {
        return new C16698b(w9jVar);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C16697a(z3g0Var, z3g0Var);
    }
}
