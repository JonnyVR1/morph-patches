package p153l;

import p137rx.C22421c;
import p137rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: classes3.dex */
public final class k360<T, U> implements C22421c.c<T, T>, rcj<U, U, Boolean> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends U> f123684a;

    /* JADX INFO: renamed from: b */
    public final rcj<? super U, ? super U, Boolean> f123685b;

    /* JADX INFO: renamed from: l.k360$a */
    public class C18080a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public U f123686e;

        /* JADX INFO: renamed from: f */
        public boolean f123687f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f123688g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18080a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f123688g = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f123688g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f123688g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                U uCall = k360.this.f123684a.call(t);
                U u = this.f123686e;
                this.f123686e = uCall;
                if (!this.f123687f) {
                    this.f123687f = true;
                    this.f123688g.onNext(t);
                    return;
                }
                try {
                    if (k360.this.f123685b.call(u, uCall).booleanValue()) {
                        m129868e(1L);
                    } else {
                        this.f123688g.onNext(t);
                    }
                } catch (Throwable th) {
                    j6f.m143665g(th, this.f123688g, uCall);
                }
            } catch (Throwable th2) {
                j6f.m143665g(th2, this.f123688g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.k360$b */
    public static final class C18081b {
        static final k360<?, ?> INSTANCE = new k360<>(UtilityFunctions.m222733b());
    }

    public k360(rcj<? super U, ? super U, Boolean> rcjVar) {
        this.f123684a = UtilityFunctions.m222733b();
        this.f123685b = rcjVar;
    }

    /* JADX INFO: renamed from: c */
    public static <T> k360<T, T> m148002c() {
        return (k360<T, T>) C18081b.INSTANCE;
    }

    @Override // p153l.rcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C18080a(gcg0Var, gcg0Var);
    }

    public k360(qcj<? super T, ? extends U> qcjVar) {
        this.f123684a = qcjVar;
        this.f123685b = this;
    }
}
