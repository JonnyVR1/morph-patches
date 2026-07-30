package p003l;

import java.util.NoSuchElementException;
import p014rx.C1099c;
import p014rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class yv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final boolean f9154a;

    /* JADX INFO: renamed from: b */
    public final T f9155b;

    /* JADX INFO: renamed from: l.yv50$a */
    public static final class C0666a {
        static final yv50<?> INSTANCE = new yv50<>();
    }

    /* JADX INFO: renamed from: l.yv50$b */
    public static final class C0667b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f9156e;

        /* JADX INFO: renamed from: f */
        public final boolean f9157f;

        /* JADX INFO: renamed from: g */
        public final T f9158g;

        /* JADX INFO: renamed from: h */
        public T f9159h;

        /* JADX INFO: renamed from: i */
        public boolean f9160i;

        /* JADX INFO: renamed from: j */
        public boolean f9161j;

        public C0667b(z3g0<? super T> z3g0Var, boolean z, T t) {
            this.f9156e = z3g0Var;
            this.f9157f = z;
            this.f9158g = t;
            m9242e(2L);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f9161j) {
                return;
            }
            if (this.f9160i) {
                this.f9156e.mo3257f(new SingleProducer(this.f9156e, this.f9159h));
                return;
            }
            boolean z = this.f9157f;
            z3g0<? super T> z3g0Var = this.f9156e;
            if (z) {
                z3g0Var.mo3257f(new SingleProducer(this.f9156e, this.f9158g));
            } else {
                z3g0Var.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f9161j) {
                ejd0.m3864j(th);
            } else {
                this.f9156e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f9161j) {
                return;
            }
            if (!this.f9160i) {
                this.f9159h = t;
                this.f9160i = true;
            } else {
                this.f9161j = true;
                this.f9156e.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    public yv50(boolean z, T t) {
        this.f9154a = z;
        this.f9155b = t;
    }

    /* JADX INFO: renamed from: b */
    public static <T> yv50<T> m9236b() {
        return (yv50<T>) C0666a.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0667b c0667b = new C0667b(z3g0Var, this.f9154a, this.f9155b);
        z3g0Var.m9240b(c0667b);
        return c0667b;
    }

    public yv50(T t) {
        this(true, t);
    }

    public yv50() {
        this(false, null);
    }
}
