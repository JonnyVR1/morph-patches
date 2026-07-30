package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class rw50<T> extends sw50<T> {

    /* JADX INFO: renamed from: l.rw50$a */
    public class C19804a implements sw50.InterfaceC20044a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f161307a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f161308b;

        /* JADX INFO: renamed from: l.rw50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sw50.C20046c f161309a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f161310b;

            public a(sw50.C20046c c20046c, Long l2) {
                this.f161309a = c20046c;
                this.f161310b = l2;
            }

            @Override // p149l.d30
            public void call() {
                this.f161309a.m186125g(this.f161310b.longValue());
            }
        }

        public C19804a(long j, TimeUnit timeUnit) {
            this.f161307a = j;
            this.f161308b = timeUnit;
        }

        @Override // p149l.y9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c4g0 mo94599a(sw50.C20046c<T> c20046c, Long l2, bud0.AbstractC15976a abstractC15976a) {
            return abstractC15976a.mo99202c(new a(c20046c, l2), this.f161307a, this.f161308b);
        }
    }

    /* JADX INFO: renamed from: l.rw50$b */
    public class C19805b implements sw50.InterfaceC20045b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f161312a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f161313b;

        /* JADX INFO: renamed from: l.rw50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sw50.C20046c f161314a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f161315b;

            public a(sw50.C20046c c20046c, Long l2) {
                this.f161314a = c20046c;
                this.f161315b = l2;
            }

            @Override // p149l.d30
            public void call() {
                this.f161314a.m186125g(this.f161315b.longValue());
            }
        }

        public C19805b(long j, TimeUnit timeUnit) {
            this.f161312a = j;
            this.f161313b = timeUnit;
        }

        @Override // p149l.z9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 mo100621b(sw50.C20046c<T> c20046c, Long l2, T t, bud0.AbstractC15976a abstractC15976a) {
            return abstractC15976a.mo99202c(new a(c20046c, l2), this.f161312a, this.f161313b);
        }
    }

    public rw50(long j, TimeUnit timeUnit, C22306c<? extends T> c22306c, bud0 bud0Var) {
        super(new C19804a(j, timeUnit), new C19805b(j, timeUnit), c22306c, bud0Var);
    }

    @Override // p149l.sw50
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ z3g0 call(z3g0 z3g0Var) {
        return super.call(z3g0Var);
    }
}
