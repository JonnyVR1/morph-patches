package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;

/* JADX INFO: loaded from: classes5.dex */
public class e910 extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public MultiCallTopView f89916i;

    public e910(bsm<yl40> bsmVar, MultiCallTopView multiCallTopView) {
        super(bsmVar);
        this.f89916i = multiCallTopView;
        m144512z2(new td10(bsmVar));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m115337K3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m115340N3(soj0 soj0Var) {
        m115343R3();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m115341O3(Integer num) {
        r610.m177993a0(this, this.f188512e, num.intValue(), 5);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m115342P3(ug10 ug10Var) {
        w4t w4tVar = this.f188512e.f77104j;
        MotionType motionType = MotionType.multi_call;
        if (w4tVar.m201577L3(motionType)) {
            return;
        }
        yi10.m214879a("startMultiCallMode role:" + ug10Var.getRole() + " orderId = " + ug10Var.getOrderId());
        m206028F2().MotionEvent.motionSwitch().mo172463j(new jy00(true, motionType).m143840b(new ta10(this.f89916i, ug10Var)).m143839a(new f30() { // from class: l.d910
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e910.m115337K3((Integer) obj, (MotionType) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final void m115343R3() {
        yi10.m214879a("stopMultiCallMode");
        m206028F2().MotionEvent.motionSwitch().mo172463j(new jy00(false, MotionType.multi_call));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().MultiCallEvent.startLiveMultiCall(), new e30() { // from class: l.a910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68105a.m115342P3((ug10) obj);
            }
        });
        m129304h3(m206028F2().MultiCallEvent.closeMultiCallMotion(), new e30() { // from class: l.b910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74190a.m115340N3((soj0) obj);
            }
        });
        m129304h3(m206028F2().MultiCallEvent.openMultiCallWithTab(), new e30() { // from class: l.c910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79851a.m115341O3((Integer) obj);
            }
        });
    }
}
