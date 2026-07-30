package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class mzf0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public boolean f136378i;

    /* JADX INFO: renamed from: j */
    public boolean f136379j;

    public mzf0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m157138M3(roj0 roj0Var) {
        this.f136379j = true;
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
        gkh0.m126627j(u0t.f172943b, "notifyStreamReady success:");
        this.f136378i = false;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m157139N3(Throwable th) {
        this.f136379j = true;
        m206028F2().LivePusherEvent.notifyPushStreamReady().m172467p();
        gkh0.m126627j(u0t.f172943b, "notifyStreamReady fail");
        this.f136378i = false;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m157140O3(pzf0 pzf0Var) {
        return Boolean.valueOf(this.f136379j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m157141P3() {
        C4319c c4319cLifecycle_ = lifecycle_();
        if (this.f136378i) {
            return;
        }
        if (!NullChecker.m81303a(c4319cLifecycle_) || c4319cLifecycle_.f15555a) {
            this.f136378i = true;
            gkh0.m126627j(u0t.f172943b, "notifyStreamReady start");
            duringCreated(LivingNormalApiProvider.m71600v6(((pn40) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.kzf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125379a.m157138M3((roj0) obj);
                }
            }, new e30() { // from class: l.lzf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130650a.m157139N3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(pzf0.class, new w9j() { // from class: l.jzf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120389a.m157140O3((pzf0) obj);
            }
        });
    }
}
