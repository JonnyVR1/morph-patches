package p009l;

import l.d30;
import l.uq40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xq40 extends AbstractC1065o4 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m24954d(z5l.C1346a c1346a) {
        c1346a.f23488b.m19386Y4();
        c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        uq40.F(c1346a.m25611a(), new d30() { // from class: l.vq40
            public final void call() {
                xq40.m24954d(c1346a);
            }
        }, new d30() { // from class: l.wq40
            public final void call() {
                c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
            }
        });
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return uq40.x(c1346a.m25611a());
    }
}
