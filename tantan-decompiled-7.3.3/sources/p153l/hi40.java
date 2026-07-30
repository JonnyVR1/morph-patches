package p153l;

import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class hi40 extends j3z<ki40> {

    /* JADX INFO: renamed from: b */
    public final C22508b<String> f109980b;

    /* JADX INFO: renamed from: c */
    public final fi40 f109981c;

    public hi40(ner nerVar) {
        super(nerVar);
        this.f109980b = C22508b.m222767b();
        this.f109981c = new fi40();
    }

    /* JADX INFO: renamed from: h0 */
    public fi40 m135107h0() {
        return this.f109981c;
    }

    /* JADX INFO: renamed from: i0 */
    public C22421c<String> m135108i0() {
        return this.f109980b.asObservable();
    }

    /* JADX INFO: renamed from: j0 */
    public void m135109j0(String str) {
        this.f109980b.onNext(str);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
