package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class u2u extends w2u<x2u> {

    /* JADX INFO: renamed from: g */
    public boolean f177244g;

    public u2u(ner nerVar, C22421c<Boolean> c22421c, nus nusVar) {
        super(nerVar, c22421c, nusVar);
    }

    /* JADX INFO: renamed from: T2 */
    public String m194302T2() {
        return (String) m160243N2(new evs());
    }

    /* JADX INFO: renamed from: U2 */
    public void m194303U2(boolean z) {
        if (!z) {
            itd0<bk3> itd0Var = itd0.f116822d;
            if (!((bk3) tbs.m190077m(itd0Var)).f77038a.get().booleanValue()) {
                ((bk3) tbs.m190077m(itd0Var)).f77038a.put(Boolean.TRUE);
            }
            if (!this.f177244g) {
                this.f177244g = true;
                t4u.f172135e.onNext(Boolean.FALSE);
            }
        }
        t4u.m189324m(z);
    }
}
