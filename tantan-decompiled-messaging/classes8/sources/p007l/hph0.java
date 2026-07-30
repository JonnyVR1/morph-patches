package p007l;

import l.bud0;
import l.kjd0;
import l.w9j;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class hph0 extends kjd0 {

    /* JADX INFO: renamed from: b */
    public static volatile bud0 f2850b;

    /* JADX INFO: renamed from: c */
    public static volatile w9j<bud0, bud0> f2851c;

    /* JADX INFO: renamed from: m */
    public static bud0 m9349m(o4m o4mVar) {
        if (f2850b == null) {
            f2850b = Schedulers.from(o4mVar.mo10173a());
        }
        return f2850b;
    }

    /* JADX INFO: renamed from: n */
    public static w9j<bud0, bud0> m9350n(final o4m o4mVar) {
        if (f2851c == null) {
            f2851c = new w9j() { // from class: l.gph0
                public final Object call(Object obj) {
                    return hph0.m9349m(o4mVar);
                }
            };
        }
        return f2851c;
    }
}
