package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rw50<T> extends sw50<T> {

    /* JADX INFO: renamed from: l.rw50$a */
    public class C0519a implements sw50.InterfaceC0539a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f7098a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f7099b;

        /* JADX INFO: renamed from: l.rw50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sw50.C0541c f7100a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f7101b;

            public a(sw50.C0541c c0541c, Long l2) {
                this.f7100a = c0541c;
                this.f7101b = l2;
            }

            @Override // p003l.d30
            public void call() {
                this.f7100a.m7647g(this.f7101b.longValue());
            }
        }

        public C0519a(long j, TimeUnit timeUnit) {
            this.f7098a = j;
            this.f7099b = timeUnit;
        }

        @Override // p003l.y9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c4g0 mo2764a(sw50.C0541c<T> c0541c, Long l2, bud0.AbstractC0185a abstractC0185a) {
            return abstractC0185a.mo2915c(new a(c0541c, l2), this.f7098a, this.f7099b);
        }
    }

    /* JADX INFO: renamed from: l.rw50$b */
    public class C0520b implements sw50.InterfaceC0540b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f7103a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f7104b;

        /* JADX INFO: renamed from: l.rw50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sw50.C0541c f7105a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f7106b;

            public a(sw50.C0541c c0541c, Long l2) {
                this.f7105a = c0541c;
                this.f7106b = l2;
            }

            @Override // p003l.d30
            public void call() {
                this.f7105a.m7647g(this.f7106b.longValue());
            }
        }

        public C0520b(long j, TimeUnit timeUnit) {
            this.f7103a = j;
            this.f7104b = timeUnit;
        }

        @Override // p003l.z9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 mo6904b(sw50.C0541c<T> c0541c, Long l2, T t, bud0.AbstractC0185a abstractC0185a) {
            return abstractC0185a.mo2915c(new a(c0541c, l2), this.f7103a, this.f7104b);
        }
    }

    public rw50(long j, TimeUnit timeUnit, C1099c<? extends T> c1099c, bud0 bud0Var) {
        super(new C0519a(j, timeUnit), new C0520b(j, timeUnit), c1099c, bud0Var);
    }

    @Override // p003l.sw50
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ z3g0 call(z3g0 z3g0Var) {
        return super.call(z3g0Var);
    }
}
