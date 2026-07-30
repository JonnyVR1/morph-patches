package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p149l.ig3;
import p149l.rc90;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorElementAt<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f207208a;

    /* JADX INFO: renamed from: b */
    public final boolean f207209b;

    /* JADX INFO: renamed from: c */
    public final T f207210c;

    public static class InnerProducer extends AtomicBoolean implements rc90 {
        private static final long serialVersionUID = 1;
        final rc90 actual;

        public InnerProducer(rc90 rc90Var) {
            this.actual = rc90Var;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                ig3.m135964a("n >= 0 required");
            } else {
                if (j <= 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.request(Long.MAX_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorElementAt$a */
    public class C22325a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f207211e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f207212f;

        public C22325a(z3g0 z3g0Var) {
            this.f207212f = z3g0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f207212f.mo106696f(new InnerProducer(rc90Var));
        }

        @Override // p149l.m250
        public void onCompleted() {
            int i = this.f207211e;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.f207208a) {
                boolean z = operatorElementAt.f207209b;
                z3g0 z3g0Var = this.f207212f;
                if (z) {
                    z3g0Var.onNext(operatorElementAt.f207210c);
                    this.f207212f.onCompleted();
                } else {
                    z3g0Var.onError(new IndexOutOfBoundsException(OperatorElementAt.this.f207208a + " is out of bounds"));
                }
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207212f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int i = this.f207211e;
            this.f207211e = i + 1;
            if (i == OperatorElementAt.this.f207208a) {
                this.f207212f.onNext(t);
                this.f207212f.onCompleted();
                unsubscribe();
            }
        }
    }

    public OperatorElementAt(int i, T t, boolean z) {
        if (i >= 0) {
            this.f207208a = i;
            this.f207210c = t;
            this.f207209b = z;
        } else {
            throw new IndexOutOfBoundsException(i + " is out of bounds");
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C22325a c22325a = new C22325a(z3g0Var);
        z3g0Var.m217046b(c22325a);
        return c22325a;
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }
}
