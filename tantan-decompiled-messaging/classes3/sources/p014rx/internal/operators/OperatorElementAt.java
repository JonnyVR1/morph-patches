package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import l.ig3;
import p003l.rc90;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorElementAt<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f10833a;

    /* JADX INFO: renamed from: b */
    public final boolean f10834b;

    /* JADX INFO: renamed from: c */
    public final T f10835c;

    public static class InnerProducer extends AtomicBoolean implements rc90 {
        private static final long serialVersionUID = 1;
        final rc90 actual;

        public InnerProducer(rc90 rc90Var) {
            this.actual = rc90Var;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                ig3.a("n >= 0 required");
            } else {
                if (j <= 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.request(Long.MAX_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorElementAt$a */
    public class C1118a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f10836e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f10837f;

        public C1118a(z3g0 z3g0Var) {
            this.f10837f = z3g0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f10837f.mo3257f(new InnerProducer(rc90Var));
        }

        @Override // p003l.m250
        public void onCompleted() {
            int i = this.f10836e;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.f10833a) {
                boolean z = operatorElementAt.f10834b;
                z3g0 z3g0Var = this.f10837f;
                if (z) {
                    z3g0Var.onNext(operatorElementAt.f10835c);
                    this.f10837f.onCompleted();
                } else {
                    z3g0Var.onError(new IndexOutOfBoundsException(OperatorElementAt.this.f10833a + " is out of bounds"));
                }
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10837f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int i = this.f10836e;
            this.f10836e = i + 1;
            if (i == OperatorElementAt.this.f10833a) {
                this.f10837f.onNext(t);
                this.f10837f.onCompleted();
                unsubscribe();
            }
        }
    }

    public OperatorElementAt(int i, T t, boolean z) {
        if (i >= 0) {
            this.f10833a = i;
            this.f10835c = t;
            this.f10834b = z;
        } else {
            throw new IndexOutOfBoundsException(i + " is out of bounds");
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C1118a c1118a = new C1118a(z3g0Var);
        z3g0Var.m9240b(c1118a);
        return c1118a;
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }
}
