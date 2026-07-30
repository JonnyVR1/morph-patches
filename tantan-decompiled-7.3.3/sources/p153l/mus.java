package p153l;

import com.p051p1.mobile.android.app.Act;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public class mus<V extends iam> extends l6t<V> {

    /* JADX INFO: renamed from: e */
    public final nus f138836e;

    public mus(ner nerVar, nus nusVar) {
        super(nerVar);
        this.f138836e = nusVar;
    }

    /* JADX INFO: renamed from: E2 */
    public <T extends hk2<R>, R> void m160237E2(Class<T> cls, final qcj<T, R> qcjVar) {
        m113231o2(m160240K2().m194444e(cls), false).subscribe(dhw.m115825d(new y20() { // from class: l.lus
            @Override // p153l.y20
            public final void call(Object obj) {
                hk2 hk2Var = (hk2) obj;
                hk2Var.m135609c(qcjVar.call(hk2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public LiveHomeEventBus m160238F2() {
        return this.f138836e.f143737a;
    }

    /* JADX INFO: renamed from: H2 */
    public nus m160239H2() {
        return this.f138836e;
    }

    /* JADX INFO: renamed from: K2 */
    public u3z m160240K2() {
        return this.f138836e.f143739c;
    }

    /* JADX INFO: renamed from: N2 */
    public <T> T m160243N2(hk2<T> hk2Var) {
        m160240K2().m194450k(hk2Var);
        return hk2Var.m135608b();
    }

    public Act act() {
        return this.f138836e.f143738b.act();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public final void mo73648t() {
        super.mo73648t();
    }

    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
    }

    /* JADX INFO: renamed from: M2 */
    public void mo160242M2() {
    }

    /* JADX INFO: renamed from: L2 */
    public void mo160241L2(boolean z) {
    }
}
