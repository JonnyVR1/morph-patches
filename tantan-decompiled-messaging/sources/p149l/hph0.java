package p149l;

import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes8.dex */
public class hph0 extends kjd0 {

    /* JADX INFO: renamed from: b */
    public static volatile bud0 f108926b;

    /* JADX INFO: renamed from: c */
    public static volatile w9j<bud0, bud0> f108927c;

    /* JADX INFO: renamed from: m */
    public static bud0 m132339m(o4m o4mVar) {
        if (f108926b == null) {
            f108926b = Schedulers.from(o4mVar.mo162607a());
        }
        return f108926b;
    }

    /* JADX INFO: renamed from: n */
    public static w9j<bud0, bud0> m132340n(final o4m o4mVar) {
        if (f108927c == null) {
            f108927c = new w9j() { // from class: l.gph0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return hph0.m132339m(o4mVar);
                }
            };
        }
        return f108927c;
    }
}
