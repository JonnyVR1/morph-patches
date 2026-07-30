package p153l;

import java.util.NoSuchElementException;
import p137rx.C22421c;
import p137rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class e460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final boolean f92059a;

    /* JADX INFO: renamed from: b */
    public final T f92060b;

    /* JADX INFO: renamed from: l.e460$a */
    public static final class C16706a {
        static final e460<?> INSTANCE = new e460<>();
    }

    /* JADX INFO: renamed from: l.e460$b */
    public static final class C16707b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f92061e;

        /* JADX INFO: renamed from: f */
        public final boolean f92062f;

        /* JADX INFO: renamed from: g */
        public final T f92063g;

        /* JADX INFO: renamed from: h */
        public T f92064h;

        /* JADX INFO: renamed from: i */
        public boolean f92065i;

        /* JADX INFO: renamed from: j */
        public boolean f92066j;

        public C16707b(gcg0<? super T> gcg0Var, boolean z, T t) {
            this.f92061e = gcg0Var;
            this.f92062f = z;
            this.f92063g = t;
            m129868e(2L);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f92066j) {
                return;
            }
            if (this.f92065i) {
                this.f92061e.mo95773f(new SingleProducer(this.f92061e, this.f92064h));
                return;
            }
            boolean z = this.f92062f;
            gcg0<? super T> gcg0Var = this.f92061e;
            if (z) {
                gcg0Var.mo95773f(new SingleProducer(this.f92061e, this.f92063g));
            } else {
                gcg0Var.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f92066j) {
                hrd0.m136792j(th);
            } else {
                this.f92061e.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f92066j) {
                return;
            }
            if (!this.f92065i) {
                this.f92064h = t;
                this.f92065i = true;
            } else {
                this.f92066j = true;
                this.f92061e.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    public e460(boolean z, T t) {
        this.f92059a = z;
        this.f92060b = t;
    }

    /* JADX INFO: renamed from: b */
    public static <T> e460<T> m119388b() {
        return (e460<T>) C16706a.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C16707b c16707b = new C16707b(gcg0Var, this.f92059a, this.f92060b);
        gcg0Var.m129866b(c16707b);
        return c16707b;
    }

    public e460(T t) {
        this(true, t);
    }

    public e460() {
        this(false, null);
    }
}
