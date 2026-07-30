package p153l;

import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes8.dex */
public class oxh0 extends nrd0 {

    /* JADX INFO: renamed from: b */
    public static volatile f2e0 f149669b;

    /* JADX INFO: renamed from: c */
    public static volatile qcj<f2e0, f2e0> f149670c;

    /* JADX INFO: renamed from: m */
    public static f2e0 m169709m(e7m e7mVar) {
        if (f149669b == null) {
            f149669b = Schedulers.from(e7mVar.mo119713a());
        }
        return f149669b;
    }

    /* JADX INFO: renamed from: n */
    public static qcj<f2e0, f2e0> m169710n(final e7m e7mVar) {
        if (f149670c == null) {
            f149670c = new qcj() { // from class: l.nxh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return oxh0.m169709m(e7mVar);
                }
            };
        }
        return f149670c;
    }
}
