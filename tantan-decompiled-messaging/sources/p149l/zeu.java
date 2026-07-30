package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class zeu<V extends s7m> extends k4t<V> {

    /* JADX INFO: renamed from: e */
    public final jlu f202862e;

    public zeu(jlu jluVar) {
        super(jluVar.f118587d);
        this.f202862e = jluVar;
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m218406D2(e30 e30Var, q2f.C19395b c19395b, Object obj) {
        try {
            e30Var.call(obj);
        } catch (Exception unused) {
            CrashHelper.m81296c(new Throwable("live event handle error, event is " + c19395b.m172457d()));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public <T extends zj2<R>, R> void m218408F2(Class<T> cls, final w9j<T, R> w9jVar) {
        m104250o2(m218415P2().m211228e(cls), false).subscribe(ffw.m121193d(new e30() { // from class: l.yeu
            @Override // p149l.e30
            public final void call(Object obj) {
                zj2 zj2Var = (zj2) obj;
                zj2Var.m219083c(w9jVar.call(zj2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public wlu m218409H2() {
        return this.f202862e.f118588e;
    }

    /* JADX INFO: renamed from: I2 */
    public <T> void m218410I2(final q2f.C19395b<T, C22306c<T>> c19395b, final e30<T> e30Var) {
        m104250o2(c19395b.m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.xeu
            @Override // p149l.e30
            public final void call(Object obj) {
                zeu.m218406D2(e30Var, c19395b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public LiveVChatEventBus m218411K2() {
        return this.f202862e.f118584a;
    }

    /* JADX INFO: renamed from: L2 */
    public void m218412L2(boolean z) {
        act().lambda$debugItems$19();
        if (z) {
            act().overridePendingTransition(0, wzb0.f188720c);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public jlu m218413M2() {
        return this.f202862e;
    }

    /* JADX INFO: renamed from: N2 */
    public boolean m218414N2() {
        return this.f202862e.f118589f;
    }

    /* JADX INFO: renamed from: P2 */
    public xuy m218415P2() {
        return this.f202862e.f118586c;
    }

    /* JADX INFO: renamed from: Q2 */
    public <T> T m218416Q2(zj2<T> zj2Var) {
        m218415P2().m211234k(zj2Var);
        return zj2Var.m219082b();
    }

    public Act act() {
        return this.f202862e.m142119a();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public final void mo72465t() {
        super.mo72465t();
    }
}
