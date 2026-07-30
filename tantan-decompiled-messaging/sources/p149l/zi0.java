package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class zi0 extends AbstractC18834o4 {

    /* JADX INFO: renamed from: a */
    public static boolean f203246a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m218888c(z5l.C21640a c21640a) {
        if (uq40.m194983y(c21640a.m217363a(), true)) {
            return;
        }
        c21640a.f201828b.f140350G.m132487l(Boolean.TRUE);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(final z5l.C21640a c21640a) {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149341c0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        ark.m98441P0(c21640a.m217363a(), "", new d30() { // from class: l.yi0
            @Override // p149l.d30
            public final void call() {
                zi0.m218888c(c21640a);
            }
        }, false, false, null);
        return bool;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        boolean z = (!vy8.m200606d() || c21640a.f201828b.m161240k6() || f203246a) ? false : true;
        if (!z) {
            c21640a.f201828b.f140350G.m132487l(Boolean.TRUE);
        }
        return z;
    }
}
