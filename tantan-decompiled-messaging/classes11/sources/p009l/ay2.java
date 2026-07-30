package p009l;

import l.ark;
import l.d30;
import l.uq40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ay2 extends AbstractC1065o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11763c(z5l.C1346a c1346a) {
        if (uq40.y(c1346a.m25611a(), true)) {
            return;
        }
        c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        ark.P0(c1346a.m25611a(), "", new d30() { // from class: l.zx2
            public final void call() {
                ay2.m11763c(c1346a);
            }
        }, false, true, (d30) null);
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return false;
    }
}
