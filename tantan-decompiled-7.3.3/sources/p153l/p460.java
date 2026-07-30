package p153l;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class p460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f150498a;

    /* JADX INFO: renamed from: l.p460$a */
    public class C19293a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C19294b f150499a;

        public C19293a(C19294b c19294b) {
            this.f150499a = c19294b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f150499a.m170544g(j);
        }
    }

    /* JADX INFO: renamed from: l.p460$b */
    public static final class C19294b<T> extends gcg0<T> implements qcj<Object, T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f150501e;

        /* JADX INFO: renamed from: h */
        public final int f150504h;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f150502f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final ArrayDeque<Object> f150503g = new ArrayDeque<>();

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f150505i = NotificationLite.m222581f();

        public C19294b(gcg0<? super T> gcg0Var, int i) {
            this.f150501e = gcg0Var;
            this.f150504h = i;
        }

        @Override // p153l.qcj
        public T call(Object obj) {
            return this.f150505i.m222586e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m170544g(long j) {
            if (j > 0) {
                rc2.m180776h(this.f150502f, j, this.f150503g, this.f150501e, this);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            rc2.m180773e(this.f150502f, this.f150503g, this.f150501e, this);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f150503g.clear();
            this.f150501e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f150503g.size() == this.f150504h) {
                this.f150503g.poll();
            }
            this.f150503g.offer(this.f150505i.m222590j(t));
        }
    }

    public p460(int i) {
        if (i >= 0) {
            this.f150498a = i;
        } else {
            kym.m151996a("count cannot be negative");
            throw null;
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C19294b c19294b = new C19294b(gcg0Var, this.f150498a);
        gcg0Var.m129866b(c19294b);
        gcg0Var.mo95773f(new C19293a(c19294b));
        return c19294b;
    }
}
