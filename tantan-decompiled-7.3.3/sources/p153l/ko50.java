package p153l;

import java.util.NoSuchElementException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class ko50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f127689a;

    /* JADX INFO: renamed from: b */
    public final rcj<T, T, T> f127690b;

    /* JADX INFO: renamed from: l.ko50$a */
    public class C18225a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18226b f127691a;

        public C18225a(C18226b c18226b) {
            this.f127691a = c18226b;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f127691a.m150586g(j);
        }
    }

    /* JADX INFO: renamed from: l.ko50$b */
    public static final class C18226b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: h */
        public static final Object f127693h = new Object();

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f127694e;

        /* JADX INFO: renamed from: f */
        public final rcj<T, T, T> f127695f;

        /* JADX INFO: renamed from: g */
        public T f127696g = (T) f127693h;

        public C18226b(gcg0<? super T> gcg0Var, rcj<T, T, T> rcjVar) {
            this.f127694e = gcg0Var;
            this.f127695f = rcjVar;
            m129868e(0L);
        }

        /* JADX INFO: renamed from: g */
        public void m150586g(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
            } else if (j != 0) {
                m129868e(Long.MAX_VALUE);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            T t = this.f127696g;
            Object obj = f127693h;
            gcg0<? super T> gcg0Var = this.f127694e;
            if (t == obj) {
                gcg0Var.onError(new NoSuchElementException());
            } else {
                gcg0Var.onNext(t);
                this.f127694e.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f127694e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            T t2 = this.f127696g;
            if (t2 == f127693h) {
                this.f127696g = t;
                return;
            }
            try {
                this.f127696g = this.f127695f.call(t2, t);
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                this.f127694e.onError(th);
            }
        }
    }

    public ko50(C22421c<T> c22421c, rcj<T, T, T> rcjVar) {
        this.f127689a = c22421c;
        this.f127690b = rcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        C18226b c18226b = new C18226b(gcg0Var, this.f127690b);
        gcg0Var.m129866b(c18226b);
        gcg0Var.mo95773f(new C18225a(c18226b));
        this.f127689a.unsafeSubscribe(c18226b);
    }
}
