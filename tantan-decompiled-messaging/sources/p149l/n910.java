package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;

/* JADX INFO: loaded from: classes5.dex */
public class n910 extends qi10<yl40> {
    public n910(bsm<yl40> bsmVar, MultiCallTopView multiCallTopView, j510<yl40> j510Var) {
        super(bsmVar, multiCallTopView, j510Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m158528K4(Boolean bool) {
        this.f154637i.m132487l(bool);
    }

    @Override // p149l.qi10, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(this.f154638j.m139804f4()).map(new w9j() { // from class: l.l910
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vg10.m198312d((BLiveMultiCall) obj));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.m910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132658a.m158528K4((Boolean) obj);
            }
        }));
    }
}
