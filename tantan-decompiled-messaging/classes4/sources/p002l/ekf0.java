package p002l;

import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ekf0 {

    /* JADX INFO: renamed from: a */
    public b<C0546a> f9837a = b.b();

    /* JADX INFO: renamed from: l.ekf0$a */
    public static class C0546a {

        /* JADX INFO: renamed from: a */
        public float f9838a;

        public C0546a(float f) {
            this.f9838a = f;
        }
    }

    /* JADX INFO: renamed from: a */
    public c<C0546a> m12572a() {
        return this.f9837a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public void m12573b(C0546a c0546a) {
        this.f9837a.onNext(c0546a);
    }
}
