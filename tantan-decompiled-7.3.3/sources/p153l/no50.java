package p153l;

import java.util.NoSuchElementException;
import p137rx.C22421c;
import p137rx.C22422d;

/* JADX INFO: loaded from: classes3.dex */
public class no50<T> implements C22422d.b<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f142908a;

    /* JADX INFO: renamed from: l.no50$a */
    public class C18911a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f142909e;

        /* JADX INFO: renamed from: f */
        public boolean f142910f;

        /* JADX INFO: renamed from: g */
        public T f142911g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ oqf0 f142912h;

        public C18911a(oqf0 oqf0Var) {
            this.f142912h = oqf0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(2L);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f142909e) {
                return;
            }
            boolean z = this.f142910f;
            oqf0 oqf0Var = this.f142912h;
            if (z) {
                oqf0Var.mo168812c(this.f142911g);
            } else {
                oqf0Var.mo168811b(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f142912h.mo168811b(th);
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (!this.f142910f) {
                this.f142910f = true;
                this.f142911g = t;
            } else {
                this.f142909e = true;
                this.f142912h.mo168811b(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }
    }

    public no50(C22421c<T> c22421c) {
        this.f142908a = c22421c;
    }

    /* JADX INFO: renamed from: b */
    public static <T> no50<T> m164042b(C22421c<T> c22421c) {
        return new no50<>(c22421c);
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(oqf0<? super T> oqf0Var) {
        C18911a c18911a = new C18911a(oqf0Var);
        oqf0Var.m168810a(c18911a);
        this.f142908a.unsafeSubscribe(c18911a);
    }
}
