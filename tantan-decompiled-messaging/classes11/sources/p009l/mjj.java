package p009l;

import com.p1.mobile.android.app.App;
import l.e30;
import l.mcr;
import l.mkd0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class mjj {
    /* JADX INFO: renamed from: c */
    public static mjj m18515c(mcr mcrVar, boolean z) {
        return new c4k(App.e);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract c<d90> m18516b(double d, double d2);

    /* JADX INFO: renamed from: e */
    public void m18517e(mcr mcrVar, final double d, final double d2, e30<d90> e30Var, e30<Throwable> e30Var2) {
        mkd0.D(new v9j() { // from class: l.ljj
            public final Object call() {
                return this.f16188a.m18516b(d, d2);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()), true).subscribe(mkd0.K(e30Var, e30Var2, false));
    }
}
