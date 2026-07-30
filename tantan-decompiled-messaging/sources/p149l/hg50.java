package p149l;

import java.util.NoSuchElementException;
import p133rx.C22306c;
import p133rx.C22307d;

/* JADX INFO: loaded from: classes3.dex */
public class hg50<T> implements C22307d.b<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f107564a;

    /* JADX INFO: renamed from: l.hg50$a */
    public class C17304a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f107565e;

        /* JADX INFO: renamed from: f */
        public boolean f107566f;

        /* JADX INFO: renamed from: g */
        public T f107567g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ fif0 f107568h;

        public C17304a(fif0 fif0Var) {
            this.f107568h = fif0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(2L);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f107565e) {
                return;
            }
            boolean z = this.f107566f;
            fif0 fif0Var = this.f107568h;
            if (z) {
                fif0Var.mo121511c(this.f107567g);
            } else {
                fif0Var.mo121510b(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f107568h.mo121510b(th);
            unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (!this.f107566f) {
                this.f107566f = true;
                this.f107567g = t;
            } else {
                this.f107565e = true;
                this.f107568h.mo121510b(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }
    }

    public hg50(C22306c<T> c22306c) {
        this.f107564a = c22306c;
    }

    /* JADX INFO: renamed from: b */
    public static <T> hg50<T> m130808b(C22306c<T> c22306c) {
        return new hg50<>(c22306c);
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(fif0<? super T> fif0Var) {
        C17304a c17304a = new C17304a(fif0Var);
        fif0Var.m121509a(c17304a);
        this.f107564a.unsafeSubscribe(c17304a);
    }
}
