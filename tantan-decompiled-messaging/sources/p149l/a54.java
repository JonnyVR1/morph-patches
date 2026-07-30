package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class a54 extends h4t<ho2, d54> {
    public a54(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new d54());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m95008L3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public void m95010R3(String str) {
        m95013P3(str);
        ((d54) this.viewModel).m110018k();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m95011N3(BLiveCallSummary bLiveCallSummary) {
        ((d54) this.viewModel).m110017j(bLiveCallSummary);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m95012O3(String str) {
        return Boolean.valueOf(!((d54) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: P3 */
    public void m95013P3(String str) {
        duringCreated(LivingNormalApiProvider.m71327R3(str)).subscribe(ffw.m121194e(new e30() { // from class: l.y44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195894a.m95011N3((BLiveCallSummary) obj);
            }
        }, new e30() { // from class: l.z44
            @Override // p149l.e30
            public final void call(Object obj) {
                a54.m95008L3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallEvent.callSummary().m172460g()).filter(new w9j() { // from class: l.w44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184472a.m95012O3((String) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.x44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190938a.m95010R3((String) obj);
            }
        }));
    }
}
