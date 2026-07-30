package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class x460<T> extends y460<T> {

    /* JADX INFO: renamed from: l.x460$a */
    public class C21246a implements y460.InterfaceC21510a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f192341a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f192342b;

        /* JADX INFO: renamed from: l.x460$a$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y460.C21512c f192343a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f192344b;

            public a(y460.C21512c c21512c, Long l2) {
                this.f192343a = c21512c;
                this.f192344b = l2;
            }

            @Override // p153l.x20
            public void call() {
                this.f192343a.m214197g(this.f192344b.longValue());
            }
        }

        public C21246a(long j, TimeUnit timeUnit) {
            this.f192341a = j;
            this.f192342b = timeUnit;
        }

        @Override // p153l.scj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public kcg0 mo95332a(y460.C21512c<T> c21512c, Long l2, f2e0.AbstractC16877a abstractC16877a) {
            return abstractC16877a.mo102837c(new a(c21512c, l2), this.f192341a, this.f192342b);
        }
    }

    /* JADX INFO: renamed from: l.x460$b */
    public class C21247b implements y460.InterfaceC21511b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f192346a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TimeUnit f192347b;

        /* JADX INFO: renamed from: l.x460$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y460.C21512c f192348a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Long f192349b;

            public a(y460.C21512c c21512c, Long l2) {
                this.f192348a = c21512c;
                this.f192349b = l2;
            }

            @Override // p153l.x20
            public void call() {
                this.f192348a.m214197g(this.f192349b.longValue());
            }
        }

        public C21247b(long j, TimeUnit timeUnit) {
            this.f192346a = j;
            this.f192347b = timeUnit;
        }

        @Override // p153l.tcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kcg0 mo112959b(y460.C21512c<T> c21512c, Long l2, T t, f2e0.AbstractC16877a abstractC16877a) {
            return abstractC16877a.mo102837c(new a(c21512c, l2), this.f192346a, this.f192347b);
        }
    }

    public x460(long j, TimeUnit timeUnit, C22421c<? extends T> c22421c, f2e0 f2e0Var) {
        super(new C21246a(j, timeUnit), new C21247b(j, timeUnit), c22421c, f2e0Var);
    }

    @Override // p153l.y460
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ gcg0 call(gcg0 gcg0Var) {
        return super.call(gcg0Var);
    }
}
