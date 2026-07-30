package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class sqa0 {

    /* JADX INFO: renamed from: b */
    public static sqa0 f165947b = new sqa0();

    /* JADX INFO: renamed from: a */
    public C22393b<Boolean> f165948a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public static sqa0 m185475b() {
        return f165947b;
    }

    /* JADX INFO: renamed from: a */
    public C22306c<Boolean> m185476a() {
        return this.f165948a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public void m185477c(boolean z) {
        this.f165948a.onNext(Boolean.valueOf(z));
    }
}
