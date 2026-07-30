package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p153l.gcg0;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorElementAt<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f208130a;

    /* JADX INFO: renamed from: b */
    public final boolean f208131b;

    /* JADX INFO: renamed from: c */
    public final T f208132c;

    public static class InnerProducer extends AtomicBoolean implements vk90 {
        private static final long serialVersionUID = 1;
        final vk90 actual;

        public InnerProducer(vk90 vk90Var) {
            this.actual = vk90Var;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                wg3.m206174a("n >= 0 required");
            } else {
                if (j <= 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.request(Long.MAX_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorElementAt$a */
    public class C22440a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public int f208133e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f208134f;

        public C22440a(gcg0 gcg0Var) {
            this.f208134f = gcg0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f208134f.mo95773f(new InnerProducer(vk90Var));
        }

        @Override // p153l.bb50
        public void onCompleted() {
            int i = this.f208133e;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.f208130a) {
                boolean z = operatorElementAt.f208131b;
                gcg0 gcg0Var = this.f208134f;
                if (z) {
                    gcg0Var.onNext(operatorElementAt.f208132c);
                    this.f208134f.onCompleted();
                } else {
                    gcg0Var.onError(new IndexOutOfBoundsException(OperatorElementAt.this.f208130a + " is out of bounds"));
                }
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208134f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int i = this.f208133e;
            this.f208133e = i + 1;
            if (i == OperatorElementAt.this.f208130a) {
                this.f208134f.onNext(t);
                this.f208134f.onCompleted();
                unsubscribe();
            }
        }
    }

    public OperatorElementAt(int i, T t, boolean z) {
        if (i >= 0) {
            this.f208130a = i;
            this.f208132c = t;
            this.f208131b = z;
        } else {
            throw new IndexOutOfBoundsException(i + " is out of bounds");
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C22440a c22440a = new C22440a(gcg0Var);
        gcg0Var.m129866b(c22440a);
        return c22440a;
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }
}
