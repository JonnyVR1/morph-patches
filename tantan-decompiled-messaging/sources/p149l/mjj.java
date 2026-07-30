package p149l;

import com.p046p1.mobile.android.app.App;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mjj {
    /* JADX INFO: renamed from: c */
    public static mjj m154842c(mcr mcrVar, boolean z) {
        return new c4k(App.f15369e);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract C22306c<d90> m154843b(double d, double d2);

    /* JADX INFO: renamed from: e */
    public void m154844e(mcr mcrVar, final double d, final double d2, e30<d90> e30Var, e30<Throwable> e30Var2) {
        mkd0.m154952D(new v9j() { // from class: l.ljj
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f128330a.m154843b(d, d2);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()), true).subscribe(mkd0.m154959K(e30Var, e30Var2, false));
    }
}
