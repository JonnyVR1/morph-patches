package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ow50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, ? super Integer, Boolean> f6272a;

    /* JADX INFO: renamed from: l.ow50$a */
    public class C0462a implements x9j<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f6273a;

        public C0462a(w9j w9jVar) {
            this.f6273a = w9jVar;
        }

        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f6273a.call(t);
        }
    }

    /* JADX INFO: renamed from: l.ow50$b */
    public class C0463b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f6274e;

        /* JADX INFO: renamed from: f */
        public boolean f6275f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f6276g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0463b(z3g0 z3g0Var, boolean z, z3g0 z3g0Var2) {
            super(z3g0Var, z);
            this.f6276g = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f6275f) {
                return;
            }
            this.f6276g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f6275f) {
                return;
            }
            this.f6276g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                x9j<? super T, ? super Integer, Boolean> x9jVar = ow50.this.f6272a;
                int i = this.f6274e;
                this.f6274e = i + 1;
                if (x9jVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.f6276g.onNext(t);
                    return;
                }
                this.f6275f = true;
                this.f6276g.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.f6275f = true;
                f5f.m3966g(th, this.f6276g, t);
                unsubscribe();
            }
        }
    }

    public ow50(w9j<? super T, Boolean> w9jVar) {
        this(new C0462a(w9jVar));
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0463b c0463b = new C0463b(z3g0Var, false, z3g0Var);
        z3g0Var.m9240b(c0463b);
        return c0463b;
    }

    public ow50(x9j<? super T, ? super Integer, Boolean> x9jVar) {
        this.f6272a = x9jVar;
    }
}
