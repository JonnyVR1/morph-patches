package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes5.dex */
public class nsf0 {

    /* JADX INFO: renamed from: a */
    public C22508b<C18943a> f143497a = C22508b.m222767b();

    /* JADX INFO: renamed from: l.nsf0$a */
    public static class C18943a {

        /* JADX INFO: renamed from: a */
        public float f143498a;

        public C18943a(float f) {
            this.f143498a = f;
        }
    }

    /* JADX INFO: renamed from: a */
    public C22421c<C18943a> m164594a() {
        return this.f143497a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public void m164595b(C18943a c18943a) {
        this.f143497a.onNext(c18943a);
    }
}
