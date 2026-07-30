package p149l;

import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class t940 extends muy<w940> {

    /* JADX INFO: renamed from: b */
    public final C22393b<String> f168990b;

    /* JADX INFO: renamed from: c */
    public final r940 f168991c;

    public t940(mcr mcrVar) {
        super(mcrVar);
        this.f168990b = C22393b.m221521b();
        this.f168991c = new r940();
    }

    /* JADX INFO: renamed from: h0 */
    public r940 m187600h0() {
        return this.f168991c;
    }

    /* JADX INFO: renamed from: i0 */
    public C22306c<String> m187601i0() {
        return this.f168990b.asObservable();
    }

    /* JADX INFO: renamed from: j0 */
    public void m187602j0(String str) {
        this.f168990b.onNext(str);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
