package p009l;

import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import l.d30;
import l.uc80;
import l.w5b;
import l.wc80;
import l.y3h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a4h0 extends AbstractC1065o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11186c(z5l.C1346a c1346a) {
        c1346a.f23487a.act().m3877Z5().m4037B0();
        CoreModule.c.k2.U.a(1);
        CoreModule.c.k2.V.put(Long.valueOf(mqi0.m18550o()));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        w5b w5bVar = CoreModule.c.k2;
        w5bVar.W = false;
        w5bVar.s3();
        y3h0 y3h0Var = new y3h0(c1346a.m25611a());
        y3h0Var.O(new d30() { // from class: l.z3h0
            public final void call() {
                a4h0.m11186c(c1346a);
            }
        });
        if (a.p().I()) {
            a.p().C(CorePopLevel.SURPRISE_BOX, c1346a.m25611a(), y3h0Var, 20000);
        } else {
            wc80.e().q(uc80.a(y3h0Var));
        }
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        return CoreModule.c.k2.W;
    }
}
