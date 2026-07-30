package p153l;

import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class k560<T, U, R> implements C22421c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f123972c = new Object();

    /* JADX INFO: renamed from: a */
    public final rcj<? super T, ? super U, ? extends R> f123973a;

    /* JADX INFO: renamed from: b */
    public final C22421c<? extends U> f123974b;

    /* JADX INFO: renamed from: l.k560$a */
    public class C18097a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f123975e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f123976f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18097a(gcg0 gcg0Var, boolean z, AtomicReference atomicReference, are0 are0Var) {
            super(gcg0Var, z);
            this.f123975e = atomicReference;
            this.f123976f = are0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f123976f.onCompleted();
            this.f123976f.unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f123976f.onError(th);
            this.f123976f.unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            Object obj = this.f123975e.get();
            if (obj != k560.f123972c) {
                try {
                    this.f123976f.onNext(k560.this.f123973a.call(t, obj));
                } catch (Throwable th) {
                    j6f.m143664f(th, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.k560$b */
    public class C18098b extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f123978e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f123979f;

        public C18098b(AtomicReference atomicReference, are0 are0Var) {
            this.f123978e = atomicReference;
            this.f123979f = are0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f123978e.get() == k560.f123972c) {
                this.f123979f.onCompleted();
                this.f123979f.unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f123979f.onError(th);
            this.f123979f.unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(U u) {
            this.f123978e.set(u);
        }
    }

    public k560(C22421c<? extends U> c22421c, rcj<? super T, ? super U, ? extends R> rcjVar) {
        this.f123974b = c22421c;
        this.f123973a = rcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super R> gcg0Var) {
        are0 are0Var = new are0(gcg0Var, false);
        gcg0Var.m129866b(are0Var);
        AtomicReference atomicReference = new AtomicReference(f123972c);
        C18097a c18097a = new C18097a(are0Var, true, atomicReference, are0Var);
        C18098b c18098b = new C18098b(atomicReference, are0Var);
        are0Var.m129866b(c18097a);
        are0Var.m129866b(c18098b);
        this.f123974b.unsafeSubscribe(c18098b);
        return c18097a;
    }
}
