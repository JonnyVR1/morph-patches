package p153l;

import com.p051p1.mobile.android.app.App;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fmj {
    /* JADX INFO: renamed from: c */
    public static fmj m126236c(ner nerVar, boolean z) {
        return new u6k(App.f16088e);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract C22421c<z80> m126237b(double d, double d2);

    /* JADX INFO: renamed from: e */
    public void m126239e(ner nerVar, final double d, final double d2, y20<z80> y20Var, y20<Throwable> y20Var2) {
        psd0.m173593D(new pcj() { // from class: l.emj
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94657a.m126237b(d, d2);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()), true).subscribe(psd0.m173600K(y20Var, y20Var2, false));
    }
}
