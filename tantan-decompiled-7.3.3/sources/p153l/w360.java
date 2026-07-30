package p153l;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class w360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final y20<? super T> f187102a;

    /* JADX INFO: renamed from: l.w360$a */
    public class C21006a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f187103a;

        public C21006a(AtomicLong atomicLong) {
            this.f187103a = atomicLong;
        }

        @Override // p153l.vk90
        public void request(long j) {
            rc2.m180770b(this.f187103a, j);
        }
    }

    /* JADX INFO: renamed from: l.w360$b */
    public class C21007b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f187105e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicLong f187106f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21007b(gcg0 gcg0Var, gcg0 gcg0Var2, AtomicLong atomicLong) {
            super(gcg0Var);
            this.f187105e = gcg0Var2;
            this.f187106f = atomicLong;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f187105e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f187105e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f187106f.get() > 0) {
                this.f187105e.onNext(t);
                this.f187106f.decrementAndGet();
                return;
            }
            y20<? super T> y20Var = w360.this.f187102a;
            if (y20Var != null) {
                try {
                    y20Var.call(t);
                } catch (Throwable th) {
                    j6f.m143665g(th, this.f187105e, t);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.w360$c */
    public static final class C21008c {
        static final w360<Object> INSTANCE = new w360<>();
    }

    public w360(y20<? super T> y20Var) {
        this.f187102a = y20Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> w360<T> m204762b() {
        return (w360<T>) C21008c.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        AtomicLong atomicLong = new AtomicLong();
        gcg0Var.mo95773f(new C21006a(atomicLong));
        return new C21007b(gcg0Var, gcg0Var, atomicLong);
    }

    public w360() {
        this(null);
    }
}
