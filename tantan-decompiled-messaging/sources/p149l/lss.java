package p149l;

import com.p046p1.mobile.android.app.Act;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class lss<V extends s7m> extends k4t<V> {

    /* JADX INFO: renamed from: e */
    public final mss f129893e;

    public lss(mcr mcrVar, mss mssVar) {
        super(mcrVar);
        this.f129893e = mssVar;
    }

    /* JADX INFO: renamed from: E2 */
    public <T extends zj2<R>, R> void m151641E2(Class<T> cls, final w9j<T, R> w9jVar) {
        m104250o2(m151644K2().m211228e(cls), false).subscribe(ffw.m121193d(new e30() { // from class: l.kss
            @Override // p149l.e30
            public final void call(Object obj) {
                zj2 zj2Var = (zj2) obj;
                zj2Var.m219083c(w9jVar.call(zj2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public LiveHomeEventBus m151642F2() {
        return this.f129893e.f135530a;
    }

    /* JADX INFO: renamed from: H2 */
    public mss m151643H2() {
        return this.f129893e;
    }

    /* JADX INFO: renamed from: K2 */
    public xuy m151644K2() {
        return this.f129893e.f135532c;
    }

    /* JADX INFO: renamed from: N2 */
    public <T> T m151646N2(zj2<T> zj2Var) {
        m151644K2().m211234k(zj2Var);
        return zj2Var.m219082b();
    }

    public Act act() {
        return this.f129893e.f135531b.act();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public final void mo72465t() {
        super.mo72465t();
    }

    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
    }

    /* JADX INFO: renamed from: M2 */
    public void mo122936M2() {
    }

    /* JADX INFO: renamed from: L2 */
    public void mo151645L2(boolean z) {
    }
}
