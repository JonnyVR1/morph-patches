package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ow50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, ? super Integer, Boolean> f145957a;

    /* JADX INFO: renamed from: l.ow50$a */
    public class C19058a implements x9j<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f145958a;

        public C19058a(w9j w9jVar) {
            this.f145958a = w9jVar;
        }

        @Override // p149l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f145958a.call(t);
        }
    }

    /* JADX INFO: renamed from: l.ow50$b */
    public class C19059b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f145959e;

        /* JADX INFO: renamed from: f */
        public boolean f145960f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f145961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19059b(z3g0 z3g0Var, boolean z, z3g0 z3g0Var2) {
            super(z3g0Var, z);
            this.f145961g = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f145960f) {
                return;
            }
            this.f145961g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f145960f) {
                return;
            }
            this.f145961g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                x9j<? super T, ? super Integer, Boolean> x9jVar = ow50.this.f145957a;
                int i = this.f145959e;
                this.f145959e = i + 1;
                if (x9jVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.f145961g.onNext(t);
                    return;
                }
                this.f145960f = true;
                this.f145961g.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.f145960f = true;
                f5f.m119493g(th, this.f145961g, t);
                unsubscribe();
            }
        }
    }

    public ow50(w9j<? super T, Boolean> w9jVar) {
        this(new C19058a(w9jVar));
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C19059b c19059b = new C19059b(z3g0Var, false, z3g0Var);
        z3g0Var.m217046b(c19059b);
        return c19059b;
    }

    public ow50(x9j<? super T, ? super Integer, Boolean> x9jVar) {
        this.f145957a = x9jVar;
    }
}
