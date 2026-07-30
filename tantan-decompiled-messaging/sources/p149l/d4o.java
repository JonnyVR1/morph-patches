package p149l;

import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class d4o extends v0u<e4o> {
    public d4o(mcr mcrVar, C22306c<Boolean> c22306c, mss mssVar) {
        super(mcrVar, c22306c, mssVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(C22306c.interval(s9s.f163228b.m195987y3(), TimeUnit.SECONDS), false).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.c4o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveCounterApi.refreshLiveCounter();
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public String m109993U2() {
        return (String) m151646N2(new dts());
    }

    /* JADX INFO: renamed from: V2 */
    public void m109994V2(boolean z) {
        if (!z) {
            gld0<jj3> gld0Var = gld0.f103314d;
            if (!((jj3) s9s.m182763m(gld0Var)).f118220a.get().booleanValue()) {
                ((jj3) s9s.m182763m(gld0Var)).f118220a.put(Boolean.TRUE);
                ((hl3) s9s.m182763m(gld0.f103313c)).m131630d().m132487l(Long.valueOf(System.currentTimeMillis()));
            }
            gld0<nj3> gld0Var2 = gld0.f103312b;
            if (((nj3) s9s.m182763m(gld0Var2)).m159627i() != null && ((nj3) s9s.m182763m(gld0Var2)).m159627i().liveTabUnread > 0) {
                IntlLiveCounterApi.patchReddot("clearliveTabUnread").subscribe(ffw.m121192c());
            }
        }
        s2u.m182081m(z);
    }
}
