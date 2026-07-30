package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class ekf0 {

    /* JADX INFO: renamed from: a */
    public C22393b<C16637a> f91970a = C22393b.m221521b();

    /* JADX INFO: renamed from: l.ekf0$a */
    public static class C16637a {

        /* JADX INFO: renamed from: a */
        public float f91971a;

        public C16637a(float f) {
            this.f91971a = f;
        }
    }

    /* JADX INFO: renamed from: a */
    public C22306c<C16637a> m116960a() {
        return this.f91970a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public void m116961b(C16637a c16637a) {
        this.f91970a.onNext(c16637a);
    }
}
