package p149l;

import java.util.NoSuchElementException;
import p133rx.C22306c;
import p133rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class yv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final boolean f200225a;

    /* JADX INFO: renamed from: b */
    public final T f200226b;

    /* JADX INFO: renamed from: l.yv50$a */
    public static final class C21538a {
        static final yv50<?> INSTANCE = new yv50<>();
    }

    /* JADX INFO: renamed from: l.yv50$b */
    public static final class C21539b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f200227e;

        /* JADX INFO: renamed from: f */
        public final boolean f200228f;

        /* JADX INFO: renamed from: g */
        public final T f200229g;

        /* JADX INFO: renamed from: h */
        public T f200230h;

        /* JADX INFO: renamed from: i */
        public boolean f200231i;

        /* JADX INFO: renamed from: j */
        public boolean f200232j;

        public C21539b(z3g0<? super T> z3g0Var, boolean z, T t) {
            this.f200227e = z3g0Var;
            this.f200228f = z;
            this.f200229g = t;
            m217048e(2L);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f200232j) {
                return;
            }
            if (this.f200231i) {
                this.f200227e.mo106696f(new SingleProducer(this.f200227e, this.f200230h));
                return;
            }
            boolean z = this.f200228f;
            z3g0<? super T> z3g0Var = this.f200227e;
            if (z) {
                z3g0Var.mo106696f(new SingleProducer(this.f200227e, this.f200229g));
            } else {
                z3g0Var.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f200232j) {
                ejd0.m116793j(th);
            } else {
                this.f200227e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f200232j) {
                return;
            }
            if (!this.f200231i) {
                this.f200230h = t;
                this.f200231i = true;
            } else {
                this.f200232j = true;
                this.f200227e.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    public yv50(boolean z, T t) {
        this.f200225a = z;
        this.f200226b = t;
    }

    /* JADX INFO: renamed from: b */
    public static <T> yv50<T> m216192b() {
        return (yv50<T>) C21538a.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C21539b c21539b = new C21539b(z3g0Var, this.f200225a, this.f200226b);
        z3g0Var.m217046b(c21539b);
        return c21539b;
    }

    public yv50(T t) {
        this(true, t);
    }

    public yv50() {
        this(false, null);
    }
}
