package p149l;

import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ex50<T, U, R> implements C22306c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f93574c = new Object();

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, ? super U, ? extends R> f93575a;

    /* JADX INFO: renamed from: b */
    public final C22306c<? extends U> f93576b;

    /* JADX INFO: renamed from: l.ex50$a */
    public class C16706a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f93577e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f93578f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16706a(z3g0 z3g0Var, boolean z, AtomicReference atomicReference, vie0 vie0Var) {
            super(z3g0Var, z);
            this.f93577e = atomicReference;
            this.f93578f = vie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f93578f.onCompleted();
            this.f93578f.unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f93578f.onError(th);
            this.f93578f.unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            Object obj = this.f93577e.get();
            if (obj != ex50.f93574c) {
                try {
                    this.f93578f.onNext(ex50.this.f93575a.call(t, obj));
                } catch (Throwable th) {
                    f5f.m119492f(th, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ex50$b */
    public class C16707b extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f93580e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f93581f;

        public C16707b(AtomicReference atomicReference, vie0 vie0Var) {
            this.f93580e = atomicReference;
            this.f93581f = vie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f93580e.get() == ex50.f93574c) {
                this.f93581f.onCompleted();
                this.f93581f.unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f93581f.onError(th);
            this.f93581f.unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(U u) {
            this.f93580e.set(u);
        }
    }

    public ex50(C22306c<? extends U> c22306c, x9j<? super T, ? super U, ? extends R> x9jVar) {
        this.f93576b = c22306c;
        this.f93575a = x9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var, false);
        z3g0Var.m217046b(vie0Var);
        AtomicReference atomicReference = new AtomicReference(f93574c);
        C16706a c16706a = new C16706a(vie0Var, true, atomicReference, vie0Var);
        C16707b c16707b = new C16707b(atomicReference, vie0Var);
        vie0Var.m217046b(c16706a);
        vie0Var.m217046b(c16707b);
        this.f93576b.unsafeSubscribe(c16707b);
        return c16706a;
    }
}
