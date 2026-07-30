package p153l;

import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class d6o extends w2u<e6o> {
    public d6o(ner nerVar, C22421c<Boolean> c22421c, nus nusVar) {
        super(nerVar, c22421c, nusVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(C22421c.interval(tbs.f172989b.m203774y3(), TimeUnit.SECONDS), false).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.c6o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveCounterApi.refreshLiveCounter();
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public String m114504U2() {
        return (String) m160243N2(new evs());
    }

    /* JADX INFO: renamed from: V2 */
    public void m114505V2(boolean z) {
        if (!z) {
            itd0<bk3> itd0Var = itd0.f116822d;
            if (!((bk3) tbs.m190077m(itd0Var)).f77038a.get().booleanValue()) {
                ((bk3) tbs.m190077m(itd0Var)).f77038a.put(Boolean.TRUE);
                ((gm3) tbs.m190077m(itd0.f116821c)).m130729d().m137019l(Long.valueOf(System.currentTimeMillis()));
            }
            itd0<fk3> itd0Var2 = itd0.f116820b;
            if (((fk3) tbs.m190077m(itd0Var2)).m125958i() != null && ((fk3) tbs.m190077m(itd0Var2)).m125958i().liveTabUnread > 0) {
                IntlLiveCounterApi.patchReddot("clearliveTabUnread").subscribe(dhw.m115824c());
            }
        }
        t4u.m189324m(z);
    }
}
