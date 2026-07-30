package p002l;

import l.mcr;
import l.muy;
import l.r940;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t940 extends muy<w940> {

    /* JADX INFO: renamed from: b */
    public final b<String> f20136b;

    /* JADX INFO: renamed from: c */
    public final r940 f20137c;

    public t940(mcr mcrVar) {
        super(mcrVar);
        this.f20136b = b.b();
        this.f20137c = new r940();
    }

    /* JADX INFO: renamed from: h0 */
    public r940 m22814h0() {
        return this.f20137c;
    }

    /* JADX INFO: renamed from: i0 */
    public c<String> m22815i0() {
        return this.f20136b.asObservable();
    }

    /* JADX INFO: renamed from: j0 */
    public void m22816j0(String str) {
        this.f20136b.onNext(str);
    }

    public void destroy() {
    }
}
