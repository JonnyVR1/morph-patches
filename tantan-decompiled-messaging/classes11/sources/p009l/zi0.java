package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.ark;
import l.d30;
import l.hpd0;
import l.uq40;
import l.vy8;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zi0 extends AbstractC1065o4 {

    /* JADX INFO: renamed from: a */
    public static boolean f23685a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m25801c(z5l.C1346a c1346a) {
        if (uq40.y(c1346a.m25611a(), true)) {
            return;
        }
        c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        hpd0 hpd0Var = CoreModule.c.e0.c0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        ark.P0(c1346a.m25611a(), "", new d30() { // from class: l.yi0
            public final void call() {
                zi0.m25801c(c1346a);
            }
        }, false, false, (d30) null);
        return bool;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        boolean z = (!vy8.d() || c1346a.f23488b.m19446k6() || f23685a) ? false : true;
        if (!z) {
            c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
        }
        return z;
    }
}
