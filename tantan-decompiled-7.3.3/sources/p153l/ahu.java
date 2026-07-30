package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public class ahu<V extends iam> extends l6t<V> {

    /* JADX INFO: renamed from: e */
    public final knu f71426e;

    public ahu(knu knuVar) {
        super(knuVar.f127641d);
        this.f71426e = knuVar;
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m97923D2(y20 y20Var, v3f.C20734b c20734b, Object obj) {
        try {
            y20Var.call(obj);
        } catch (Exception unused) {
            CrashHelper.m82479c(new Throwable("live event handle error, event is " + c20734b.m199267d()));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public <T extends hk2<R>, R> void m97925F2(Class<T> cls, final qcj<T, R> qcjVar) {
        m113231o2(m97932P2().m194444e(cls), false).subscribe(dhw.m115825d(new y20() { // from class: l.zgu
            @Override // p153l.y20
            public final void call(Object obj) {
                hk2 hk2Var = (hk2) obj;
                hk2Var.m135609c(qcjVar.call(hk2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public xnu m97926H2() {
        return this.f71426e.f127642e;
    }

    /* JADX INFO: renamed from: I2 */
    public <T> void m97927I2(final v3f.C20734b<T, C22421c<T>> c20734b, final y20<T> y20Var) {
        m113231o2(c20734b.m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.ygu
            @Override // p153l.y20
            public final void call(Object obj) {
                ahu.m97923D2(y20Var, c20734b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public LiveVChatEventBus m97928K2() {
        return this.f71426e.f127638a;
    }

    /* JADX INFO: renamed from: L2 */
    public void m97929L2(boolean z) {
        act().lambda$debugItems$19();
        if (z) {
            act().overridePendingTransition(0, q7c0.f155954c);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public knu m97930M2() {
        return this.f71426e;
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m97931N2() {
        return this.f71426e.f127643f;
    }

    /* JADX INFO: renamed from: P2 */
    public u3z m97932P2() {
        return this.f71426e.f127640c;
    }

    /* JADX INFO: renamed from: Q2 */
    public <T> T m97933Q2(hk2<T> hk2Var) {
        m97932P2().m194450k(hk2Var);
        return hk2Var.m135608b();
    }

    public Act act() {
        return this.f71426e.m150552a();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public final void mo73648t() {
        super.mo73648t();
    }
}
