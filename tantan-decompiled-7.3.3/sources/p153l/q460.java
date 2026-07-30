package p153l;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class q460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f155523a;

    /* JADX INFO: renamed from: b */
    public final f2e0 f155524b;

    /* JADX INFO: renamed from: c */
    public final int f155525c;

    /* JADX INFO: renamed from: l.q460$a */
    public class C19519a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C19520b f155526a;

        public C19519a(C19520b c19520b) {
            this.f155526a = c19520b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f155526a.m175202h(j);
        }
    }

    /* JADX INFO: renamed from: l.q460$b */
    public static final class C19520b<T> extends gcg0<T> implements qcj<Object, T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f155528e;

        /* JADX INFO: renamed from: f */
        public final long f155529f;

        /* JADX INFO: renamed from: g */
        public final f2e0 f155530g;

        /* JADX INFO: renamed from: h */
        public final int f155531h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f155532i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<Object> f155533j = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public final ArrayDeque<Long> f155534k = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f155535l = NotificationLite.m222581f();

        public C19520b(gcg0<? super T> gcg0Var, int i, long j, f2e0 f2e0Var) {
            this.f155528e = gcg0Var;
            this.f155531h = i;
            this.f155529f = j;
            this.f155530g = f2e0Var;
        }

        @Override // p153l.qcj
        public T call(Object obj) {
            return this.f155535l.m222586e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m175201g(long j) {
            long j2 = j - this.f155529f;
            while (true) {
                Long lPeek = this.f155534k.peek();
                if (lPeek == null || lPeek.longValue() >= j2) {
                    return;
                }
                this.f155533j.poll();
                this.f155534k.poll();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m175202h(long j) {
            rc2.m180776h(this.f155532i, j, this.f155533j, this.f155528e, this);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            m175201g(this.f155530g.now());
            this.f155534k.clear();
            rc2.m180773e(this.f155532i, this.f155533j, this.f155528e, this);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f155533j.clear();
            this.f155534k.clear();
            this.f155528e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f155531h != 0) {
                long jNow = this.f155530g.now();
                if (this.f155533j.size() == this.f155531h) {
                    this.f155533j.poll();
                    this.f155534k.poll();
                }
                m175201g(jNow);
                this.f155533j.offer(this.f155535l.m222590j(t));
                this.f155534k.offer(Long.valueOf(jNow));
            }
        }
    }

    public q460(int i, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        if (i < 0) {
            kym.m151996a("count could not be negative");
            throw null;
        }
        this.f155523a = timeUnit.toMillis(j);
        this.f155524b = f2e0Var;
        this.f155525c = i;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C19520b c19520b = new C19520b(gcg0Var, this.f155525c, this.f155523a, this.f155524b);
        gcg0Var.m129866b(c19520b);
        gcg0Var.mo95773f(new C19519a(c19520b));
        return c19520b;
    }

    public q460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f155523a = timeUnit.toMillis(j);
        this.f155524b = f2e0Var;
        this.f155525c = -1;
    }
}
