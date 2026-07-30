package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class n360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final y20<Long> f139935a;

    /* JADX INFO: renamed from: l.n360$a */
    public class C18769a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18770b f139936a;

        public C18769a(C18770b c18770b) {
            this.f139936a = c18770b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            n360.this.f139935a.call(Long.valueOf(j));
            this.f139936a.m161276h(j);
        }
    }

    /* JADX INFO: renamed from: l.n360$b */
    public static final class C18770b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f139938e;

        public C18770b(gcg0<? super T> gcg0Var) {
            this.f139938e = gcg0Var;
            m129868e(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m161276h(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f139938e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f139938e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f139938e.onNext(t);
        }
    }

    public n360(y20<Long> y20Var) {
        this.f139935a = y20Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C18770b c18770b = new C18770b(gcg0Var);
        gcg0Var.mo95773f(new C18769a(c18770b));
        gcg0Var.m129866b(c18770b);
        return c18770b;
    }
}
